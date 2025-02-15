package qa_system;

public class Question {
    private int id;
    private String content;
    private String timestamp;

    // Constructor
    public Question(int id, String content, String timestamp) {
        this.id = id;
        this.content = content;
        this.timestamp = timestamp;
    }

    // Getters
    public int getId() { return id; }
    public String getContent() { return content; }
    public String getTimestamp() { return timestamp; }

    // Setters
    public void setContent(String content) { this.content = content; }
    public void setTimestamp(String timestamp) { this.timestamp = timestamp; }

    // CRUD Operations
    public void createQuestion() {
        System.out.println("✅ New Question Added: " + content);
    }

    public void displayQuestion() {
        System.out.println("📝 Question ID: " + id + " | " + content + " | Created on: " + timestamp);
    }

    public void modifyQuestion(String newContent) {
        this.content = newContent;
        System.out.println("✏️ Question Updated: " + content);
    }

    public void removeQuestion() {
        System.out.println("🗑️ Question Removed.");
    }
}
