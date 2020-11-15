/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author colin
 */
public class Exam {
    String question;
    String correctAnswer;
    double mark;
    String userAnswer;

    public Exam(String question, String correctAnswer, double mark, String userAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.mark = mark;
        this.userAnswer = userAnswer;
    }
    public Exam() {
       question = "";
       correctAnswer = "";
       mark = 0;
       userAnswer = "";   
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }
    
}
