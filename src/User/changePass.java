
package User;

import config.DbConnect;
import config.Session;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Login.LoginForm;
import config.PassHasher;
import java.security.NoSuchAlgorithmException;

public class changePass extends javax.swing.JFrame {

  
    public changePass() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        acc_lnln = new javax.swing.JLabel();
        acc_fnfn = new javax.swing.JLabel();
        idDisplay = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        oldpass = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        newpass = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        conpass = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CHANGE PASSWORD");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 300, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 60));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Profile_free_icons_designed_by_Freepik-removebg-preview__1_-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, 130));

        acc_lnln.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        acc_lnln.setForeground(new java.awt.Color(255, 255, 255));
        acc_lnln.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_lnln.setText("USER");
        jPanel2.add(acc_lnln, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 170, 30));

        acc_fnfn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        acc_fnfn.setForeground(new java.awt.Color(255, 255, 255));
        acc_fnfn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_fnfn.setText("USER");
        jPanel2.add(acc_fnfn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 170, 30));

        idDisplay.setBackground(new java.awt.Color(0, 102, 102));
        idDisplay.setFont(new java.awt.Font("Arial Black", 2, 14)); // NOI18N
        idDisplay.setForeground(new java.awt.Color(255, 255, 255));
        idDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idDisplay.setText("(UID)");
        jPanel2.add(idDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 180, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, 460));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        oldpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldpassActionPerformed(evt);
            }
        });
        jPanel3.add(oldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 180, 30));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setText("Type Old Password:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 160, 30));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setText("Enter New Password:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 160, 30));

        newpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpassActionPerformed(evt);
            }
        });
        jPanel3.add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 180, 30));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel9.setText("Confirm Password:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 160, 30));

        conpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conpassActionPerformed(evt);
            }
        });
        jPanel3.add(conpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 180, 30));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("BACK");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(0, -10, 80, 50);

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 80, 30));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SAVE");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(0, -10, 80, 50);

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 80, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 710, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void oldpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldpassActionPerformed

    private void newpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpassActionPerformed

    private void conpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conpassActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getInstance();
        if(sess.getUid()==0){
          JOptionPane.showMessageDialog(null, "No Account, Login First!");
         LoginForm loginForm = new LoginForm();
         loginForm.setVisible(true);
         this.dispose();
      }else{
      
        acc_fnfn.setText(""+sess.getFname());
        acc_lnln.setText(""+sess.getLname());
        idDisplay.setText("USER ID: "+sess.getUid());
        
       
        }
    }//GEN-LAST:event_formWindowActivated

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
    try {
    DbConnect dbc = new DbConnect();
    Session sess = Session.getInstance();
    String olddbpass;

    String query = "SELECT * FROM users WHERE u_id = '" + sess.getUid() + "'";
    ResultSet resultSet = dbc.getData(query);

    if (resultSet.next()) {
        olddbpass = resultSet.getString("ps"); 

        String oldhash = PassHasher.hashPassword(oldpass.getText());
        if (olddbpass.equals(oldhash)) {

            
            if (!newpass.getText().equals(conpass.getText())) {
                JOptionPane.showMessageDialog(null, "New Password and Confirm Password do not match!", "Error", JOptionPane.ERROR_MESSAGE);
                return;  
            }

            
            String npass = PassHasher.hashPassword(newpass.getText());
            dbc.updateData("UPDATE users SET ps = '" + npass + "' WHERE u_id = '" + sess.getUid() + "'");

            JOptionPane.showMessageDialog(null, "Successfully Updated!");
            LoginForm lg = new LoginForm();
            lg.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Old Password is Incorrect!");
        }
    } else {
        JOptionPane.showMessageDialog(null, "User not found!");
    }

    resultSet.close(); 
} catch (SQLException | NoSuchAlgorithmException ex) {
    System.out.println("Error: " + ex);
}

    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
     accountDetails ad = new accountDetails();
        ad.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseClicked
      public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_fnfn;
    private javax.swing.JLabel acc_lnln;
    private javax.swing.JTextField conpass;
    private javax.swing.JLabel idDisplay;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField newpass;
    private javax.swing.JTextField oldpass;
    // End of variables declaration//GEN-END:variables
}
