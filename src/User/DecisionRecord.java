/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Login.LoginForm;
import config.DbConnect;
import config.Session;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class DecisionRecord extends javax.swing.JFrame {

    /**
     * Creates new form DecisionRecord
     */
    public DecisionRecord() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        u_lname = new javax.swing.JLabel();
        u_fname = new javax.swing.JLabel();
        Lbutton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(0, 102, 102));
        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("WELCOME!");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 80));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Profile_free_icons_designed_by_Freepik-removebg-preview__1_-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 130));

        u_lname.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        u_lname.setForeground(new java.awt.Color(255, 255, 255));
        u_lname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        u_lname.setText("USER");
        jPanel2.add(u_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 170, 20));

        u_fname.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        u_fname.setForeground(new java.awt.Color(255, 255, 255));
        u_fname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        u_fname.setText("USER");
        jPanel2.add(u_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 170, 20));

        Lbutton.setBackground(new java.awt.Color(0, 153, 153));
        Lbutton.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Lbutton.setForeground(new java.awt.Color(0, 102, 102));
        Lbutton.setText("LOGOUT");
        Lbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(Lbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 110, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, 480));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Iconos_gratuitos_de_Mujer_diseñados_por_Freepik__1_-removebg-preview.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 130, 140));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ACCOUNT");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 130, 30));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setLayout(null);
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 150, 180));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 740, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         Session sess = Session.getInstance();
      
      if(sess.getUid()==0){
          JOptionPane.showMessageDialog(null, "No Account, Login First!");
         LoginForm loginForm = new LoginForm();
         loginForm.setVisible(true);
         this.dispose();
      }else{
      
      u_fname.setText(""+sess.getFname());
      u_lname.setText(""+sess.getLname());
    }//GEN-LAST:event_formWindowActivated
    }
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       accountDetails accd = new accountDetails();
       accd.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void LbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LbuttonActionPerformed
    
    Session sess = Session.getInstance();
    DbConnect dbc = new DbConnect();
    dbc.insertLog(sess.getUid(), "Logged out from the system");

    LoginForm login = new LoginForm();
    login.setVisible(true);
    this.dispose();
    
    }//GEN-LAST:event_LbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(DecisionRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DecisionRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DecisionRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DecisionRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DecisionRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Lbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel u_fname;
    private javax.swing.JLabel u_lname;
    // End of variables declaration//GEN-END:variables
}
