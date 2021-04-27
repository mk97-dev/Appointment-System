/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapy.sports.injury.centre.psic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mubeen Khan
 */
public class PhysicianTest {
    static Physician physician3 = new Physician();
    public PhysicianTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
        physician3.setFullName("Dr Isaac");
        physician3.setAddress("17 Calver Avenue");
        physician3.setPhoneNumber(1233);
        physician3.setConsultationHours("09-03-2021 19:00:00");
        physician3.addExpertise("Physiotherapy");
        physician3.setTimeTable("08-03-2021 09:00:00", "Physiotherapy");
        physician3.setTimeTable("08-03-2021 11:00:00", "Physiotherapy");
        physician3.setTimeTable("08-03-2021 13:00:00", "Physiotherapy");
        physician3.setTimeTable("08-03-2021 15:00:00", "Physiotherapy");
        physician3.setTimeTable("08-03-2021 17:00:00", "Physiotherapy");
        physician3.setTimeTable("09-03-2021 09:00:00", "Physiotherapy");
        physician3.setTimeTable("09-03-2021 11:00:00", "Physiotherapy");
        physician3.setTimeTable("09-03-2021 13:00:00", "Physiotherapy");
        physician3.setTimeTable("09-03-2021 15:00:00", "Physiotherapy");
        physician3.setTimeTable("09-03-2021 17:00:00", "Physiotherapy");
        physician3.setTimeTable("10-03-2021 09:00:00", "Physiotherapy");
        physician3.setTimeTable("10-03-2021 11:00:00", "Physiotherapy");
        physician3.setTimeTable("10-03-2021 13:00:00", "Physiotherapy");
        physician3.setTimeTable("10-03-2021 15:00:00", "Physiotherapy");
        physician3.setTimeTable("10-03-2021 17:00:00", "Physiotherapy");
        physician3.setTimeTable("15-03-2021 09:00:00", "Physiotherapy");
        physician3.setTimeTable("15-03-2021 11:00:00", "Physiotherapy");
        physician3.setTimeTable("15-03-2021 13:00:00", "Physiotherapy");
        physician3.setTimeTable("15-03-2021 15:00:00", "Physiotherapy");
        physician3.setTimeTable("15-03-2021 17:00:00", "Physiotherapy");
        physician3.setTimeTable("16-03-2021 09:00:00", "Physiotherapy");
        physician3.setTimeTable("16-03-2021 11:00:00", "Physiotherapy");
        physician3.setTimeTable("16-03-2021 13:00:00", "Physiotherapy");
        physician3.setTimeTable("16-03-2021 15:00:00", "Physiotherapy");
        physician3.setTimeTable("16-03-2021 17:00:00", "Physiotherapy");
        physician3.setTimeTable("17-03-2021 09:00:00", "Physiotherapy");
        physician3.setTimeTable("17-03-2021 11:00:00", "Physiotherapy");
        physician3.setTimeTable("17-03-2021 13:00:00", "Physiotherapy");
        physician3.setTimeTable("17-03-2021 15:00:00", "Physiotherapy");
        physician3.setTimeTable("17-03-2021 17:00:00", "Physiotherapy");
        physician3.setTimeTable("22-03-2021 09:00:00", "Physiotherapy");
        physician3.setTimeTable("22-03-2021 11:00:00", "Physiotherapy");
        physician3.setTimeTable("22-03-2021 13:00:00", "Physiotherapy");
        physician3.setTimeTable("22-03-2021 15:00:00", "Physiotherapy");
        physician3.setTimeTable("22-03-2021 17:00:00", "Physiotherapy");
        physician3.setTimeTable("23-03-2021 09:00:00", "Physiotherapy");
        physician3.setTimeTable("23-03-2021 11:00:00", "Physiotherapy");
        physician3.setTimeTable("23-03-2021 13:00:00", "Physiotherapy");
        physician3.setTimeTable("23-03-2021 15:00:00", "Physiotherapy");
        physician3.setTimeTable("23-03-2021 17:00:00", "Physiotherapy");
        physician3.setTimeTable("24-03-2021 09:00:00", "Physiotherapy");
        physician3.setTimeTable("24-03-2021 11:00:00", "Physiotherapy");
        physician3.setTimeTable("24-03-2021 13:00:00", "Physiotherapy");
        physician3.setTimeTable("24-03-2021 15:00:00", "Physiotherapy");
        physician3.setTimeTable("24-03-2021 17:00:00", "Physiotherapy");
        physician3.setTimeTable("29-03-2021 09:00:00", "Physiotherapy");
        physician3.setTimeTable("29-03-2021 11:00:00", "Physiotherapy");
        physician3.setTimeTable("29-03-2021 13:00:00", "Physiotherapy");
        physician3.setTimeTable("29-03-2021 15:00:00", "Physiotherapy");
        physician3.setTimeTable("29-03-2021 17:00:00", "Physiotherapy");
        physician3.setTimeTable("30-03-2021 09:00:00", "Physiotherapy");
        physician3.setTimeTable("30-03-2021 11:00:00", "Physiotherapy");
        physician3.setTimeTable("30-03-2021 13:00:00", "Physiotherapy");
        physician3.setTimeTable("30-03-2021 15:00:00", "Physiotherapy");
        physician3.setTimeTable("30-03-2021 17:00:00", "Physiotherapy");
        physician3.setTimeTable("31-03-2021 09:00:00", "Physiotherapy");
        physician3.setTimeTable("31-03-2021 11:00:00", "Physiotherapy");
        physician3.setTimeTable("31-03-2021 13:00:00", "Physiotherapy");
        physician3.setTimeTable("31-03-2021 15:00:00", "Physiotherapy");
        physician3.setTimeTable("31-03-2021 17:00:00", "Physiotherapy");
        physician3.setPhysicianId();
        Physician.setPhysicians(physician3);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getPhysicianId method, of class Physician.
     */
    @Test
    public void testGetPhysicianId() {
        String expResult = "Physician1";
        String result = physician3.getPhysicianId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getExpertise method, of class Physician.
     */
    @Test
    public void testGetExpertise() {
        ArrayList<String> expResult = new ArrayList<>();
        expResult.add("Physiotherapy");
        ArrayList<String> result = physician3.getExpertise();
        assertEquals(expResult, result);
    }


    /**
     * Test of getPhysicians method, of class Physician.
     */
    @Test
    public void testGetPhysicians() {
        ArrayList<Physician> expResult = new ArrayList<>();
        expResult.add(physician3);
        ArrayList<Physician> result = Physician.getPhysicians();
        assertEquals(expResult, result);
    }
    /**
     * Test of getConsultationHours method, of class Physician.
     */
    @Test
    public void testGetConsultationHours() {
        LinkedHashMap<String,String> expResult = new LinkedHashMap<>();
        expResult.put("Tue 09-03-2021 19:00:00","Available");
        expResult.put("Tue 09-03-2021 19:30:00","Available");
        expResult.put("Tue 09-03-2021 20:00:00","Available");
        expResult.put("Tue 09-03-2021 20:30:00","Available");
        expResult.put("Tue 16-03-2021 19:00:00","Available");
        expResult.put("Tue 16-03-2021 19:30:00","Available");
        expResult.put("Tue 16-03-2021 20:00:00","Available");
        expResult.put("Tue 16-03-2021 20:30:00","Available");
        expResult.put("Tue 23-03-2021 19:00:00","Available");
        expResult.put("Tue 23-03-2021 19:30:00","Available");
        expResult.put("Tue 23-03-2021 20:00:00","Available");
        expResult.put("Tue 23-03-2021 20:30:00","Available");
        expResult.put("Tue 30-03-2021 19:00:00","Available");
        expResult.put("Tue 30-03-2021 19:30:00","Available");
        expResult.put("Tue 30-03-2021 20:00:00","Available");
        expResult.put("Tue 30-03-2021 20:30:00","Available");
        
        
        LinkedHashMap<String,String> result = physician3.getConsultationHours();
        assertEquals(expResult, result);
    }

    
}
