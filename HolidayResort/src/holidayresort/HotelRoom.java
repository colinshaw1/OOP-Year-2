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
public class HotelRoom extends Holiday {
    private int roomNumber;
    private int roomCost;
    private int breakfast;
    private int breakfastInculded;

    public HotelRoom(int roomNumber, int roomCost, int breakfast, int breakfastInculded, String clientName, int bookingReference, String startDate, int numNights) {
        super(clientName, bookingReference, startDate, numNights);
        this.roomNumber = roomNumber;
        this.roomCost = roomCost;
        this.breakfast = breakfast;
        this.breakfastInculded = breakfastInculded;
    }
    public HotelRoom(){
    roomNumber = 0;
    roomCost = 130;
    breakfast = 10;
    breakfastInculded = roomCost + breakfast;
     
    }    
    

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomCost() {
        return roomCost;
    }

    public void setRoomCost(int roomCost) {
        this.roomCost = roomCost;
    }

    public int getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(int breakfast) {
        this.breakfast = breakfast;
    }

    public int getBreakfastInculded() {
        return breakfastInculded;
    }

    public void setBreakfastInculded(int breakfastInculded) {
        this.breakfastInculded = breakfastInculded;
    }

    

}