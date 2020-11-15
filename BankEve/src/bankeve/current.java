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
public class current extends BankAccount {

    public current(int phone, int acNum, String name, String iban, double balance) {
        super(acNum, name, iban, balance);
        this.phone = phone;
    }
    private int phone;
    
    public void currentDetails(){
            System.out.println("phone" +phone);
}
    
}
