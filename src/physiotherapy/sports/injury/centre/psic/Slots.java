/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physiotherapy.sports.injury.centre.psic;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Mubeen Khan
 */
public class Slots {

   

    private int slotId;
    private static int count = 0;
    private String slotDateTime;
    private String treatment;
    private String status;
    
    
    public Slots(String slotDateTime,String treatment) {
        this.slotDateTime = slotDateTime;
        this.treatment = treatment;
        this.status = "Available";
        this.slotId = ++count;
        
    }

    /**
     * @return the slotId
     */
    public int getSlotId() {
        return slotId;
    }

    /**
     * @param slotId the slotId to set
     */
   

    /**
     * @return the slotDateTime
     */
    public String getSlotDateTime() {
        return slotDateTime;
    }

   

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the treatment
     */
    public String getTreatment() {
        return treatment;
    }


    
}
