package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;

public class Checkbox extends Question {
    public ArrayList<String> answers;

    public Checkbox(String question, ArrayList<String> answers) {
        super(question);
        this.answers = answers;
    }
}

