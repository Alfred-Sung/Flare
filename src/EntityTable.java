import Flare.*;
import symbtab.*;
import kotlin.Pair;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class EntityTable extends FlareParserBaseVisitor<Object> {
    public GlobalScope table = new GlobalScope();
     Scope currentScope;

     EntityTable() {
         currentScope = table;
     }

    private void pushScope(Scope s) {
        currentScope = s;
        System.out.println("entering: "+ currentScope.getName());
    }

    private void popScope() {
        System.out.println("leaving: "+ currentScope.getName());
        currentScope = currentScope.getEnclosedScope();
    }

    @Override
    public Object visitEntityHeader(FlareParser.EntityHeaderContext ctx) {
         EntityScope entity = new EntityScope(currentScope, ctx, ctx.IDENTIFIER().getText());

        pushScope(entity);
        super.visitEntityHeader(ctx);
        popScope();

        return null;
    }

    @Override
    public Object visitConstructorHeader(FlareParser.ConstructorHeaderContext ctx) {
        try {
            if (!ctx.IDENTIFIER().getText().equals(currentScope.getName()))
                 throw new Exception("Illegal constructor");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object visitDeconstructorHeader(FlareParser.DeconstructorHeaderContext ctx) {
        try {
            if (!ctx.IDENTIFIER().getText().equals(currentScope.getName()))
                throw new Exception("Illegal deconstructor");


        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object visitMethodHeader(FlareParser.MethodHeaderContext ctx) {
        try {
            if (ctx.IDENTIFIER().getText().equals(currentScope.getName()))
                throw new Exception("Illegal method name");


        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Object visitDeclarationStatement(FlareParser.DeclarationStatementContext ctx) {
        if (ctx.arraySpecifier().size() == 0) ctx.addChild(new FlareParser.ArraySpecifierContext(ctx, 0));
        Pair<Integer, Integer> range = (Pair<Integer, Integer>)super.visit(ctx.arraySpecifier(0));

        FlareParser.VariableTypeContext typeContext = ctx.variableType();
        Type type = new Type(typeContext.getText(), range.getFirst(), range.getSecond());

        List<TerminalNode> identifiers = ctx.identifierList().IDENTIFIER();

        new VariableSymbol(currentScope, ctx.identifierList(), identifiers.get(0).getText(), type);

        for (int i = 1; i < identifiers.size(); i++)
            new VariableSymbol(currentScope, ctx.identifierList(), identifiers.get(i).getText(), type);

        return null;
    }

    @Override
    public Object visitDeclarationStatementSingular(FlareParser.DeclarationStatementSingularContext ctx) {
        if (ctx.arraySpecifier().size() == 0) ctx.addChild(new FlareParser.ArraySpecifierContext(ctx, 0));
        Pair<Integer, Integer> range = (Pair<Integer, Integer>)super.visit(ctx.arraySpecifier(0));

        FlareParser.VariableTypeContext typeContext = ctx.variableType();
        Type type = new Type(typeContext.getText(), range.getFirst(), range.getSecond());

        new VariableSymbol(currentScope, ctx, ctx.IDENTIFIER().getText(), type);

        return null;
    }

    @Override
    public Object visitArraySpecifier(FlareParser.ArraySpecifierContext ctx) {
        List<TerminalNode> range = ctx.INTEGER_LITERAL();

        switch(range.size()) {
            case 0:
                return new Pair(0, 1);
            case 1:
                return new Pair(0, Integer.parseInt(range.get(0).getText()));
            case 2:
                return new Pair(Integer.parseInt(range.get(0).getText()), Integer.parseInt(range.get(1).getText()));
        }
        return super.visitArraySpecifier(ctx);
    }
}
