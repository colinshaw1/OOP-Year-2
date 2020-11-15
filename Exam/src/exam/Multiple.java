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
public class Multiple extends Exam{
    private double options;    

    public Multiple(double options, String question, String correctAnswer, double mark, String userAnswer) {
        super(question, correctAnswer, mark, userAnswer);
        this.options = options;
    }

    public double getOptions() {
        return options;
    }

    public void setOptions(double options) {
        this.options = options;
    }
    public Multiple(double options) {
        this.options = options;
    }
}
