import Flare.*;
import kotlin.Triple;
import org.antlr.symtab.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class CGenerator extends FlareParserBaseVisitor<Object> {
    GlobalScope entityTable;
    Scope currentScope;

    CGenerator(GlobalScope entityTable) {
        this.entityTable = entityTable;
        currentScope = new GlobalScope(null);
        
        System.out.println(entityTable.toTestString());
    }

    @Override
    public Object visitEntityHeader(FlareParser.EntityHeaderContext ctx) {
        FileGenerator.generateFile(ctx.IDENTIFIER().getText(), "h");

        FileGenerator.write("#include <vector>\n");

        return super.visitChildren(ctx);
    }

    @Override
    public Object visitDeclarationHeader(FlareParser.DeclarationHeaderContext ctx) {
        FileGenerator.write("typedef struct " + FileGenerator.getCurrentFile() + "{");

        super.visitChildren(ctx);

        FileGenerator.write("} " + FileGenerator.getCurrentFile() + "; ");
        return null;
    }

    @Override
    public Object visitDeclarationLine(FlareParser.DeclarationLineContext ctx) {
        super.visitChildren(ctx);
        FileGenerator.write(";");
        return null;
    }

    @Override
    public Object visitDeclarationStatement(FlareParser.DeclarationStatementContext ctx) {
        FileGenerator.write("std::vector<" + ctx.variableType().getText() + ">");

        List<ParseTree> identifiers = ctx.identifierList().children;
        FileGenerator.write(identifiers.get(0).getText());
        for (int i = 2; i < identifiers.size(); i += 2)
            FileGenerator.write( "," + identifiers.get(i).getText());

        return null;
    }

    enum methodType { CONSTRUCTOR, DECONSTRUCTOR, METHOD }

    @Override
    public Object visitEntityMethods(FlareParser.EntityMethodsContext ctx) {
        List<FlareParser.DeclarationStatementSingularContext> parameters = (List<FlareParser.DeclarationStatementSingularContext>)super.visit(ctx.declarationParameters());
        Triple<String, String, methodType> methodInfo = (Triple<String, String, methodType>)super.visit(ctx.definedFunctionHeaders());

        FileGenerator.write("template<typename " + methodInfo.getSecond() + "0");
        for(int i = 0; i < parameters.size(); i++)
            FileGenerator.write(", typename "+ methodInfo.getSecond() + (i + 1));
        FileGenerator.write(">");

        FileGenerator.write(methodInfo.getFirst() + " " + methodInfo.getSecond());

        FileGenerator.write("(" + methodInfo.getSecond() + "0 entity");
        if (methodInfo.getThird() == methodType.CONSTRUCTOR)
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

        super.visit(ctx.body());

        FileGenerator.write("}");
        return null;
    }

    @Override
    public Object visitConstructorHeader(FlareParser.ConstructorHeaderContext ctx) {
        return new Triple("void", FileGenerator.getCurrentFile() + "_ctor", methodType.CONSTRUCTOR);
    }

    @Override
    public Object visitDeconstructorHeader(FlareParser.DeconstructorHeaderContext ctx) {
        return new Triple("void", FileGenerator.getCurrentFile()+ "_dtor", methodType.DECONSTRUCTOR);
    }

    @Override
    public Object visitMethodHeader(FlareParser.MethodHeaderContext ctx) {
        return new Triple(ctx.methodType().getText(), FileGenerator.getCurrentFile() + "_"+ ctx.IDENTIFIER().getText(), methodType.METHOD);
    }
    @Override
    public Object visitDeclarationParameters(FlareParser.DeclarationParametersContext ctx) {
        return ctx.declarationStatementSingular();
    }

    @Override
    public Object visitDeclarationStatementSingular(FlareParser.DeclarationStatementSingularContext ctx) {
        String typePtr = ctx.variableType().getText();
        FileGenerator.write(typePtr + " " + ctx.IDENTIFIER().getText());
        return null;
    }

    @Override
    public Object visitStatement(FlareParser.StatementContext ctx) {
        super.visitChildren(ctx);
        FileGenerator.write(";");
        return null;
    }

    @Override
    public Object visitAssignment(FlareParser.AssignmentContext ctx) {
        return super.visitAssignment(ctx);
    }

    @Override
    public Object visitIdentifierSpecifier(FlareParser.IdentifierSpecifierContext ctx) {

        return null;
    }
}
