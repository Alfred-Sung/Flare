import Flare.FlareParser;
import Flare.util.FileGenerator;
import exception.FlareException;
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

    @Override
    public Object visitIfStatement(FlareParser.IfStatementContext ctx) {
        return super.visitIfStatement(ctx);
    }

    @Override
    public Object visitForStatement(FlareParser.ForStatementContext ctx) {
        VariableSymbol variable = ((List<VariableSymbol>)super.visit(ctx.newStatement())).get(0);

        FileGenerator.write("for(int " + data +"=0;" + data + "<" + variable.getTranslatedName() + ".size();" + data + "++){for(;");
        super.visit(ctx.condition());
        FileGenerator.write(";");
        super.visit(ctx.expression());
        FileGenerator.write("){");
        super.visit(ctx.singleLineOrBlockBody());
        FileGenerator.write("}}");

        return null;
    }

    @Override
    public Object visitWhileStatement(FlareParser.WhileStatementContext ctx) {
        return super.visitWhileStatement(ctx);
    }

    @Override
    public Object visitNewStatement(FlareParser.NewStatementContext ctx) {
        List<VariableSymbol> result = new LinkedList<>();

        if (ctx.arraySpecifier().size() == 0) ctx.addChild(new FlareParser.ArraySpecifierContext(ctx, ctx.invokingState));
        Pair<Integer, Integer> range = (Pair<Integer, Integer>)super.visit(ctx.arraySpecifier(0));

        Type type = new Type(ctx.variableType().getText(), range.getFirst(), range.getSecond());
        List<TerminalNode> identifiers = ctx.IDENTIFIER();

        VariableSymbol variable = new VariableSymbol(currentScope, ctx, identifiers.get(0).getText(), type);
        variable.setTranslatedName("m_" + identifiers.get(0).getText());

        result.add(variable);

        try {
            if (type.isPrimitive()) {
                for (FlareParser.CallParameterContext parameterContext : ctx.callParameter())
                    if (parameterContext.parameterExpression().size() != 1) throw new FlareException("Primitive initializer must have a single parameter", parameterContext.start);

                FileGenerator.write("std::vector<" + type.getName() + ">" + variable.getTranslatedName() + "=std::vector<" + type.getName() + ">(" + range.getSecond() + "," + range.getFirst() + ");");
                FileGenerator.write("for(int iter=0;iter<" + variable.getTranslatedName() + ".size();iter++)" + variable.getTranslatedName() + "[iter]=");
                super.visit(ctx.callParameter(0), "iter");
                FileGenerator.write(";");

                for (int i = 1; i < identifiers.size(); i++) {
                    variable = new VariableSymbol(currentScope, ctx, identifiers.get(i).getText(), type);
                    variable.setTranslatedName("m_" + identifiers.get(i).getText());
                    result.add(variable);

                    FileGenerator.write("std::vector<" + type.getName() + ">" + variable.getTranslatedName() + "=std::vector<" + type.getName() + ">(" + range.getSecond() + "," + range.getFirst() + ");");
                    FileGenerator.write("for(int iter=0;iter<" + variable.getTranslatedName() + ".size();iter++)" + variable.getTranslatedName() + "[iter]=");
                    super.visit(ctx.callParameter(i), "iter");
                    FileGenerator.write(";");
                }
            } else {
                //TODO Function constructor signature resolve-find
                variable.resolveType();

                FileGenerator.write(type.getName() + "*" + variable.getTranslatedName() + ";");
                FileGenerator.write(type.getName() + "_allocate(entity,Math.abs(" + range.getSecond() + "," + range.getFirst() + "));");
                FileGenerator.write(type.getName() + "_ctor(" + variable.getTranslatedName() + "," + range.getFirst() + "," + range.getSecond());
                FileGenerator.write(");");

                for (int i = 1; i < identifiers.size(); i++) {
                    variable = new VariableSymbol(currentScope, ctx, identifiers.get(i).getText(), type);
                    variable.setTranslatedName("m_" + identifiers.get(i).getText());
                    result.add(variable);

                    FileGenerator.write(type.getName() + "*" + variable.getTranslatedName() + ";");
                    FileGenerator.write(type.getName() + "_allocate(entity,Math.abs(" + range.getSecond() + "," + range.getFirst() + "));");
                    FileGenerator.write(type.getName() + "_ctor(" + variable.getTranslatedName() + "," + range.getFirst() + "," + range.getSecond());
                    FileGenerator.write(");");
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return result;
    }
    //</editor-fold>

    //TODO Function signature resolve-find
    @Override
    public Object visitFunctionCall(FlareParser.FunctionCallContext ctx) {
        LinkedList<Scope> trace = (LinkedList<Scope>) super.visit(ctx.identifierSpecifier());
        FileGenerator.write(trace.getLast().getTranslatedName()+ "(");

        List<FlareParser.ParameterExpressionContext> parameters = (List<FlareParser.ParameterExpressionContext>)super.visit(ctx.callParameter());
        FunctionScope function = (FunctionScope) trace.getLast();
        List<VariableSymbol> signature = function.getSignature();

        try {
            if (function.getSignature().size() != parameters.size())
                throw new FlareException("Mismatched function call parameters", ((ParserRuleContext)currentScope.getNode()).start);

            if (parameters.size() > 0) {
                FileGenerator.write("[](int iter)->" + signature.get(0).getType().getName() + "{return " + parameters.get(0).getText() + ";}");

                for (int i = 1; i < signature.size(); i++) {
                    FileGenerator.write(",[](int iter)->" + signature.get(i).getType().getName() + "{return " + parameters.get(i).getText() + ";}");
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        FileGenerator.write(")");

        return null;
    }

    @Override
    public Object visitAssignment(FlareParser.AssignmentContext ctx) {
        LinkedList<Scope> trace = (LinkedList<Scope>) super.visit(ctx.identifierSpecifier());
        VariableSymbol variable = (VariableSymbol) trace.getLast();

        //TODO Differentiate between primitive and entity assignments
        try {
            if (variable.isPrimitive()) {
                FileGenerator.write("for(int i=0;i<" + variable.getTranslatedName() + ".size(); i++)" + variable.getTranslatedName() + "[i]" + ctx.assign().getText());
                super.visit(ctx.expression());
                FileGenerator.write(";");
            } else {
                if (ctx.assign().ASSIGN() == null)
                    throw new FlareException("Invalid operator on entity", ctx.assign().ASSIGN().getSymbol());

                FileGenerator.write(variable.getTypeName() + "::assign(" + variable.getTranslatedName() + ",");
                super.visit(ctx.expression());
                FileGenerator.write(");");
            }
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    //<editor-fold desc="Parameter Expression">
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
            FileGenerator.write(trace.getLast().getTranslatedName() + "[ " + data +"]");
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

    //<editor-fold desc="Expression">
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

        for (int i = 1; i < ctx.children.size(); i+=2) {
            FileGenerator.write(ctx.getChild(i).getText());
            super.visit(ctx.getChild(i + 1));
        }

        return null;
    }

    @Override
    public Object visitPreUnaryExpression(FlareParser.PreUnaryExpressionContext ctx) {
        LinkedList<Scope> trace = (LinkedList<Scope>) super.visit(ctx.identifierSpecifier());
        FileGenerator.write(ctx.getChild(0).getText() + trace.getLast().getTranslatedName());
        FileGenerator.write("[" + data + "]");

        return null;
    }

    @Override
    public Object visitPostUnaryExpression(FlareParser.PostUnaryExpressionContext ctx) {
        LinkedList<Scope> trace = (LinkedList<Scope>) super.visit(ctx.identifierSpecifier());
        FileGenerator.write(trace.getLast().getTranslatedName() + "[" + data + "]");
        FileGenerator.write(ctx.getChild(1).getText());

        return null;
    }

    @Override
    public Object visitTerm(FlareParser.TermContext ctx) {
        if (ctx.identifierSpecifier() != null) {
            LinkedList<Scope> trace = (LinkedList<Scope>) super.visit(ctx.identifierSpecifier());
            FileGenerator.write(trace.getLast().getTranslatedName() + "[" + data + "]");
        } else if (ctx.expression() != null) {
            FileGenerator.write("(");
            super.visit(ctx.expression());
            FileGenerator.write(")");
        } else {
            FileGenerator.write(ctx.getText());
        }

        return null;
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
    public Object visitIdentifierSpecifier(FlareParser.IdentifierSpecifierContext ctx) {
        LinkedList<Scope> trace;
        // Return the scope track of the identifier list
        if (ctx.THIS() != null)
            trace = currentScope.getEnclosedScope().resolve(new LinkedList<>(ctx.IDENTIFIER()), new LinkedList<Scope>());
        else
            trace = currentScope.resolve(new LinkedList<>(ctx.IDENTIFIER()), new LinkedList<Scope>());

        //System.out.println(trace);
        return trace;
    }

    @Override
    public Object visitDeclarationStatementSingular(FlareParser.DeclarationStatementSingularContext ctx) {
        if (ctx.arraySpecifier().size() == 0) ctx.addChild(new FlareParser.ArraySpecifierContext(ctx, ctx.invokingState));
        Pair<Integer, Integer> range = (Pair<Integer, Integer>)super.visit(ctx.arraySpecifier(0));

        Type type = new Type(ctx.variableType().getText(), range.getFirst(), range.getSecond());

        VariableSymbol variable = new VariableSymbol(currentScope, ctx, ctx.IDENTIFIER().getText(), type);
        variable.setTranslatedName("m_" + ctx.IDENTIFIER().getText());
        variable.resolveType();

        return null;
    }
}
