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
public class Wedding extends Greetings{

   private String openVerse [] = { "Hello", "Dear"};
   private String middleVerse [] = {"May the years ahead streghten the love you share", "Warm wishes for your wedding day and a happy return", "We wish you all the best as you begin your lives together"};
   private String endVerse [] = {"Regards", "Yours Sincerely", "Many Happy Returns"};
  // private String name;
   //private String client;
   
    //take one Greeting at random
    //cast to int as Math.random is double by default
    // * top index which starts 0
      @Override
    //public void salutation(String name){
    public void salutation(String name){
        String e = openVerse [(int)Math.floor(Math.random()*2)];
        System.out.println(e + " " + name);
     }
    @Override
    public void verse(){ 
        String f = middleVerse [(int)Math.floor(Math.random()*2)];
        System.out.println(f);
    } 
    @Override
    public void closing(String client){ 
        String g = endVerse[(int)Math.floor(Math.random()*2)];
        System.out.println(g + " " + client);
    }

}
