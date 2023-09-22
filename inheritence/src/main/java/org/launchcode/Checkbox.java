package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public class Checkbox extends Question{
    public String correctChecks;
    public Checkbox(String question, ArrayList<String> answerChoices, String correctChecks) {
        super(question, answerChoices);
        this.correctChecks = correctChecks;
    }

    public String getCorrectAnswer() {
        return correctChecks;
    }

    public void setCorrectAnswer(String correctChecks) {
        this.correctChecks = correctChecks;
    }

    public boolean checkAnswer() {
        Scanner input = new Scanner(System.in);

        System.out.println("List your answers with no spaces all caps and in alphabetical order.");

        String userChoice = input.nextLine();

        this.setIsCorrect(userChoice.equals(correctChecks));

        return (userChoice.equals(correctChecks));
    }
}
