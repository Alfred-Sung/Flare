import Flare.FlareParser;
import Flare.util.FileGenerator;
import exception.FlareException;
import kotlin.Pair;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import symbtab.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MethodGenerator extends BaseVisitor {
    public void setCurrentScope(Scope scope) {
        currentScope = scope;
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

    @Override
    public Object visitBuiltinFunctions(FlareParser.BuiltinFunctionsContext ctx) {
        FileGenerator.write("{");
        super.visitBuiltinFunctions(ctx);
        FileGenerator.write("}");

        return null;
    }

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
    public Object visitCallParameter(FlareParser.CallParameterContext ctx) { return ctx.parameterExpression(); }

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
    public Object visitNewStatement(FlareParser.NewStatementContext ctx) {
        if (ctx.arraySpecifier().size() == 0) ctx.addChild(new FlareParser.ArraySpecifierContext(ctx, ctx.invokingState));
        Pair<Integer, Integer> range = (Pair<Integer, Integer>)super.visit(ctx.arraySpecifier(0));

        Type type = new Type(ctx.variableType().getText(), range.getFirst(), range.getSecond());
        List<TerminalNode> identifiers = ctx.IDENTIFIER();

        VariableSymbol variable = new VariableSymbol(currentScope, ctx, identifiers.get(0).getText(), type);
        variable.setTranslatedName("m_" + identifiers.get(0).getText());
        variable.resolveType();

        try {
            if (type.isPrimitive()) {
                for (FlareParser.CallParameterContext parameterContext : ctx.callParameter())
                    if (parameterContext.parameterExpression().size() != 1) throw new FlareException("Primitive initializer must have a single parameter", parameterContext.start);

                FileGenerator.write("std::vector<" + type.getName() + ">" + variable.getTranslatedName() + "=std::vector<" + type.getName() + ">(" + range.getSecond() + "," + range.getFirst() + ");");
                FileGenerator.write("for(int iter=0;iter<" + variable.getTranslatedName() + ";iter++)" + variable.getTranslatedName() + "[iter]=" + ctx.callParameter(0).getText() + ";");

                for (int i = 1; i < identifiers.size(); i++) {
                    variable = new VariableSymbol(currentScope, ctx, identifiers.get(i).getText(), type);
                    variable.setTranslatedName("m_" + identifiers.get(i).getText());

                    FileGenerator.write("std::vector<" + type.getName() + ">" + variable.getTranslatedName() + "=std::vector<" + type.getName() + ">(" + range.getSecond() + "," + range.getFirst() + ");");
                    FileGenerator.write("for(int iter=0;iter<" + variable.getTranslatedName() + ".size();iter++)" + variable.getTranslatedName() + "[iter]=" + ctx.callParameter(i).getText() + ";");
                }
            } else {
                //TODO Function constructor signature resolve-find
                variable.resolveType();

                FileGenerator.write(type.getName() + "*" + variable.getTranslatedName() + ";");
                FileGenerator.write(type.getName() + "_allocate(entity,Math.abs(" + range.getSecond() + "," + range.getFirst() + "));");
                FileGenerator.write(type.getName() + "_ctor(" + variable.getTranslatedName() + "," + range.getFirst() + "," + range.getSecond());

                FileGenerator.write(");");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return null;
    }

    @Override
    public Object visitAssignment(FlareParser.AssignmentContext ctx) {
        LinkedList<Scope> trace = (LinkedList<Scope>) super.visit(ctx.identifierSpecifier());
        VariableSymbol variable = (VariableSymbol) trace.getLast();

        FileGenerator.write("for (int i = 0; i < " + variable.getTranslatedName() + ".size(); i++)"  + variable.getTranslatedName() + "[i]" + ctx.assign().getText());
        super.visit(ctx.expression());
        FileGenerator.write(";");
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

        for (int i = 1; i < ctx.children.size(); i+=2) {
            FileGenerator.write(ctx.getChild(i).getText());
            super.visit(ctx.getChild(i + 1));
        }

        return null;
    }

    @Override
    public Object visitTerm(FlareParser.TermContext ctx) {
        if (ctx.identifierSpecifier() != null) {
            LinkedList<Scope> trace = (LinkedList<Scope>) super.visit(ctx.identifierSpecifier());
            FileGenerator.write(trace.getLast().getTranslatedName() + "[i]");
        } else
            FileGenerator.write(ctx.getText());

        return null;
    }

    @Override
    public Object visitArraySpecifier(FlareParser.ArraySpecifierContext ctx) {
        TerminalNode range = ctx.INTEGER_LITERAL();
        return new Pair(0, range == null ? 1 : Integer.parseInt(range.getText()));
    }
}
