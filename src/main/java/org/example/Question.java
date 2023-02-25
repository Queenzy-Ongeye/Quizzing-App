package org.example;

import java.util.List;

public class Question {
    private String question;
    private List<String> answers;
    private int correctAnswer;
    private String cAnswer;

    public Question(String question, List<String> answers, int correctAnswer, String cAnswer){
        this.question = question;
        this.answers = answers;
        this.cAnswer = cAnswer;
        this.correctAnswer = correctAnswer;
    }

//    Adding the getters
    public String getQuestion() {
        return question;
    }
    public List<String> getAnswers() {
        return answers;
    }
    public String getCAnswer() {
        return cAnswer;
    }
    public int getCorrectAnswer() {
        return correctAnswer;
    }

}
