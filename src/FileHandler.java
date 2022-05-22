import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    public String generateFileContents(Bug bug) {
        String fileContents = "";
        //get each parameter from Bug class
        //iterate through and append each to String using StringBuilder
        //return String
        return fileContents;
    }
    public void saveFile(String fileName, String fileContents) {
        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(fileContents);
            myWriter.close();
            System.out.println("Contents have been saved to file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
