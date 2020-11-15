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
public class Holiday {
    private String clientName; 
    private int bookingReference; 
    private String startDate;
    private int numNights;
    
    public Holiday(){
        clientName = new String(); 
        bookingReference = 0;
        startDate = new String();
        numNights = 0;       
    }
  public Holiday(String clientName, int bookingReference, String startDate, int numNights) {
        this.clientName = clientName;
        this.bookingReference = bookingReference;
        this.startDate = startDate;
        this.numNights = numNights;
    }
  
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getBookingReference() {
        return bookingReference;
    }

    public void setBookingReference(int bookingReference) {
        this.bookingReference = bookingReference;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getNumNights() {
        return numNights;
    }

    public void setNumNights(int numNights) {
        this.numNights = numNights;
    }
    
  
    
}
