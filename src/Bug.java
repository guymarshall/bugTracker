import java.time.LocalDate;
import java.util.Date;

public class Bug {
    int bugID;
    String status;
    String title;
    String description;
    LocalDate dateCreated;
    String createdBy;
    String assignedTo;
    String priority;
    String category;

    public Bug(int bugID, String status, String title, String description, LocalDate dateCreated,
               String createdBy, String assignedTo, String priority, String category) {
        this.bugID = bugID;
        this.status = status;
        this.title = title;
        this.description = description;
        this.dateCreated = dateCreated;
        this.createdBy = createdBy;
        this.assignedTo = assignedTo;
        this.priority = priority;
        this.category = category;
    }

    public int getBugID() {
        return bugID;
    }

    public void setBugID(int bugID) {
        this.bugID = bugID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}