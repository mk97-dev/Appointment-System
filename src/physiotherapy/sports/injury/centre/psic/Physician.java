/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapy.sports.injury.centre.psic;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/**
 *
 * @author Mubeen Khan
 */
public class Physician extends Personnel  {
    
    private ArrayList<String> expertise = new ArrayList<String>();
    private static int count = 0;
    private static ArrayList<Physician> physicians = new ArrayList<Physician>();
    private String physicianId = "Physician";
    private LinkedHashMap<Slots,String> timeTable = new LinkedHashMap<Slots,String>();
    private LinkedHashMap<String,String> consultationHours = new LinkedHashMap<String,String>();
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
         
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
        LocalDateTime dateTime = LocalDateTime.parse(date, formatter);
        DayOfWeek dow = dateTime.getDayOfWeek();
        String dayDate = dow.getDisplayName(TextStyle.SHORT, Locale.UK)+" "+date;
        timeTable.put(new Slots(dayDate,expertise),this.status);
    }

    public LinkedHashMap<String,String> getConsultationHours() {
        return consultationHours;
    }

    public void setConsultationHours(String date) {
        for(int j=0;j<4;j++){
        for(int i=0;i<4;i++){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
        LocalDateTime dateTime = LocalDateTime.parse(date, formatter);
        dateTime = dateTime.plusMinutes(30*i);
        dateTime = dateTime.plusDays(j*7);
        DayOfWeek dow = dateTime.getDayOfWeek();
        String dayDate = dow.getDisplayName(TextStyle.SHORT, Locale.UK)+" "+formatter.format(dateTime);
        consultationHours.put(dayDate,"Available");
    }
        }
    }

}
