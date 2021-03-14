/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapy.sports.injury.centre.psic;

import static java.time.LocalDateTime.now;
import java.util.ArrayList;

/**
 *
 * @author Mubeen Khan
 */
public class PhysiotherapySportsInjuryCentrePSIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //To store Appointments
        ArrayList<Treatment> appointments = new ArrayList<Treatment>();  
        
       Physician physician1 = new Physician("mubeen","49 gleanings Avenue",45678,"15/03/2021 at 19:00");
       physician1.addExpertiseAppointments("Physiotherapy1","15/03/2021 at 9:00");
       physician1.addExpertiseAppointments("Physiotherapy2","15/03/2021 at 11:00");
       physician1.addExpertiseAppointments("Physiotherapy3","15/03/2021 at 13:00");
       physician1.addExpertiseAppointments("Osteopathy1","15/03/2021 at 15:00");
       physician1.addExpertiseAppointments("Osteopathy2","15/03/2021 at 17:00");
       
       Patient patient1 = new Patient("nadir","53 st stephens Rd",987654);
       
       ArrayList<Room> rooms = new ArrayList<Room>();
       rooms.add(new Room("medical consulting suite A"));
       rooms.add(new Room("medical consulting suite B"));
       rooms.add(new Room("medical consulting suite C"));
       rooms.add(new Room("GYM"));
       rooms.add(new Room("Swimming Pool"));
       
       //Treatment Booking
       String treatementName = "Physiotherapy";
       String roomName = String.valueOf(rooms.get(0));
       String dateBooking = String.valueOf(now());
       String dateAppointment = physician1.expertiseAppointments.get("Physiotherapy1");
       String physicianName = physician1.getFullName();
       String patientName = patient1.getFullName();
       String status = "Booked.";
       
       if (appointments.isEmpty()){
       Treatment treatment1 = new Treatment("Physiotherapy",String.valueOf(rooms.get(0)),String.valueOf(now()),physician1.expertiseAppointments.get("Physiotherapy1"),physician1.getFullName(),patient1.getFullName(),"Booked");
       appointments.add(treatment1);
       System.out.println("Appointment has been booked.");
       System.out.println("Details");
       System.out.println("Treatment Name: " + treatment1.getTreatmentName());
       System.out.println("Room Name : " + treatment1.getPlace()); 
       System.out.println("Date of Booking :" + treatment1.getDateTimeOfBooking());
       System.out.println("Date of Appointment : " + treatment1.getDateTimeOfTreatment());
       System.out.println("Physician Name : " + treatment1.getPhysicianName());
       System.out.println("Patient Name : " + treatment1.getPatientName());
       System.out.println("Status : " + treatment1.getStatus());
       
       }
       
    
    }
}
