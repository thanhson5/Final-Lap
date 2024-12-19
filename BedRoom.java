
package pkgfinal.lab;

import java.util.Date;



    public class BedRoom extends Room {
    private int numberOfBeds;

    public BedRoom(String id, String name, double baseCost, Date checkinDate, Date checkoutDate, int numberOfBeds) {
        super(id, name, baseCost, checkinDate, checkoutDate);
        this.numberOfBeds = numberOfBeds;
    }

    @Override
    public double calculateCost() {
        double cost = baseCost * calculateDayStays();
        if (numberOfBeds >= 3) {
            cost *= 1.1; // Increase by 10%
        }
        return cost;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bedroom [ID: " + id + ", Name: " + name + ", Beds: " + numberOfBeds + ", Cost: " + calculateCost() + "]");
    }

    @Override
    public void enterRoomInfo() {
        
    }

    @Override
    public void updateRoomById(String id) {
        
    }
}

        
    
        

