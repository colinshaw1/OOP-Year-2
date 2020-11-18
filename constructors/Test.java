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
public class Test extends Assessment {
    private int numQuestions;
    private int duration;
    
    public Test(String name, String type, int weighting, int numQuestions, int duration){
    super(name, type, weighting);
    this.numQuestions = numQuestions;
    this.duration = duration;
}

    public int getNumQuestions() {
        return numQuestions;
    }

    public void setNumQuestions(int numQuestions) {
        this.numQuestions = numQuestions;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public String getDetauls(){
        return super.getDetails()+"\nDuration: "+duration+"\nNumber of Questions; "+numQuestions;
    }
    
}
