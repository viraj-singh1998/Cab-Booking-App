/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabs;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author viraj
 */
public class WaitingWindow extends javax.swing.JFrame {
    Connection connect=null;
    String userid;
    String driverid;
    int min_distance;
    int duration;
    /**
     * Creates new form WaitingWindow
     */
    public WaitingWindow(String user, String d_main, int min_d, int travel) {
        initComponents();
        connect = userdb.dbconnect();
        
        userid = user;
        driverid = d_main;
        min_distance = min_d;
        duration = travel;
    

    
     this.setVisible(true);
       this.setLocationRelativeTo(null);
       String sql="Select * from driver where dusername=?";
            try{
              
                PreparedStatement pst1=connect.prepareStatement(sql);
                pst1.setString(1, driverid);
                
                ResultSet rs=pst1.executeQuery();
                driverName.setText(rs.getString("dname"));
                
             
                driverPhone.setText(rs.getString("dphone"));
                
                
                driverCar.setText(rs.getString("dcar"));
                
                
                driverCarNo.setText(rs.getString("dcarno"));
                
                
                driverRating.setText(rs.getString("drating"));
                
                
                tripDuration.setText(String.valueOf(duration * 10) + " minutes." );
                
                
                fare.setText(String.valueOf(duration * 10) + " INR." );
                
                
    
                pst1.close();
                rs.close();
            }
                
                catch (SQLException ex) {
            System.out.println(ex.getMessage());
                }
        }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fare = new javax.swing.JLabel();
        tripDuration = new javax.swing.JLabel();
        driverRating = new javax.swing.JLabel();
        driverCarNo = new javax.swing.JLabel();
        driverCar = new javax.swing.JLabel();
        driverPhone = new javax.swing.JLabel();
        driverName = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Driver's Phone Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 92, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Driver Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 47, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Car Build");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 137, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Car License Plate Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 186, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Driver Rating");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 238, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Trip Duration");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 288, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Estimated Fare");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 339, -1, -1));

        fare.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fare.setText("...");
        getContentPane().add(fare, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 339, 150, -1));

        tripDuration.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tripDuration.setText("...");
        getContentPane().add(tripDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 288, 160, -1));

        driverRating.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        driverRating.setText("...");
        getContentPane().add(driverRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 238, 91, -1));

        driverCarNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        driverCarNo.setText("...");
        getContentPane().add(driverCarNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 186, 150, -1));

        driverCar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        driverCar.setText("...");
        getContentPane().add(driverCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 137, 170, -1));

        driverPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        driverPhone.setText("...");
        getContentPane().add(driverPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 92, 135, -1));

        driverName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        driverName.setText("...");
        getContentPane().add(driverName, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 47, 135, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 400, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calibri Light", 3, 22)); // NOI18N
        jLabel8.setText("Status");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 11, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 153, 0));
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 540, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.setVisible(false);
        new RequestCab(userid, "", 0, 0).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void arr( ) {
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
            java.util.logging.Logger.getLogger(WaitingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WaitingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WaitingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WaitingWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WaitingWindow(userid, driverid, min_distance, duration).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel driverCar;
    private javax.swing.JLabel driverCarNo;
    private javax.swing.JLabel driverName;
    private javax.swing.JLabel driverPhone;
    private javax.swing.JLabel driverRating;
    private javax.swing.JLabel fare;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel tripDuration;
    // End of variables declaration//GEN-END:variables
}
