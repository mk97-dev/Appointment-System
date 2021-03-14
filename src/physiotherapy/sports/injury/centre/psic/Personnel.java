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
public class Personnel {
    private static int count = 0;
    private int uniqueId;
    private String fullName;
    private String address;
    private int phoneNumber;
    
    public Personnel(String fullName,String address,int phoneNumber){
    
        uniqueId = ++count;
        this.fullName = fullName;
        this.address  = address;
        this.phoneNumber = phoneNumber;
        
}

    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
