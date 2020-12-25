import Flare.FlareParser;
import Flare.FlareParserBaseVisitor;
import kotlin.Pair;
import org.antlr.symtab.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class EntityTable extends FlareParserBaseVisitor<Object> {
    public GlobalScope table = new GlobalScope(null);
     Scope currentScope;

     EntityTable() {
         currentScope = table;
     }

    private void pushScope(Scope s) {
        currentScope = s;
        System.out.println("entering: "+ currentScope.getName() + ":"+s);
    }

    private void popScope() {
        System.out.println("leaving: "+ currentScope.getName() + ":" + currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public Object visitEntityHeader(FlareParser.EntityHeaderContext ctx) {
         ClassSymbol entity = new ClassSymbol(ctx.IDENTIFIER().getText());
         entity.setEnclosingScope(currentScope);
         currentScope.define(entity);
         pushScope(entity);

        super.visitEntityHeader(ctx);

        popScope();

        return null;
    }

    @Override
    public Object visitDeclarationHeader(FlareParser.DeclarationHeaderContext ctx) {
        MethodSymbol struct = new MethodSymbol("struct");
        struct.setEnclosingScope(currentScope);
        currentScope.define(struct);
        pushScope(struct);

        super.visitDeclarationHeader(ctx);

        popScope();

        return null;
    }

    @Override
    public Object visitConstructorHeader(FlareParser.ConstructorHeaderContext ctx) {
        try {
            if (!ctx.IDENTIFIER().getText().equals(currentScope.getName()))
                 throw new Exception("Illegal constructor");

            ArrayRangeType type = new ArrayRangeType(new PrimitiveType(ctx.IDENTIFIER().getText()), 1, 1);

            MethodSymbol function = new MethodSymbol(ctx.IDENTIFIER().getText());
            function.setType(type);

            function.setEnclosingScope(currentScope);
            currentScope.define(function);
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

            ArrayRangeType type = new ArrayRangeType(new PrimitiveType("void"), 1, 1);

            MethodSymbol function = new MethodSymbol("~" + ctx.IDENTIFIER().getText());
            function.setType(type);

            function.setEnclosingScope(currentScope);
            currentScope.define(function);
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

            MethodSymbol function = new MethodSymbol(ctx.IDENTIFIER().getText());
            function.setEnclosingScope(currentScope);
            currentScope.define(function);
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
        ArrayRangeType type = new ArrayRangeType(new PrimitiveType(typeContext.getText()), range.getFirst(), range.getSecond());

        FlareParser.IdentifierListContext identifiers = ctx.identifierList();

        for (TerminalNode identifier : identifiers.IDENTIFIER()) {
            VariableSymbol variable = new VariableSymbol(identifier.getText());
            variable.setType(type);
            variable.setDefNode(identifiers);

            variable.setScope(currentScope);
            currentScope.define(variable);
        }

        return null;
    }

    @Override
    public Object visitDeclarationStatementSingular(FlareParser.DeclarationStatementSingularContext ctx) {
        if (ctx.arraySpecifier().size() == 0) ctx.addChild(new FlareParser.ArraySpecifierContext(ctx, 0));
        Pair<Integer, Integer> range = (Pair<Integer, Integer>)super.visit(ctx.arraySpecifier(0));

        FlareParser.VariableTypeContext typeContext = ctx.variableType();
        ArrayRangeType type = new ArrayRangeType(new PrimitiveType(typeContext.getText()), range.getFirst(), range.getSecond());

        VariableSymbol variable = new VariableSymbol(ctx.IDENTIFIER().getText());
        variable.setType(type);
        variable.setDefNode(ctx);

        variable.setScope(currentScope);
        currentScope.define(variable);

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
