/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapy.sports.injury.centre.psic;

import java.time.LocalDateTime;

/**
 *
 * @author Mubeen Khan
 */
public class Treatment {
    private String treatmentName;
    private String place;
    private LocalDateTime dateTimeOfBooking;
    private LocalDateTime dateTimeOfTreatment;
    private String physicianName;
    private String patientName;
    private String status;
    private static int count = 0;
    private String appointmentId = "Appointment ";

    public Treatment(String treatmentName, String place, LocalDateTime dateTimeOfBooking, LocalDateTime dateTimeOfTreatment, String physicianName, String patientName, String status) {
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

    public LocalDateTime getDateTimeOfBooking() {
        return dateTimeOfBooking;
    }

    public LocalDateTime getDateTimeOfTreatment() {
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
