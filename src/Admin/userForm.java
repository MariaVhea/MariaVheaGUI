/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import config.DbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Login.LoginForm;

/**
 *
 * @author HP
 */
public class userForm extends javax.swing.JFrame {

    /**
     * Creates new form userForm
     */
    public userForm() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Lname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Number = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        userReg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Passreg = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        clear = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        ustatus = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("First Name:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 90, 30));

        Fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnameActionPerformed(evt);
            }
        });
        jPanel2.add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 180, 30));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last Name:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 90, 30));

        Lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LnameActionPerformed(evt);
            }
        });
        jPanel2.add(Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 180, 30));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Number:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 90, 30));

        Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberActionPerformed(evt);
            }
        });
        jPanel2.add(Number, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 180, 30));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 90, 30));

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        jPanel2.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 180, 30));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 90, 30));

        userReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userRegActionPerformed(evt);
            }
        });
        jPanel2.add(userReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 180, 30));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 90, 30));

        Passreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassregActionPerformed(evt);
            }
        });
        jPanel2.add(Passreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 180, 30));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("User ID:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 90, 30));

        uid.setEnabled(false);
        uid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uidActionPerformed(evt);
            }
        });
        jPanel2.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 180, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 550));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clear.setBackground(new java.awt.Color(255, 255, 255));
        clear.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        clear.setForeground(new java.awt.Color(0, 153, 153));
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 110, 30));

        refresh.setBackground(new java.awt.Color(255, 255, 255));
        refresh.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        refresh.setForeground(new java.awt.Color(0, 153, 153));
        refresh.setText("REFRESH");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 120, 30));

        cancel.setBackground(new java.awt.Color(255, 255, 255));
        cancel.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        cancel.setForeground(new java.awt.Color(0, 153, 153));
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 110, 30));

        add.setBackground(new java.awt.Color(255, 255, 255));
        add.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        add.setForeground(new java.awt.Color(0, 153, 153));
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 110, 30));

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        update.setForeground(new java.awt.Color(0, 153, 153));
        update.setText("UPDATE");
        update.setEnabled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 110, 30));

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 153, 153));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 110, 30));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Account Type:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 110, 30));

        jComboBox1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 180, 30));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User Status:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 110, 30));

        ustatus.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        ustatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        ustatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ustatusActionPerformed(evt);
            }
        });
        jPanel1.add(ustatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 180, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/copilot_image_1741498817306-removebg-preview (1).png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 460, 350));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FnameActionPerformed

    private void LnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LnameActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void userRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userRegActionPerformed

    private void PassregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassregActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassregActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        String fname = Fname.getText().trim();
        String lname = Lname.getText().trim();
        String username = userReg.getText().trim();
        String email = Email.getText().trim();
        String password = Passreg.getText().trim();
        String cn = Number.getText().trim();
        String accountType = jComboBox1.getSelectedItem().toString();
        String userStatus = ustatus.getSelectedItem().toString();
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        if (fname.isEmpty() || lname.isEmpty() || cn.isEmpty() || email.isEmpty() || username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required. Please fill out the form.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!fname.matches("[a-zA-Z ]+") || !lname.matches("[a-zA-Z ]+")) {
            JOptionPane.showMessageDialog(this, "Only letters are allowed for First and Last Name.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!email.matches(emailRegex)) {
            JOptionPane.showMessageDialog(this, "Invalid Email! Please enter a valid email address.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!username.matches("[a-zA-Z0-9_]{5,}")) {
            JOptionPane.showMessageDialog(this, "Invalid Username! Must be at least 5 characters and contain only letters, numbers, and underscores.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!password.matches("^(?=.*[A-Z])(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?])(?=.*\\d).{8,}$")) {
            JOptionPane.showMessageDialog(this, "Invalid Password! Must be at least 8 characters long, contain one uppercase letter, one special character, and one number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        System.out.println("Debug: Validation passed, checking for duplicates...");

        try (Connection connect = new DbConnect().getConnection()) {

            String checkQuery = "SELECT COUNT(*) FROM users WHERE us = ? OR em = ?";
            try (PreparedStatement checkStmt = connect.prepareStatement(checkQuery)) {
                checkStmt.setString(1, username);
                checkStmt.setString(2, email);
                ResultSet rs = checkStmt.executeQuery();

                if (rs.next() && rs.getInt(1) > 0) {
                    JOptionPane.showMessageDialog(this, "Username or Email already exists. Please choose another.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

           String insertQuery = "INSERT INTO users (fn, ln, cn, em, us, ps, type, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
try (PreparedStatement insertStmt = connect.prepareStatement(insertQuery)) {
    insertStmt.setString(1, fname);
    insertStmt.setString(2, lname);
    insertStmt.setString(3, cn);
    insertStmt.setString(4, email);
    insertStmt.setString(5, username);
    insertStmt.setString(6, password);
    insertStmt.setString(7, accountType);
    insertStmt.setString(8, userStatus);



                int inserted = insertStmt.executeUpdate();

                if (inserted > 0) {
                    JOptionPane.showMessageDialog(this, "Registration Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    new UserDashboard().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Registration failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addActionPerformed

    private void ustatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ustatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ustatusActionPerformed

    private void uidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uidActionPerformed

    private void NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

   String fname = Fname.getText().trim();
   String lname = Lname.getText().trim();
   String username = userReg.getText().trim();
   String email = Email.getText().trim();
   String password = Passreg.getText().trim();
   String cn = Number.getText().trim();
   String accountType = jComboBox1.getSelectedItem().toString();
   String userStatus = ustatus.getSelectedItem().toString();
   String userId = uid.getText().trim(); 


     if (fname.isEmpty() || lname.isEmpty() || cn.isEmpty() || email.isEmpty() || 
    username.isEmpty() || password.isEmpty() || userId.isEmpty()) {
    JOptionPane.showMessageDialog(this, "All fields are required.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

     if (!fname.matches("[a-zA-Z ]+") || !lname.matches("[a-zA-Z ]+")) {
    JOptionPane.showMessageDialog(this, "Only letters are allowed for First and Last Name.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

     String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
     if (!email.matches(emailRegex)) {
    JOptionPane.showMessageDialog(this, "Invalid Email!", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

     if (!username.matches("[a-zA-Z0-9_]{5,}")) {
    JOptionPane.showMessageDialog(this, "Username must be at least 5 characters long and contain only letters, numbers, and underscores.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

      if (!password.matches("^(?=.*[A-Z])(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?])(?=.*\\d).{8,}$")) {
    JOptionPane.showMessageDialog(this, "Password must be at least 8 characters, contain one uppercase letter, one special character, and one number.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

    System.out.println("Debug: Validation passed, checking for existing email and username...");

    try (Connection conn = new DbConnect().getConnection()) {
   
    String checkSql = "SELECT COUNT(*) FROM users WHERE (em = ? OR us = ?) AND u_id != ?";
    try (PreparedStatement checkStmt = conn.prepareStatement(checkSql)) {
        checkStmt.setString(1, email);
        checkStmt.setString(2, username);
        checkStmt.setString(3, userId);
        
        ResultSet rs = checkStmt.executeQuery();
        if (rs.next() && rs.getInt(1) > 0) {
            JOptionPane.showMessageDialog(this, "Email or Username is already in use by another user!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    System.out.println("Debug: No duplicate email or username found, updating user data...");

    // Proceed with update
    String sql = "UPDATE users SET fn = ?, ln = ?, cn = ?, em = ?, us = ?, ps = ?, type = ?, status = ? WHERE u_id = ?";
    try (PreparedStatement pst = conn.prepareStatement(sql)) {
        pst.setString(1, fname);
        pst.setString(2, lname);
        pst.setString(3, cn);
        pst.setString(4, email);
        pst.setString(5, username);
        pst.setString(6, password); 
        pst.setString(7, accountType);
        pst.setString(8, userStatus);
        pst.setString(9, userId);

        int rowsAffected = pst.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "User updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Update failed. User not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

} catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}


    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
    }//GEN-LAST:event_deleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        UserDashboard userDashboard = new UserDashboard();
         userDashboard.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(userForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Email;
    public javax.swing.JTextField Fname;
    public javax.swing.JTextField Lname;
    public javax.swing.JTextField Number;
    public javax.swing.JPasswordField Passreg;
    public javax.swing.JButton add;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    public javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton refresh;
    public javax.swing.JTextField uid;
    public javax.swing.JButton update;
    public javax.swing.JTextField userReg;
    public javax.swing.JComboBox<String> ustatus;
    // End of variables declaration//GEN-END:variables
}
