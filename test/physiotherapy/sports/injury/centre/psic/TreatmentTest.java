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
public class TreatmentTest {
    static Treatment newTreatment;
    public TreatmentTest() {
    

    }
    
    @BeforeClass
    public static void setUpClass() {
    newTreatment = new Treatment("Physiotherapy","Tue 16-03-2021 19:30:00","Dr. David", "Patient1","GYM");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getTreatmentName method, of class Treatment.
     */
    @Test
    public void testGetTreatmentName() {
        String expResult = "Physiotherapy";
        String result = newTreatment.getTreatmentName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDateTimeOfTreatment method, of class Treatment.
     */
    @Test
    public void testGetDateTimeOfTreatment() {
        String expResult = "Tue 16-03-2021 19:30:00";
        String result = newTreatment.getDateTimeOfTreatment();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPhysicianName method, of class Treatment.
     */
    @Test
    public void testGetPhysicianName() {
        String expResult = "Dr. David";
        String result = newTreatment.getPhysicianName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPatientName method, of class Treatment.
     */
    @Test
    public void testGetPatientName() {
        String expResult = "Patient1";
        String result = newTreatment.getPatientName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTreatments method, of class Treatment.
     */
    @Test
    public void testGetTreatments() {
        ArrayList<Treatment> expResult = new ArrayList<Treatment>();
        expResult.add(newTreatment);
        ArrayList<Treatment> result = Treatment.getTreatments();
        assertEquals(expResult, result);
    }

    

    /**
     * Test of getRoom method, of class Treatment.
     */
    @Test
    public void testGetRoom() {
        String expResult = "GYM";
        String result = newTreatment.getRoom();
        assertEquals(expResult, result);
    }


    /**
     * Test of getStatus method, of class Treatment.
     */
    @Test
    public void testGetStatus() {
        String expResult = "Booked";
        String result = newTreatment.getStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of findTreatment method, of class Treatment.
     */
    @Test
    public void testFindTreatment() {
        String patient = "Patient1";
        String date = "Tue 16-03-2021 19:30:00";
        boolean expResult = true;
        boolean result = Treatment.findTreatment(patient, date);
        assertEquals(expResult, result);
    }

}
