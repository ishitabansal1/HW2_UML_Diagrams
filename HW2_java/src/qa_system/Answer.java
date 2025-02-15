package qa_system; // Ensure this matches your folder name

public class Answer {
    private int answerID;
    private String text;
    private int linkedQuestionID;

    // Constructor
    public Answer(int answerID, String text, int linkedQuestionID) {
        this.answerID = answerID;
        this.text = text;
        this.linkedQuestionID = linkedQuestionID;
    }

    // Getter for Answer ID
    public int getAnswerID() {
        return answerID;
    }

    // Getter for text
    public String getText() {
        return text;
    }

    // Getter for linked Question ID
    public int getLinkedQuestionId() {
        return linkedQuestionID;
    }

    // View answer details
    public void viewAnswer() {
        System.out.println("📌 Answer ID: " + answerID);
        System.out.println("💬 Answer: " + text);
        System.out.println("🔗 Linked Question ID: " + linkedQuestionID);
        System.out.println("-----------------------------");
    }
}
