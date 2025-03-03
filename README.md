# Quiz-Java

## Overview
This is a simple quiz game developed in Java. It is the second game I have ever made and my first using Java. The project is designed to enhance object-oriented programming (OOP) skills by organizing code into distinct classes and services.

## Features
- A structured object-oriented design.
- Modular components for better code management.
- Interactive quiz gameplay with user input.
- Automatic score calculation and display.

## Project Structure
```
Quiz-Java/
│── Quiz/
│   │── Main.java           # Entry point of the application
│   │── Question.java       # Defines the Question class
│   │── QuestionService.java # Handles quiz logic and score calculation
```

### File Descriptions

#### `Main.java`
- The **entry point** of the application.
- Creates an instance of `QuestionService` and calls methods to set questions, run the quiz, and print the final score.

#### `Question.java`
- Defines the `Question` class.
- Each `Question` object contains:
  - An `id` (unique identifier for each question).
  - A `question` (text of the question).
  - A list of `options` (multiple-choice answers).
  - An `answer` (the correct answer).
- Provides constructors, getters, and setters for data encapsulation.

#### `QuestionService.java`
- Manages the **quiz logic**.
- **Methods included:**
  - `setQuestions()`: Initializes a list of hardcoded questions.
  - `playQuiz()`: Iterates through the questions, accepts user input, and stores responses.
  - `calculateScore()`: Compares user responses to correct answers and computes the final score.
  - `printScore()`: Displays the user's score at the end of the game.

## New Learnings from This Project
- **Using Classes for Entities**: Every entity (like `Question`) is represented as a separate class for modularity.
- **Service-Oriented Architecture**: Functionality is separated into a dedicated service class (`QuestionService`).
- **Encapsulation and Data Hiding**: Private variables and getter/setter methods ensure controlled access to data.
- **User Input Handling**: Used `Scanner` to read user input dynamically during the quiz.
- **ArrayList Usage**: Managed dynamic collections of questions and answers efficiently. Learnt to create new ArrayList on spot when passing into a constructor.
- **Methodical Execution**: `Main.java` only orchestrates the components, ensuring a clean separation of concerns.

## Personal Learnings
My key takeaways include:
1. **Using classes for every entity**: Organizing related data and behaviors in well-defined classes.
2. **Creating services for functionalities**: Implementing a modular approach by handling quiz operations in `QuestionService`.
3. **Keeping the main class clean**: `Main.java` only assembles and triggers components, keeping it organized, easy to read and maintain.

## How to Run the Project
1. Clone the repository or download the project files.
2. Compile the Java files using:
   ```bash
   javac Quiz/*.java
   ```
3. Run the program:
   ```bash
   java Quiz.Main
   ```
4. Answer the quiz questions when prompted.
5. View your score at the end of the game.

## Future Enhancements
- **Dynamic Question Loading**: Load questions from a file or database instead of hardcoding them.
- **Graphical User Interface (GUI)**: Replace the console-based system with a graphical version. (Try combining with some basic front-end UI).
- **Multiple Question Types**: Add support for different types of questions (e.g., true/false, fill-in-the-blank).
- **Leaderboard System**: Maintain a record of high scores.
