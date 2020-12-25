import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class FileGenerator {
    private static String directory;
    private static String currentFile;

    private static FileWriter writer;

    public static void setDirectory(String genDirectory) {
        System.out.println(genDirectory);
        FileGenerator.directory = genDirectory;
    }

    public static void generateFile(String fileName, String fileExtension) {
        try {
            writer.close();
        } catch (Exception e) {
            System.out.println("No writer exists");
        }

        try {
            FileGenerator.currentFile = fileName;
            FileGenerator.writer = new FileWriter(FileGenerator.directory + '\\' + fileName + '.' + fileExtension);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.toString());
        }
    }

    public static void write(String line) {
        try {
            FileGenerator.writer.write(line);
            FileGenerator.writer.flush();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.toString());
        }
    }

    public static String getCurrentFile() {
        return currentFile;
    }
}
