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
public class HolidayApp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Holiday a = new Holiday( "Colin", 123, "21/10/2020", 2);
        a.setClientName("Colin");
        a.setBookingReference(123);
        a.setStartDate("21/10/2020");
        a.setNumNights(2);
        System.out.println("Client's name: " + a.getClientName());
        System.out.println("Booking Reference Number: " + a.getBookingReference());
        System.out.println("Start Date: " + a.getStartDate());
        System.out.println("Number of Nights " + a.getNumNights());
    
        HotelRoom b = new HotelRoom( 10, 130, 10, 280, "Darren", 1256, "14/11/2020", 2);
        System.out.println("Clients name: " +b.getClientName());
        System.out.println("Booking Reference Number: " + b.getBookingReference());
        System.out.println("Start Date: " + b.getStartDate());
        System.out.println("Number of Nights: " + b.getNumNights());
        System.out.println("Room Number: " + b.getRoomNumber());
        System.out.println("Standard Cost Per Night: €" + b.getRoomCost());
        System.out.println("Breakfast Cost: €" + b.getBreakfast());
        System.out.println("Breakfast Included: €" + b.getBreakfastInculded());
        
        Cottages c = new Cottages("From Reception", 50, 60, 330, "John", 1236, "13/11/2020", 3);
        System.out.println("Clients name: " +c.getClientName());
        System.out.println("Booking Reference Number: " + c.getBookingReference());
        System.out.println("Start Date: " + c.getStartDate());
        System.out.println("Number of Nights: " + c.getNumNights());
        System.out.println("Key Collection point: " + c.getKeyCollection());
        System.out.println("Standard Cost Per Night: €" + c.getCostPerNight());
        System.out.println("Electricity charge: €" + c.getElectricity());
        System.out.println("Total cost for stay  with Electricity and Cottege cost: €" + c.getElectricityCharge());
        
        
    
    }
          
}

