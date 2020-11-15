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
public class ExamApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Exam Q1 = new Exam();
        Q1.setQuestion("insert question");
        Q1.setCorrectAnswer("Insert correct answer");
        Q1.setMark(0);
        Q1.setUserAnswer("User input");
        
        System.out.println(Q1.getCorrectAnswer() + "," + Q1.getCorrectAnswer() + "," + Q1.getMark() + "," + Q1.getUserAnswer());
        
        Multiple M1 = new Multiple(0.0, "Insert Question", "Insert correct answer", 0.0, "User Input");
        System.out.println(M1.getQuestion() + "," + M1.getCorrectAnswer() + "," + M1.getMark() + "," + M1.getOptions() + "," + M1.getUserAnswer());
        
        Essay E1 = new Essay(0.0, "Insert question", "Insert Correct answer", 0.0, "User input");
        System.out.println(E1.getQuestion() + "," + E1.getCorrectAnswer() + "," + E1.getMark() + "," + E1.getUserAnswer() + "," + E1.getWordCount());
   

    }
    
}
