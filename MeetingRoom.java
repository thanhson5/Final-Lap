package pkgfinal.lab;

import java.util.Date;


public class MeetingRoom extends Room {
    private final int capacity;

    public MeetingRoom(String id, String name, double baseCost, Date checkinDate, Date checkoutDate, int capacity) {
        super(id, name, baseCost, checkinDate, checkoutDate);
        this.capacity = capacity;
    }

    @Override
    public double calculateCost() {
        double cost = baseCost * calculateDayStays();
        if (capacity > 50) {
            cost *= 1.2; // Increase by 20%
        }
        return cost;
    }

    @Override
    public void displayDetails() {
        System.out.println("Meeting Room [ID: " + id + ", Name: " + name + ", Capacity: " + capacity + ", Cost: " + calculateCost() + "]");
    }

    @Override
    public void enterRoomInfo() {
        
    }

    @Override
    public void updateRoomById(String id) {
        
    }
}
