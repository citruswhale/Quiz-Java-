import java.util.*;

// Create a class with type question which has id, question, options and correct answer.
public class Question {
    int id;
    String question;
    ArrayList<String> options;
    String answer;

    //Set constructors:
    public Question() {
        this.options = new ArrayList<>();
    }

    public Question(int id, String question, ArrayList<String> options, String answer) {
        this.id = id;
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    // Set getters and setters (and show methods)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void showOptions() {
        for (String option: options) {
            System.out.println(option);
        }
    }

    public void setOption(String option) {
        this.options.add(option);
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}