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
public class Birthday extends Greetings{
 
   private String openVerse [] = { "Hello", "Dear"};
   private String middleVerse [] = {"Happy Birthday", "Many Happy Returns", "May your birthday be filled with love"};
   private String endVerse [] = {"Regards", "Yours Sincerely", "Many Happy Returns"};
   //private String name;
   //private String client;
   
    //take one Greeting at random
    //cast to int as Math.random is double by default
    // * top index which starts 0
    @Override
    //public void salutation(String name){
    public void salutation(String name){
        String j = openVerse [(int)Math.floor(Math.random()*2)];
        System.out.println(j + " " + name);
     }
    @Override
    public void verse(){ 
        String k = middleVerse [(int)Math.floor(Math.random()*2)];
        System.out.println(k);
    } 
    @Override
    public void closing(String client){ 
        String m = endVerse[(int)Math.floor(Math.random()*2)];
        System.out.println(m + " " + client);
    }

}
