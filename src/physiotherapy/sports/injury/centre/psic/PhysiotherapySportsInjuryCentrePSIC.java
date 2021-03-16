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
       
       bookTreatment(physicians, rooms, patients, appointments);   //Add hardcoded bookings
      
       
    
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
        
        Physician physician1 = new Physician("mubeen","49 gleanings Avenue",45678,"15-03-2021 19:00:00");
        physician1.addExpertise("Rehabilitaion");
        physician1.addExpertise("Osteopathy");
        physician1.addExpertiseAppointments("Physiotherapy","15-03-2021 09:00:00");
        physician1.addExpertiseAppointments("Physiotherapy2","15-03-2021 11:00:00");
        physician1.addExpertiseAppointments("Physiotherapy3","15-03-2021 13:00:00");
        physician1.addExpertiseAppointments("Osteopathy1","15-03-2021 15:00:00");
        physician1.addExpertiseAppointments("Osteopathy2","15-03-2021 17:00:00");
        physician1.addWorkingDays("Monday");
        physician1.addWorkingDays("tuesday");
        physicians.add(physician1);
        
        Physician physician2 = new Physician("Ali","53 gleanings Avenue",45678,"16-03-2021 19:00:00");
        physician1.addExpertise("Rehabilitaion");
        physician1.addExpertise("Physiotherapy");
        physician2.addExpertiseAppointments("Physiotherapy1","15-03-2021 09:00:00");
        physician2.addExpertiseAppointments("Physiotherapy2","15-03-2021 11:00:00");
        physician2.addExpertiseAppointments("Physiotherapy3","15-03-2021 13:00:00");
        physician2.addExpertiseAppointments("Osteopathy1","15-03-2021 15:00:00");
        physician2.addExpertiseAppointments("Osteopathy2","15-03-2021 17:00:00");
        physician2.addWorkingDays("Monday");
        physician2.addWorkingDays("tuesday");
        physician2.addWorkingDays("Wednesday");
        physician2.addWorkingDays("Friday");
        physicians.add(physician2);
        
        return physicians;
    }

    private static ArrayList<Patient> addPatients() {
        ArrayList<Patient> patients = new ArrayList<Patient>();
        Patient patient1 = new Patient("nadir","53 st stephens Rd",987654);
        patients.add(patient1);
        return patients;
    }
}
