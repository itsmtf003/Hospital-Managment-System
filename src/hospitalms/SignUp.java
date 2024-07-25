package hospitalms;

import Project.ConnectionProvider;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        Fname = new javax.swing.JLabel();
        EmailID = new javax.swing.JLabel();
        pw = new javax.swing.JLabel();
        cpw = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        pw1 = new javax.swing.JPasswordField();
        cpw1 = new javax.swing.JPasswordField();
        Signup = new javax.swing.JButton();
        AlreadyAUser = new javax.swing.JLabel();
        SignUp = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        HeadText = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PrivacyPolicy = new javax.swing.JCheckBox();
        Img = new javax.swing.JLabel();

        jLabel1.setBackground(new java.awt.Color(255, 204, 255));
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(150, 150, 150, 150, new java.awt.Color(204, 204, 255)));

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up!");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fname.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        Fname.setForeground(new java.awt.Color(255, 255, 255));
        Fname.setText("Username:");
        getContentPane().add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        EmailID.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        EmailID.setForeground(new java.awt.Color(255, 255, 255));
        EmailID.setText("Email ID:");
        getContentPane().add(EmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        pw.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        pw.setForeground(new java.awt.Color(255, 255, 255));
        pw.setText("Password :");
        getContentPane().add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 100, -1));

        cpw.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        cpw.setForeground(new java.awt.Color(255, 255, 255));
        cpw.setText("Confirm Password: ");
        getContentPane().add(cpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 160, -1));
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 430, 40));
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 430, 37));
        getContentPane().add(pw1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 210, 33));

        cpw1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpw1ActionPerformed(evt);
            }
        });
        getContentPane().add(cpw1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, 210, 33));

        Signup.setBackground(new java.awt.Color(0, 0, 51));
        Signup.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        Signup.setForeground(new java.awt.Color(255, 255, 255));
        Signup.setText("SIGN UP!");
        Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupActionPerformed(evt);
            }
        });
        getContentPane().add(Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 434, 35));

        AlreadyAUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AlreadyAUser.setForeground(new java.awt.Color(255, 255, 255));
        AlreadyAUser.setText("Already A User?");
        getContentPane().add(AlreadyAUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, -1, -1));

        SignUp.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        SignUp.setForeground(new java.awt.Color(204, 0, 102));
        SignUp.setText("Login Now!");
        SignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpMouseClicked(evt);
            }
        });
        getContentPane().add(SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, -1, -1));

        jPanel2.setBackground(new java.awt.Color(27, 33, 79));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeadText.setBackground(new java.awt.Color(153, 51, 255));
        HeadText.setFont(new java.awt.Font("Papyrus", 1, 36)); // NOI18N
        HeadText.setForeground(new java.awt.Color(255, 255, 255));
        HeadText.setText("Sign Up");
        jPanel2.add(HeadText, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 180, -1));

        jLabel3.setFont(new java.awt.Font("Pristina", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Please make sure that you are entering your correct details!.");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        PrivacyPolicy.setBackground(new java.awt.Color(255, 255, 255));
        PrivacyPolicy.setForeground(new java.awt.Color(255, 255, 255));
        PrivacyPolicy.setText("I've read and agree with TERMS OF SERVICE and PRIVACY POLICY");
        PrivacyPolicy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrivacyPolicyActionPerformed(evt);
            }
        });
        jPanel2.add(PrivacyPolicy, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 400, 19));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 500, 540));

        Img.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        Img.setForeground(new java.awt.Color(255, 255, 255));
        Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalms/Signup2.png"))); // NOI18N
        getContentPane().add(Img, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 980, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrivacyPolicyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrivacyPolicyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrivacyPolicyActionPerformed

    private void SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupActionPerformed
        String userName= uname.getText();
        String EmailID = Email.getText();
        String pw = pw1.getText();
        String cpw = cpw1.getText();
       

        // Input Validation
        if (userName.isEmpty() || EmailID.isEmpty() || pw.isEmpty() || cpw.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all the required fields!");
            return;
        }
        
        if (!pw.equals(cpw)) {
                JOptionPane.showMessageDialog(null, "Passwords do not match!");
            } else {
            

        try {
            // Validate Age to be a number

            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
                st.executeUpdate("INSERT INTO `signup`(`userName`, `Email`, `pw`, `cpw`) VALUES ('"+userName+"','"+EmailID+"','"+pw+"','"+cpw+"') ");
            JOptionPane.showMessageDialog(null, "Signed Up Successfully!");
            clearForm();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Adding Patient: " + e.getMessage());
        }
        }
    }
    private void clearForm() {
        uname.setText("");
        Email.setText("");
        pw1.setText("");
        cpw1.setText("");
    
        
 

    }//GEN-LAST:event_SignupActionPerformed

    private void cpw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpw1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpw1ActionPerformed



    private void SignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpMouseClicked
        // TODO add your handling code here:
        SignIn lp = new SignIn();
        lp.show();
        dispose();
    }//GEN-LAST:event_SignUpMouseClicked

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
            java.util.logging.Logger.getLogger(SignUp.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("JDBC Is Connected");
        } catch (Exception e) {
            System.out.println("Exception" + e.getMessage());

        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlreadyAUser;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel EmailID;
    private javax.swing.JLabel Fname;
    private javax.swing.JLabel HeadText;
    private javax.swing.JLabel Img;
    private javax.swing.JCheckBox PrivacyPolicy;
    private javax.swing.JLabel SignUp;
    private javax.swing.JButton Signup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cpw;
    private javax.swing.JPasswordField cpw1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel pw;
    private javax.swing.JPasswordField pw1;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
