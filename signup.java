/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
 
/**
 *
 * @author viraj
 */
public class signup extends javax.swing.JFrame {
    Connection connect=null;
    /**
     * Creates new form signup
     */
    public signup() {
        initComponents();
       // connect = 
       connect = userdb.dbconnect();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        confirmPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        signup = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 86, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Phone Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 130, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 70, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Username");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 86, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 86, -1));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 253, -1));

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 253, -1));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 253, -1));
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 253, -1));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 253, -1));
        getContentPane().add(confirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 253, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Confirm Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        signup.setBackground(new java.awt.Color(0, 51, 153));
        signup.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        signup.setForeground(new java.awt.Color(255, 255, 255));
        signup.setText("Sign Up");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        getContentPane().add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calibri Light", 3, 22)); // NOI18N
        jLabel7.setText("Enter Details");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 153, 0));
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 550, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
     boolean flag = true;
     boolean validity= validate(email.getText());
        if(name.getText().equals("") || phone.getText().equals("") || email.getText().equals("") || username.getText().equals("") || password.getText().equals("")){
            if(name.getText().equals("") == true)
            {
                JOptionPane.showMessageDialog(null,"Name field is empty.");
                flag = false;
            }
            else if(flag&&phone.getText().equals("") == true)
            {
                JOptionPane.showMessageDialog(null,"Phone number field is empty.");
                flag = false;
            }
            else if(flag&&(phone.getText().length()<10||phone.getText().length()>10)){
                JOptionPane.showMessageDialog(null,"Length of Number entered in not correct!!!");
                flag = false;
            }
            else if(flag&&email.getText().equals("") == true)
            {
                JOptionPane.showMessageDialog(null,"E-mail field is empty.");
                flag = false;
            }
            else if(flag&&!validity)
         {
           JOptionPane.showMessageDialog(null,"Enter your Email-Id in proper format");
           flag=false;
         }
            else if(flag&&username.getText().equals("") == true)
            {
                JOptionPane.showMessageDialog(null,"Username field is empty.");
                flag = false;
            }
            else if(flag&&password.getText().equals("") == true)
            {
                JOptionPane.showMessageDialog(null,"Password field is empty.");
                flag = false;
            }
        }
        
        if(flag&&!password.getText().equals(confirmPassword.getText()))
        {
            flag = false;
            JOptionPane.showMessageDialog(null,"Passwords do not match.");
        }
        else if(flag&&password.getText().length()<4)
        {
            flag = false;
            JOptionPane.showMessageDialog(null,"Password is too short.");
        }
        //boolean validatity = 
         //boolean validity= validate(email.getText());
        /* if(flag&&!validity)
         {
           JOptionPane.showMessageDialog(null,"Enter your Id in proper format");
           flag=false;
         }*/
        if(flag){
        try{
            String query="INSERT INTO user VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst=connect.prepareStatement(query);
            pst.setString(2, username.getText());
            pst.setString(3, String.valueOf(password.getPassword()));
            pst.setString(4, name.getText());
            pst.setString(5, email.getText());
            pst.setString(1, phone.getText());
            pst.setString(6,String.valueOf(0));
            pst.setString(7,String.valueOf(0));
            pst.setString(8,String.valueOf(0));
            pst.setString(9,String.valueOf(0));
            pst.executeUpdate();    
            this.setVisible(false);
            JOptionPane.showMessageDialog(null,"Account created Successfully");
            new main().setVisible(true);
            pst.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Your username is already taken by some user...");
            //System.out.println(ex.getMessage());
           
//JOptionPane.showMessageDialog(null,"Your username is already taken by some user.");
        }
        }
    }//GEN-LAST:event_signupActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }
        public boolean validate(String hex) {
        Pattern pattern;
        Matcher matcher;

        String EMAIL_PATTERN = 
        "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
        "[a-zA-Z0-9_+&*-]+)*@" + 
        "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
        "A-Z]{2,7}$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(hex);
        return matcher.matches();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    private javax.swing.JButton signup;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
