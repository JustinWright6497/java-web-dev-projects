package org.launchcode;

import java.util.ArrayList;

public class Quiz {
    public String name;
    public double grade;
    public ArrayList<Question> someQuestions;
    public Quiz(String name, ArrayList<Question> someQuestions) {
        this.name = name;
        this.someQuestions = someQuestions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
