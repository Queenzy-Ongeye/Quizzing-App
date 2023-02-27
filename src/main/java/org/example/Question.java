package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question {
    private String question;
    private List<Object> answers;
    private Object correctAnswer;

    public Question(String question, List<Object> answers, Object correctAnswer){
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

//    Adding the getters
    public String getQuestion() {
        return question;
    }
    public List<Object> getAnswers() {
        return answers;
    }
    public Object getCorrectAnswer() {
        return correctAnswer;
    }

}
