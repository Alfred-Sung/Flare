import Flare.FlareParser;
import Flare.util.BaseVisitor;
import Flare.util.FileGenerator;
import exception.FlareException;
import symbtab.exception.InvalidScopeException;
import symbtab.exception.ScopeException;
import kotlin.Pair;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import symbtab.*;

import java.util.LinkedList;
import java.util.List;

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
        FileGenerator.write("{");
        if (ctx.forStatement() != null)
            super.visit(ctx.getChild(ctx.children.size() - 1), data + "i");
        else
            super.visit(ctx.getChild(ctx.children.size() - 1));
        FileGenerator.write("}");

        return null;
    }

    //TODO: Implement
    @Override
    public Object visitIfStatement(FlareParser.IfStatementContext ctx) {
        return super.visitIfStatement(ctx);
    }

    /**
     *
     */
    @Override
    public Object visitForStatement(FlareParser.ForStatementContext ctx) {
        VariableSymbol variable = ((List<VariableSymbol>) super.visit(ctx.newStatement())).get(0);

        FileGenerator.write("for(int " + data +"=0;" + data + "<" + variable.getTranslatedName() + ".size();" + data + "++){for(;");
        super.visit(ctx.condition());
        FileGenerator.write(";");
        super.visit(ctx.expression());
        FileGenerator.write("){");
        super.visit(ctx.singleLineOrBlockBody());
        FileGenerator.write("}}");

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
                    if (signature.getEntityScope().getName() != currentScope.getEntityScope().getName())
                        throw  new FlareException("Scope " + function.getName() + " is protected and inaccessible", ctx.IDENTIFIER(0).getSymbol(), ctx.callParameter(0).stop);

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
                        if (signature.getEntityScope().getName() != currentScope.getEntityScope().getName())
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
        LinkedList<Scope> trace = (LinkedList<Scope>) super.visit(ctx.identifierSpecifier());

        //FileGenerator.write("for(int " + data +"=0;" + data + "<" + variable.getTranslatedName() + ".size();" + data + "++){for(;");
        //super.visit(ctx.condition());
        FileGenerator.write(";");
        //super.visit(ctx.expression());
        FileGenerator.write("){std::cout<<");
        FileGenerator.write("<<std::endl;}}");

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

        try {
            if (trace.getLast() instanceof FunctionScope) {
                FunctionScope function = (FunctionScope) trace.getLast();

                FileGenerator.write(trace.getLast().getTranslatedName() + "(entity,");
                //TODO Figure out start and end index

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
                        if (signature.getEntityScope().getName() != currentScope.getEntityScope().getName())
                            throw new FlareException("Scope " + function.getName() + " is protected and inaccessible", ctx.start, ctx.stop);

                    //TODO: Start - End may not be correct?
                    FileGenerator.write(type.getName() + "_ctor(" + variable.getTranslatedName() + "," + type.getStart() + "," + type.getEnd());
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
                throw new FlareException("Mixed types in expression", ((ParserRuleContext) ctx.getChild(i * 2)).start);
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
                throw new FlareException("Mixed types in expression", ((ParserRuleContext) ctx.getChild(i * 2)).start);
        }

        return type;
    }

    /**
     *
     * @return
     */
    //TODO Function call
    private Type checkParameterTerm(FlareParser.ParameterTermContext ctx) throws FlareException {
        Type type = null;

        if (ctx.identifierSpecifier() != null) {
            LinkedList<Scope> trace = (LinkedList<Scope>) super.visit(ctx.identifierSpecifier());
            type = trace.getLast().getType();
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

    //TODO Function call
    @Override
    public Object visitParameterTerm(FlareParser.ParameterTermContext ctx) {
        if (ctx.identifierSpecifier() != null) {
            LinkedList<Scope> trace = (LinkedList<Scope>) super.visit(ctx.identifierSpecifier());
            //TODO Variable access problem
            FileGenerator.write(trace.getLast().getTranslatedName() + "(" + data + ")");
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
        LinkedList<Scope> trace = (LinkedList<Scope>) super.visit(ctx.identifierSpecifier());
        if (trace.size() == 0) return null;

        try {
            VariableSymbol variable = (VariableSymbol) trace.getLast();

            if (variable.isPrimitive()) {
                String i = data + "i";
                FileGenerator.write("for(int " + i + "=0; " + i + "<" + variable.getTranslatedName() + ".size();  " + i + "++)" + variable.getTranslatedName() + "[" + i + "]" + ctx.assign().getText());

                if (!variable.getType().equals(super.visit(ctx.expression(), i)))
                    throw new FlareException("Mismatching types", ctx.assign().start);

                FileGenerator.write(";");
            } else {
                if (ctx.assign().ASSIGN() == null)
                    throw new FlareException("Invalid operator on entity", ctx.assign().ASSIGN().getSymbol());

                FileGenerator.write(variable.getTypeName() + "::assign(" + variable.getTranslatedName() + ",");

                if (!variable.getType().equals(super.visit(ctx.expression())))
                    throw new FlareException("Mismatching types", ctx.assign().start);
                FileGenerator.write(");");
            }
        }catch (FlareException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    //<editor-fold desc="Expression">
    @Override
    public Object visitExpression(FlareParser.ExpressionContext ctx) {
        Type type = (Type) super.visitExpression(ctx);

        /*
        if (ctx.castSpecifier() != null)
            return super.visit(ctx.castSpecifier());
         */

        return type;
    }

    @Override
    public Object visitAdditiveExpression(FlareParser.AdditiveExpressionContext ctx) {
        Type type = (Type) super.visit(ctx.multiplicativeExpression(0));

        try {
            for (int i = 1; i < ctx.children.size(); i+=2) {
                FileGenerator.write(ctx.getChild(i).getText());

                if (!type.equals(super.visit(ctx.getChild(i + 1))))
                    throw new FlareException("Mixed types in expression", ((ParserRuleContext)ctx.getChild(i + 1)).start);
            }
        } catch (FlareException e) {
            System.err.println(e.getMessage());
        }

        return type;
    }

    @Override
    public Object visitMultiplicativeExpression(FlareParser.MultiplicativeExpressionContext ctx) {
        Type type = (Type) super.visit(ctx.term(0));

        try {
            for (int i = 1; i < ctx.children.size(); i += 2) {
                FileGenerator.write(ctx.getChild(i).getText());

                if (!type.equals(super.visit(ctx.getChild(i + 1))))
                    throw new FlareException("Mixed types in expression", ((ParserRuleContext)ctx.getChild(i + 1)).start);
            }
        } catch (FlareException e) {
            System.err.println(e.getMessage());
        }

        return type;
    }

    @Override
    public Object visitTerm(FlareParser.TermContext ctx) {
        Type type = null;

        if (ctx.identifierSpecifier() != null) {
            LinkedList<Scope> trace = (LinkedList<Scope>) super.visit(ctx.identifierSpecifier());
            //TODO Variable access problem
            FileGenerator.write(trace.getLast().getTranslatedName() + "(" + data + ")");
            type = trace.getLast().getType();
        } else if (ctx.expression() != null) {
            FileGenerator.write("(");
            type = (Type) super.visit(ctx.expression(), data);
            FileGenerator.write(")");
        } else if (ctx.functionCall() != null) {
            type = (Type) super.visit(ctx.functionCall());
        } else {
            FileGenerator.write(ctx.getText());
            type = Type.getType(ctx.literal());
        }

        return type;
    }
//</editor-fold>

    //<editor-fold desc="Condition">
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
        return new Pair(0, range == null ? 1 : Integer.parseInt(range.getText()));
    }

    @Override
    public Object visitCastSpecifier(FlareParser.CastSpecifierContext ctx) {
        FileGenerator.write("(" + ctx.primitiveType().getText() + ")");
        return null;
    }

    public Object checkCastSpecifier(FlareParser.CastSpecifierContext ctx) {
        if (ctx.arraySpecifier() == null) ctx.addChild(new FlareParser.ArraySpecifierContext(ctx, ctx.invokingState));
        Pair<Integer, Integer> range = (Pair<Integer, Integer>)super.visit(ctx.arraySpecifier());

        Type type = new Type(ctx.primitiveType().getText(), range.getFirst(), range.getSecond());

        return type;
    }

    @Override
    public Object visitIdentifierSpecifier(FlareParser.IdentifierSpecifierContext ctx) {
        LinkedList<Scope> trace = new LinkedList<>();
        // Return the scope track of the identifier list
        try {
            if (ctx.THIS() != null)
                trace = currentScope.getEnclosedScope().resolve(currentScope.getEntityScope(), new LinkedList<>(ctx.IDENTIFIER()), new LinkedList<Scope>());
            else
                trace = currentScope.resolve(currentScope.getEntityScope(), new LinkedList<>(ctx.IDENTIFIER()), new LinkedList<Scope>());
        } catch (ScopeException e) {
            //TODO Use InvalidScopeException to make message better
            System.err.println(new FlareException(e.getMessage(), ctx.start, ctx.stop).getMessage());
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
}
