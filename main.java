import static spark.Spark.*;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        staticFileLocation("/web");

        Quiz quiz = new Quiz();

        // Define a route to serve the quiz questions as JSON
        get("/api/questions", (req, res) -> {
            res.type("application/json");
            return new Gson().toJson(quiz.getQuestions());
        });
    }
}
