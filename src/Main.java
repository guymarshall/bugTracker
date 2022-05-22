import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int bugID = 7;
        String status = "Open";
        String title = "Computer keeps crashing!!";
        String description = "When I turn the computer on, it crashes and shows a blue screen";
        LocalDate dateCreated = LocalDate.now();
        String createdBy = "Steven";
        String assignedTo = "Tom";
        String priority = "Urgent";
        String category = "Hardware fault";

        Bug bug = new Bug(bugID, status, title, description, dateCreated, createdBy, assignedTo, priority, category);

        System.out.println(bug);
    }
}