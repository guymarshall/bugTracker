import java.io.FileWriter;
import java.io.IOException;

//serialise object

public class BugFileHandler {
    private static final String SEPARATOR = "|%$&£**&!*";
    public String generateFileContents(String[] bugDetails) {
        StringBuilder fileContents = new StringBuilder();

        for (String bugDetail: bugDetails) {
            fileContents.append(bugDetail).append(SEPARATOR);
        }
        return fileContents.toString();
    }
    public void saveFile(String fileName, String fileContents) {
        String extension = ".txt";
        try (FileWriter myWriter = new FileWriter(fileName + extension)) {
            myWriter.write(fileContents);
            System.out.println("Contents have been saved to file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /*readFile()*/
}
