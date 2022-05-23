import java.time.LocalDateTime;

public class Bug {
    private String bugID;
    private String status;
    private String title;
    private String description;
    private LocalDateTime dateCreated;
    private String createdBy;
    private String assignedTo;
    private String priority;
    private String category;

    public Bug(String bugID, String status, String title, String description, LocalDateTime dateCreated,
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

    public String getBugID() {
        return bugID;
    }

    public void setBugID(String bugID) {
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

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
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