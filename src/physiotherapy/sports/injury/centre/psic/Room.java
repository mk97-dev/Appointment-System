/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapy.sports.injury.centre.psic;

/**
 *
 * @author Mubeen Khan
 */
public class Room {
    private String roomName;

    public Room(String roomName){
       this.roomName = roomName;
        
    }
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
    
}
