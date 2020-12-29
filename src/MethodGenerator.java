import org.antlr.v4.runtime.tree.ParseTree;
import symbtab.*;
import Flare.FlareParser;
import Flare.FlareParserBaseVisitor;

import java.util.LinkedList;
import java.util.List;

public class MethodGenerator extends BaseVisitor {
    public void setCurrentScope(Scope scope) { currentScope = scope; }

    @Override
    public Object visitDeclarationStatement(FlareParser.DeclarationStatementContext ctx) {
        if (ctx.variableType().IDENTIFIER() == null)
            declarePrimitive(ctx);
        else
            declareEntity(ctx);

        return null;
    }

    private void declarePrimitive(FlareParser.DeclarationStatementContext ctx) {
        FileGenerator.write("std::vector<" + ctx.variableType().getText() + ">");

        List<ParseTree> identifiers = ctx.identifierList().children;
        FileGenerator.write(identifiers.get(0).getText());
        for (int i = 2; i < identifiers.size(); i += 2)
            FileGenerator.write( "," + identifiers.get(i).getText());
    }

    private void declareEntity(FlareParser.DeclarationStatementContext ctx) {
        currentScope.resolve(ctx.variableType().getText());
        FileGenerator.write(ctx.variableType().getText() + " *");

        List<ParseTree> identifiers = ctx.identifierList().children;
        FileGenerator.write(identifiers.get(0).getText());
        for (int i = 2; i < identifiers.size(); i += 2)
            FileGenerator.write( "," + identifiers.get(i).getText());
    }

    @Override
    public Object visitStatement(FlareParser.StatementContext ctx) {
        super.visitChildren(ctx);
        //FileGenerator.write(ctx.getText());
        FileGenerator.write(";");
        return null;
    }

    @Override
    public Object visitBuiltinFunctions(FlareParser.BuiltinFunctionsContext ctx) {
        return super.visitBuiltinFunctions(ctx);
    }

    @Override
    public Object visitAssignment(FlareParser.AssignmentContext ctx) {
        return super.visitAssignment(ctx);
    }

    @Override
    public Object visitFunctionCall(FlareParser.FunctionCallContext ctx) {
        FunctionScope function = (FunctionScope)currentScope.resolve(new LinkedList<>(ctx.identifierSpecifier().IDENTIFIER()));
        FileGenerator.write(function.getTranslatedName());

        return super.visit(ctx.callParameter());
    }

    @Override
    public Object visitIdentifierSpecifier(FlareParser.IdentifierSpecifierContext ctx) {
        currentScope.resolve(new LinkedList<>(ctx.IDENTIFIER()));
        return null;
    }
}
