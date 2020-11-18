/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors;

import java.util.Date;

/**
 *
 * @author colin
 */
public class AssessmentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Assessment a = new Assessment ("OOP Exam" );
        a.setName("OOP Project");
        a.setType("Continous Assessment");
        a.setWeighting(35);
        
        System.out.println("Assessment Name: " +a.getName());
        System.out.println("Assessment Type: "+ a.getType());
        System.out.println("Assessment Weighting: "+ a.getWeighting());
        
        Assessment b = new Assessment("OOP Exam", "Terminal Exam", 50);
        System.out.println("Assessment Name: " +b.getName());
        System.out.println("Assessment Type: "+ b.getType());
        System.out.println("Assessment Weighting: "+ b.getWeighting());
        
      //new instance of project class
      Date d = new Date (28,02,2013);
      Project p = new Project("OOP Project", "Continuous Assessment",30,d);
      System.out.println(p.getName());
      System.out.println(p.getType());
      System.out.println(p.getWeighting());
      System.out.println(p.getDeadline());
      
      // getDetails method to retrive details of a and b
        System.out.println(a.getDetails());
        System.out.println(b.getDetails());
    }
    
}
