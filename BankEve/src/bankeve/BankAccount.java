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
public class BankAccount {
    private int acNum;
    private String name;
    private String iban;
    private double balance;
    
    public BankAccount(int acNum, String name, String iban, double balance){
        this.acNum = acNum;
        this.name = name;
        this.iban = iban;
        this.balance = balance;
    }
    public void showDetails(){
        System.out.println("acNum: " +acNum+ " name:" +name+ "iban:" +iban+ "balance" +balance);
    }
}
