import Flare.FlareParser;
import Flare.util.FileGenerator;
import kotlin.Pair;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import symbtab.BaseVisitor;
import symbtab.Scope;
import symbtab.Type;
import symbtab.VariableSymbol;

import java.util.LinkedList;
import java.util.List;

public class MethodGenerator extends BaseVisitor {
    public void setCurrentScope(Scope scope) {
        currentScope = scope;
    }

    @Override
    public Object visitDeclarationStatement(FlareParser.DeclarationStatementContext ctx) {
        if (ctx.variableType().IDENTIFIER() == null) {
            FileGenerator.write("std::vector<" + ctx.variableType().getText() + ">");
        } else {
            currentScope.resolve(ctx.variableType().getText(), new LinkedList<Scope>());
            FileGenerator.write(ctx.variableType().getText() + " *");
        }
        List<ParseTree> identifiers = ctx.identifierList().children;

        Type type = new Type(ctx.variableType().getText(), 0, 1);
        VariableSymbol variable = new VariableSymbol(currentScope, ctx, identifiers.get(0).getText(), type);
        variable.setTranslatedName("m_" + identifiers.get(0).getText());
        variable.resolveType();

        FileGenerator.write(variable.getTranslatedName() + ";");

        for (int i = 2; i < identifiers.size(); i += 2) {
            variable = new VariableSymbol(currentScope, ctx, identifiers.get(i).getText(), type);
            variable.setTranslatedName("m_" + identifiers.get(i).getText());
            FileGenerator.write("," + variable.getTranslatedName());
        }

        if (ctx.variableType().IDENTIFIER() == null) {
            FileGenerator.write(identifiers.get(0).getText() + ".resize(" + Math.abs(variable.getEnd() - variable.getStart()) + ");");
        }

        return null;
    }

    @Override
    public Object visitDeclarationStatementSingular(FlareParser.DeclarationStatementSingularContext ctx) {
        if (ctx.variableType().IDENTIFIER() == null) {
            FileGenerator.write("std::vector<" + ctx.variableType().getText() + ">");
        } else {
            currentScope.resolve(ctx.variableType().getText(), new LinkedList<Scope>());
            FileGenerator.write(ctx.variableType().getText() + " *");
        }

        if (ctx.arraySpecifier().size() == 0) ctx.addChild(new FlareParser.ArraySpecifierContext(ctx, ctx.invokingState));
        Pair<Integer, Integer> range = (Pair<Integer, Integer>)super.visit(ctx.arraySpecifier(0));

        Type type = new Type(ctx.variableType().getText(), range.getFirst(), range.getSecond());
        VariableSymbol variable = new VariableSymbol(currentScope, ctx, ctx.IDENTIFIER().getText(), type);
        variable.setTranslatedName("m_" + ctx.IDENTIFIER().getText());
        variable.resolveType();

        FileGenerator.write(variable.getTranslatedName() + ";");

        if (ctx.variableType().IDENTIFIER() == null)
            FileGenerator.write(variable.getTranslatedName() + ".resize(" + Math.abs(type.getEnd() - type.getStart()) + ");");

        return variable;
    }

    @Override
    public Object visitStatement(FlareParser.StatementContext ctx) {
        super.visitChildren(ctx);
        Flare.util.FileGenerator.write(";");
        return null;
    }

    @Override
    public Object visitBuiltinFunctions(FlareParser.BuiltinFunctionsContext ctx) {
        return super.visitBuiltinFunctions(ctx);
    }

    @Override
    public Object visitAssignment(FlareParser.AssignmentContext ctx) {
        LinkedList<Scope> trace = (LinkedList<Scope>)super.visit(ctx.children.get(0));
        VariableSymbol variable = (VariableSymbol) trace.getLast();

        FileGenerator.write("for(int i=" + variable.getStart() + ";i<" + variable.getEnd() + ";i++){");
        FileGenerator.write(variable.getTranslatedName() + "[i]" + ctx.assign().getText());

        super.visit(ctx.expression());
        FileGenerator.write(";}");

        return null;
    }

    @Override
    public Object visitFunctionCall(FlareParser.FunctionCallContext ctx) {
        LinkedList<Scope> trace = (LinkedList<Scope>) super.visit(ctx.identifierSpecifier());

        FileGenerator.write(trace.getLast().getTranslatedName());
        super.visit(ctx.callParameter());

        return null;
    }

    @Override
    public Object visitCallParameter(FlareParser.CallParameterContext ctx) {
        FileGenerator.write("(");
        if (ctx.expression().size() > 0) {
            FileGenerator.write("[](int i){ return ");
            super.visit(ctx.expression().get(0));
            FileGenerator.write("}");

            for (FlareParser.ExpressionContext expression : ctx.expression()) {
                FileGenerator.write(",[](int i){ return ");
                super.visit(expression);
                FileGenerator.write("}");
            }
        }

        FileGenerator.write(")");
        return null;
    }

    @Override
    public Object visitIdentifierSpecifier(FlareParser.IdentifierSpecifierContext ctx) {
        LinkedList<Scope> trace;
        // Return the scope track of the identifier list
        if (ctx.THIS() != null)
            trace = currentScope.getEnclosedScope().resolve(new LinkedList<>(ctx.IDENTIFIER()), new LinkedList<Scope>());
        else
            trace = currentScope.resolve(new LinkedList<>(ctx.IDENTIFIER()), new LinkedList<Scope>());

        System.out.println(trace);
        return trace;
    }

    @Override
    public Object visitExpression(FlareParser.ExpressionContext ctx) {
        FileGenerator.write(ctx.getText());
        return super.visitExpression(ctx);
    }

    @Override
    public Object visitArraySpecifier(FlareParser.ArraySpecifierContext ctx) {
        TerminalNode range = ctx.INTEGER_LITERAL();

        if (range == null)
            return new Pair(0, 1);
        else
            return new Pair(0, Integer.parseInt(range.getText()));
    }
}
