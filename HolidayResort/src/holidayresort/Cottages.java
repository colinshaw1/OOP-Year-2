/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holidayresort;

/**
 *
 * @author colin
 */
public class Cottages extends Holiday {
    private String keyCollection;
    private int costPerNight;
    private int electricity;
    private int electricityCharge;

    public Cottages(String keyCollection, int costPerNight, int electricity, int electricityCharge, String clientName, int bookingReference, String startDate, int numNights) {
        super(clientName, bookingReference, startDate, numNights);
        this.keyCollection = keyCollection;
        this.costPerNight = costPerNight;
        this.electricity = electricity;
        this.electricityCharge = electricityCharge;
    }
     public Cottages(){
        keyCollection = new String();
        costPerNight = 60;
        electricity = 50;
        electricityCharge = costPerNight + electricity;
    }
    public String getKeyCollection() {
        return keyCollection;
    }

    public void setKeyCollection(String keyCollection) {
        this.keyCollection = keyCollection;
    }

    public int getCostPerNight() {
        return costPerNight;
    }

    public void setCostPerNight(int costPerNight) {
        this.costPerNight = costPerNight;
    }

    public int getElectricity() {
        return electricity;
    }

    public void setElectricity(int electricity) {
        this.electricity = electricity;
    }

    public int getElectricityCharge() {
        return electricityCharge;
    }

    public void setElectricityCharge(int electricityCharge) {
        this.electricityCharge = electricityCharge;
    }
     
    }
