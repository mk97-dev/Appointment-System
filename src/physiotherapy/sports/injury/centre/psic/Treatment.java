/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapy.sports.injury.centre.psic;

import Views.VisitorView;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Mubeen Khan
 */
public class Treatment {

   
    private String treatmentName;
    private String room;
   //private LocalDateTime dateTimeOfBooking;
    private String dateTimeOfTreatment;
    private String physicianName;
    private String patientName;
    private static int count = 0;
    private String appointmentId = "Appointment ";
    private String status;
    private static ArrayList<Treatment> treatments = new ArrayList<Treatment>();

    public Treatment(String treatmentName,String dateTimeOfTreatment, String physicianName, String patientName,String room) {
        this.treatmentName = treatmentName;
        this.room = room;
        //this.dateTimeOfBooking = dateTimeOfBooking;
        this.dateTimeOfTreatment = dateTimeOfTreatment;
        this.physicianName = physicianName;
        this.patientName = patientName;
        this.status = "Booked";
        appointmentId = appointmentId + String.valueOf(++count);
        treatments.add(this);
    }

    public String getTreatmentName() {
        return treatmentName;
    }

   public String getDateTimeOfTreatment() {
        return dateTimeOfTreatment;
    }

    public String getPhysicianName() {
        return physicianName;
    }

    public String getPatientName() {
        return patientName;
    }

    /**
     * @return the treatments
     */
    public static ArrayList<Treatment> getTreatments() {
        return treatments;
    }

    /**
     * @param aTreatments the treatments to set
     */
    public static void setTreatments(ArrayList<Treatment> aTreatments) {
        treatments = aTreatments;
    }

    /**
     * @return the room
     */
    public String getRoom() {
        return room;
    }

    /**
     * @param room the room to set
     */
    public void setRoom(String room) {
        this.room = room;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
     public static boolean findTreatment(String patient, String date) {
         for(Treatment treatment: treatments){
             if(treatment.getPatientName().equals(patient)&&treatment.getDateTimeOfTreatment().equals(date) && treatment.getStatus().equals("Booked")){
                 return true;
             }
         }
         return false;

     
     }

    /**
     * @param dateTimeOfTreatment the dateTimeOfTreatment to set
     */
    public void setDateTimeOfTreatment(String dateTimeOfTreatment) {
        this.dateTimeOfTreatment = dateTimeOfTreatment;
    }

    public static String findTreatmentsByPatient(String s,String visitor) {
        for (Treatment treatment : Treatment.getTreatments()) {
            if (treatment.getPatientName().equals(visitor)) {
                s += treatment.getTreatmentName() + "\t" + treatment.getPhysicianName() + "\t" + treatment.getDateTimeOfTreatment() + "\t" + treatment.getPatientName() + "\t" + treatment.getStatus() + "\n";
            }
        }
        return s;
    }
}
