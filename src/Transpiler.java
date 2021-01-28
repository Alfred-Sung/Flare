import Flare.FlareParser;
import Flare.util.FileGenerator;
import Flare.util.Timer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import symbtab.GlobalScope;
import symbtab.Scope;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Transpiler {
    public static void main(String[] args) {
        try {
            FileGenerator.setDirectory(args[0]);
            List<ParseTree> trees = new LinkedList<>();

            for (int i = 1; i < args.length; i++) {
                Timer.start();
                CharStream stream = fromFileName(args[i]);

                FlareLexer lex = new FlareLexer(stream);
                CommonTokenStream tokens = new CommonTokenStream(lex);

                FlareParser parse = new FlareParser(tokens);
                trees.add(parse.file());
                Timer.stop();
                System.out.println("Parsed " + args[i] + " in " + Timer.getElapsed() + "ms");
            }

            Timer.start();
            EntityTable entityTable = new EntityTable();
            for (ParseTree tree : trees)
                entityTable.visit(tree);
            Timer.stop();
            System.out.println("Populated entity table in " + Timer.getElapsed() + "ms");

            Timer.start();
            HeaderGenerator visitor = new HeaderGenerator(entityTable.table);
            for (ParseTree tree : trees)
                visitor.visit(tree);
            Timer.stop();
            System.out.println("Generated code in " + Timer.getElapsed() + "ms");

            Scope main = entityTable.table.get("main");
            if (main != null) {
                Timer.start();
                FileGenerator.generateFile("main", "c");

                FileGenerator.write("#include<vector>\n");
                for (String filename : ((GlobalScope)entityTable.table).getChildren())
                    if (!filename.equals("main")) FileGenerator.write("#include\"" + filename + ".h\"\n");

                MethodGenerator methodGenerator = new MethodGenerator();
                methodGenerator.setCurrentScope(main);

                FileGenerator.write("int main(){");
                methodGenerator.visitBody(((FlareParser.MainMethodContext) main.getNode()).body());
                FileGenerator.write("return 0;}");
                FileGenerator.close();

                Timer.stop();
                System.out.println("Generated main.c " + Timer.getElapsed() + "ms");

                Timer.start();
                compileCprog(args[0]);
                Timer.stop();
                System.out.println("gcc compiled in " + Timer.getElapsed() + "ms");

            } else {
                System.out.println("Main method does not exist");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void compileCprog(String filename) throws Exception {
        File dir = new File(filename);

        Process p = Runtime.getRuntime().exec("cmd /C gcc main.c -o a", null, dir);
        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line = null;
        while ((line = in.readLine()) != null)
            System.out.println(line);
    }
}