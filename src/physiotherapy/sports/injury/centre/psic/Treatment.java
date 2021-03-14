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
public class Treatment {
    private String treatmentName;
    private String place;
    private String dateTimeOfBooking;
    private String dateTimeOfTreatment;
    private String physicianName;
    private String patientName;
    private String status;
    private static int count = 0;
    private String appointmentId = "Appointment ";

    public Treatment(String treatmentName, String place, String dateTimeOfBooking, String dateTimeOfTreatment, String physicianName, String patientName, String status) {
        this.treatmentName = treatmentName;
        this.place = place;
        this.dateTimeOfBooking = dateTimeOfBooking;
        this.dateTimeOfTreatment = dateTimeOfTreatment;
        this.physicianName = physicianName;
        this.patientName = patientName;
        this.status = status;
        appointmentId = appointmentId + String.valueOf(++count);
    }

    public String getTreatmentName() {
        return treatmentName;
    }

    public String getPlace() {
        return place;
    }

    public String getDateTimeOfBooking() {
        return dateTimeOfBooking;
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

    public String getStatus() {
        return status;
    }
}
