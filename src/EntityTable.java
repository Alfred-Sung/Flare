import Flare.FlareParser;
import Flare.util.BaseVisitor;
import Flare.util.FileGenerator;
import exception.FlareException;
import kotlin.Pair;
import org.antlr.v4.runtime.ParserRuleContext;
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

    // Initialize currentScope as GlobalScope
    EntityTable() { currentScope = table; }

    /**
     * Generates the EntityScope and generates a new .h file
     *
     * Throws FlareException: already defined
     */
    @Override
    public Object visitEntityHeader(FlareParser.EntityHeaderContext ctx) {
        try {
            //Kina a hacky solution but the EntityScope is its own type from (0, 1)
            Type type = new Type(ctx.IDENTIFIER().getText(), 0, 1);
            EntityScope entity = new EntityScope(currentScope, ctx, ctx.IDENTIFIER().getText(), type);
            FileGenerator.addHeaderFile(ctx.IDENTIFIER().getText());

            //Add the components and methods to the entityTable
            pushScope(entity);
            super.visitEntityHeader(ctx);
            popScope();
        } catch (FlareException e) {
            System.err.println(e.getMessage());
        }

        return null;
    }

    /**
     * Generates the FunctionScope and FunctionSignature
     * Methods can have different parameters without overlapping their signatures
     * In the entityTable, the FunctionScope is always PUBLIC while the FunctionSignatures reflect what's written
     *
     * Throws FlareException: already defined
     * Throws FlareException: Function signature already defined
     */
    @Override
    public Object visitEntityMethods(FlareParser.EntityMethodsContext ctx) {
        FunctionScope function = null;

        ParseTree header = ctx.definedFunctionHeaders().getChild(0);
        String headerName = header.getChild(header.getChildCount() - 1).getText();

        try {
            //Check if there is already a method declared
            if (currentScope.contains(headerName)) {
                Scope scope = currentScope.get(headerName);
                if (!(scope instanceof FunctionScope))
                    throw new FlareException("Variable " + scope.getName() + " already defined in " + currentScope.getName(), ctx.start, ctx.stop);

                function = (FunctionScope) scope;
            } else
                function = (FunctionScope) super.visit(ctx.definedFunctionHeaders(), Scope.Visibility.PUBLIC);

            pushScope(function);

            //Get visibility
            Scope.Visibility visibility = Scope.Visibility.PRIVATE;
            if (ctx.visibilityModifier().PUBLIC() != null)
                visibility = Scope.Visibility.PUBLIC;
            else if (ctx.visibilityModifier().PROTECTED() != null)
                visibility = Scope.Visibility.PROTECTED;

            //Add FunctionSignature under the FunctionScope
            FunctionSignature signature = new FunctionSignature(currentScope.getEntityScope(), function, ctx.declarationParameters(), function.getType(), visibility);

            //Convert method parameters into List<Type> and set the signature
            pushScope(signature);
            signature.setSignature((List<Type>) super.visit(ctx.declarationParameters()));
            popScope();

            function.addSignature(signature);
            popScope();
        } catch (FlareException e) {
            System.err.println(e.getMessage());
        }

        return null;
    }

    /**
     * Generates the Type of the parameters in a method
     *
     * @return A list of Type generated
     */
    @Override
    public Object visitDeclarationParameters(FlareParser.DeclarationParametersContext ctx) {
        ArrayList<Type> parameters = new ArrayList<>(ctx.declarationStatementSingular().size());

        for (FlareParser.DeclarationStatementSingularContext declaration : ctx.declarationStatementSingular()) {
            VariableSymbol var = (VariableSymbol) super.visit(declaration);
            parameters.add(var.getType());
        }

        return parameters;
    }

    /**
     * Check and generate FunctionScope
     * Constructors must have the same name as the EntityScope
     * Translated name is set to $entityName_ctor
     *
     * Throws FlareException: Illegal constructor
     * Throws FlareException: already defined
     *
     * @return The FunctionScope generated
     */
    @Override
    public Object visitConstructorHeader(FlareParser.ConstructorHeaderContext ctx) {
        FunctionScope function = null;

        try {
            // Check if constructor matches the entity name
            if (!ctx.IDENTIFIER().getText().equals(currentScope.getName()))
                throw new FlareException("Illegal constructor", ctx.start, ctx.stop);

            // Create new FunctionScope variable and return
            Type type = new Type(ctx.IDENTIFIER().getText(), 0, 1);
            function = new FunctionScope(currentScope.getEntityScope(), currentScope, ctx.IDENTIFIER().getText(), type, (Scope.Visibility) data);
            function.setTranslatedName(ctx.IDENTIFIER().getText() + "_ctor");

        } catch (FlareException e) {
            System.err.println(e.getMessage());
        }

        return function;
    }

    /**
     * Check and generate FunctionScope
     * Destructors must have the same name as the EntityScope
     * Translated name is set to $entityName_dtor
     *
     * Throws FlareException: Illegal destructor
     * Throws FlareException: already defined
     *
     * @return The FunctionScope generated
     */
    @Override
    public Object visitDestructorHeader(FlareParser.DestructorHeaderContext ctx) {
        FunctionScope function = null;

        try {
            // Check if destructor matches the entity name
            if (!ctx.IDENTIFIER().getText().equals(currentScope.getName()))
                throw new FlareException("Illegal destructor", ctx.start, ctx.stop);

            // Create new FunctionScope variable and return
            Type type = new Type(Type.Typetype.VOID, 0, 1);
            function = new FunctionScope(currentScope.getEntityScope(), currentScope, ctx.IDENTIFIER().getText(), type, (Scope.Visibility) data);
            function.setTranslatedName(ctx.IDENTIFIER().getText() + "_dtor");

        } catch (FlareException e) {
            System.err.println(e.getMessage());
        }

        return function;
    }

    /**
     * Check and generate FunctionScope
     * User-declared methods must not have the same name as the EntityScope
     * Translated name is set to $entityName_$identifier_
     *
     * Throws FlareException: Illegal constructor
     * Throws FlareException: already defined
     *
     * @return The FunctionScope generated
     */
    @Override
    public Object visitMethodHeader(FlareParser.MethodHeaderContext ctx) {
        FunctionScope function = null;

        try {
            // Function names cannot be their entity name
            if (ctx.IDENTIFIER().getText().equals(currentScope.getName()))
                throw new FlareException("Illegal constructor", ctx.start, ctx.stop);

            // Create new FunctionScope variable and return
            Type type = new Type(ctx.methodType().getText(), 0, 1);
            function = new FunctionScope(currentScope.getEntityScope(), currentScope, ctx.IDENTIFIER().getText(), type, (Scope.Visibility) data);
            function.setTranslatedName(currentScope.getName() + "_" + ctx.IDENTIFIER().getText() + "_");

        } catch (FlareException e) {
            System.err.println(e.getMessage());
        }

        return function;
    }

    /**
     * Check and generate VariableSymbol in entity's component
     * Translated name in C++ is $entityName_$identifier
     * Multiple identifiers can appear in this statement
     *
     * Throws FlareException: already defined
     */
    @Override
    public Object visitDeclarationStatement(FlareParser.DeclarationStatementContext ctx) {
        // Check if an array specifier is explicitly declared, if not add one with default range (0, 1)
        if (ctx.arraySpecifier().size() == 0) ctx.addChild(new FlareParser.ArraySpecifierContext(ctx, ctx.invokingState));
        Pair<Integer, Integer> range = (Pair<Integer, Integer>) super.visit(ctx.arraySpecifier(0));

        //Get variable type
        Type type = new Type(ctx.variableType().getText(), range.getFirst(), range.getSecond());

        List<TerminalNode> identifiers = ctx.identifierList().IDENTIFIER();

        try {
            for (int i = 0; i < identifiers.size(); i++) {
                VariableSymbol component = new VariableSymbol(currentScope.getEntityScope(), currentScope, ctx.identifierList(), identifiers.get(i).getText(), type, VariableSymbol.VariableTag.ENTITY);
                component.setTranslatedName(currentScope.getName() + "_" + identifiers.get(i).getText());
            }
        } catch (FlareException e) {
            System.err.println(e.getMessage());
        }

        return null;
    }

    /**
     * Check and generate VariableSymbol in entity's component
     * Translated name in C++ is $entityName_$identifier
     * Only single identifiers can appear in this statement
     *
     * Throws FlareException: already defined
     *
     * @return The VariableScope generated
     */
    @Override
    public Object visitDeclarationStatementSingular(FlareParser.DeclarationStatementSingularContext ctx) {
        VariableSymbol var = null;
        // Check if an array specifier is explicitly declared, if not add one with a range of [0, 1]
        if (ctx.arraySpecifier().size() == 0) ctx.addChild(new FlareParser.ArraySpecifierContext(ctx, ctx.invokingState));
        Pair<Integer, Integer> range = (Pair<Integer, Integer>) super.visit(ctx.arraySpecifier(0));

        //Get variable type
        Type type = new Type(ctx.variableType().getText(), range.getFirst(), range.getSecond());

        try {
            var = new VariableSymbol(currentScope.getEntityScope(), currentScope, ctx, ctx.IDENTIFIER().getText(), type, VariableSymbol.VariableTag.PARAMETER);
        } catch (FlareException e) {
            System.err.println(e.getMessage());
        }

        return var;
    }

    /**
     * Get the range from the arraySpecifier
     *
     * @return Pair\<int\> of the start and end int values
     */
    @Override
    public Object visitArraySpecifier(FlareParser.ArraySpecifierContext ctx) {
       TerminalNode range = ctx.INTEGER_LITERAL();

       if (range == null)
            return new Pair(0, 1);
        else
            return new Pair(0, Integer.parseInt(range.getText()));
    }

    /**
     * Generate a FunctionScope for the main method
     *
     * Throws FlareException: already defined
     */
    @Override
    public Object visitMainMethod(FlareParser.MainMethodContext ctx) {
        try {
            //main method is always void with a private visibility
            Type type = new Type(Type.Typetype.VOID, 0, 1);
            FunctionScope main = new FunctionScope(null, currentScope, "main", type, Scope.Visibility.PRIVATE);

            //Kinda a hacky solution since we can't set a reference to itself in the constructor
            main.setEntityScope(main);
            main.setNode(ctx);
        } catch (FlareException e) {
            System.err.println(e.getMessage());
        }

        return null;
    }
}
