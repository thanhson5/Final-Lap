/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.lab;

import java.util.Date;

public abstract class Room implements IRoom {
    protected String id;
    protected String name;
    protected double baseCost;
    protected Date checkinDate;
    protected Date checkoutDate;

    public Room(String id, String name, double baseCost, Date checkinDate, Date checkoutDate) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
    }

    protected long calculateDayStays() {
        long difference = checkoutDate.getTime() - checkinDate.getTime();
        return difference / (1000 * 60 * 60 * 24);
    }

    @Override
    public abstract double calculateCost();

    @Override
    public abstract void displayDetails();

    @Override
    public abstract void enterRoomInfo();

    @Override
    public abstract void updateRoomById(String id);
}

