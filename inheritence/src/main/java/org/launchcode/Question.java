package org.launchcode;

import java.util.ArrayList;

public abstract class Question {
    public static int nextQuestionNumber = 1;
    public static int questionNumber;
    public String question;
    public boolean isCorrect;
    public ArrayList<String> answerChoices;

    public Question( String question, ArrayList<String> answerChoices) {
        questionNumber = nextQuestionNumber;
        nextQuestionNumber++;
        this.question = question;
        this.answerChoices = answerChoices;
    }

    public static int getQuestionNumber() {
        return questionNumber;
    }

    public ArrayList<String> getAnswerChoices() {
        return answerChoices;
    }

    public void setAnswerChoices(ArrayList<String> answerChoices) {
        this.answerChoices = answerChoices;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(boolean correct) {
        isCorrect = correct;
    }

    public void printAnswerChoices() {
        for (String answer : answerChoices) {
            System.out.println(answer);
        }
    }

    public abstract boolean checkAnswer();
}
