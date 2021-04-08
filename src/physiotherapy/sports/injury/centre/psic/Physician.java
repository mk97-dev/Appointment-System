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
public class Physician extends Personnel  {
    
    private ArrayList<String> expertise = new ArrayList<String>();
    private static int count = 0;
    private static ArrayList<Physician> physicians = new ArrayList<Physician>();
    private String physicianId = "Physician ";
    private HashMap<Slots,String> timeTable = new HashMap<Slots,String>();
    private String consultationHours;
   private String status = "Available";
   


    
    public String getPhysicianId() {
        return physicianId;
    }

    public void setPhysicianId() {
        physicianId = physicianId + String.valueOf(++count);
    }
     
    public ArrayList<String> getExpertise() {
        return expertise;
    }

    public void setExpertise(ArrayList<String> expertise) {
        this.expertise = expertise;
    }

    
   
    
    public void addExpertise(String expertise){
        this.expertise.add(expertise);
    }

    /**
     * @return the physicians
     */
    public static ArrayList<Physician> getPhysicians() {
        return physicians;
    }

    /**
     * @param aPhysicians the physicians to set
     */
    public static void setPhysicians(Physician aPhysicians) {
        physicians.add(aPhysicians);
    }


    /**
     * @return the timeTable
     */
    public HashMap<Slots,String> getTimeTable() {
        return timeTable;
    }

    /**
     * @param date the timeTable to set
     * @param expertise
     */
    public void setTimeTable(String date,String expertise) {
        
        timeTable.put(new Slots(date,expertise),this.status);
    }

    public String getConsultationHours() {
        return consultationHours;
    }

    public void setConsultationHours(String consultationHours) {
        this.consultationHours = consultationHours;
    }

}
