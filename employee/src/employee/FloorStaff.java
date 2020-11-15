/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author colin
 */
public class FloorStaff extends Employee {
    private double rate;

    public FloorStaff(double rate, String name, String id, String dob) {
        super(name, id, dob);
        this.rate = rate;
    }

    public FloorStaff(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
    
}
