/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapy.sports.injury.centre.psic;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mubeen Khan
 */
public class PatientTest {
    static Patient patient1;
   ArrayList<Patient> expResult = new ArrayList<Patient>();
    public PatientTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        patient1 = new Patient();
        patient1.setFullName("Nadir");
        patient1.setAddress("53 ST stephens Rd");
        patient1.setPhoneNumber(67890);
        patient1.setPatientId();
        Patient.setPatients(patient1);
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getPatient method, of class Patient.
     */
    @Test
    public void testGetPatient() {
          
        String patientName = "Nadir";
        Patient expResult = patient1;
        Patient result = Patient.getPatient(patientName);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPatients method, of class Patient.
     */
    @Test
    public void testGetPatients() {
        
        expResult.add(patient1);
        ArrayList<Patient> result = Patient.getPatients();
        assertEquals(expResult, result);
    }


    /**
     * Test of getPatientId method, of class Patient.
     */
    @Test
    public void testGetPatientId() {
        
        String expResult = "Patient1";
        String result = patient1.getPatientId();
        assertEquals(expResult, result);
    }


    
}
