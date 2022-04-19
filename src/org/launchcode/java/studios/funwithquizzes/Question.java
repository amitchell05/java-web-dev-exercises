package org.launchcode.java.studios.funwithquizzes;

public abstract class Question {

    private String question;

    public Question (String question) { this.question = question; }

    public void displayQuestion() {
        System.out.println(question);
    }

    public String getQuestion() { return question; }

    public void setQuestion() { this.question = question; }
}
