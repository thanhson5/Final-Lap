
package pkgfinal.lab;

import java.util.Date;

public class Processor {
    public static void main(String[] args) {
        RoomList roomList = new RoomList();

        
        roomList.addRoom(new MeetingRoom("MR001", "Conference A", 500, new Date(), new Date(), 60));
        roomList.addRoom(new BedRoom("BR001", "Suite", 300, new Date(), new Date(), 4));

        
        roomList.displayAllRooms();

        
        roomList.countRooms();

        
        IRoom expensiveRoom = roomList.findMostExpensiveRoom();
        if (expensiveRoom != null) {
            System.out.println("Most Expensive Room:");
            expensiveRoom.displayDetails();
        }
    }
}

