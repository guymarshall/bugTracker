import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        System.out.println("debug: running program");

        String bugID = UUID.randomUUID().toString();
        String status = "Open";
        String title = "Computer keeps crashing!!";
        String description = "When I turn the computer on, it crashes and shows a blue screen";
        LocalDateTime dateCreated = LocalDateTime.now();
        String createdBy = "Steven";
        String assignedTo = "Tom";
        String priority = "Urgent";
        String category = "Hardware fault";

        Bug bug = new Bug(bugID, status, title, description, dateCreated, createdBy, assignedTo, priority, category);

        // String fileContents = bug.generateFileContents(bug);
        String filename = String.format("%s_%s_%s.txt", bugID, dateCreated, createdBy);

        System.out.println(filename);

        //save file with bugID_dateTime_createdBy as filename

        System.out.println(bug);
        System.out.println(dateCreated);
    }
}