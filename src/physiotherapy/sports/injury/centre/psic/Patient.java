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
public class Patient extends Personnel {
    private static int count = 0;
    private String patientId = "Patient ";
    
    
    
    public Patient(String fullName, String address, int phoneNumber) {
        super(fullName, address, phoneNumber);
        patientId = patientId + String.valueOf(++count);
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
    
    
}
