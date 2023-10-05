/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import java.util.regex.*;

import javax.swing.JOptionPane;

/**
 *
 * @author payal
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        fName_validation = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        firstName = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        messageTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        email_validation = new javax.swing.JLabel();
        fname_validation = new javax.swing.JLabel();
        lName_validation = new javax.swing.JLabel();
        message_validation = new javax.swing.JLabel();
        age_validation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setPreferredSize(new java.awt.Dimension(700, 500));

        fName_validation.setBackground(new java.awt.Color(0, 204, 204));
        fName_validation.setForeground(new java.awt.Color(0, 204, 204));

        titleLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Customer Form");

        firstName.setText("First Name:");

        lastNameLabel.setText("Email:");

        ageLabel.setText("Last Name:");

        emailLabel.setText("Age:");

        messageLabel.setText("Message:");

        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });
        firstNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstNameTextFieldKeyReleased(evt);
            }
        });

        ageTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageTextFieldKeyReleased(evt);
            }
        });

        emailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTextFieldKeyReleased(evt);
            }
        });

        lastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextFieldActionPerformed(evt);
            }
        });
        lastNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lastNameTextFieldKeyReleased(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fName_validationLayout = new javax.swing.GroupLayout(fName_validation);
        fName_validation.setLayout(fName_validationLayout);
        fName_validationLayout.setHorizontalGroup(
            fName_validationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fName_validationLayout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(253, 253, 253))
            .addGroup(fName_validationLayout.createSequentialGroup()
                .addGroup(fName_validationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fName_validationLayout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(submitButton))
                    .addGroup(fName_validationLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(fName_validationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(age_validation, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fName_validationLayout.createSequentialGroup()
                                .addGroup(fName_validationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstName)
                                    .addComponent(ageLabel)
                                    .addComponent(emailLabel)
                                    .addComponent(lastNameLabel)
                                    .addComponent(messageLabel))
                                .addGap(58, 58, 58)
                                .addGroup(fName_validationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(firstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(lastNameTextField)
                                    .addComponent(ageTextField)
                                    .addComponent(emailTextField)
                                    .addComponent(messageTextField))
                                .addGroup(fName_validationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(fName_validationLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(fName_validationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(email_validation, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lName_validation, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fname_validation, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(fName_validationLayout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(message_validation, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fName_validationLayout.setVerticalGroup(
            fName_validationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fName_validationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(fName_validationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fName_validationLayout.createSequentialGroup()
                        .addGroup(fName_validationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstName)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fname_validation, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(fName_validationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lName_validation, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fName_validationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ageLabel)
                                .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(fName_validationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailLabel)
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(age_validation, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(fName_validationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fName_validationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lastNameLabel)
                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(email_validation, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(fName_validationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fName_validationLayout.createSequentialGroup()
                        .addGroup(fName_validationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(messageLabel)
                            .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(submitButton)
                        .addContainerGap(71, Short.MAX_VALUE))
                    .addGroup(fName_validationLayout.createSequentialGroup()
                        .addComponent(message_validation, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fName_validation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fName_validation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void lastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextFieldActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String firstName= firstNameTextField.getText();
        String lastName= lastNameTextField.getText();
        String age= ageTextField.getText();
        String email= emailTextField.getText();
        String message= messageTextField.getText();
        JOptionPane.showMessageDialog(this, firstName+" "+ lastName+" "+age+ " "+email+" "+message, "Customer Information", HEIGHT);
    }//GEN-LAST:event_submitButtonActionPerformed

    private void firstNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameTextFieldKeyReleased
        // TODO add your handling code here:
        String pattern= "^[a-zA-Z]{0,30}$";
        Pattern pat= Pattern.compile(pattern);
        Matcher match= pat.matcher(firstNameTextField.getText());
        if(!match.matches()){
            fname_validation.setText("Invalid First Name");
        }
        else
            fname_validation.setText(null);
    }//GEN-LAST:event_firstNameTextFieldKeyReleased

    private void lastNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameTextFieldKeyReleased
        // TODO add your handling code here:
        String pattern= "^[a-zA-Z]{0,30}$";
        Pattern pat= Pattern.compile(pattern);
        Matcher match= pat.matcher(lastNameTextField.getText());
        if(!match.matches()){
            lName_validation.setText("Invalid last Name");
        }
        else
            lName_validation.setText(null);
    }//GEN-LAST:event_lastNameTextFieldKeyReleased

    private void emailTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextFieldKeyReleased
        // TODO add your handling code here:
        String pattern= "^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,5}$";
        Pattern pat= Pattern.compile(pattern);
        Matcher match= pat.matcher(emailTextField.getText());
        if(!match.matches()){
            email_validation.setText("Invalid Email");
        }
        else
            email_validation.setText(null);
    }//GEN-LAST:event_emailTextFieldKeyReleased

    private void ageTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTextFieldKeyReleased
        // TODO add your handling code here:
        String pattern= "^[0-9]{0,3}$";
        Pattern pat= Pattern.compile(pattern);
        Matcher match= pat.matcher(ageTextField.getText());
        if(!match.matches()){
            age_validation.setText("Invalid Age");
        }
        else
            age_validation.setText(null);
    }//GEN-LAST:event_ageTextFieldKeyReleased

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel age_validation;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel email_validation;
    private javax.swing.JPanel fName_validation;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel fname_validation;
    private javax.swing.JLabel lName_validation;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JLabel message_validation;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
