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
public class Essay extends Exam{
private double wordCount;
    public Essay(double wordCount, String question, String correctAnswer, double mark, String userAnswer) {
        super(question, correctAnswer, mark, userAnswer);
        this.wordCount = wordCount;
    }

    public double getWordCount() {
        return wordCount;
    }

    public void setWordCount(double wordCount) {
        this.wordCount = wordCount;
    }
    
    public Essay(double wordCount) {
        this.wordCount = wordCount;
    }
    
}
