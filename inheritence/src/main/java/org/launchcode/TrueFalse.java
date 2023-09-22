package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public class TrueFalse extends Question{
    public Boolean answerTF;
    public ArrayList<Boolean> answerChoices = new ArrayList<Boolean>();

    public TrueFalse(String question, ArrayList<String> answerChoices, Boolean answerTF) {
        super(question, answerChoices);
        this.answerTF = answerTF;
    }

    public Boolean getCorrectAnswer() {
        return answerTF;
    }

    public void setCorrectAnswer(Boolean answerTF) {
        this.answerTF = answerTF;
    }

    public boolean checkAnswer() {
        Scanner input = new Scanner(System.in);

        Boolean userChoice = input.hasNextBoolean();

        this.setIsCorrect(userChoice == answerTF);

        return (userChoice == answerTF);
    }
}
