import java.util.*;

public class QuestionService {
    ArrayList<Question> questions = new ArrayList<>();
    ArrayList<String> answers = new ArrayList<>();

    // Set the questions (hard coded for now)
    public void setQuestions() {
        questions.add(new Question(1, "size of int", new ArrayList<>(List.of("2", "6", "4", "8")), "4"));
        questions.add(new Question(2, "size of double", new ArrayList<>(List.of("2", "6", "4", "8")), "8"));
        questions.add(new Question(3, "size of char", new ArrayList<>(List.of("2", "6", "4", "8")), "2"));
        questions.add(new Question(4, "size of long", new ArrayList<>(List.of("2", "6", "4", "8")), "8"));
        questions.add(new Question(5, "size of boolean", new ArrayList<>(List.of("1", "2", "4", "8")), "1"));
    }

    // Main body of the game
    public void playQuiz() {
        for (Question question: questions) {
            Scanner sc = new Scanner(System.in);
            System.out.println(question.getQuestion());
            question.showOptions();
            answers.add(sc.nextLine());
        }
    }

    // Calculate and return score
    private int calculateScore() {
        int score = 0;
        for (int i = 0; i < answers.size(); i++) {
            if (questions.get(i).getAnswer().equals(answers.get(i))) {
                score++;
            }
        }
        return score;
    }

    // Print the score after calculating
    public void printScore() {
        System.out.println("You Scored " + calculateScore() + "/5 points");
    }
}