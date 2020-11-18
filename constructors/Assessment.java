/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors;

/**
 *
 * @author colin
 */
public class Assessment {
    private String name; 
    private String type;
    private int weighting;
    
    public Assessment(){
        name = new String();
        type = new String();
        weighting =  0;
    }
    public Assessment(String name, String type, int weighting){
        this.name =  name;
        this.type = type;
        this.weighting = weighting;
     
        
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeighting() {
        return weighting;
    }

    public void setWeighting(int weighting) {
        this.weighting = weighting;
    }

    public String getDetails(){
        return "Name: "+name+"\nType: "+type+"\nWeighting: "+weighting+"%";
    }
}
