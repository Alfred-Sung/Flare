import symbtab.*;
import Flare.FlareParser;
import Flare.FlareParserBaseVisitor;

import java.util.LinkedList;

public class MethodGenerator extends BaseVisitor {
    public void setCurrentScope(Scope scope) { currentScope = scope; }

    @Override
    public Object visitDeclarationStatement(FlareParser.DeclarationStatementContext ctx) {
        return null;
    }
    @Override
    public Object visitDeclarationStatementSingular(FlareParser.DeclarationStatementSingularContext ctx) {
        return null;
    }

    @Override
    public Object visitStatement(FlareParser.StatementContext ctx) {
        super.visitChildren(ctx);
        FileGenerator.write(ctx.getText());
        FileGenerator.write(";");
        return null;
    }

    @Override
    public Object visitAssignment(FlareParser.AssignmentContext ctx) {
        return super.visitAssignment(ctx);
    }

    @Override
    public Object visitIdentifierSpecifier(FlareParser.IdentifierSpecifierContext ctx) {
        currentScope.resolve(new LinkedList<>(ctx.IDENTIFIER()));
        return null;
    }
}
