package com.example.homework6.ui.data;

import java.io.Serializable;

public class GameModel implements Serializable {
    private String level;
    private String quiz;
    private String answerOne;
    private String answerTwo;
    private String answerThree;
    private String answerFour;
    private String correctAnswer;

    public GameModel(String level, String quiz, String answerOne, String answerTwo, String answerThree, String answerFour, String correctAnswer) {
        this.level = level;
        this.quiz = quiz;
        this.answerOne = answerOne;
        this.answerTwo = answerTwo;
        this.answerThree = answerThree;
        this.answerFour = answerFour;
        this.correctAnswer = correctAnswer;
    }


    public String getLevel() {
        return level;
    }

    public String getQuiz() {
        return quiz;
    }

    public String getAnswerOne() {
        return answerOne;
    }

    public String getAnswerTwo() {
        return answerTwo;
    }

    public String getAnswerThree() {
        return answerThree;
    }

    public String getAnswerFour() {
        return answerFour;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
