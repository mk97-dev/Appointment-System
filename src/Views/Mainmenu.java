/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.util.ArrayList;
import physiotherapy.sports.injury.centre.psic.Patient;
import physiotherapy.sports.injury.centre.psic.Physician;
import physiotherapy.sports.injury.centre.psic.Room;
import physiotherapy.sports.injury.centre.psic.Treatment;

/**
 *
 * @author Mubeen Khan
 */
public class Mainmenu extends javax.swing.JFrame {

    /**
     * Creates new form Mainmenu
     */
    public Mainmenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAdminMenu = new javax.swing.JButton();
        btnPhysicianMenu = new javax.swing.JButton();
        btnPatientMenu = new javax.swing.JButton();
        btnVisitorMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Main Menu");

        btnAdminMenu.setText("Admin Login");
        btnAdminMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminMenuActionPerformed(evt);
            }
        });

        btnPhysicianMenu.setText("Physician Login");
        btnPhysicianMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhysicianMenuActionPerformed(evt);
            }
        });

        btnPatientMenu.setText("Patient Login");
        btnPatientMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientMenuActionPerformed(evt);
            }
        });

        btnVisitorMenu.setText("Visitor Login");
        btnVisitorMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitorMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnPhysicianMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(btnAdminMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPatientMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVisitorMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(btnAdminMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPhysicianMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPatientMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVisitorMenu)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPhysicianMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhysicianMenuActionPerformed
        // TODO add your handling code here:
        PhysicianView newView = new PhysicianView();
        newView.setVisible(true);
        setVisible(false);
        this.dispose();
        
    }//GEN-LAST:event_btnPhysicianMenuActionPerformed

    private void btnAdminMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminMenuActionPerformed
        // TODO add your handling code here:
        AdminView newView = new AdminView();
        newView.setVisible(true);
        setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnAdminMenuActionPerformed

    private void btnPatientMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientMenuActionPerformed
        // TODO add your handling code here:
        PatientView newView = new PatientView();
        newView.setVisible(true);
        setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnPatientMenuActionPerformed

    private void btnVisitorMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitorMenuActionPerformed
        // TODO add your handling code here:
        VisitorView newView = new VisitorView();
        newView.setVisible(true);
        setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnVisitorMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //ArrayList To store Appointments
        ArrayList<Treatment> appointments = new ArrayList<Treatment>();

        //Hard coded Data
        ArrayList<Physician> physicians = addPhysicians(); //Add hardcoded physicians

        ArrayList<Patient> patients = addPatients();        //Add hardcoded patients

        addRooms();                  //Add hardcoded rooms

        //bookTreatment(physicians, rooms, patients, appointments);   //Add hardcoded bookings
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainmenu().setVisible(true);
            }
        });
    }

    private static void addRooms() {
        Room room4 = new Room("medical consulting suite A");
        Room.setRooms(room4);
        Room room = new Room("medical consulting suite B");
        Room.setRooms(room);
        Room room1 = new Room("medical consulting suite C");
        Room.setRooms(room1);
        Room room2 = new Room("GYM");
        Room.setRooms(room2);
        Room room3 = new Room("Swimming Pool");
        Room.setRooms(room3);

    }

    //Method to add hard coded physycians
    private static ArrayList<Physician> addPhysicians() {
        ArrayList<Physician> physicians = new ArrayList<Physician>();
        String[] rehabilitationTreatments = {"Gym rehabilitation", "Pool rehabilitation"};
        String[] physiotherapyTreatments = {"Mobilisation of the spine and joints", "Neural Mobilisation"};
        String[] osteopathyTreatments = {"massage", "acupunture"};

        Physician physician1 = new Physician();
        physician1.setFullName("Mubeen");
        physician1.setAddress("49 Gleaning Avenue");
        physician1.setPhoneNumber(12345);
        physician1.setConsultationHours("05-03-2021 19:00:00");
        physician1.addExpertise("Rehabilitation");
        physician1.addExpertise("Osteopathy");
        physician1.setTimeTable("05-03-2021 09:00:00", "Rehabilitation");
        physician1.setTimeTable("05-03-2021 11:00:00", "Rehabilitation");
        physician1.setTimeTable("05-03-2021 13:00:00", "Rehabilitation");
        physician1.setTimeTable("05-03-2021 15:00:00", "Osteopathy");
        physician1.setTimeTable("05-03-2021 17:00:00", "Osteopathy");
        physician1.setTimeTable("06-03-2021 09:00:00", "Rehabilitation");
        physician1.setTimeTable("06-03-2021 11:00:00", "Rehabilitation");
        physician1.setTimeTable("06-03-2021 13:00:00", "Rehabilitation");
        physician1.setTimeTable("06-03-2021 15:00:00", "Osteopathy");
        physician1.setTimeTable("06-03-2021 17:00:00", "Osteopathy");
        physician1.setTimeTable("12-03-2021 09:00:00", "Rehabilitation");
        physician1.setTimeTable("12-03-2021 11:00:00", "Rehabilitation");
        physician1.setTimeTable("12-03-2021 13:00:00", "Osteopathy");
        physician1.setTimeTable("12-03-2021 15:00:00", "Osteopathy");
        physician1.setTimeTable("12-03-2021 17:00:00", "Osteopathy");
        physician1.setTimeTable("13-03-2021 09:00:00", "Osteopathy");
        physician1.setTimeTable("13-03-2021 11:00:00", "Osteopathy");
        physician1.setTimeTable("13-03-2021 13:00:00", "Rehabilitation");
        physician1.setTimeTable("13-03-2021 15:00:00", "Rehabilitation");
        physician1.setTimeTable("13-03-2021 17:00:00", "Rehabilitation");
        physician1.setTimeTable("19-03-2021 09:00:00", "Rehabilitation");
        physician1.setTimeTable("19-03-2021 11:00:00", "Rehabilitation");
        physician1.setTimeTable("19-03-2021 13:00:00", "Osteopathy");
        physician1.setTimeTable("19-03-2021 15:00:00", "Osteopathy");
        physician1.setTimeTable("19-03-2021 17:00:00", "Osteopathy");
        physician1.setTimeTable("20-03-2021 09:00:00", "Rehabilitation");
        physician1.setTimeTable("20-03-2021 11:00:00", "Rehabilitation");
        physician1.setTimeTable("20-03-2021 13:00:00", "Osteopathy");
        physician1.setTimeTable("20-03-2021 15:00:00", "Osteopathy");
        physician1.setTimeTable("20-03-2021 17:00:00", "Osteopathy");
        physician1.setTimeTable("26-03-2021 09:00:00", "Osteopathy");
        physician1.setTimeTable("26-03-2021 11:00:00", "Osteopathy");
        physician1.setTimeTable("26-03-2021 13:00:00", "Osteopathy");
        physician1.setTimeTable("26-03-2021 15:00:00", "Rehabilitation");
        physician1.setTimeTable("26-03-2021 17:00:00", "Rehabilitation");
        physician1.setTimeTable("27-03-2021 09:00:00", "Osteopathy");
        physician1.setTimeTable("27-03-2021 11:00:00", "Osteopathy");
        physician1.setTimeTable("27-03-2021 13:00:00", "Osteopathy");
        physician1.setTimeTable("27-03-2021 15:00:00", "Osteopathy");
        physician1.setTimeTable("27-03-2021 17:00:00", "Osteopathy");
        physician1.setPhysicianId();
        Physician.setPhysicians(physician1);

        Physician physician2 = new Physician();
        physician2.setFullName("ALI");
        physician2.setAddress("53 Gleaning Avenue");
        physician2.setPhoneNumber(12345);
        physician2.setConsultationHours("07-03-2021 07:00:00");
        physician2.addExpertise("Rehabilitation");
        physician2.addExpertise("Osteopathy");
        physician2.setTimeTable("06-03-2021 09:00:00", "Rehabilitation");
        physician2.setTimeTable("06-03-2021 11:00:00", "Rehabilitation");
        physician2.setTimeTable("06-03-2021 13:00:00", "Rehabilitation");
        physician2.setTimeTable("06-03-2021 15:00:00", "Osteopathy");
        physician2.setTimeTable("06-03-2021 17:00:00", "Osteopathy");
        physician2.setTimeTable("07-03-2021 09:00:00", "Rehabilitation");
        physician2.setTimeTable("07-03-2021 11:00:00", "Rehabilitation");
        physician2.setTimeTable("07-03-2021 13:00:00", "Rehabilitation");
        physician2.setTimeTable("07-03-2021 15:00:00", "Osteopathy");
        physician2.setTimeTable("07-03-2021 17:00:00", "Osteopathy");
        physician2.setTimeTable("08-03-2021 09:00:00", "Rehabilitation");
        physician2.setTimeTable("08-03-2021 11:00:00", "Rehabilitation");
        physician2.setTimeTable("08-03-2021 13:00:00", "Osteopathy");
        physician2.setTimeTable("08-03-2021 15:00:00", "Osteopathy");
        physician2.setTimeTable("08-03-2021 17:00:00", "Osteopathy");
        physician2.setTimeTable("13-03-2021 09:00:00", "Osteopathy");
        physician2.setTimeTable("13-03-2021 11:00:00", "Osteopathy");
        physician2.setTimeTable("13-03-2021 13:00:00", "Rehabilitation");
        physician2.setTimeTable("13-03-2021 15:00:00", "Rehabilitation");
        physician2.setTimeTable("13-03-2021 17:00:00", "Rehabilitation");
        physician2.setTimeTable("14-03-2021 09:00:00", "Rehabilitation");
        physician2.setTimeTable("14-03-2021 11:00:00", "Rehabilitation");
        physician2.setTimeTable("14-03-2021 13:00:00", "Osteopathy");
        physician2.setTimeTable("14-03-2021 15:00:00", "Osteopathy");
        physician2.setTimeTable("14-03-2021 17:00:00", "Osteopathy");
        physician2.setTimeTable("15-03-2021 09:00:00", "Rehabilitation");
        physician2.setTimeTable("15-03-2021 11:00:00", "Rehabilitation");
        physician2.setTimeTable("15-03-2021 13:00:00", "Osteopathy");
        physician2.setTimeTable("15-03-2021 15:00:00", "Osteopathy");
        physician2.setTimeTable("15-03-2021 17:00:00", "Osteopathy");
        physician2.setTimeTable("20-03-2021 09:00:00", "Rehabilitation");
        physician2.setTimeTable("20-03-2021 11:00:00", "Rehabilitation");
        physician2.setTimeTable("20-03-2021 13:00:00", "Osteopathy");
        physician2.setTimeTable("20-03-2021 15:00:00", "Osteopathy");
        physician2.setTimeTable("20-03-2021 17:00:00", "Osteopathy");
        physician2.setTimeTable("21-03-2021 09:00:00", "Rehabilitation");
        physician2.setTimeTable("21-03-2021 11:00:00", "Rehabilitation");
        physician2.setTimeTable("21-03-2021 13:00:00", "Osteopathy");
        physician2.setTimeTable("21-03-2021 15:00:00", "Osteopathy");
        physician2.setTimeTable("21-03-2021 17:00:00", "Osteopathy");
        physician2.setTimeTable("22-03-2021 09:00:00", "Rehabilitation");
        physician2.setTimeTable("22-03-2021 11:00:00", "Rehabilitation");
        physician2.setTimeTable("22-03-2021 13:00:00", "Osteopathy");
        physician2.setTimeTable("22-03-2021 15:00:00", "Osteopathy");
        physician2.setTimeTable("22-03-2021 17:00:00", "Osteopathy");
        physician2.setTimeTable("27-03-2021 09:00:00", "Osteopathy");
        physician2.setTimeTable("27-03-2021 11:00:00", "Osteopathy");
        physician2.setTimeTable("27-03-2021 13:00:00", "Osteopathy");
        physician2.setTimeTable("27-03-2021 15:00:00", "Rehabilitation");
        physician2.setTimeTable("27-03-2021 17:00:00", "Rehabilitation");
        physician2.setTimeTable("28-03-2021 09:00:00", "Osteopathy");
        physician2.setTimeTable("28-03-2021 11:00:00", "Osteopathy");
        physician2.setTimeTable("28-03-2021 13:00:00", "Osteopathy");
        physician2.setTimeTable("28-03-2021 15:00:00", "Osteopathy");
        physician2.setTimeTable("28-03-2021 17:00:00", "Osteopathy");
        physician2.setTimeTable("29-03-2021 09:00:00", "Rehabilitation");
        physician2.setTimeTable("29-03-2021 11:00:00", "Rehabilitation");
        physician2.setTimeTable("29-03-2021 13:00:00", "Rehabilitation");
        physician2.setTimeTable("29-03-2021 15:00:00", "Rehabilitation");
        physician2.setTimeTable("29-03-2021 17:00:00", "Rehabilitation");
        physician2.setPhysicianId();
        Physician.setPhysicians(physician2);

        Physician physician3 = new Physician();
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

        return physicians;
    }

    private static ArrayList<Patient> addPatients() {
        ArrayList<Patient> patients = new ArrayList<Patient>();
        Patient patient1 = new Patient();
        patient1.setFullName("Nadir");
        patient1.setAddress("53 ST stephens Rd");
        patient1.setPhoneNumber(67890);
        patient1.setPatientId();
        Patient.setPatients(patient1);

        Patient patient2 = new Patient();
        patient2.setFullName("David");
        patient2.setAddress("52 ST stephens Rd");
        patient2.setPhoneNumber(67890);
        patient2.setPatientId();
        Patient.setPatients(patient2);

        Patient patient3 = new Patient();
        patient3.setFullName("Gary");
        patient3.setAddress("51 ST stephens Rd");
        patient3.setPhoneNumber(56789);
        patient3.setPatientId();
        Patient.setPatients(patient3);

        Patient patient4 = new Patient();
        patient4.setFullName("Richard");
        patient4.setAddress("43 ST stephens Rd");
        patient4.setPhoneNumber(19890);
        patient4.setPatientId();
        Patient.setPatients(patient4);

        return patients;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminMenu;
    private javax.swing.JButton btnPatientMenu;
    private javax.swing.JButton btnPhysicianMenu;
    private javax.swing.JButton btnVisitorMenu;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
