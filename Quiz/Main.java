public class Main {
    public static void main(String[] args) {
        // Create an object of questionService. Set the questions, run the game and calculate the score and print.
        QuestionService service = new QuestionService();
        service.setQuestions();
        service.playQuiz();
        service.printScore();
    }
}