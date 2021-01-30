import Flare.FlareParser;
import Flare.util.BaseVisitor;
import Flare.util.FileGenerator;
import exception.FlareException;
import kotlin.Pair;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import symbtab.*;

import java.util.ArrayList;
import java.util.List;

/**
 * First pass of the transpiler
 * Add all declared entities, their components, and functions to the scope tree so that the transpiler knows ahead of time
 * Sets translated names of the necessary scopes when converted to C++
 */
public class EntityTable extends BaseVisitor {
    //table is exposed and used in Transpiler.java
    public GlobalScope table = new GlobalScope();

    EntityTable() { currentScope = table; }

    @Override
    public Object visitEntityHeader(FlareParser.EntityHeaderContext ctx) {
        Type type = new Type(ctx.IDENTIFIER().getText(), 0, 0);
        EntityScope entity = new EntityScope(currentScope, ctx, ctx.IDENTIFIER().getText(), type);
        FileGenerator.addHeaderFile(ctx.IDENTIFIER().getText());

        pushScope(entity);
        super.visitEntityHeader(ctx);
        popScope();

        return null;
    }

    @Override
    public Object visitEntityMethods(FlareParser.EntityMethodsContext ctx) {
        FunctionScope function = null;

        ParseTree header = ctx.definedFunctionHeaders().getChild(0);
        String headerName = header.getChild(header.getChildCount() - 1).getText();
        if (currentScope.contains(headerName))
            function = (FunctionScope)currentScope.get(headerName);
        else
            function = (FunctionScope)super.visit(ctx.definedFunctionHeaders());

        pushScope(function);
        FunctionSignature signature = new FunctionSignature(function, ctx.declarationParameters(), function.getType());

        pushScope(signature);
        signature.setSignature((List<Type>) super.visit(ctx.declarationParameters()));
        popScope();

        function.addSignature(signature);
        popScope();

        return null;
    }

    @Override
    public Object visitDeclarationParameters(FlareParser.DeclarationParametersContext ctx) {
        ArrayList<Type> parameters = new ArrayList<>(ctx.declarationStatementSingular().size());

        for (FlareParser.DeclarationStatementSingularContext declaration : ctx.declarationStatementSingular()) {
            VariableSymbol var = (VariableSymbol) super.visit(declaration);
            parameters.add(new Type(var.getTypeName(), var.getStart(), var.getEnd()));
        }

        return parameters;
    }

    @Override
    public Object visitConstructorHeader(FlareParser.ConstructorHeaderContext ctx) {
        FunctionScope function = null;

        try {
            // Check if constructor matches the entity name
            if (!ctx.IDENTIFIER().getText().equals(currentScope.getName()))
                throw new FlareException("Illegal constructor", ctx.IDENTIFIER().getSymbol());

            Type type = new Type(ctx.IDENTIFIER().getText(), 1, 1);
            function = new FunctionScope(currentScope, ctx.IDENTIFIER().getText(), type);
            function.setTranslatedName(ctx.IDENTIFIER().getText() + "_ctor");

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return function;
    }

    @Override
    public Object visitDeconstructorHeader(FlareParser.DeconstructorHeaderContext ctx) {
        FunctionScope function = null;

        try {
            // Check if deconstructor matches the entity name
            if (!ctx.IDENTIFIER().getText().equals(currentScope.getName()))
                throw new FlareException("Illegal constructor", ctx.IDENTIFIER().getSymbol());

            Type type = new Type("void", 1, 1);
            function = new FunctionScope(currentScope, "~" + ctx.IDENTIFIER().getText(), type);
            function.setTranslatedName(ctx.IDENTIFIER().getText() + "_dtor");

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return function;
    }

    @Override
    public Object visitMethodHeader(FlareParser.MethodHeaderContext ctx) {
        FunctionScope function = null;

        try {
            // Function names cannot be their entity name
            if (ctx.IDENTIFIER().getText().equals(currentScope.getName()))
                throw new FlareException("Illegal constructor", ctx.IDENTIFIER().getSymbol());

            Type type = new Type(ctx.methodType().getText(), 0, 1);

            function = new FunctionScope(currentScope, ctx.IDENTIFIER().getText(), type);
            function.setTranslatedName(currentScope.getName() + "_" + ctx.IDENTIFIER().getText() + "_");

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return function;
    }

    @Override
    public Object visitDeclarationStatement(FlareParser.DeclarationStatementContext ctx) {
        // Check if an array specifier is explicitly declared, if not add one with a range of [0, 1]
        if (ctx.arraySpecifier().size() == 0) ctx.addChild(new FlareParser.ArraySpecifierContext(ctx, ctx.invokingState));
        Pair<Integer, Integer> range = (Pair<Integer, Integer>) super.visit(ctx.arraySpecifier(0));

        FlareParser.VariableTypeContext typeContext = ctx.variableType();
        Type type = new Type(typeContext.getText(), range.getFirst(), range.getSecond());

        List<TerminalNode> identifiers = ctx.identifierList().IDENTIFIER();

        //new VariableSymbol(currentScope, ctx.identifierList(), identifiers.get(0).getText(), type);

        for (int i = 0; i < identifiers.size(); i++) {
            VariableSymbol var = new VariableSymbol(currentScope, ctx.identifierList(), identifiers.get(i).getText(), type, VariableSymbol.VariableTag.ENTITY);
            var.setTranslatedName(currentScope.getName() + "_" + identifiers.get(i).getText());
        }

        return null;
    }

    @Override
    public Object visitDeclarationStatementSingular(FlareParser.DeclarationStatementSingularContext ctx) {
        // Check if an array specifier is explicitly declared, if not add one with a range of [0, 1]
        if (ctx.arraySpecifier().size() == 0) ctx.addChild(new FlareParser.ArraySpecifierContext(ctx, ctx.invokingState));
        Pair<Integer, Integer> range = (Pair<Integer, Integer>) super.visit(ctx.arraySpecifier(0));

        FlareParser.VariableTypeContext typeContext = ctx.variableType();
        Type type = new Type(typeContext.getText(), range.getFirst(), range.getSecond());

        VariableSymbol var = new VariableSymbol(currentScope, ctx, ctx.IDENTIFIER().getText(), type, VariableSymbol.VariableTag.PARAMETER);

        return var;
    }

    @Override
    public Object visitArraySpecifier(FlareParser.ArraySpecifierContext ctx) {
       TerminalNode range = ctx.INTEGER_LITERAL();

       if (range == null)
            return new Pair(0, 1);
        else
            return new Pair(0, Integer.parseInt(range.getText()));
    }

    @Override
    public Object visitMainMethod(FlareParser.MainMethodContext ctx) {
        Type type = new Type(Type.Typetype.VOID, 0, 0);
        FunctionScope main = new FunctionScope(currentScope, "main", type);
        main.setNode(ctx);

        return null;
    }
}
