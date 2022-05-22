import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Bug tracker ---");
        Scanner scanner = new Scanner(System.in);

        String bugID = UUID.randomUUID().toString();
        String status = "Open";

        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Description: ");
        String description = scanner.nextLine();
        LocalDateTime dateCreated = LocalDateTime.now();

        System.out.print("Created by: ");
        String createdBy = scanner.nextLine();

        System.out.print("Assigned to: ");
        String assignedTo = scanner.nextLine();

        System.out.print("Priority: ");
        String priority = scanner.nextLine();

        System.out.print("Category: ");
        String category = scanner.nextLine();

        Bug bug = new Bug(bugID, status, title, description, dateCreated, createdBy, assignedTo, priority, category);

        String[] bugDetails = {bugID, title, description, dateCreated.toString(), createdBy, assignedTo, priority, category};

        BugFileHandler bugFileHandler = new BugFileHandler();
        String fileContents = bugFileHandler.generateFileContents(bugDetails);

        System.out.println(fileContents);

//        String filename = String.format("%s_%s.txt", bugID, dateCreated);

        System.out.println(bugID);

        //save file with bugID_dateTime_createdBy as filename
        bugFileHandler.saveFile(bugID, fileContents);

        System.out.println(bug);
        System.out.println(dateCreated);
    }
}