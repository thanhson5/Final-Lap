
package pkgfinal.lab;

import java.util.ArrayList;


public class RoomList {
    private final ArrayList<IRoom> roomList = new ArrayList<>();

    public void addRoom(IRoom room) {
        roomList.add(room);
    }

    public void updateRoomById(String id) {
        roomList.forEach((room) -> {
            room.updateRoomById(id);
        });
    }
    public void deleteRoomById(String id) {
        roomList.removeIf(room -> ((Room) room).id.equals(id));
    }
    public IRoom findRoomById(String id) {
        for (IRoom room : roomList) {
            if (((Room) room).id.equals(id)) {
                return room;
            }
        }
        return null;
    }
     public void displayAllRooms() {
         roomList.forEach((room) -> {
             room.displayDetails();
        });
    }

    public IRoom findMostExpensiveRoom() {
        IRoom mostExpensiveRoom = null;
        double maxCost = 0;

        for (IRoom room : roomList) {
            double cost = room.calculateCost();
            if (cost > maxCost) {
                maxCost = cost;
                mostExpensiveRoom = room;
            }
        }
        return mostExpensiveRoom;
    }

    public void countRooms() {
        int meetingRoomCount = 0;
        int bedRoomCount = 0;

        for (IRoom room : roomList) {
            if (room instanceof MeetingRoom) {
                meetingRoomCount++;
            } else if (room instanceof BedRoom) {
                bedRoomCount++;
            }
        }

        System.out.println("Meeting Rooms: " + meetingRoomCount);
        System.out.println("Bedrooms: " + bedRoomCount);
    }
}
