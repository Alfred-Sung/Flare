import Flare.FlareParser;
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
            currentScope.resolve(ctx.variableType().getText());
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
            currentScope.resolve(ctx.variableType().getText());
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
        //FileGenerator.write(ctx.getText());
        return null;
    }

    @Override
    public Object visitBuiltinFunctions(FlareParser.BuiltinFunctionsContext ctx) {
        return super.visitBuiltinFunctions(ctx);
    }

    @Override
    public Object visitAssignment(FlareParser.AssignmentContext ctx) {
        VariableSymbol variable = (VariableSymbol) super.visit(ctx.children.get(0));

        FileGenerator.write("for(int i=" + variable.getStart() + ";i<" + variable.getEnd() + ";i++){");
        FileGenerator.write(variable.getTranslatedName() + "[i]" + ctx.assign().getText());
        super.visit(ctx.expression());
        FileGenerator.write(";}");

        return null;
    }

    @Override
    public Object visitFunctionCall(FlareParser.FunctionCallContext ctx) {
        Scope function = currentScope.resolve(new LinkedList<>(ctx.identifierSpecifier().IDENTIFIER()));
        FileGenerator.write(function.getTranslatedName());

        return super.visit(ctx.callParameter());
    }

    @Override
    public Object visitIdentifierSpecifier(FlareParser.IdentifierSpecifierContext ctx) {
        return currentScope.resolve(new LinkedList<>(ctx.IDENTIFIER()));
    }

    @Override
    public Object visitExpression(FlareParser.ExpressionContext ctx) {
        FileGenerator.write(ctx.getText());
        return null;
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
