import Flare.FlareParser;
import Flare.util.BaseVisitor;
import Flare.util.FileGenerator;
import exception.FlareCircularDependencyException;
import exception.FlareException;
import kotlin.Pair;
import org.antlr.v4.runtime.tree.TerminalNode;
import symbtab.*;
import symbtab.exception.ScopeException;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Creates C files for each entity and generates typedef structs and function headers
 * Actual method code generation is separated in MethodGenerator.java since some visitors need to have different functionality
 * Does some checks and imports required list primitives
 */
public class HeaderGenerator extends BaseVisitor<Object, Object> {
    MethodGenerator methodGenerator = new MethodGenerator();

    HeaderGenerator(GlobalScope entityTable) {
        currentScope = entityTable;
    }
    EntityScope currentEntityScope;

    /**
     * Create C header file with the entity name
     */
    @Override
    public Object visitEntityHeader(FlareParser.EntityHeaderContext ctx) {
        String entityName = ctx.IDENTIFIER().getText();

        FileGenerator.generateFile(entityName, "h");

        //Header guard and some other code
        FileGenerator.write("#ifndef " + entityName + "_H\n");
        FileGenerator.write("#define " + entityName + "_H\n");
        FileGenerator.write("#include<iostream>\n");
        FileGenerator.write("#include<vector>\n");
        FileGenerator.write("#include<cmath>\n");
        FileGenerator.write("#include<algorithm>\n");

        //Include the rest of the entities declared by the user
        for (String filename : ((GlobalScope) currentScope).getEntities())
            if (!filename.equals(entityName)) FileGenerator.write("#include\"" + filename + ".h\"\n");

        pushScope(currentScope.get(entityName));
        currentEntityScope = (EntityScope) currentScope;

        super.visitChildren(ctx);
        popScope();

        FileGenerator.write("\n#endif");

        return null;
    }

    /**
     * Import the subcomponents of an entity
     *
     * Throws FlareException: circular dependency
     */
    private void importEntityHeader(FlareParser.EntityHeaderContext ctx) {
        try {
            //Bad stuff happens when it comes to a full circle
            if (ctx.IDENTIFIER().getText().equals(currentEntityScope.getName()))
                throw new FlareCircularDependencyException("Circular dependency detected in " + ctx.IDENTIFIER().getText(), ctx.IDENTIFIER().getSymbol());

            if (ctx.entityBody().declarationHeader() == null)
                ctx.entityBody().addChild(new FlareParser.DeclarationHeaderContext(ctx, ctx.invokingState));
            super.visitChildren(ctx.entityBody().declarationHeader());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Write a typedef struct with the entity name
     * Typedef struct will only contain list primitives
     */
    @Override
    public Object visitDeclarationHeader(FlareParser.DeclarationHeaderContext ctx) {
        FileGenerator.write("typedef struct " + currentEntityScope.getName() + "{");
        //Visit declarationLines
        super.visitChildren(ctx);
        FileGenerator.write("}" + currentEntityScope.getName() + ";");

        //Write assign() boilerplate code
        FileGenerator.write("template<typename A,typename B>void " + currentEntityScope.getName() + "_assign(A a,B b,int start,int end){");

        for (VariableSymbol component : currentEntityScope.getComponents()) {
            if (component.isPrimitive()) {
                //std::vector of primitives can be copied over using std::copy
                FileGenerator.write("std::copy(b->" + component.getTranslatedName() + ".begin()+start," +
                        "b->" + component.getTranslatedName() + ".begin()+start+std::abs(end-start)+1," +
                        "a->" + component.getTranslatedName() + ".begin()+end);");
            } else {
                //To copy over user-declared entities using the assign()
                //TODO: figure out start and end values
                FileGenerator.write(component.getTypeName() + "_assign(a,b,"
                        + "std::abs(end-start)*" + currentEntityScope.getComponentIndex(component) + ","
                        + "std::abs(end-start)*" + (currentEntityScope.getComponentIndex(component) + currentEntityScope.getComponentSize(component))
                        + ");");
            }
        }

        //Write allocate() boilerplate code
        FileGenerator.write("}template<typename A>void " + currentEntityScope.getName() + "_allocate(A entity,int size){ ");

        HashSet<String> set = new HashSet<>();

        for (VariableSymbol component : currentEntityScope.getComponents()) {
            if (component.isPrimitive()) {
                //std::vector of primitives can be allocated using .resize
                FileGenerator.write("entity->" + component.getTranslatedName() + "=std::vector<" + component.getTypeName() + ">"
                        + "(size*" + currentEntityScope.getComponentSize(component) + ","
                        + Type.getDefaultValue(component.getType().getType()) + ");");

            } else {
                if (set.contains(component.getTypeName())) continue;

                //user-declared entities can be allocated using allocate()
                FileGenerator.write(component.getTypeName() + "_allocate(entity,size*" +
                        currentEntityScope.getComponentTypeSize(component) + ");");

                set.add(component.getTypeName());
            }
        }
        FileGenerator.write("}");

        return null;
    }

    /**
     * Write list primitives into the typedef struct
     * List primitives can either be directly declared from the current entity or indirectly from declaring another entity
     * In which case the HeaderGenerator must import the entity type's components
     * This call is recursive
     *
     * Throws FlareException:
     */
    @Override
    public Object visitDeclarationStatement(FlareParser.DeclarationStatementContext ctx) {
        try {
            List<TerminalNode> identifiers = ctx.identifierList().IDENTIFIER();

            VariableSymbol var = (VariableSymbol) currentScope.resolve(currentScope.getEntityScope(), identifiers.get(0).getText(), new LinkedList<>()).getLast();

            if (var.getType().getType() != Type.Typetype.USER_DECLARED) {
                declarePrimitive(ctx);
            } else  {
                declareImportedEntity(ctx);

                for (TerminalNode identifier : identifiers) {
                    var = (VariableSymbol) currentScope.resolve(currentScope.getEntityScope(), identifier.getText(), new LinkedList<>()).getLast();
                    if (currentEntityScope == currentScope)
                        currentEntityScope.addComponent(var);
                }
            }
        } catch (ScopeException e) {
            //TODO
            System.err.println(new FlareException("", ctx.start, ctx.stop).getMessage());
        } catch (FlareException e) {
            System.err.println(e.getMessage());
        }

        return null;
    }

    /**
     * Write the list primitives
     */
    private void declarePrimitive(FlareParser.DeclarationStatementContext ctx) throws ScopeException {
        List<TerminalNode> identifiers = ctx.identifierList().IDENTIFIER();
        //Scope resolve because the variables were added in the EntityTable pass
        VariableSymbol var = (VariableSymbol) currentScope.resolve(currentScope.getEntityScope(), identifiers.get(0).getText(), new LinkedList<>()).getLast();

        if (currentEntityScope.hasComponent(var)) return;

        FileGenerator.write("std::vector<" + ctx.variableType().getText() + ">");
        FileGenerator.write(var.getTranslatedName());
        //if (currentEntityScope == currentScope)
            currentEntityScope.addComponent(var);

        for (int i = 1; i < identifiers.size(); i++) {
            //Scope resolve because the variables were added in the EntityTable pass
            var = (VariableSymbol) currentScope.resolve(currentScope.getEntityScope(), identifiers.get(i).getText(), new LinkedList<>()).getLast();
            FileGenerator.write("," + var.getTranslatedName());
            //if (currentEntityScope == currentScope)
                currentEntityScope.addComponent(var);
        }

        FileGenerator.write(";");
    }

    /**
     * Push and pop appropriate scopes and call importEntityHeader()
     */
    private void declareImportedEntity(FlareParser.DeclarationStatementContext ctx) throws FlareException {
        //Resolve imported entity scope
        pushScope(currentScope.get(ctx.identifierList().IDENTIFIER(0).getText()));
        VariableSymbol variableScope = ((VariableSymbol) currentScope);
        variableScope.resolveType();
        popScope();

        pushScope(variableScope.getTypeScope());
        importEntityHeader((FlareParser.EntityHeaderContext) variableScope.getTypeScope().getNode());
        popScope();

        //Return current scope to main entity
        pushScope(variableScope.getEnclosedScope());
    }

    /**
     * Write C function headers with template typename for each parameter
     * Constructors and Destructors have additional code in the function body
     */
    @Override
    public Object visitEntityMethods(FlareParser.EntityMethodsContext ctx) {
        Pair<Type, String> methodInfo = (Pair<Type, String>) super.visit(ctx.definedFunctionHeaders());
        pushScope(currentScope.get(methodInfo.getSecond()));

        FunctionScope function = (FunctionScope) currentScope;

        try {
            function.resolveType();
        } catch (FlareException e) {
            System.err.println(e.getMessage());
        }

        pushScope(((FunctionScope) currentScope).match(ctx.declarationParameters()));
        super.visit(ctx.declarationParameters());

        List<FlareParser.DeclarationStatementSingularContext> parameters = ctx.declarationParameters().declarationStatementSingular();

        FileGenerator.write("template<typename " + methodInfo.getSecond() + "0");
        for (int i = 0; i < parameters.size(); i++)
            FileGenerator.write(",typename " + methodInfo.getSecond() + (i + 1));
        FileGenerator.write(">");

        if (ctx.definedFunctionHeaders().constructorHeader() != null)
            FileGenerator.write(methodInfo.getSecond() + "0 ");
        else if (ctx.definedFunctionHeaders().destructorHeader() != null)
            FileGenerator.write("void ");
        else if (methodInfo.getFirst().getType() == Type.Typetype.VOID)
            FileGenerator.write("void ");
        else if (methodInfo.getFirst().isPrimitive())
            FileGenerator.write("std::vector<" + methodInfo.getFirst().getName() + "> ");
        else
            FileGenerator.write(methodInfo.getFirst().getName() + "* ");

        FileGenerator.write(function.getTranslatedName() + "(" + methodInfo.getSecond() + "0 entity,int start,int end");

        for (int i = 0; i < parameters.size(); i++) {
            String parameterName = parameters.get(i).IDENTIFIER().getText();
            FileGenerator.write(",const " + methodInfo.getSecond() + (i + 1) + " &" + currentScope.get(parameterName).getTranslatedName());
        }

        FileGenerator.write("){");

        /*
        if (ctx.definedFunctionHeaders().constructorHeader() != null) {
            HashSet<String> set = new HashSet<>();

            for (VariableSymbol component : currentEntityScope.getComponents()) {
                if (component.isPrimitive() || set.contains(component.getTypeName())) continue;
                //TODO: Calling _allocate in _ctor needs attribute calculations
                FileGenerator.write(component.getTypeName() + "_allocate(entity,std::abs(end-start)*" + currentEntityScope.getComponentTypeSize(component) + ");");
                set.add(component.getTypeName());
            }
        }
         */

        methodGenerator.setCurrentScope(currentScope);
        methodGenerator.visitBody(ctx.body());

        if (ctx.definedFunctionHeaders().constructorHeader() != null) FileGenerator.write("return entity;");
        FileGenerator.write("}");
        popScope(); //Pop FunctionSignature scope
        popScope(); //Pop Function scope

        return null;
    }

    /**
     * @return Pair \<VOID, String entityName\>
     */
    @Override
    public Object visitConstructorHeader(FlareParser.ConstructorHeaderContext ctx) {
        return new Pair<>(new Type(Type.Typetype.VOID, 0, 1), currentEntityScope.getName());
    }

    /**
     * @return Pair \<VOID, String entityName\>
     */
    @Override
    public Object visitDestructorHeader(FlareParser.DestructorHeaderContext ctx) {
        return new Pair<>(new Type(Type.Typetype.VOID, 0, 1), "~" + currentEntityScope.getName());
    }

    /**
     * @return Pair \<Type type, String methodName\>
     */
    @Override
    public Object visitMethodHeader(FlareParser.MethodHeaderContext ctx) {
        return new Pair<>(new Type(ctx.methodType().getText(), 0, 1) , ctx.IDENTIFIER().getText());
    }

    @Override
    public Object visitDeclarationStatementSingular(FlareParser.DeclarationStatementSingularContext ctx) {
        try {
            VariableSymbol variable = (VariableSymbol) currentScope.get(ctx.IDENTIFIER().getText());
            variable.resolveType();

            variable.setTranslatedName("m_" + variable.getName());
        } catch (FlareException e) {
            System.err.println(e.getMessage());
        }

        return null;
    }
}
