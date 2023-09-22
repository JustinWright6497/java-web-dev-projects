package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;


public class MultipleChoice extends Question{
    public String correctChoice;
    public MultipleChoice(String question, ArrayList<String> answerChoices, String correctChoice) {
        super(question, answerChoices);
        this.correctChoice = correctChoice;
    }

    public String getCorrectAnswer() {
        return correctChoice;
    }

    public void setCorrectAnswer(String correctChoice) {
        this.correctChoice = correctChoice;
    }

    public boolean checkAnswer() {
        Scanner input = new Scanner(System.in);

        String userChoice = input.nextLine();

        this.setIsCorrect(userChoice.equals(this.correctChoice));

        return (userChoice.equals(this.correctChoice));
    }
}
