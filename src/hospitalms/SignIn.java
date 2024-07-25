package hospitalms;


import java.sql.*;
import javax.swing.JOptionPane;
import Project.ConnectionProvider;

public class SignIn extends javax.swing.JFrame {

    public SignIn() {
        initComponents();
         Connection con = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        pw1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SignUp = new javax.swing.JLabel();
        ForgotPass = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        SignIn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pw = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        HeadText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login page");
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        userName.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setText("Username:");
        getContentPane().add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 270, 40));

        pw1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pw1ActionPerformed(evt);
            }
        });
        getContentPane().add(pw1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 270, 40));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("New User?");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        SignUp.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        SignUp.setForeground(new java.awt.Color(255, 255, 51));
        SignUp.setText("Sign Up Now!");
        SignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpMouseClicked(evt);
            }
        });
        getContentPane().add(SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));

        ForgotPass.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        ForgotPass.setForeground(new java.awt.Color(255, 255, 51));
        ForgotPass.setText("Forgot Password?");
        ForgotPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForgotPassMouseClicked(evt);
            }
        });
        getContentPane().add(ForgotPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        jButton4.setBackground(new java.awt.Color(0, 0, 15));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("↪");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 50, 30));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, -1, 480));

        SignIn.setBackground(new java.awt.Color(3, 3, 20));
        SignIn.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        SignIn.setForeground(new java.awt.Color(255, 255, 255));
        SignIn.setText("Login");
        SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInActionPerformed(evt);
            }
        });
        getContentPane().add(SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 260, 40));

        jPanel2.setBackground(new java.awt.Color(27, 33, 79));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pw.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        pw.setForeground(new java.awt.Color(255, 255, 255));
        pw.setText("Password:");
        jPanel2.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Example: m.t.f.03");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 122, 20));

        HeadText.setBackground(new java.awt.Color(153, 51, 255));
        HeadText.setFont(new java.awt.Font("Papyrus", 1, 36)); // NOI18N
        HeadText.setForeground(new java.awt.Color(255, 255, 255));
        HeadText.setText("Log In");
        jPanel2.add(HeadText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 123, -1));

        jLabel1.setFont(new java.awt.Font("Pristina", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Please Login to Continue :)");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 480));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalms/login2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pw1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pw1ActionPerformed

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInActionPerformed
        
        String entereduserName = uname.getText();
        String enteredpw = new String(pw1.getPassword()); // Get the password as a string.

        if (entereduserName.isEmpty() || enteredpw.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter both account number and PIN.");
        } else {
            // Authenticate the user using entered account number and PIN
            boolean authenticated = authenticateUser(entereduserName, enteredpw);

            if (authenticated) {
                JOptionPane.showMessageDialog(this, "Welcome!");
                
                 Main m = new Main();
                 m.setVisible(true);
                 dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username Or Password!");
            }
        }
    }//GEN-LAST:event_SignInActionPerformed

    private void SignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpMouseClicked
        // TODO add your handling code here:
        SignUp su = new SignUp();
        su.show();
        dispose();
    }//GEN-LAST:event_SignUpMouseClicked

    private void ForgotPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPassMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ForgotPassMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//        // TODO add your handling code here:
        Start st = new Start();
        st.show();
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    // Method to authenticate user using account number and PIN
    private boolean authenticateUser(String entereduserName, String enteredpw) {
        try {
            // Perform database query to check if account number and PIN match
            Connection con = ConnectionProvider.getCon();
            PreparedStatement pst = con.prepareStatement("SELECT * FROM `signup` WHERE userName = ? AND pw = ?");
            pst.setString(1, entereduserName);
            pst.setString(2, enteredpw);
            ResultSet rs = pst.executeQuery();

            return rs.next(); // If the query returns any result, authentication is successful
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SignIn().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ForgotPass;
    private javax.swing.JLabel HeadText;
    private javax.swing.JButton SignIn;
    private javax.swing.JLabel SignUp;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel pw;
    private javax.swing.JPasswordField pw1;
    private javax.swing.JTextField uname;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
