import Flare.FlareParser;
import Flare.util.FileGenerator;
import exception.FlareCircularDependencyException;
import exception.FlareException;
import kotlin.Pair;
import kotlin.Triple;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import symbtab.*;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Creates C files for each entity and generates typedef structs and function headers
 * Actual method code generation is separated in MethodGenerator.java since some visitors need to have different functionality
 * Does some checks and imports required list primitives
 */
public class HeaderGenerator extends BaseVisitor {
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
        FileGenerator.generateFile(ctx.IDENTIFIER().getText(), "h");
        FileGenerator.write("#include <vector>\n");

        pushScope(currentScope.get(ctx.IDENTIFIER().getText()));
        currentEntityScope = (EntityScope) currentScope;

        super.visitChildren(ctx);
        popScope();

        return null;
    }

    private void importEntityHeader(FlareParser.EntityHeaderContext ctx) {
        try {
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

        super.visitChildren(ctx);

        FileGenerator.write("template<typename A,typename B>static void assign(A a, B b);} " + currentEntityScope.getName() + "; ");
        FileGenerator.write("template<typename A,typename B>void " + currentEntityScope.getName() + "::assign(A a,B b){");

        HashSet<String> set = new HashSet<>();
        for (VariableSymbol component : currentEntityScope.getComponents()) {
            if (component.isPrimitive())
                FileGenerator.write("a->" + component.getTranslatedName() + "=b->" + component.getTranslatedName() + ";");
            else {
                if (set.contains(component.getTypeName())) continue;

                FileGenerator.write(component.getTypeName() + "::assign(a,b);");
                set.add(component.getTypeName());
            }
        }

        FileGenerator.write("}template<typename A>void " + currentEntityScope.getName() + "_allocate(A entity,int size){ ");
        for (VariableSymbol component : currentEntityScope.getComponents()) {
            if (!component.isPrimitive()) continue;
            FileGenerator.write("entity->" + component.getTranslatedName() + "=new std::vector<" + component.getType().getName() + ">(size,"+ Type.getDefaultValue(component.getType().getType()) +");");
        }
        FileGenerator.write("}");

        return null;
    }

    /**
     * Write list primitives into the typedef struct
     * List primitives can either be directly declared from the current entity or indirectly from declaring another entity
     * In which case the HeaderGenerator must import the entity type's components
     * This call is recursive
     */
    @Override
    public Object visitDeclarationStatement(FlareParser.DeclarationStatementContext ctx) {
        List<ParseTree> identifiers = ctx.identifierList().children;
        VariableSymbol var = (VariableSymbol) currentScope.resolve(identifiers.get(0).getText(), new LinkedList<Scope>()).getLast();

        if (var.getType().getType() != Type.Typetype.USER_DECLARED)
            declarePrimitive(ctx);
        else if (currentEntityScope.addComponent(var)) {
            declareImportedEntity(ctx);

            for (int i = 2; i < identifiers.size(); i += 2) {
                var = (VariableSymbol) currentScope.resolve(identifiers.get(i).getText(), new LinkedList<Scope>()).getLast();
                currentEntityScope.addComponent(var);
            }
        }

        return null;
    }

    /**
     * Write the list primitives
     */
    private void declarePrimitive(FlareParser.DeclarationStatementContext ctx) {
        List<ParseTree> identifiers = ctx.identifierList().children;
        VariableSymbol var = (VariableSymbol) currentScope.resolve(identifiers.get(0).getText(), new LinkedList<Scope>()).getLast();

        FileGenerator.write("std::vector<" + ctx.variableType().getText() + ">");
        FileGenerator.write(var.getTranslatedName());

        for (int i = 2; i < identifiers.size(); i += 2) {
            var = (VariableSymbol) currentScope.resolve(identifiers.get(i).getText(), new LinkedList<Scope>()).getLast();
            FileGenerator.write("," + var.getTranslatedName());
        }

        FileGenerator.write(";");
    }

    /**
     * Push and pop appropriate scopes and call importEntityHeader()
     */
    private void declareImportedEntity(FlareParser.DeclarationStatementContext ctx) {
        // Resolve imported entity scope
        pushScope(currentScope.get(ctx.identifierList().IDENTIFIER(0).getText()));
        VariableSymbol variableScope = ((VariableSymbol) currentScope);
        variableScope.resolveType();
        popScope();

        pushScope(variableScope.getTypeScope());
        importEntityHeader((FlareParser.EntityHeaderContext) variableScope.getTypeScope().getNode());
        popScope();

        // Return current scope to main entity
        pushScope(variableScope.getEnclosedScope());
    }

    /**
     * Write C function headers with template typename for each parameter
     * Constructors and Deconstructors have additional code in the function body
     */
    @Override
    public Object visitEntityMethods(FlareParser.EntityMethodsContext ctx) {
        Pair<Type, String> methodInfo = (Pair<Type, String>) super.visit(ctx.definedFunctionHeaders());
        pushScope(currentScope.get(methodInfo.getSecond()));

        ((FunctionScope) currentScope).resolveType();
        super.visit(ctx.declarationParameters());

        List<FlareParser.DeclarationStatementSingularContext> parameters = ctx.declarationParameters().declarationStatementSingular();

        FileGenerator.write("template<typename " + methodInfo.getSecond() + "0");
        for (int i = 0; i < parameters.size(); i++)
            FileGenerator.write(", typename " + methodInfo.getSecond() + (i + 1));
        FileGenerator.write(">");

        if (methodInfo.getFirst().isPrimitive())
            FileGenerator.write("std::vector<" + methodInfo.getFirst().getName() + ">");
        else
            FileGenerator.write(methodInfo.getFirst().getName() + "*");

        FileGenerator.write(currentScope.getTranslatedName() + "(" + methodInfo.getSecond() + "0 entity,int start,int end");

        for (int i = 0; i < parameters.size(); i++) {
            String parameterName = parameters.get(i).IDENTIFIER().getText();
            FileGenerator.write(", const " + methodInfo.getSecond() + (i + 1) + " &" + currentScope.get(parameterName).getTranslatedName());
        }

        FileGenerator.write(") {");

        if (ctx.definedFunctionHeaders().constructorHeader() != null) {
            HashSet<String> set = new HashSet<>();

            for (VariableSymbol component : currentEntityScope.getComponents()) {
                if (component.isPrimitive() || set.contains(component.getTypeName())) continue;
                FileGenerator.write(component.getTypeName() + "_allocate(entity,Math.abs(end-start)*" + currentEntityScope.getComponentAttribute(component.getTypeName()) +");");
                set.add(component.getTypeName());
            }
        }

        methodGenerator.setCurrentScope(currentScope);
        methodGenerator.visitBody(ctx.body());

        FileGenerator.write("}");
        popScope();

        return null;
    }

    @Override
    public Object visitConstructorHeader(FlareParser.ConstructorHeaderContext ctx) {
        return new Pair(new Type(Type.Typetype.VOID, 0, 1), currentEntityScope.getName());
    }

    @Override
    public Object visitDeconstructorHeader(FlareParser.DeconstructorHeaderContext ctx) {
        return new Pair(new Type(Type.Typetype.VOID, 0, 1), "~" + currentEntityScope.getName());
    }

    @Override
    public Object visitMethodHeader(FlareParser.MethodHeaderContext ctx) {
        return new Pair(new Type(ctx.methodType().getText(), 0, 1) , ctx.IDENTIFIER().getText());
    }

    @Override
    public Object visitDeclarationStatementSingular(FlareParser.DeclarationStatementSingularContext ctx) {
        VariableSymbol variable = (VariableSymbol) currentScope.get(ctx.IDENTIFIER().getText());
        variable.resolveType();

        variable.setTranslatedName("m_" + variable.getName());
        return null;
    }
}
