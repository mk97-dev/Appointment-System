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
public class Patient extends Personnel {
    private static int count = 0;

    public static Patient getPatient(String patientName) {
        for (Patient patient : patients) {
                return patient;
            
        }
        return null;
    }
    private String patientId = "Patient";
    private static ArrayList<Patient> patients = new ArrayList<Patient>();

    public static ArrayList<Patient> getPatients() {
        return patients;
    }

    public static void setPatients(Patient aPatients) {
        patients.add(aPatients);
        
    }
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId() {
        patientId = patientId + String.valueOf(++count);
    }
    
    
}
