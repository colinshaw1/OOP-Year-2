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
public class Student extends BankAccount{
    private String email;
    private String stuId;
    private double charges;

    public Student(String email, String studId, double charges, int acNum, String name, String iban, double balance) {
        super(acNum, name, iban, balance);
        this.email = email;
        this.stuId = stuId;
        this.charges = charges;
    }
    public void studentDetails(){
        System.out.println("email: " +email+ " stuID: " +stuId+ "charges: "+charges);
    }
    
}
