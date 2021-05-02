import Flare.FlareParser;
import Flare.util.BaseVisitor;
import Flare.util.FileGenerator;
import exception.FlareException;
import kotlin.Pair;
import org.antlr.v4.runtime.tree.TerminalNode;
import symbtab.*;
import symbtab.exception.InvalidScopeException;
import symbtab.exception.ScopeException;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class MethodGenerator extends BaseVisitor<Object, String> {
    public void setCurrentScope(Scope scope) {
        currentScope = scope;
    }
    public MethodGenerator() { data = ""; }

    //<editor-fold desc="Built-in Functions">

    /**
     * Enclose translated code in its own scope
     */
    @Override
    public Object visitBuiltinFunctions(FlareParser.BuiltinFunctionsContext ctx) {
        //TODO: Write for loop through values here
        //TODO: Check for nested BuildInFunction, if so do not write for loop
        //Probably write a function that goes up enclosedScopes and stops once instanceof CodeBlockScope
        pushScope(new CodeBlockScope(currentScope.getEntityScope(), currentScope, ctx));

        String i = data + "i";
        //FileGenerator.write("for(int " + data + "=" + type.getStart() + ";" + data + "<" + type.getEnd() + ";" + data + "++){");

        FileGenerator.write("{");
        super.visit(ctx.getChild(0), i);
        FileGenerator.write("}");
        //FileGenerator.write("}");

        popScope();
        return null;
    }

    private Type checkIfStatement(FlareParser.IfStatementContext ctx) throws FlareException {
        Type type = checkCondition(ctx.conditionAndBlock().condition());

        for (FlareParser.ElseIfStatementContext elseIf : ctx.elseIfStatement()) {
            Type other = checkCondition(elseIf.conditionAndBlock().condition());

            if (type.getStart() != other.getStart() || type.getEnd() != other.getEnd())
                throw new FlareException("Mismatching lengths ::<" + type.getStart() + ", " + type.getEnd() + "> and " +
                        "::<" + other.getStart() + ", " + other.getEnd() + "> and "
                        , elseIf.start, elseIf.stop);
        }

        return type;
    }

    @Override
    public Object visitIfStatement(FlareParser.IfStatementContext ctx) {
        try {
            //Check if "else if" statements have the same type
            Type type = checkIfStatement(ctx);

            FileGenerator.write("if(");
            super.visit(ctx.conditionAndBlock().condition(), data);
            FileGenerator.write("){");
            super.visit(ctx.conditionAndBlock().singleLineOrBlockBody(), data);

            for (FlareParser.ElseIfStatementContext elseIf : ctx.elseIfStatement())
                super.visit(elseIf, data);

            if (ctx.elseStatement() != null)
                super.visit(ctx.elseStatement(), data);

            FileGenerator.write("}");
        } catch (FlareException e) {
            System.err.println(e.getMessage());
        }

        return null;
    }

    @Override
    public Object visitElseIfStatement(FlareParser.ElseIfStatementContext ctx) {
        FileGenerator.write("}else if(");
        super.visit(ctx.conditionAndBlock().condition(), data);
        FileGenerator.write("){");
        super.visit(ctx.conditionAndBlock().singleLineOrBlockBody(), data);

        return null;
    }

    @Override
    public Object visitElseStatement(FlareParser.ElseStatementContext ctx) {
        FileGenerator.write("}else{");
        return super.visit(ctx.singleLineOrBlockBody(), data);
    }

    /**
     *
     */
    @Override
    public Object visitForStatement(FlareParser.ForStatementContext ctx) {
        try {
            LinkedList<Scope> trace;
            if (ctx.newStatement() != null)
                trace = ((LinkedList<Scope>) super.visit(ctx.newStatement()));
            else
                trace = ((LinkedList<Scope>) super.visit(ctx.identifierSpecifier()));
            if (trace.size() == 0) return null;

            Scope variable = trace.getLast();

            FileGenerator.write("for(;");
            checkCondition(ctx.condition());
            super.visit(ctx.condition(), data);
            FileGenerator.write(";");

            trace = (LinkedList<Scope>) super.visit(ctx.assignment().identifierSpecifier(), data);
            if (trace.size() == 0) return null;

            variable = trace.getLast();

            Type other = checkExpression(ctx.assignment().expression());
            if (!variable.getType().equals(other))
                throw new FlareException("Mismatching types " + variable.getType().getName() + "::<" + variable.getType().getStart() + ", " + variable.getType().getEnd() + "> and "
                        + other.getName()+ "::<" + other.getStart() + ", " + other.getEnd() + ">" , ctx.assignment().start, ctx.assignment().stop);

            switch (((VariableSymbol)variable).getTag()) {
                case PARAMETER:
                    FileGenerator.write(variable.getTranslatedName() + "(" + data + ")" + ctx.assignment().assign().getText());
                    break;
                default:
                    FileGenerator.write(variable.getTranslatedName() + "[" + data + "]" + ctx.assignment().assign().getText());
                    break;
            }
            super.visit(ctx.assignment().expression(), data);
            FileGenerator.write("){");
            super.visit(ctx.singleLineOrBlockBody(), data);
            FileGenerator.write("}}");
        } catch (FlareException e) {
            System.err.println(e);
        }

        return null;
    }

    //TODO: Implement
    @Override
    public Object visitWhileStatement(FlareParser.WhileStatementContext ctx) {
        return super.visitWhileStatement(ctx);
    }

    /**
     * Flare:
     *      $type::<$start, $end> $identifier0($parameter0), $identifier1($parameter1), ...;
     *
     * Primitive type equivalent C++:
     *      auto m_$identifier0 = std::vector<$type>($end, $start);
     *      for (int iter = $start; iter < $end; iter++)
     *          m_$identifier0[iter] = $parameter0;
     *
     * User-declared type equivalent C++:
     *      auto m_$identifier0 = new $type();
     *      $identifier0_allocate(m_$identifier0, std::abs($end - $start));
     *      $identifier0_ctor(m_$identifier0, $start, $end);
     *
     * @param ctx FlareParser NewStatementContext passed by BaseVisitor
     * @return All new VariableSymbols generated from new statement
     */
    @Override
    public Object visitNewStatement(FlareParser.NewStatementContext ctx) {
        List<VariableSymbol> result = new LinkedList<>();

        // Check ArraySpecifier, if none, then add with default range (0, 1)
        if (ctx.arraySpecifier().size() == 0) ctx.addChild(new FlareParser.ArraySpecifierContext(ctx, ctx.invokingState));
        Pair<Integer, Integer> range = (Pair<Integer, Integer>)super.visit(ctx.arraySpecifier(0));

        Type type = new Type(ctx.variableType().getText(), range.getFirst(), range.getSecond());
        // Get all identifiers specified in the new statement
        List<TerminalNode> identifiers = ctx.IDENTIFIER();

        try {
            // Generate first VariableSymbol
            // NewStatement is guaranteed at least one identifier
            VariableSymbol variable = new VariableSymbol(currentScope.getEntityScope(), currentScope, ctx, identifiers.get(0).getText(), type, VariableSymbol.VariableTag.BODY);
            variable.setTranslatedName("m_" + identifiers.get(0).getText());

            result.add(variable);

            if (type.isPrimitive()) {
                for (FlareParser.CallParameterContext parameterContext : ctx.callParameter()) {
                    //Check parameter size
                    if (parameterContext.parameterExpression().size() != 1)
                        throw new FlareException("Primitive initializer must have a single parameter",  ctx.IDENTIFIER(0).getSymbol(), ctx.callParameter(0).stop);

                    //Check if parameters passed in are the appropriate types
                    if (!type.equals(checkParameterExpression(ctx.callParameter(0).parameterExpression(0))))
                        throw new FlareException("Function signature does not exist",  ctx.IDENTIFIER(0).getSymbol(), ctx.callParameter(0).stop);
                }

                FileGenerator.write("auto " + variable.getTranslatedName() + "=std::vector<" + type.getName() + ">(" + range.getSecond() + "," + range.getFirst() + ");");
                FileGenerator.write("for(int iter=0;iter<" + variable.getTranslatedName() + ".size();iter++)" + variable.getTranslatedName() + "[iter]=");
                //Write parameterExpression
                super.visit(ctx.callParameter(0).parameterExpression(0), "iter");
                FileGenerator.write(";");

                //Write the rest of the primitive variables
                for (int i = 1; i < identifiers.size(); i++) {
                    variable = new VariableSymbol(currentScope.getEntityScope(), currentScope, ctx, identifiers.get(i).getText(), type, VariableSymbol.VariableTag.BODY);
                    variable.setTranslatedName("m_" + identifiers.get(i).getText());
                    result.add(variable);

                    FileGenerator.write("std::vector<" + type.getName() + ">" + variable.getTranslatedName() + "=std::vector<" + type.getName() + ">(" + range.getSecond() + "," + range.getFirst() + ");");
                    FileGenerator.write("for(int iter=0;iter<" + variable.getTranslatedName() + ".size();iter++)" + variable.getTranslatedName() + "[iter]=");
                    super.visit(ctx.callParameter(i).parameterExpression(0), "iter");
                    FileGenerator.write(";");
                }
            } else {
                variable.resolveType();
                FunctionScope function = (FunctionScope) type.getReferencedScope().get(type.getName());
                //Check if function exists
                if (function == null)
                    throw new FlareException("Function does not exist", ctx.IDENTIFIER(0).getSymbol(), ctx.callParameter(0).stop);

                //Check if function has matching parameters
                FunctionSignature signature = function.match(getCallParameters(ctx.callParameter(0)));
                if (signature == null)
                    throw new FlareException("Function signature does not exist", ctx.IDENTIFIER(0).getSymbol(), ctx.callParameter(0).stop);

                //Check function signature visibility
                if (signature.getVisibility() == Scope.Visibility.PRIVATE)
                    if (!signature.getEntityScope().getName().equals(currentScope.getEntityScope().getName()))
                        throw new FlareException("Scope " + function.getName() + " is protected and inaccessible", ctx.IDENTIFIER(0).getSymbol(), ctx.callParameter(0).stop);

                FileGenerator.write("auto " + variable.getTranslatedName() + "=new " + variable.getTypeName() + "();");
                //FileGenerator.write(type.getName() + "*" + variable.getTranslatedName() + "=new " + variable.getTypeName() + "();");

                FileGenerator.write(type.getName() + "_allocate(" + variable.getTranslatedName() + ",std::abs(" + range.getSecond() + "-" + range.getFirst() + "));");
                FileGenerator.write(type.getName() + "_ctor(" + variable.getTranslatedName() + "," + range.getFirst() + "," + range.getSecond());
                super.visit(ctx.callParameter(0));
                FileGenerator.write(");");

                //Write the rest of the variables
                for (int i = 1; i < identifiers.size(); i++) {
                    variable = new VariableSymbol(currentScope.getEntityScope(), currentScope, ctx, identifiers.get(i).getText(), type, VariableSymbol.VariableTag.BODY);
                    variable.setTranslatedName("m_" + identifiers.get(i).getText());
                    result.add(variable);

                    //Check if function has matching parameters
                    signature = function.match(getCallParameters(ctx.callParameter(i)));
                    if (signature == null)
                        throw new FlareException("Function signature does not exist", ctx.IDENTIFIER(i).getSymbol(), ctx.callParameter(i).stop);

                    //Check function signature visibility
                    if (signature.getVisibility() == Scope.Visibility.PRIVATE)
                        if (!signature.getEntityScope().getName().equals(currentScope.getEntityScope().getName()))
                            throw  new FlareException("Scope " + function.getName() + " is protected and inaccessible", ctx.IDENTIFIER(i).getSymbol(), ctx.callParameter(i).stop);

                    FileGenerator.write(type.getName() + "*" + variable.getTranslatedName() + "=new " + variable.getTypeName() + "();");
                    FileGenerator.write(type.getName() + "_allocate(" + variable.getTranslatedName() + ",std::abs(" + range.getSecond() + "-" + range.getFirst() + "));");
                    FileGenerator.write(type.getName() + "_ctor(" + variable.getTranslatedName() + "," + range.getFirst() + "," + range.getSecond() + ",");
                    super.visit(ctx.callParameter(i));
                    FileGenerator.write(");");
                }
            }
        } catch (FlareException e) {
            System.err.println(e.getMessage());
        }

        return result;
    }

    /**
     *
     */
    @Override
    public Object visitReturnStatement(FlareParser.ReturnStatementContext ctx) {
        try {
            LinkedList<Scope> trace = (LinkedList<Scope>) super.visit(ctx.identifierSpecifier());
            if (trace == null) return null;

            if (!currentScope.getType().equals(trace.getLast().getType()))
                throw new FlareException("Return value does not match function signature", ctx.identifierSpecifier().start);

            FileGenerator.write("return " + trace.getLast().getTranslatedName() + ";");
        } catch (FlareException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    //TODO: Implement
    @Override
    public Object visitPrintStatement(FlareParser.PrintStatementContext ctx) {
        //LinkedList<Scope> trace = (LinkedList<Scope>) super.visit(ctx.identifierSpecifier());

        //FileGenerator.write("for(int " + data +"=0;" + data + "<" + variable.getTranslatedName() + ".size();" + data + "++){for(;");
        //super.visit(ctx.condition());
        FileGenerator.write(";");
        //super.visit(ctx.expression());
        FileGenerator.write("){std::cout<<");
        FileGenerator.write("<<std::endl;}}");

        return null;
    }

    @Override
    public Object visitSingleLineOrBlockBody(FlareParser.SingleLineOrBlockBodyContext ctx) {
        pushScope(new CodeBlockScope(currentScope.getEntityScope(), currentScope, ctx));
        super.visitSingleLineOrBlockBody(ctx);
        popScope();
        return null;
    }

    //</editor-fold>

    /**
     *
     * @return Type of the FunctionScope that was generated
     */
    @Override
    public Object visitFunctionCall(FlareParser.FunctionCallContext ctx) {
        LinkedList<Scope> trace = (LinkedList<Scope>) super.visit(ctx.identifierSpecifier());
        if (trace.size() == 0) return null;

        Pair<Integer, Integer> interval = getInterval(trace);

        try {
            if (trace.getLast() instanceof FunctionScope) {
                FunctionScope function = (FunctionScope) trace.getLast();
                FileGenerator.write(trace.getLast().getTranslatedName() + "(entity,");
                //TODO Figure out start and end index
                FileGenerator.write("std::abs(end-start)*" + interval.getFirst() + ",std::abs(end-start)*" + interval.getSecond());

                if (function.match(getCallParameters(ctx.callParameter())) == null)
                    throw new FlareException("Function signature does not exist", ctx.start, ctx.stop);

                super.visit(ctx.callParameter());

                FileGenerator.write(");");

                return function.getType();
            } else if (trace.getLast() instanceof VariableSymbol) {
                VariableSymbol variable = (VariableSymbol) trace.getLast();
                Type type = variable.getType();

                if (type.isPrimitive()) {
                    if (ctx.callParameter().parameterExpression().size() != 1)
                        throw new FlareException("Primitive initializer must have a single parameter", ctx.start, ctx.stop);
                    if (!type.equals(checkParameterExpression(ctx.callParameter().parameterExpression(0))))
                        throw new FlareException("Function signature does not exist", ctx.start, ctx.stop);

                    if (variable.getTag() == VariableSymbol.VariableTag.ENTITY)
                        FileGenerator.write("for(int iter=0;iter<entity->" + variable.getTranslatedName() + ".size();iter++)" + variable.getTranslatedName() + "[iter]=");
                    else
                        FileGenerator.write("for(int iter=0;iter<" + variable.getTranslatedName() + ".size();iter++)" + variable.getTranslatedName() + "[iter]=");

                    super.visit(ctx.callParameter().parameterExpression(0), "iter");
                    FileGenerator.write(";");
                } else {
                    variable.resolveType();
                    FunctionScope function = (FunctionScope) type.getReferencedScope().get(type.getName());
                    //Check if function exists
                    if (function == null)
                        throw new FlareException("Function does not exist", ctx.start, ctx.stop);

                    //Check if function has matching parameters
                    FunctionSignature signature = function.match(getCallParameters(ctx.callParameter()));
                    if (signature == null)
                        throw new FlareException("Function signature does not exist", ctx.start, ctx.stop);

                    //Check function signature visibility
                    if (signature.getVisibility() == Scope.Visibility.PRIVATE)
                        if (!signature.getEntityScope().getName().equals(currentScope.getEntityScope().getName()))
                            throw new FlareException("Scope " + function.getName() + " is protected and inaccessible", ctx.start, ctx.stop);

                    //TODO: Start - End may not be correct?
                    if (variable.getTag() == VariableSymbol.VariableTag.ENTITY)
                        FileGenerator.write(type.getName() + "_ctor(entity,std::abs(end-start)*" + interval.getFirst() + ",std::abs(end-start)*" + interval.getSecond());
                    else
                        FileGenerator.write(type.getName() + "_ctor(" + variable.getTranslatedName() + "," + interval.getFirst() + "," + interval.getSecond());

                    super.visit(ctx.callParameter());
                    FileGenerator.write(");");
                }

                return type;
            }

            throw new FlareException("Invalid function call", ctx.start, ctx.stop);
        } catch (FlareException e) {
            System.err.println(e.getMessage());
        }

        return null;
    }

    //<editor-fold desc="Parameter Expression">

    /**
     *
     * @return
     */
    private List<Type> getCallParameters(FlareParser.CallParameterContext ctx) throws FlareException {
        LinkedList<Type> result = new LinkedList<>();
        for (FlareParser.ParameterExpressionContext expression : ctx.parameterExpression())
            result.add(checkParameterExpression(expression));

        return result;
    }

    /**
     *
     * @return
     */
    private Type checkParameterExpression(FlareParser.ParameterExpressionContext ctx) throws FlareException  {
        /*
        if (ctx.castSpecifier() != null)
            return (Type) checkCastSpecifier(ctx.castSpecifier());
         */
        return checkParameterAdditiveExpression(ctx.parameterAdditiveExpression());
    }

    /**
     *
     * @return
     */
    private Type checkParameterAdditiveExpression(FlareParser.ParameterAdditiveExpressionContext ctx) throws FlareException  {
        Type type = checkParameterMultiplicativeExpression(ctx.parameterMultiplicativeExpression(0));
        for (int i = 1; i < ctx.parameterMultiplicativeExpression().size(); i++) {
            if (!type.equals(checkParameterMultiplicativeExpression(ctx.parameterMultiplicativeExpression(i))))
                throw new FlareException("Mixed types in expression", ctx.start, ctx.stop);
        }

        return type;
    }

    /**
     *
     * @return
     */
    private Type checkParameterMultiplicativeExpression(FlareParser.ParameterMultiplicativeExpressionContext ctx) throws FlareException {
        Type type = checkParameterTerm(ctx.parameterTerm(0));
        for (int i = 1; i <ctx.parameterTerm().size(); i++) {
            if (!type.equals(checkParameterTerm(ctx.parameterTerm(i))))
                throw new FlareException("Mixed types in expression", ctx.start, ctx.stop);
        }

        return type;
    }

    /**
     *
     * @return
     */
    private Type checkParameterTerm(FlareParser.ParameterTermContext ctx) throws FlareException {
        Type type;

        if (ctx.identifierSpecifier() != null) {
            LinkedList<Scope> trace = (LinkedList<Scope>) super.visit(ctx.identifierSpecifier());

            try {
                type = ((VariableSymbol) trace.getLast()).getType();
            } catch (NoSuchElementException e) {
                throw new FlareException("Variable " + ctx.identifierSpecifier().getText() + " not found", ctx.start, ctx.stop);
            } catch (ClassCastException e) {
                throw new FlareException("Identifier " + ctx.identifierSpecifier().getText() + " is not a variable", ctx.start, ctx.stop);
            }
        } else if (ctx.functionCall() != null) {
            LinkedList<Scope> trace = (LinkedList<Scope>) super.visit(ctx.functionCall().identifierSpecifier());

            try {
                FunctionScope function = (FunctionScope) trace.getLast();
                FunctionSignature signature = function.match(getCallParameters(ctx.functionCall().callParameter()));
                if (signature == null)
                    throw new FlareException("Function signature does not exist", ctx.functionCall().start, ctx.functionCall().stop);

                if (signature.getVisibility() == Scope.Visibility.PRIVATE)
                    if (!signature.getEntityScope().getName().equals(currentScope.getEntityScope().getName()))
                        throw new FlareException("Scope " + function.getName() + " is protected and inaccessible", ctx.functionCall().start, ctx.functionCall().stop);

                type = function.getType();
            } catch (NoSuchElementException e) {
                throw new FlareException("Function " + ctx.functionCall().identifierSpecifier().getText() + " not found", ctx.start, ctx.stop);
            } catch (ClassCastException e) {
                throw new FlareException("Identifier " + ctx.functionCall().identifierSpecifier().getText() + " is not a function", ctx.start, ctx.stop);
            }
        } else if (ctx.parameterExpression() != null) {
            type = checkParameterExpression(ctx.parameterExpression());
        } else if (ctx.ITER() != null) {
            type = new Type(Type.Typetype.INT, 0, 1);
        } else {
            type = Type.getType(ctx.literal());
        }

        return type;
    }

    @Override
    public Object visitCallParameter(FlareParser.CallParameterContext ctx) {
        for (int i = 0; i < ctx.parameterExpression().size(); i++) {
            FileGenerator.write(",[](int iter){return ");
            super.visit(ctx.parameterExpression(i), "iter");
            FileGenerator.write("}");
        }

        return null;
    }

    @Override
    public Object visitParameterAdditiveExpression(FlareParser.ParameterAdditiveExpressionContext ctx) {
        super.visit(ctx.parameterMultiplicativeExpression(0));

        for (int i = 1; i < ctx.children.size(); i+=2) {
            FileGenerator.write(ctx.getChild(i).getText());
            super.visit(ctx.getChild(i + 1));
        }

        return null;
    }

    @Override
    public Object visitParameterMultiplicativeExpression(FlareParser.ParameterMultiplicativeExpressionContext ctx) {
        super.visit(ctx.parameterTerm(0));

        for (int i = 1; i < ctx.children.size(); i+=2) {
            FileGenerator.write(ctx.getChild(i).getText());
            super.visit(ctx.getChild(i + 1));
        }

        return null;
    }


    @Override
    public Object visitParameterTerm(FlareParser.ParameterTermContext ctx) {
        if (ctx.identifierSpecifier() != null) {
            LinkedList<Scope> trace = (LinkedList<Scope>) super.visit(ctx.identifierSpecifier());
            VariableSymbol variable = (VariableSymbol) trace.getLast();

            switch (variable.getTag()) {
                case PARAMETER:
                    FileGenerator.write(variable.getTranslatedName() + "(" + data + ")");
                    break;
                default:
                    FileGenerator.write(variable.getTranslatedName() + "[" + data + "]");
                    break;
            }
        } else if (ctx.functionCall() != null) {
            //TODO Function call
            LinkedList<Scope> trace = (LinkedList<Scope>) super.visit(ctx.functionCall().identifierSpecifier());
        } else if (ctx.parameterExpression() != null) {
            FileGenerator.write("(");
            super.visit(ctx.parameterExpression());
            FileGenerator.write(")");
        } else {
            FileGenerator.write(ctx.getText());
        }

        return null;
    }
    //</editor-fold>

    @Override
    public Object visitAssignment(FlareParser.AssignmentContext ctx) {
        //Get identifier scope
        LinkedList<Scope> trace = (LinkedList<Scope>) super.visit(ctx.identifierSpecifier());
        if (trace.size() == 0) return null;

        try {
            VariableSymbol variable = (VariableSymbol) trace.getLast();
            Pair<Integer, Integer> interval = getInterval(trace);
            Type other = checkExpression(ctx.expression());
            if (!variable.getType().equals(other))
                throw new FlareException("Mismatching types " + variable.getType().getName() + "::<" + variable.getType().getStart() + ", " + variable.getType().getEnd() + "> and "
                        + other.getName()+ "::<" + other.getStart() + ", " + other.getEnd() + ">" , ctx.start, ctx.stop);

            if (variable.isPrimitive()) {
                String i = data + "i";

                if (variable.getTag() == VariableSymbol.VariableTag.ENTITY)
                    FileGenerator.write("for(int " + i + "=std::abs(end-start)*" + interval.getFirst() + ";" + i + "<std::abs(end-start)*" + interval.getSecond() + ";" + i + "++)");
                else
                    FileGenerator.write("for(int " + i + "=" + variable.getType().getLength() + "*" + interval.getFirst() + ";" + i + "<" + variable.getType().getLength() + "*" + interval.getSecond() + ";" + i + "++)");

                if (variable.getTag() == VariableSymbol.VariableTag.PARAMETER)
                    FileGenerator.write(variable.getTranslatedName() + "(" + i + ")" + ctx.assign().getText());
                else if (variable.getTag() == VariableSymbol.VariableTag.ENTITY)
                    FileGenerator.write("entity->" + variable.getTranslatedName() + "[" + i + "]" + ctx.assign().getText());
                else if (variable.getTag() == VariableSymbol.VariableTag.BODY)
                    FileGenerator.write(variable.getTranslatedName() + "[" + i + "]" + ctx.assign().getText());

                super.visit(ctx.expression(), i);

                FileGenerator.write(";");
            } else {
                if (ctx.assign().ASSIGN() == null)
                    throw new FlareException("Invalid operator on entity", ctx.assign().ASSIGN().getSymbol());

                //TODO Figure out start and end index
                FileGenerator.write(variable.getTypeName() + "::assign(" + variable.getTranslatedName() + "," + interval.getFirst() + "," + interval.getSecond());

                super.visit(ctx.expression());
            }
        } catch (ClassCastException e) {
            System.err.println(new FlareException("Identifier " + trace.getLast().getName() + " is not a variable", ctx.start, ctx.stop).getMessage());
        } catch (FlareException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    //<editor-fold desc="Expression">
    /**
     *
     * @return
     */
    private Type checkExpression(FlareParser.ExpressionContext ctx) throws FlareException  {
        /*
        if (ctx.castSpecifier() != null)
            return (Type) checkCastSpecifier(ctx.castSpecifier());
         */
        return checkAdditiveExpression(ctx.additiveExpression());
    }

    /**
     *
     * @return
     */
    private Type checkAdditiveExpression(FlareParser.AdditiveExpressionContext ctx) throws FlareException  {
        Type type = checkMultiplicativeExpression(ctx.multiplicativeExpression(0));
        for (int i = 1; i < ctx.multiplicativeExpression().size(); i++) {
            if (!type.equals(checkMultiplicativeExpression(ctx.multiplicativeExpression(i))))
                throw new FlareException("Mixed types in expression", ctx.start, ctx.stop);
        }

        return type;
    }

    /**
     *
     * @return
     */
    private Type checkMultiplicativeExpression(FlareParser.MultiplicativeExpressionContext ctx) throws FlareException {
        Type type = checkTerm(ctx.term(0));
        for (int i = 1; i <ctx.term().size(); i++) {
            if (!type.equals(checkTerm(ctx.term(i))))
                throw new FlareException("Mixed types in expression", ctx.start, ctx.stop);
        }

        return type;
    }

    /**
     *
     * @return
     */
    private Type checkTerm(FlareParser.TermContext ctx) throws FlareException {
        Type type;

        if (ctx.identifierSpecifier() != null) {
            LinkedList<Scope> trace = (LinkedList<Scope>) super.visit(ctx.identifierSpecifier());

            try {
                type = ((VariableSymbol) trace.getLast()).getType();
            } catch (NoSuchElementException e) {
                throw new FlareException("Variable " + ctx.identifierSpecifier().getText() + " not found", ctx.start, ctx.stop);
            } catch (ClassCastException e) {
                throw new FlareException("Identifier " + ctx.identifierSpecifier().getText() + " is not a variable", ctx.start, ctx.stop);
            }
        } else if (ctx.functionCall() != null) {
            LinkedList<Scope> trace = (LinkedList<Scope>) super.visit(ctx.functionCall().identifierSpecifier());

            try {
                FunctionScope function = (FunctionScope) trace.getLast();
                FunctionSignature signature = function.match(getCallParameters(ctx.functionCall().callParameter()));
                if (signature == null)
                    throw new FlareException("Function signature does not exist", ctx.functionCall().start, ctx.functionCall().stop);

                if (signature.getVisibility() == Scope.Visibility.PRIVATE)
                    if (!signature.getEntityScope().getName().equals(currentScope.getEntityScope().getName()))
                        throw  new FlareException("Scope " + function.getName() + " is protected and inaccessible", ctx.functionCall().start, ctx.functionCall().stop);

                type = function.getType();
            } catch (NoSuchElementException e) {
                throw new FlareException("Function " + ctx.functionCall().identifierSpecifier().getText() + " not found", ctx.start, ctx.stop);
            } catch (ClassCastException e) {
                throw new FlareException("Identifier " + ctx.functionCall().identifierSpecifier().getText() + " is not a function", ctx.start, ctx.stop);
            }
        } else if (ctx.expression() != null) {
            type = checkExpression(ctx.expression());
        } else {
            type = Type.getType(ctx.literal());
        }

        return type;
    }

    @Override
    public Object visitExpression(FlareParser.ExpressionContext ctx) {
        super.visitExpression(ctx);

        /*
        if (ctx.castSpecifier() != null)
            return super.visit(ctx.castSpecifier());
         */

        return null;
    }

    @Override
    public Object visitAdditiveExpression(FlareParser.AdditiveExpressionContext ctx) {
        super.visit(ctx.multiplicativeExpression(0));

        for (int i = 1; i < ctx.children.size(); i+=2) {
            FileGenerator.write(ctx.getChild(i).getText());

            super.visit(ctx.getChild(i + 1));
        }

        return null;
    }

    @Override
    public Object visitMultiplicativeExpression(FlareParser.MultiplicativeExpressionContext ctx) {
        super.visit(ctx.term(0));

        for (int i = 1; i < ctx.children.size(); i += 2) {
            FileGenerator.write(ctx.getChild(i).getText());
            super.visit(ctx.getChild(i + 1));
        }

        return null;
    }

    @Override
    public Object visitTerm(FlareParser.TermContext ctx) {
        if (ctx.identifierSpecifier() != null) {
            LinkedList<Scope> trace = (LinkedList<Scope>) super.visit(ctx.identifierSpecifier());
            VariableSymbol variable = (VariableSymbol) trace.getLast();

            switch (variable.getTag()) {
                case PARAMETER:
                    FileGenerator.write(variable.getTranslatedName() + "(" + data + ")");
                    break;
                default:
                    FileGenerator.write(variable.getTranslatedName() + "[" + data + "]");
                    break;
            }
        } else if (ctx.functionCall() != null) {
            //TODO Function call
            LinkedList<Scope> trace = (LinkedList<Scope>) super.visit(ctx.functionCall().identifierSpecifier());
        } else if (ctx.expression() != null) {
            FileGenerator.write("(");
            super.visit(ctx.expression(), data);
            FileGenerator.write(")");
        } else {
            FileGenerator.write(ctx.getText());
        }

        return null;
    }
    //</editor-fold>

    //<editor-fold desc="Condition">
    private Type checkCondition(FlareParser.ConditionContext ctx) throws FlareException {
        if (ctx.BOOL_LITERAL() != null) {
            return new Type(Type.Typetype.BOOLEAN, 0, 1);
        } else {
            Type type = checkComparator(ctx.comparator(0));
            if (ctx.comparator().size() > 1)
                if (!type.equals(checkComparator(ctx.comparator(1))))
                    throw new FlareException("Mixed types in expression", ctx.start, ctx.stop);

            return type;
        }
    }

    private Type checkComparator(FlareParser.ComparatorContext ctx) throws FlareException  {
        if (ctx.condition() != null) {
            return checkCondition(ctx.condition());
        } else {
            Type type = checkExpression(ctx.expression(0));
            if (!type.equals(checkExpression(ctx.expression(1))))
                throw new FlareException("Mixed types in expression", ctx.start, ctx.stop);

            return type;
        }
    }

    @Override
    public Object visitCondition(FlareParser.ConditionContext ctx) {
        if (ctx.BOOL_LITERAL() != null) {
            FileGenerator.write(ctx.getText());
        } else {
            super.visit(ctx.comparator(0));

            for (int i = 1; i < ctx.children.size(); i += 2) {
                FileGenerator.write(ctx.getChild(i).getText());
                super.visit(ctx.getChild(i + 1));
            }
        }
        return null;
    }

    @Override
    public Object visitComparison(FlareParser.ComparisonContext ctx) {
        FileGenerator.write(ctx.getText());
        return null;
    }
    //</editor-fold>

    @Override
    public Object visitArraySpecifier(FlareParser.ArraySpecifierContext ctx) {
        TerminalNode range = ctx.INTEGER_LITERAL();
        return new Pair<>(0, range == null ? 1 : Integer.parseInt(range.getText()));
    }

    @Override
    public Object visitCastSpecifier(FlareParser.CastSpecifierContext ctx) {
        FileGenerator.write("(" + ctx.primitiveType().getText() + ")");
        return null;
    }

    public Type checkCastSpecifier(FlareParser.CastSpecifierContext ctx) {
        if (ctx.arraySpecifier() == null) ctx.addChild(new FlareParser.ArraySpecifierContext(ctx, ctx.invokingState));
        Pair<Integer, Integer> range = (Pair<Integer, Integer>)super.visit(ctx.arraySpecifier());

        return new Type(ctx.primitiveType().getText(), range.getFirst(), range.getSecond());
    }

    @Override
    public Object visitIdentifierSpecifier(FlareParser.IdentifierSpecifierContext ctx) {
        LinkedList<Scope> trace = new LinkedList<>();
        // Return the scope track of the identifier list
        try {
            if (ctx.THIS() != null)
                trace = currentScope.getEntityScope().resolve(currentScope.getEntityScope(), new LinkedList<>(ctx.IDENTIFIER()), new LinkedList<>());
            else
                trace = currentScope.resolve(currentScope.getEntityScope(), new LinkedList<>(ctx.IDENTIFIER()), new LinkedList<>());
        } catch (InvalidScopeException e) {
                System.err.println(new FlareException("Scope " + ctx.getText() + " is protected and inaccessible", ctx.start, ctx.stop).getMessage());
        } catch (ScopeException e) {
            System.err.println(new FlareException("Identifier " + ctx.getText() + " not found", ctx.start, ctx.stop).getMessage());
        }

        //System.out.println(trace);
        return trace;
    }

    @Override
    public Object visitDeclarationStatementSingular(FlareParser.DeclarationStatementSingularContext ctx) {
        try {
            if (ctx.arraySpecifier().size() == 0)
                ctx.addChild(new FlareParser.ArraySpecifierContext(ctx, ctx.invokingState));
            Pair<Integer, Integer> range = (Pair<Integer, Integer>) super.visit(ctx.arraySpecifier(0));

            Type type = new Type(ctx.variableType().getText(), range.getFirst(), range.getSecond());

            VariableSymbol variable = new VariableSymbol(currentScope.getEntityScope(), currentScope, ctx, ctx.IDENTIFIER().getText(), type, VariableSymbol.VariableTag.BODY);
            variable.setTranslatedName("m_" + ctx.IDENTIFIER().getText());
            variable.resolveType();
        } catch (FlareException e) {
            System.err.println(e.getMessage());
        }

        return null;
    }

    //TODO
    private Pair<Integer, Integer> getInterval(LinkedList<Scope> trace) {
        int first = 0, second = 1;
        VariableSymbol component = null;

        for (int i = trace.size() - 1; i >= 0; i--) {
            if (trace.get(i) instanceof VariableSymbol) {
                component = (VariableSymbol) trace.get(i);
            } else if (trace.get(i) instanceof EntityScope) {
                if (component == null) continue;
                EntityScope entity = (EntityScope) trace.get(i);

                first = entity.getComponentIndex(component);
                second = first + entity.getComponentSize(component);
            }
        }

        return new Pair<>(first, second);
    }
}
