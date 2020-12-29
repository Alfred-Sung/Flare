import Flare.*;
import symbtab.*;
import kotlin.Pair;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class EntityTable extends BaseVisitor {
    public GlobalScope table = new GlobalScope();

     EntityTable() {
         currentScope = table;
     }

    @Override
    public Object visitEntityHeader(FlareParser.EntityHeaderContext ctx) {
         EntityScope entity = new EntityScope(currentScope, ctx, ctx.IDENTIFIER().getText());
        FileGenerator.addHeaderFile(ctx.IDENTIFIER().getText());

        pushScope(entity);
        super.visitEntityHeader(ctx);
        popScope();

        return null;
    }

    @Override
    public Object visitEntityMethods(FlareParser.EntityMethodsContext ctx) {
        pushScope((Scope)super.visit(ctx.definedFunctionHeaders()));
        super.visit(ctx.declarationParameters());
        popScope();
        return null;
    }

    @Override
    public Object visitConstructorHeader(FlareParser.ConstructorHeaderContext ctx) {
        FunctionScope function = null;

        try {
            if (!ctx.IDENTIFIER().getText().equals(currentScope.getName()))
                 throw new Exception("Illegal constructor");

            Type type = new Type(ctx.IDENTIFIER().getText(), 1, 1);
            function = new FunctionScope(currentScope, ctx.parent, ctx.IDENTIFIER().getText(), type);
            function.setTranslatedName(ctx.IDENTIFIER().getText() + "_ctor");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return function;
    }

    @Override
    public Object visitDeconstructorHeader(FlareParser.DeconstructorHeaderContext ctx) {
        FunctionScope function = null;

        try {
            if (!ctx.IDENTIFIER().getText().equals(currentScope.getName()))
                throw new Exception("Illegal deconstructor");

            Type type = new Type("void", 1, 1);
            function = new FunctionScope(currentScope, ctx.parent, "~" + ctx.IDENTIFIER().getText(), type);
            function.setTranslatedName(ctx.IDENTIFIER().getText() + "_dtor");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return function;
    }

    @Override
    public Object visitMethodHeader(FlareParser.MethodHeaderContext ctx) {
        FunctionScope function = null;

        try {
            if (ctx.IDENTIFIER().getText().equals(currentScope.getName()))
                throw new Exception("Illegal method name");

            Type type = new Type(ctx.methodType().getText(), 1, 1);
            function = new FunctionScope(currentScope, ctx.parent, ctx.IDENTIFIER().getText(), type);
            function.setTranslatedName(currentScope.getName() + "_" + ctx.IDENTIFIER().getText());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return function;
    }

    @Override
    public Object visitDeclarationStatement(FlareParser.DeclarationStatementContext ctx) {
        if (ctx.arraySpecifier().size() == 0) ctx.addChild(new FlareParser.ArraySpecifierContext(ctx, 0));
        Pair<Integer, Integer> range = (Pair<Integer, Integer>)super.visit(ctx.arraySpecifier(0));

        FlareParser.VariableTypeContext typeContext = ctx.variableType();
        Type type = new Type(typeContext.getText(), range.getFirst(), range.getSecond());

        List<TerminalNode> identifiers = ctx.identifierList().IDENTIFIER();

        //new VariableSymbol(currentScope, ctx.identifierList(), identifiers.get(0).getText(), type);

        for (int i = 0; i < identifiers.size(); i++) {
            VariableSymbol var = new VariableSymbol(currentScope, ctx.identifierList(), identifiers.get(i).getText(), type);
            var.setTranslatedName(currentScope.getName() + "_" + identifiers.get(i).getText());
        }

        return null;
    }

    @Override
    public Object visitDeclarationStatementSingular(FlareParser.DeclarationStatementSingularContext ctx) {
        if (ctx.arraySpecifier().size() == 0) ctx.addChild(new FlareParser.ArraySpecifierContext(ctx, ctx.invokingState));
        Pair<Integer, Integer> range = (Pair<Integer, Integer>)super.visit(ctx.arraySpecifier(0));

        FlareParser.VariableTypeContext typeContext = ctx.variableType();
        Type type = new Type(typeContext.getText(), range.getFirst(), range.getSecond());

        VariableSymbol var = new VariableSymbol(currentScope, ctx, ctx.IDENTIFIER().getText(), type);

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

    @Override
    public Object visitMainMethod(FlareParser.MainMethodContext ctx) {
        Type type = new Type(Type.Typetype.VOID, 0, 0);
        new FunctionScope(currentScope, ctx, "main", type);

        return null;
    }
}
