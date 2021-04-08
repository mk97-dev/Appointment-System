/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapy.sports.injury.centre.psic;

import java.util.ArrayList;

/**
 *
 * @author Mubeen Khan
 */
public class Room {
    private String roomName;
    private static ArrayList<Room> rooms = new ArrayList<Room>();

    public Room(String roomName){
       this.roomName = roomName;
     
        
    }
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * @return the rooms
     */
    public static ArrayList<Room> getRooms() {
        return rooms;
    }

    /**
     * @param aRooms the rooms to set
     */
    public static void setRooms(Room aRooms) {
        rooms.add(aRooms);
    }

    
}
