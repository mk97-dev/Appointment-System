/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapy.sports.injury.centre.psic;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Mubeen Khan
 */
public class Physician extends Personnel {
    
    private ArrayList<String> expertise;
    private String consultationHours, appointmentHours;
    private static int count = 0;
    private String physicianId = "Physician ";
    HashMap<String, String> expertiseAppointments;
    private ArrayList<String> workingDays;
    private String[] workingHours;
    

    public HashMap<String, String> getExpertiseAppointments() {
        return expertiseAppointments;
    }

    public void addExpertiseAppointments(String expertise, String Time) {
        expertiseAppointments.put(expertise, Time);
    }
    
     public Physician(String fullName, String address, int phoneNumber, String consultationHours) {
        super(fullName, address, phoneNumber);
        expertise = new ArrayList<String>();
        workingDays = new ArrayList<String>();
        this.consultationHours = consultationHours;
        expertiseAppointments = new HashMap<String, String>();
        physicianId = physicianId + String.valueOf(++count);
    }

    public ArrayList<String> getWorkingDays() {
        return workingDays;
    }

    public void addWorkingDays(String workingDays) {
        this.workingDays.add(workingDays);
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
        this.expertise.add(expertise);
    }
    
}
