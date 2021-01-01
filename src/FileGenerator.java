import java.io.FileWriter;
import java.util.LinkedList;
import java.util.List;

public class FileGenerator {
    private static String directory;
    private static String currentFile;
    private static List<String> headerFiles = new LinkedList<>();

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

    public static void setCurrentFile(String currentFile) {
        FileGenerator.currentFile = currentFile;
    }

    public static String getCurrentFile() {
        return FileGenerator.currentFile;
    }

    public static void addHeaderFile(String fileName) {
        FileGenerator.headerFiles.add(fileName);
    }

    public static List<String> getHeaderFiles() {
        return FileGenerator.headerFiles;
    }
}
