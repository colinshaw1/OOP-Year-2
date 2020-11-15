/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankeve;

/**
 *
 * @author colin
 */
public class BankApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student aron = new Student("aron@email.com", "x123", 0.0001, 123, "aron", "IE123 567", 100000.00);
        Student colin = new Student("colin@gmail.com","x12345", 0.0002, 1234, "colin", "IE1234 5678", 10000000.00, );
       
        System.out.println("");
        aron.studentDetails();
        aron.showDetails();
        
        
        colin.studentDetails();
        colin.showDetails();
        colin.currentDetails();
    }
    
}
