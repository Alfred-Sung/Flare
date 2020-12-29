import Flare.*;
import kotlin.Function;
import symbtab.*;
import kotlin.Triple;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class HeaderGenerator extends BaseVisitor {
    MethodGenerator methodGenerator = new MethodGenerator();

    HeaderGenerator(GlobalScope entityTable) {
        currentScope = entityTable;
    }

    @Override
    public Object visitEntityHeader(FlareParser.EntityHeaderContext ctx) {
        FileGenerator.generateFile(ctx.IDENTIFIER().getText(), "h");
        FileGenerator.write("#include <vector>\n");

        pushScope(currentScope.get(ctx.IDENTIFIER().getText()));
        super.visitChildren(ctx);
        popScope();

        return null;
    }

    private void importEntityHeader(FlareParser.EntityHeaderContext ctx) {
        if (ctx.entityBody().declarationHeader() == null)
            ctx.entityBody().addChild(new FlareParser.DeclarationHeaderContext(ctx, ctx.invokingState));
        super.visitChildren(ctx.entityBody().declarationHeader());
    }

    @Override
    public Object visitDeclarationHeader(FlareParser.DeclarationHeaderContext ctx) {
        FileGenerator.write("typedef struct " + FileGenerator.getCurrentFile() + "{");

        super.visitChildren(ctx);

        FileGenerator.write("} " + FileGenerator.getCurrentFile() + "; ");
        return null;
    }

    @Override
    public Object visitDeclarationStatement(FlareParser.DeclarationStatementContext ctx) {
        if (ctx.variableType().IDENTIFIER() == null)
            declarePrimitive(ctx);
        else
            declareImportedEntity(ctx);

        return null;
    }

    private void declarePrimitive(FlareParser.DeclarationStatementContext ctx) {
        FileGenerator.write("std::vector<" + ctx.variableType().getText() + ">");

        List<ParseTree> identifiers = ctx.identifierList().children;
        VariableSymbol var = (VariableSymbol) currentScope.resolve(identifiers.get(0).getText());
        FileGenerator.write(var.getTranslatedName());

        for (int i = 2; i < identifiers.size(); i += 2) {
            var = (VariableSymbol) currentScope.resolve(identifiers.get(i).getText());
            FileGenerator.write("," + var.getTranslatedName());
        }

        FileGenerator.write(";");
    }

    private void declareImportedEntity(FlareParser.DeclarationStatementContext ctx) {
        pushScope(currentScope.get(ctx.identifierList().IDENTIFIER(0).getText()));
        VariableSymbol variableScope = ((VariableSymbol)currentScope);
        variableScope.resolveType();
        popScope();

        pushScope(variableScope.getTypeScope());
        importEntityHeader((FlareParser.EntityHeaderContext) variableScope.getTypeScope().getNode());
        popScope();

        pushScope(variableScope.getEnclosedScope());
    }

    enum methodType { CONSTRUCTOR, DECONSTRUCTOR, METHOD }

    @Override
    public Object visitEntityMethods(FlareParser.EntityMethodsContext ctx) {
        Triple<String, String, methodType> methodInfo = (Triple<String, String, methodType>)super.visit(ctx.definedFunctionHeaders());
        pushScope(currentScope.get(methodInfo.getSecond()));

        ((FunctionScope)currentScope).resolveType();
        super.visit(ctx.declarationParameters());

        List<FlareParser.DeclarationStatementSingularContext> parameters = ctx.declarationParameters().declarationStatementSingular();

        FileGenerator.write("template<typename " + methodInfo.getSecond() + "0");
        for(int i = 0; i < parameters.size(); i++)
            FileGenerator.write(", typename "+ methodInfo.getSecond() + (i + 1));
        FileGenerator.write(">");

        FileGenerator.write(methodInfo.getFirst() + " " + currentScope.getTranslatedName());

        FileGenerator.write("(" + methodInfo.getSecond() + "0 entity");
        if (methodInfo.getThird() == methodType.CONSTRUCTOR)
            FileGenerator.write(",int size");
        else if (methodInfo.getThird() == methodType.METHOD)
            FileGenerator.write(",int start,int end");



        for(int i = 0; i < parameters.size(); i++)
            FileGenerator.write(", const " +  methodInfo.getSecond() + (i + 1) + " &" + parameters.get(i).IDENTIFIER().getText());
        FileGenerator.write(") {");

        if (methodInfo.getThird() != methodType.METHOD) {
            //TODO: Get variables from struct
            //for(int i = 0; i < parameters.size(); i++)
            //    FileGenerator.write("entity->" + ".clear();");
        }

        if (methodInfo.getThird() == methodType.CONSTRUCTOR) {
            //TODO: Get variables from struct
            //for(int i = 0; i < parameters.size(); i++)
            //    FileGenerator.write("entity->" + ".reserve(size);");
        }

        methodGenerator.setCurrentScope(currentScope);
        methodGenerator.visitBody(ctx.body());

        FileGenerator.write("}");
        popScope();

        return null;
    }

    @Override
    public Object visitConstructorHeader(FlareParser.ConstructorHeaderContext ctx) {
        return new Triple("void", FileGenerator.getCurrentFile(), methodType.CONSTRUCTOR);
    }

    @Override
    public Object visitDeconstructorHeader(FlareParser.DeconstructorHeaderContext ctx) {
        return new Triple("void", "~" + FileGenerator.getCurrentFile(), methodType.DECONSTRUCTOR);
    }

    @Override
    public Object visitMethodHeader(FlareParser.MethodHeaderContext ctx) {
        return new Triple(ctx.methodType().getText(), ctx.IDENTIFIER().getText(), methodType.METHOD);
    }

    @Override
    public Object visitDeclarationStatementSingular(FlareParser.DeclarationStatementSingularContext ctx) {
        ((VariableSymbol)currentScope.get(ctx.IDENTIFIER().getText())).resolveType();
        return null;
    }
}
