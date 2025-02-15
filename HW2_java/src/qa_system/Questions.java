package qa_system;
import java.util.ArrayList;
import java.util.List;

public class Questions {
    private List<Question> allQuestions;

    // Constructor
    public Questions() {
        this.allQuestions = new ArrayList<>();
    }

    public void insertQuestion(Question q) {
        allQuestions.add(q);
        System.out.println("📌 Stored Question: " + q.getContent());
    }

    public void fetchQuestion(int qid) {
        for (Question q : allQuestions) {
            if (q.getId() == qid) {
                q.displayQuestion();
                return;
            }
        }
        System.out.println("⚠️ Question Not Found.");
    }

    public void editQuestion(int qid, String updatedContent) {
        for (Question q : allQuestions) {
            if (q.getId() == qid) {
                q.modifyQuestion(updatedContent);
                return;
            }
        }
        System.out.println("⚠️ Unable to Find Question.");
    }

    public void discardQuestion(int qid) {
        allQuestions.removeIf(q -> q.getId() == qid);
        System.out.println("🗑️ Question Successfully Removed.");
    }
}
