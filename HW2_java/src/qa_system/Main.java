package qa_system;

public class Main {
    public static void main(String[] args) {
        Questions questionBank = new Questions();
        Answers answerBank = new Answers();

        // Creating questions
        Question q1 = new Question(101, "What is Java used for?", "2025-02-14");
        questionBank.insertQuestion(q1);

        // Creating answers
        Answer a1 = new Answer(201, "Java is used for backend development.", 101);
        answerBank.submitAnswer(a1);

        // Retrieve and Modify
        questionBank.fetchQuestion(101);
        answerBank.retrieveAnswers(101);

        // Update Question
        questionBank.editQuestion(101, "Explain Java’s applications.");
        questionBank.fetchQuestion(101);

        // Remove Question & Answers
        answerBank.removeAllAnswersFor(101);
        questionBank.discardQuestion(101);
    }
}
