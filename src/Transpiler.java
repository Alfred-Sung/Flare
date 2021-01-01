import Flare.FlareParser;
import Flare.util.FileGenerator;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Transpiler {
    public static void main(String[] args) {
        try {
            FileGenerator.setDirectory(args[0]);
            List<ParseTree> trees = new LinkedList<>();

            for (int i = 1; i < args.length; i++) {
                CharStream stream = fromFileName(args[i]);

                FlareLexer lex = new FlareLexer(stream);
                CommonTokenStream tokens = new CommonTokenStream(lex);

                FlareParser parse = new FlareParser(tokens);
                trees.add(parse.file());
            }

            EntityTable entityTable = new EntityTable();
            for (ParseTree tree : trees)
                entityTable.visit(tree);

            HeaderGenerator visitor = new HeaderGenerator(entityTable.table);
            for (ParseTree tree : trees)
                visitor.visit(tree);

        } catch (Exception e) {
            System.exit(1);
        }
    }
}