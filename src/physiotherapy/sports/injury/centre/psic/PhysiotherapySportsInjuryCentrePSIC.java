/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapy.sports.injury.centre.psic;

import java.lang.reflect.Array;
import java.time.Instant;
import java.time.LocalDateTime;
import static java.time.LocalDateTime.now;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mubeen Khan
 */
public class PhysiotherapySportsInjuryCentrePSIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //ArrayList To store Appointments
       ArrayList<Treatment> appointments = new ArrayList<Treatment>();  
        
       //Hard coded Data
       ArrayList<Physician> physicians = addPhysicians(); //Add hardcoded physicians
       
       ArrayList<Patient> patients = addPatients();        //Add hardcoded patients
       
       ArrayList<Room> rooms = addRooms();                  //Add hardcoded rooms
       
       //bookTreatment(physicians, rooms, patients, appointments);   //Add hardcoded bookings
       
       //Main User PROGRAM
       
       System.out.println("---------------Main Menu---------------");
       System.out.println("1.Admin Login");
       System.out.println("2.Physician Login");
       System.out.println("3.Patient Login");
       System.out.println("4.Visitor Login");
       
       Scanner cin = new Scanner(System.in);
       int choice = cin.nextInt();
       
       switch(choice){
           case 1:
               adminLogin();
               break;
           case 2:
               physicianLogin();
               break;
           case 3:
               patientLogin();
               break;
           case 4:
               visitorLogin();
               break;
               
               
       }
      
       
    
    }

    private static void bookTreatment(ArrayList<Physician> physicians, ArrayList<Room> rooms, ArrayList<Patient> patients, ArrayList<Treatment> appointments) {
        //Treatment Booking 1
            LocalDateTime dateBooking = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

            LocalDateTime dateAppointment = LocalDateTime.parse("05-03-2021 09:00:00", myFormatObj);
            String treatmentName = "Massage";
            String roomName = rooms.get(0).getRoomName();
            String physicianName = physicians.get(0).getFullName();
            String patientName = patients.get(0).getFullName();
            String status = "Booked.";
            Treatment treatment1 = new Treatment(treatmentName,roomName,dateBooking,dateAppointment,physicianName,patientName,status);
            appointments.add(treatment1);
            
            dateAppointment = LocalDateTime.parse("05-03-2021 11:00:00", myFormatObj);
            treatmentName = "Massage";
            roomName = rooms.get(0).getRoomName();
            physicianName = physicians.get(0).getFullName();
            patientName = patients.get(0).getFullName();
            status = "Booked.";
        
            Treatment treatment2 = new Treatment(treatmentName,roomName,dateBooking,dateAppointment,physicianName,patientName,status);
            appointments.add(treatment2);
            
            dateAppointment = LocalDateTime.parse("06-03-2021 11:00:00", myFormatObj);
            treatmentName = "Massage";
            roomName = rooms.get(0).getRoomName();
            physicianName = physicians.get(0).getFullName();
            patientName = patients.get(0).getFullName();
            status = "Booked.";
            Treatment treatment3 = new Treatment(treatmentName,roomName,dateBooking,dateAppointment,physicianName,patientName,status);
            appointments.add(treatment3);
            
            
            dateAppointment = LocalDateTime.parse("07-03-2021 13:00:00", myFormatObj);
            treatmentName = "Pool rehabilitation";
            roomName = rooms.get(4).getRoomName();
            physicianName = physicians.get(0).getFullName();
            patientName = patients.get(0).getFullName();
            status = "Booked.";
            Treatment treatment4 = new Treatment(treatmentName,roomName,dateBooking,dateAppointment,physicianName,patientName,status);
            appointments.add(treatment4);
            
            
            appointments.stream().map((appointment) -> {
                System.out.println("Appointment has been booked.");
            return appointment;
        }).map((appointment) -> {
            System.out.println("Details");
            return appointment;
        }).map((appointment) -> {
            System.out.println("Treatment Name: " + appointment.getTreatmentName());
            return appointment;
        }).map((appointment) -> {
            System.out.println("Room Name : " + appointment.getPlace());
            return appointment;
        }).map((appointment) -> {
            System.out.println("Date of Booking :" + appointment.getDateTimeOfBooking().format(myFormatObj));
            return appointment;
        }).map((appointment) -> {
            System.out.println("Date of Appointment : " + appointment.getDateTimeOfTreatment().format(myFormatObj));
            return appointment;
        }).map((appointment) -> {
            System.out.println("Physician Name : " + appointment.getPhysicianName());
            return appointment;
        }).map((appointment) -> {
            System.out.println("Patient Name : " + appointment.getPatientName());
            return appointment;
        }).forEachOrdered((appointment) -> {
            System.out.println("Status : " + appointment.getStatus());
        });
    }

    private static ArrayList<Room> addRooms() {
        ArrayList<Room> rooms = new ArrayList<Room>();
        rooms.add(new Room("medical consulting suite A"));
        rooms.add(new Room("medical consulting suite B"));
        rooms.add(new Room("medical consulting suite C"));
        rooms.add(new Room("GYM"));
        rooms.add(new Room("Swimming Pool"));
        return rooms;
    }

    
    //Method to add hard coded physycians
    private static ArrayList<Physician> addPhysicians() {
        ArrayList<Physician> physicians = new ArrayList<Physician>();
        String[] rehabilitationTreatments = {"Gym rehabilitation","Pool rehabilitation"};
        String[] physiotherapyTreatments = {"Mobilisation of the spine and joints","Neural Mobilisation"};
        String[] osteopathyTreatments = {"massage","acupunture"};
        
        Physician physician1 = new Physician();
        physician1.setFullName("Mubeen");
        physician1.setAddress("49 Gleaning Avenue");
        physician1.setPhoneNumber(12345);
        physician1.setConsultationHours("05-04-2021 19:00:00");
        physician1.addExpertise("Rehabilitaion");
        physician1.addExpertise("Osteopathy");
        physician1.setTimeTable("05-03-2021 09:00:00","Rehabilitation");
        physician1.setTimeTable("05-03-2021 11:00:00","Rehabilitation");
        physician1.setTimeTable("05-03-2021 13:00:00","Rehabilitation");
        physician1.setTimeTable("05-03-2021 15:00:00","osteopathy");
        physician1.setTimeTable("05-03-2021 17:00:00","osteopathy");
        physician1.setTimeTable("06-03-2021 09:00:00","Rehabilitation");
        physician1.setTimeTable("06-03-2021 11:00:00","Rehabilitation");
        physician1.setTimeTable("06-03-2021 13:00:00","Rehabilitation");
        physician1.setTimeTable("06-03-2021 15:00:00","osteopathy");
        physician1.setTimeTable("06-03-2021 17:00:00","osteopathy");
        physician1.setTimeTable("12-03-2021 09:00:00","Rehabilitation");
        physician1.setTimeTable("12-03-2021 11:00:00","Rehabilitation");
        physician1.setTimeTable("12-03-2021 13:00:00","osteopathy");
        physician1.setTimeTable("12-03-2021 15:00:00","osteopathy");
        physician1.setTimeTable("12-03-2021 17:00:00","osteopathy");
        physician1.setTimeTable("13-03-2021 09:00:00","osteopathy");
        physician1.setTimeTable("13-03-2021 11:00:00","osteopathy");
        physician1.setTimeTable("13-03-2021 13:00:00","Rehabilitation");
        physician1.setTimeTable("13-03-2021 15:00:00","Rehabilitation");
        physician1.setTimeTable("13-03-2021 17:00:00","Rehabilitation");
        physician1.setTimeTable("19-03-2021 09:00:00","Rehabilitation");
        physician1.setTimeTable("19-03-2021 11:00:00","Rehabilitation");
        physician1.setTimeTable("19-03-2021 13:00:00","osteopathy");
        physician1.setTimeTable("19-03-2021 15:00:00","osteopathy");
        physician1.setTimeTable("19-03-2021 17:00:00","osteopathy");
        physician1.setTimeTable("20-03-2021 09:00:00","Rehabilitation");
        physician1.setTimeTable("20-03-2021 11:00:00","Rehabilitation");
        physician1.setTimeTable("20-03-2021 13:00:00","osteopathy");
        physician1.setTimeTable("20-03-2021 15:00:00","osteopathy");
        physician1.setTimeTable("20-03-2021 17:00:00","osteopathy");
        physician1.setTimeTable("26-03-2021 09:00:00","osteopathy");
        physician1.setTimeTable("26-03-2021 11:00:00","osteopathy");
        physician1.setTimeTable("26-03-2021 13:00:00","osteopathy");
        physician1.setTimeTable("26-03-2021 15:00:00","Rehabilitation");
        physician1.setTimeTable("26-03-2021 17:00:00","Rehabilitation");
        physician1.setTimeTable("27-03-2021 09:00:00","osteopathy");
        physician1.setTimeTable("27-03-2021 11:00:00","osteopathy");
        physician1.setTimeTable("27-03-2021 13:00:00","osteopathy");
        physician1.setTimeTable("27-03-2021 15:00:00","osteopathy");
        physician1.setTimeTable("27-03-2021 17:00:00","osteopathy");
        physician1.setPhysicianId();
        Physician.setPhysicians(physician1);
        
        Physician physician2 = new Physician();
        physician2.setFullName("ALI");
        physician2.setAddress("53 Gleaning Avenue");
        physician2.setPhoneNumber(12345);
        physician2.setConsultationHours("16-03-2021 19:00:00");
        physician2.addExpertise("Rehabilitaion");
        physician2.addExpertise("Physiotherapy");
        physician2.setTimeTable("06-03-2021 09:00:00","Rehabilitation");
        physician2.setTimeTable("06-03-2021 11:00:00","Rehabilitation");
        physician2.setTimeTable("06-03-2021 13:00:00","Rehabilitation");
        physician2.setTimeTable("06-03-2021 15:00:00","osteopathy");
        physician2.setTimeTable("06-03-2021 17:00:00","osteopathy");
        physician2.setTimeTable("07-03-2021 09:00:00","Rehabilitation");
        physician2.setTimeTable("07-03-2021 11:00:00","Rehabilitation");
        physician2.setTimeTable("07-03-2021 13:00:00","Rehabilitation");
        physician2.setTimeTable("07-03-2021 15:00:00","osteopathy");
        physician2.setTimeTable("07-03-2021 17:00:00","osteopathy");
        physician2.setTimeTable("08-03-2021 09:00:00","Rehabilitation");
        physician2.setTimeTable("08-03-2021 11:00:00","Rehabilitation");
        physician2.setTimeTable("08-03-2021 13:00:00","osteopathy");
        physician2.setTimeTable("08-03-2021 15:00:00","osteopathy");
        physician2.setTimeTable("08-03-2021 17:00:00","osteopathy");
        physician2.setTimeTable("13-03-2021 09:00:00","osteopathy");
        physician2.setTimeTable("13-03-2021 11:00:00","osteopathy");
        physician2.setTimeTable("13-03-2021 13:00:00","Rehabilitation");
        physician2.setTimeTable("13-03-2021 15:00:00","Rehabilitation");
        physician2.setTimeTable("13-03-2021 17:00:00","Rehabilitation");
        physician2.setTimeTable("14-03-2021 09:00:00","Rehabilitation");
        physician2.setTimeTable("14-03-2021 11:00:00","Rehabilitation");
        physician2.setTimeTable("14-03-2021 13:00:00","osteopathy");
        physician2.setTimeTable("14-03-2021 15:00:00","osteopathy");
        physician2.setTimeTable("14-03-2021 17:00:00","osteopathy");
        physician2.setTimeTable("15-03-2021 09:00:00","Rehabilitation");
        physician2.setTimeTable("15-03-2021 11:00:00","Rehabilitation");
        physician2.setTimeTable("15-03-2021 13:00:00","osteopathy");
        physician2.setTimeTable("15-03-2021 15:00:00","osteopathy");
        physician2.setTimeTable("15-03-2021 17:00:00","osteopathy");
        physician2.setTimeTable("20-03-2021 09:00:00","Rehabilitation");
        physician2.setTimeTable("20-03-2021 11:00:00","Rehabilitation");
        physician2.setTimeTable("20-03-2021 13:00:00","osteopathy");
        physician2.setTimeTable("20-03-2021 15:00:00","osteopathy");
        physician2.setTimeTable("20-03-2021 17:00:00","osteopathy");
        physician2.setTimeTable("21-03-2021 09:00:00","Rehabilitation");
        physician2.setTimeTable("21-03-2021 11:00:00","Rehabilitation");
        physician2.setTimeTable("21-03-2021 13:00:00","osteopathy");
        physician2.setTimeTable("21-03-2021 15:00:00","osteopathy");
        physician2.setTimeTable("21-03-2021 17:00:00","osteopathy");
        physician2.setTimeTable("22-03-2021 09:00:00","Rehabilitation");
        physician2.setTimeTable("22-03-2021 11:00:00","Rehabilitation");
        physician2.setTimeTable("22-03-2021 13:00:00","osteopathy");
        physician2.setTimeTable("22-03-2021 15:00:00","osteopathy");
        physician2.setTimeTable("22-03-2021 17:00:00","osteopathy");
        physician2.setTimeTable("27-03-2021 09:00:00","osteopathy");
        physician2.setTimeTable("27-03-2021 11:00:00","osteopathy");
        physician2.setTimeTable("27-03-2021 13:00:00","osteopathy");
        physician2.setTimeTable("27-03-2021 15:00:00","Rehabilitation");
        physician2.setTimeTable("27-03-2021 17:00:00","Rehabilitation");
        physician2.setTimeTable("28-03-2021 09:00:00","osteopathy");
        physician2.setTimeTable("28-03-2021 11:00:00","osteopathy");
        physician2.setTimeTable("28-03-2021 13:00:00","osteopathy");
        physician2.setTimeTable("28-03-2021 15:00:00","osteopathy");
        physician2.setTimeTable("28-03-2021 17:00:00","osteopathy");
        physician2.setTimeTable("29-03-2021 09:00:00","Rehabilitation");
        physician2.setTimeTable("29-03-2021 11:00:00","Rehabilitation");
        physician2.setTimeTable("29-03-2021 13:00:00","Rehabilitation");
        physician2.setTimeTable("29-03-2021 15:00:00","Rehabilitation");
        physician2.setTimeTable("29-03-2021 17:00:00","Rehabilitation");
        physician2.setPhysicianId();
        Physician.setPhysicians(physician2);
        
        Physician physician3 = new Physician();
        physician2.setFullName("Dr Isaac");
        physician2.setAddress("17 Calver Avenue");
        physician2.setPhoneNumber(1233);
        physician2.setConsultationHours("Thursday 19:00:00");
        physician2.addExpertise("Rehabilitaion");
        physician2.addExpertise("Physiotherapy");
        physician2.setTimeTable("07-03-2021 09:00:00","physiotherapy");
        physician2.setTimeTable("07-03-2021 11:00:00","physiotherapy");
        physician2.setTimeTable("07-03-2021 13:00:00","physiotherapy");
        physician2.setTimeTable("07-03-2021 15:00:00","physiotherapy");
        physician2.setTimeTable("07-03-2021 17:00:00","physiotherapy");
        physician2.setTimeTable("08-03-2021 09:00:00","physiotherapy");
        physician2.setTimeTable("08-03-2021 11:00:00","physiotherapy");
        physician2.setTimeTable("08-03-2021 13:00:00","physiotherapy");
        physician2.setTimeTable("08-03-2021 15:00:00","physiotherapy");
        physician2.setTimeTable("08-03-2021 17:00:00","physiotherapy");
        physician2.setTimeTable("09-03-2021 09:00:00","physiotherapy");
        physician2.setTimeTable("09-03-2021 11:00:00","physiotherapy");
        physician2.setTimeTable("09-03-2021 13:00:00","physiotherapy");
        physician2.setTimeTable("09-03-2021 15:00:00","physiotherapy");
        physician2.setTimeTable("09-03-2021 17:00:00","physiotherapy");
        physician2.setTimeTable("14-03-2021 09:00:00","physiotherapy");
        physician2.setTimeTable("14-03-2021 11:00:00","physiotherapy");
        physician2.setTimeTable("14-03-2021 13:00:00","physiotherapy");
        physician2.setTimeTable("14-03-2021 15:00:00","physiotherapy");
        physician2.setTimeTable("14-03-2021 17:00:00","physiotherapy");
        physician2.setTimeTable("15-03-2021 09:00:00","physiotherapy");
        physician2.setTimeTable("15-03-2021 11:00:00","physiotherapy");
        physician2.setTimeTable("15-03-2021 13:00:00","physiotherapy");
        physician2.setTimeTable("15-03-2021 15:00:00","physiotherapy");
        physician2.setTimeTable("15-03-2021 17:00:00","physiotherapy");
        physician2.setTimeTable("16-03-2021 09:00:00","physiotherapy");
        physician2.setTimeTable("16-03-2021 11:00:00","physiotherapy");
        physician2.setTimeTable("16-03-2021 13:00:00","physiotherapy");
        physician2.setTimeTable("16-03-2021 15:00:00","physiotherapy");
        physician2.setTimeTable("16-03-2021 17:00:00","physiotherapy");
        physician2.setTimeTable("21-03-2021 09:00:00","physiotherapy");
        physician2.setTimeTable("21-03-2021 11:00:00","physiotherapy");
        physician2.setTimeTable("21-03-2021 13:00:00","physiotherapy");
        physician2.setTimeTable("21-03-2021 15:00:00","physiotherapy");
        physician2.setTimeTable("21-03-2021 17:00:00","physiotherapy");
        physician2.setTimeTable("22-03-2021 09:00:00","physiotherapy");
        physician2.setTimeTable("22-03-2021 11:00:00","physiotherapy");
        physician2.setTimeTable("22-03-2021 13:00:00","physiotherapy");
        physician2.setTimeTable("22-03-2021 15:00:00","physiotherapy");
        physician2.setTimeTable("22-03-2021 17:00:00","physiotherapy");
        physician2.setTimeTable("23-03-2021 09:00:00","physiotherapy");
        physician2.setTimeTable("23-03-2021 11:00:00","physiotherapy");
        physician2.setTimeTable("23-03-2021 13:00:00","physiotherapy");
        physician2.setTimeTable("23-03-2021 15:00:00","physiotherapy");
        physician2.setTimeTable("23-03-2021 17:00:00","physiotherapy");
        physician2.setTimeTable("28-03-2021 09:00:00","physiotherapy");
        physician2.setTimeTable("28-03-2021 11:00:00","physiotherapy");
        physician2.setTimeTable("28-03-2021 13:00:00","physiotherapy");
        physician2.setTimeTable("28-03-2021 15:00:00","physiotherapy");
        physician2.setTimeTable("28-03-2021 17:00:00","physiotherapy");
        physician2.setTimeTable("29-03-2021 09:00:00","physiotherapy");
        physician2.setTimeTable("29-03-2021 11:00:00","physiotherapy");
        physician2.setTimeTable("29-03-2021 13:00:00","physiotherapy");
        physician2.setTimeTable("29-03-2021 15:00:00","physiotherapy");
        physician2.setTimeTable("29-03-2021 17:00:00","physiotherapy");
        physician2.setTimeTable("30-03-2021 09:00:00","physiotherapy");
        physician2.setTimeTable("30-03-2021 11:00:00","physiotherapy");
        physician2.setTimeTable("30-03-2021 13:00:00","physiotherapy");
        physician2.setTimeTable("30-03-2021 15:00:00","physiotherapy");
        physician2.setTimeTable("30-03-2021 17:00:00","physiotherapy");
        physician2.setPhysicianId();
        Physician.setPhysicians(physician2);
        
        return physicians;
    }

    private static ArrayList<Patient> addPatients() {
        ArrayList<Patient> patients = new ArrayList<Patient>();
        Patient patient1 = new Patient();
        patient1.setFullName("Nadir");
        patient1.setAddress("53 ST stephens Rd");
        patient1.setPhoneNumber(67890);
        patient1.setPatientId();
        Patient.setPatients(patient1);
        
        Patient patient2 = new Patient();
        patient1.setFullName("David");
        patient1.setAddress("52 ST stephens Rd");
        patient1.setPhoneNumber(67890);
        patient1.setPatientId();
        Patient.setPatients(patient2);
        
        Patient patient3 = new Patient();
        patient1.setFullName("Gary");
        patient1.setAddress("51 ST stephens Rd");
        patient1.setPhoneNumber(56789);
        patient1.setPatientId();
        Patient.setPatients(patient3);
        
        Patient patient4 = new Patient();
        patient1.setFullName("Richard");
        patient1.setAddress("43 ST stephens Rd");
        patient1.setPhoneNumber(19890);
        patient1.setPatientId();
        Patient.setPatients(patient4);
        
        return patients;
    }
        
    /*private static void adminLogin() {
       System.out.println("---------------Admin Menu---------------");
       System.out.println("1.Admin Login");
       System.out.println("2.Physician Login");
       System.out.println("3.Patient Login");
       System.out.println("4.Visitor Login");
    }

    private static void physicianLogin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void patientLogin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void visitorLogin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
}
