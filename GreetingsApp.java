/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greetingsapp;

import java.util.Scanner;

/**
 *
 * @author colin
 */
public class GreetingsApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        Greetings birthday = new Birthday();
        
        System.out.println("Enter recivers name, please");
        String name = sc.next();
        System.out.println("Please enter senders name");
        String client = sc.next();
        
        birthday.card(name,client);
        
        Greetings christmas = new Christmas();
        christmas.card(name, client);
        
        Greetings wedding = new Wedding();
        wedding.card(name, client);
        
    }
    
}
