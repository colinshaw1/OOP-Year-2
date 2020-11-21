/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greetingsapp;

/**
 *
 * @author colin
 */
public abstract class Greetings {
    
    protected String [] openVerse;
    protected String [] middleVerse;
    protected String [] endVerse;
    
    
    public void initialise(){
            System.out.println("Thank you and enjoy you Greeting Card ");
    }
    //definces the order the methods will run in.
    public abstract void salutation(String name);
    public abstract void verse();
    public abstract void closing(String client);
    
    /**
     *
     * @param name
     * @param client
     */
    public final void card(String name, String client){
        initialise();
        salutation(name);
        verse();
        closing(client);
       
    }
      
}
