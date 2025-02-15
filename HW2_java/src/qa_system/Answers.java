package qa_system;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Answers {
    private Map<Integer, List<Answer>> allAnswers;

    // Constructor
    public Answers() {
        this.allAnswers = new HashMap<>();
    }

    // Submitting an Answer
    public void submitAnswer(Answer a) {
        allAnswers.computeIfAbsent(a.getLinkedQuestionId(), ArrayList::new).add(a);
        System.out.println("💬 Answer Recorded for Question ID " + a.getLinkedQuestionId());
    }

    // Retrieving Answers
    public void retrieveAnswers(int qid) {
        if (allAnswers.containsKey(qid)) {
            for (Answer a : allAnswers.get(qid)) {
                a.viewAnswer();
            }
        } else {
            System.out.println("⚠️ No Answers Found for Question ID: " + qid);
        }
    }

    // Removing Answers for a Specific Question
    public void removeAllAnswersFor(int qid) {
        if (allAnswers.containsKey(qid)) {
            allAnswers.remove(qid);
            System.out.println("🗑️ Cleared All Answers for Question ID: " + qid);
        } else {
            System.out.println("⚠️ No Answers to Remove for Question ID: " + qid);
        }
    }
}
