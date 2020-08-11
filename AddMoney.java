/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author viraj
 */
public class AddMoney extends javax.swing.JFrame {
    Connection connect=null;
    String userid;
    int total;
    /**
     * Creates new form AddMoney
     */
    public AddMoney(String user) {
        userid = user;
        connect = userdb.dbconnect();
        this.setLocationRelativeTo(null);
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        addmoney = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 120, 35));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 110, 35));

        username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 89, 20));

        addmoney.setBackground(new java.awt.Color(0, 0, 153));
        addmoney.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        addmoney.setForeground(new java.awt.Color(255, 255, 255));
        addmoney.setText("Add Money");
        addmoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmoneyActionPerformed(evt);
            }
        });
        getContentPane().add(addmoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 120, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Amount to be added");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, 20));
        getContentPane().add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 89, -1));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 89, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabs/timeless-treasures-new-york-city-taxi-cabs-black-fabric-Lg.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 430));

        jButton2.setBackground(new java.awt.Color(0, 0, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Return");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 80, -1));

        jLabel4.setBackground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("jLabel4");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 540, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void addmoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmoneyActionPerformed
        // TODO add your handling code here:
         boolean flag = true;
        if(username.getText().equals("") || password.getText().equals("") || amount.getText().equals("")){
            if(username.getText().equals("") == true)
            {
                JOptionPane.showMessageDialog(null,"Username field is empty.");
                flag = false;
            }
            else if(password.getText().equals("") == true)
            {
                JOptionPane.showMessageDialog(null,"Password field is empty.");
                flag = false;
            }
            else if(amount.getText().equals("") == true)
            {
                JOptionPane.showMessageDialog(null,"Amount field is empty.");
                flag = false;
            }
        }
        
        if(flag){
            String sql="Select password from user where username=?";
            try {
                PreparedStatement pst=connect.prepareStatement(sql);
                pst.setString(1, username.getText());
                ResultSet rs=pst.executeQuery();
                int count=0;
                String pass=null;
                //System.out.println("query output is " + rs.next());
                while(rs.next())
                {
                    //System.out.println("query output is " + rs.next());
                    count++;
                    pass=rs.getString("password");
                }
                System.out.println("count is" + count);               
                if(count==0)
                {
                    JOptionPane.showMessageDialog(null,"No user with this username exists");
                    flag=false;
                }
                
                else if(count==1)
                {
                    //System.out.println(String.valueOf(password.getPassword()));
                    //String.valueOf(pass);
                
                  if(String.valueOf(password.getPassword()).equals(pass))
                    {
                        //System.out.println("entered");                      
                    }
                    else
                    {
                       JOptionPane.showMessageDialog(null,"Password incorrect");                       
                       flag=false ;
                    }
                }
                pst.close();
                rs.close();
            } catch (SQLException ex) {
            System.out.println(ex.getMessage());}
        }
        try{
        if(flag){
            if(Integer.valueOf(amount.getText())<0){
                flag=false;
                JOptionPane.showMessageDialog(null,"Negative amount cannot be added to the wallet !!!");
                
            }
        }
        if(flag){
            if(Integer.valueOf(amount.getText())>10000){
                JOptionPane.showMessageDialog(null,"Amount too high !!!");
                flag = false;
            }
            else{
                //flag=false;                
            }
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Integer values accepted only!!!");
            flag = false;
        }
        if(flag){
        try{
            String query1="SELECT wallet FROM user WHERE username=? ";
            PreparedStatement pst1=connect.prepareStatement(query1);
            pst1.setString(1, username.getText());
            ResultSet rs=pst1.executeQuery();
            total = Integer.valueOf(rs.getString("wallet"));
            pst1.close();
            rs.close();
            String query2="UPDATE user SET wallet=? WHERE username=?";
            PreparedStatement pst2=connect.prepareStatement(query2);
            pst2.setString(2, username.getText());
            int put = Integer.valueOf(amount.getText());
            pst2.setString(1, String.valueOf(total + put));
            pst2.executeUpdate();
            //rs.close();
            //pst1.close();
            pst2.close();
            this.setVisible(false);
            JOptionPane.showMessageDialog(null,amount.getText() + " INR added successfully."); 
            new RequestCab(userid, "", 0, 0).setVisible(true);
            } 
        catch (SQLException ex) {
            System.out.println(ex.getMessage());}
        
      }
    }//GEN-LAST:event_addmoneyActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new RequestCab(userid, "", 0, 0).setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void arr() {
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
            java.util.logging.Logger.getLogger(AddMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMoney(userid).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addmoney;
    private javax.swing.JTextField amount;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
