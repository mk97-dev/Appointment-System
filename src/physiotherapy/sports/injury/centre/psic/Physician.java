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
public class Physician extends Personnel {
    
    private ArrayList<String> expertise;
    private String consultationHours;
    private static int count = 0;
    private String physicianId = "Physician ";
    
     public Physician(String fullName, String address, int phoneNumber) {
        super(fullName, address, phoneNumber);
        expertise = new ArrayList<String>();
        physicianId = physicianId + String.valueOf(++count);
    }

    public String getPhysicianId() {
        return physicianId;
    }

    public void setPhysicianId(String physicianId) {
        this.physicianId = physicianId;
    }
     
    public ArrayList<String> getExpertise() {
        return expertise;
    }

    public void setExpertise(ArrayList<String> expertise) {
        this.expertise = expertise;
    }

    public String getConsultationHours() {
        return consultationHours;
    }

    public void setConsultationHours(String consultationHours) {
        this.consultationHours = consultationHours;
    }
    
   
    
    public void addExpertise(String expertise){
        this.expertise.add("expertise");
    }
    
}
