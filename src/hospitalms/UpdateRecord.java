package hospitalms;

import Project.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;

public class UpdateRecord extends javax.swing.JFrame {

    /**
     * Creates new form UpdateRecord
     */
    public UpdateRecord() {
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

        Search = new javax.swing.JButton();
        PID = new javax.swing.JTextField();
        pID = new javax.swing.JLabel();
        pName = new javax.swing.JLabel();
        PName = new javax.swing.JTextField();
        PContact = new javax.swing.JTextField();
        pNumber = new javax.swing.JLabel();
        pAge = new javax.swing.JLabel();
        PAge = new javax.swing.JTextField();
        PGender = new javax.swing.JTextField();
        pGender = new javax.swing.JLabel();
        pBloodGroup = new javax.swing.JLabel();
        PBloodGroup = new javax.swing.JTextField();
        PAddress = new javax.swing.JTextField();
        pAddress = new javax.swing.JLabel();
        pMessage = new javax.swing.JLabel();
        PMessage = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Search.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 100, 30));

        PID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(PID, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 300, 33));

        pID.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        pID.setForeground(new java.awt.Color(255, 255, 255));
        pID.setText("Patient ID :");
        getContentPane().add(pID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        pName.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        pName.setForeground(new java.awt.Color(255, 255, 255));
        pName.setText("Name : ");
        getContentPane().add(pName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        PName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(PName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 300, 33));

        PContact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(PContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 300, 33));

        pNumber.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        pNumber.setForeground(new java.awt.Color(255, 255, 255));
        pNumber.setText("Contact No. :");
        getContentPane().add(pNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        pAge.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        pAge.setForeground(new java.awt.Color(255, 255, 255));
        pAge.setText("Age :");
        getContentPane().add(pAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        PAge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(PAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 300, 33));
        getContentPane().add(PGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 300, 40));

        pGender.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        pGender.setForeground(new java.awt.Color(255, 255, 255));
        pGender.setText("Gender :");
        getContentPane().add(pGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        pBloodGroup.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        pBloodGroup.setForeground(new java.awt.Color(255, 255, 255));
        pBloodGroup.setText("Blood Group :");
        getContentPane().add(pBloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        PBloodGroup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(PBloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 300, 33));

        PAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(PAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 300, 33));

        pAddress.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        pAddress.setForeground(new java.awt.Color(255, 255, 255));
        pAddress.setText("Address :");
        getContentPane().add(pAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, -1));

        pMessage.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        pMessage.setForeground(new java.awt.Color(255, 255, 255));
        pMessage.setText("Any Major Diseases Suffered Earlier");
        getContentPane().add(pMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        PMessage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(PMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 460, 60));

        Save.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalms/save-icon--1.png"))); // NOI18N
        Save.setText("Update");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 190, 40));

        Exit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalms/Close.png"))); // NOI18N
        Exit.setText("Close");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 190, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalms/bg1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:

        String patientID = PID.getText();

        if (patientID.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter Patient ID To Search");
        } else {
            try {
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM patient WHERE patientID = '" + patientID + "'");
                if (rs.next()) {
                    PName.setText(rs.getString(2));
                    PContact.setText(rs.getString(3));
                    PAge.setText(rs.getString(4));
                    PGender.setText(rs.getString(5));
                    PBloodGroup.setText(rs.getString(6));
                    PAddress.setText(rs.getString(7));
                    PMessage.setText(rs.getString(8));
                    PID.setEditable(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Patient ID does not exist");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        }


    }//GEN-LAST:event_SearchActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        
        String patientID = PID.getText();
        String Name = PName.getText();
        String ContactNo = PContact.getText();
        String Age = PAge.getText();
        String Gender = (String) PGender.getText();
        String bloodGroup = PBloodGroup.getText();
        String address = PAddress.getText();
        String anyMajorDisease = PMessage.getText();

        try {

            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("UPDATE patient SET Name = '" + Name + "', ContactNo = '" + ContactNo + "', Age = '" + Age + "', Gender = '" + Gender + "', bloodGroup = '" + bloodGroup + "', address = '" + address + "', anyMajorDisease = '" + anyMajorDisease + "' WHERE patientID = '" + patientID + "'");
    JOptionPane.showMessageDialog(null, "Record Updated Successfully!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Adding Patient: " + e.getMessage());
        }
        
    }//GEN-LAST:event_SaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JTextField PAddress;
    private javax.swing.JTextField PAge;
    private javax.swing.JTextField PBloodGroup;
    private javax.swing.JTextField PContact;
    private javax.swing.JTextField PGender;
    private javax.swing.JTextField PID;
    private javax.swing.JTextField PMessage;
    private javax.swing.JTextField PName;
    private javax.swing.JButton Save;
    private javax.swing.JButton Search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel pAddress;
    private javax.swing.JLabel pAge;
    private javax.swing.JLabel pBloodGroup;
    private javax.swing.JLabel pGender;
    private javax.swing.JLabel pID;
    private javax.swing.JLabel pMessage;
    private javax.swing.JLabel pName;
    private javax.swing.JLabel pNumber;
    // End of variables declaration//GEN-END:variables
}
