import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private List<Question> questions;

    public Quiz() {
        questions = new ArrayList<>();
        // Add quiz questions here
        questions.add(new Question("What is Middle name of Harry ?", "James"));
        questions.add(new Question("Who had the deadly hallows in the end ?", "HARRY POTTER"));
        questions.add(new Question("Who killed nagini ?", "Neville longbottom "));
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
