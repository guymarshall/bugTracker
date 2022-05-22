import java.io.FileWriter;
import java.io.IOException;

public class BugFileHandler {
    public String generateFileContents(String[] bugDetails) {
        StringBuilder fileContents = new StringBuilder();
        String separator = "|";

        for (String bugDetail: bugDetails) {
            fileContents.append(bugDetail).append(separator);
        }
        return fileContents.toString();
    }
    public void saveFile(String fileName, String fileContents) {
        String extension = ".txt";
        try {
            FileWriter myWriter = new FileWriter(fileName + extension);
            myWriter.write(fileContents);
            myWriter.close();
            System.out.println("Contents have been saved to file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /*readFile()*/
}
