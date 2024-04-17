/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.qlchtl.views;

import com.qlchtl.dao.NhanVienDao;
import com.qlchtl.dao.TaiKhoanDao;
import com.qlchtl.entity.NhanVien;
import com.qlchtl.entity.TaiKhoan;
import com.qlchtl.utils.MsgBox;
import com.qlchtl.utils.RandomCodeEmailSender;

import java.awt.*;
import java.util.Random;

/**
 *
 * @author Dell
 */
public class ResetPassword extends javax.swing.JDialog {

    /**
     * Creates new form ResetPassword
     */
    private Boolean isVerify = false ;
    public ResetPassword(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.pnlNewPassword.setVisible(false);
        this.btnConfirm.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        lblMain = new javax.swing.JLabel();
        myPanelBoxShadow1 = new com.qlchtl.views.MyControls.MyPanelBoxShadow();
        jLabel2 = new javax.swing.JLabel();
        myPanel1 = new com.qlchtl.views.MyControls.MyPanel();
        txtAccount = new javax.swing.JTextField();
        myPanelBoxShadow2 = new com.qlchtl.views.MyControls.MyPanelBoxShadow();
        jLabel3 = new javax.swing.JLabel();
        myPanel2 = new com.qlchtl.views.MyControls.MyPanel();
        txtEmail = new javax.swing.JTextField();
        myPanelBoxShadow3 = new com.qlchtl.views.MyControls.MyPanelBoxShadow();
        jLabel4 = new javax.swing.JLabel();
        myPanel3 = new com.qlchtl.views.MyControls.MyPanel();
        txtOTP = new javax.swing.JTextField();
        btnSendOTP = new com.qlchtl.views.MyControls.MyButton();
        pnlNewPassword = new com.qlchtl.views.MyControls.MyPanelBoxShadow();
        jLabel5 = new javax.swing.JLabel();
        myPanel4 = new com.qlchtl.views.MyControls.MyPanel();
        txtNewPassWord = new javax.swing.JTextField();
        btnConfirm = new com.qlchtl.views.MyControls.MyButton();
        btnVerify = new com.qlchtl.views.MyControls.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));

        lblMain.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMain.setForeground(new java.awt.Color(102, 102, 102));
        lblMain.setText("Reset Your Password");

        myPanelBoxShadow1.setBackground(new java.awt.Color(255, 255, 255));
        myPanelBoxShadow1.setShadowSize(3);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Account");

        myPanel1.setBackground(new java.awt.Color(255, 255, 255));
        myPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        txtAccount.setBorder(null);

        javax.swing.GroupLayout myPanel1Layout = new javax.swing.GroupLayout(myPanel1);
        myPanel1.setLayout(myPanel1Layout);
        myPanel1Layout.setHorizontalGroup(
            myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );
        myPanel1Layout.setVerticalGroup(
            myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout myPanelBoxShadow1Layout = new javax.swing.GroupLayout(myPanelBoxShadow1);
        myPanelBoxShadow1.setLayout(myPanelBoxShadow1Layout);
        myPanelBoxShadow1Layout.setHorizontalGroup(
            myPanelBoxShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelBoxShadow1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        myPanelBoxShadow1Layout.setVerticalGroup(
            myPanelBoxShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(myPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        myPanelBoxShadow2.setBackground(new java.awt.Color(255, 255, 255));
        myPanelBoxShadow2.setShadowSize(3);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Email");

        myPanel2.setBackground(new java.awt.Color(255, 255, 255));
        myPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        txtEmail.setBorder(null);

        javax.swing.GroupLayout myPanel2Layout = new javax.swing.GroupLayout(myPanel2);
        myPanel2.setLayout(myPanel2Layout);
        myPanel2Layout.setHorizontalGroup(
            myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );
        myPanel2Layout.setVerticalGroup(
            myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout myPanelBoxShadow2Layout = new javax.swing.GroupLayout(myPanelBoxShadow2);
        myPanelBoxShadow2.setLayout(myPanelBoxShadow2Layout);
        myPanelBoxShadow2Layout.setHorizontalGroup(
            myPanelBoxShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelBoxShadow2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(myPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        myPanelBoxShadow2Layout.setVerticalGroup(
            myPanelBoxShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(myPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        myPanelBoxShadow3.setBackground(new java.awt.Color(255, 255, 255));
        myPanelBoxShadow3.setShadowSize(3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("OTP");

        myPanel3.setBackground(new java.awt.Color(255, 255, 255));
        myPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        txtOTP.setBorder(null);

        javax.swing.GroupLayout myPanel3Layout = new javax.swing.GroupLayout(myPanel3);
        myPanel3.setLayout(myPanel3Layout);
        myPanel3Layout.setHorizontalGroup(
            myPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        myPanel3Layout.setVerticalGroup(
            myPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtOTP, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout myPanelBoxShadow3Layout = new javax.swing.GroupLayout(myPanelBoxShadow3);
        myPanelBoxShadow3.setLayout(myPanelBoxShadow3Layout);
        myPanelBoxShadow3Layout.setHorizontalGroup(
            myPanelBoxShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(myPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        myPanelBoxShadow3Layout.setVerticalGroup(
            myPanelBoxShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(myPanelBoxShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(myPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        btnSendOTP.setForeground(new java.awt.Color(255, 255, 255));
        btnSendOTP.setText("SendOTP");
        btnSendOTP.setBorderColor(new java.awt.Color(102, 102, 102));
        btnSendOTP.setColor(new java.awt.Color(102, 102, 102));
        btnSendOTP.setColorClick(new java.awt.Color(51, 51, 51));
        btnSendOTP.setColorOver(new java.awt.Color(153, 153, 153));
        btnSendOTP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSendOTP.setRadius(15);
        btnSendOTP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSendOTPMouseClicked(evt);
            }
        });

        pnlNewPassword.setBackground(new java.awt.Color(255, 255, 255));
        pnlNewPassword.setShadowSize(3);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("New password");

        myPanel4.setBackground(new java.awt.Color(255, 255, 255));
        myPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        txtNewPassWord.setBorder(null);

        javax.swing.GroupLayout myPanel4Layout = new javax.swing.GroupLayout(myPanel4);
        myPanel4.setLayout(myPanel4Layout);
        myPanel4Layout.setHorizontalGroup(
            myPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNewPassWord, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );
        myPanel4Layout.setVerticalGroup(
            myPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNewPassWord, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlNewPasswordLayout = new javax.swing.GroupLayout(pnlNewPassword);
        pnlNewPassword.setLayout(pnlNewPasswordLayout);
        pnlNewPasswordLayout.setHorizontalGroup(
            pnlNewPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewPasswordLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNewPasswordLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(myPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        pnlNewPasswordLayout.setVerticalGroup(
            pnlNewPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNewPasswordLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(myPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Confirm");
        btnConfirm.setBorderColor(new java.awt.Color(102, 102, 102));
        btnConfirm.setColor(new java.awt.Color(102, 102, 102));
        btnConfirm.setColorClick(new java.awt.Color(51, 51, 51));
        btnConfirm.setColorOver(new java.awt.Color(153, 153, 153));
        btnConfirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConfirm.setRadius(15);
        btnConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmMouseClicked(evt);
            }
        });

        btnVerify.setForeground(new java.awt.Color(255, 255, 255));
        btnVerify.setText("Verify");
        btnVerify.setBorderColor(new java.awt.Color(102, 102, 102));
        btnVerify.setColor(new java.awt.Color(102, 102, 102));
        btnVerify.setColorClick(new java.awt.Color(51, 51, 51));
        btnVerify.setColorOver(new java.awt.Color(153, 153, 153));
        btnVerify.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVerify.setRadius(15);
        btnVerify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerifyClick(evt);
            }
        });

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(lblMain))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(myPanelBoxShadow2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(myPanelBoxShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlMainLayout.createSequentialGroup()
                                        .addComponent(btnSendOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(myPanelBoxShadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnConfirm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblMain, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(myPanelBoxShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myPanelBoxShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSendOTP, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myPanelBoxShadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerifyClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerifyClick
        // TODO add your handling code here:
            
        // Xử lý việc xác nhận otp

        
        if(txtOTP.getText().equals(code)){
            this.isVerify = true;
        }
        
        if(this.isVerify) {
            for (Component c : this.pnlMain.getComponents()) {
                c.setVisible(false);
            }
            this.lblMain.setVisible(true);
            this.pnlNewPassword.setVisible(true);
            this.btnConfirm.setVisible(true);
        }
        else {
            MsgBox.alert(this, "OTP is not valid");
        }
    }//GEN-LAST:event_btnVerifyClick

    private void btnSendOTPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendOTPMouseClicked
        // TODO add your handling code here:
        verify();
    }//GEN-LAST:event_btnSendOTPMouseClicked

    private void btnConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseClicked
        // TODO add your handling code here:
        doiMK();
    }//GEN-LAST:event_btnConfirmMouseClicked

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
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ResetPassword dialog = new ResetPassword(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.qlchtl.views.MyControls.MyButton btnConfirm;
    private com.qlchtl.views.MyControls.MyButton btnSendOTP;
    private com.qlchtl.views.MyControls.MyButton btnVerify;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblMain;
    private com.qlchtl.views.MyControls.MyPanel myPanel1;
    private com.qlchtl.views.MyControls.MyPanel myPanel2;
    private com.qlchtl.views.MyControls.MyPanel myPanel3;
    private com.qlchtl.views.MyControls.MyPanel myPanel4;
    private com.qlchtl.views.MyControls.MyPanelBoxShadow myPanelBoxShadow1;
    private com.qlchtl.views.MyControls.MyPanelBoxShadow myPanelBoxShadow2;
    private com.qlchtl.views.MyControls.MyPanelBoxShadow myPanelBoxShadow3;
    private javax.swing.JPanel pnlMain;
    private com.qlchtl.views.MyControls.MyPanelBoxShadow pnlNewPassword;
    private javax.swing.JTextField txtAccount;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNewPassWord;
    private javax.swing.JTextField txtOTP;
    // End of variables declaration//GEN-END:variables

    private String code;
    TaiKhoanDao taiKhoanDao =new  TaiKhoanDao();
    NhanVienDao nhanVienDao = new NhanVienDao();
    private String generateRandomCode() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
    void verify(){
        String matk = txtAccount.getText();
        String email = txtEmail.getText();
        if (matk.isEmpty() || email.isEmpty()) {
            MsgBox.alert(this, "Vui lòng điền đầy đủ thông tin");
        }else{
            TaiKhoan acc = taiKhoanDao.selectByTK(matk);
            if(acc == null) {
                MsgBox.alert(this, "Sai tên đăng nhập!");
            }else if(!acc.getMaTaiKhoan().equals(matk) || !acc.getTaiKhoan().equals(email)){
                MsgBox.alert(this, "Tên đăng nhập hoặc email chưa chính xác!");
            }else{
                String manv = acc.getMaNhanVien();
                if(manv == null || manv.isEmpty()) {
                    MsgBox.alert(this, "Mã nhân viên này không tồn tại");
                }
                else {
                    NhanVien nhanVien = nhanVienDao.selectById(manv);

                    if(nhanVien == null) {
                        MsgBox.alert(this, "Tài khoản nhân viên không tồn tại!");
                    } else if(!nhanVien.isTrangThai()) {
                        MsgBox.alert(this, "Tài khoản nhân viên đã bị khóa, vui lòng liên hệ admin biết thêm thông tin!");
                    } else {
                        code = generateRandomCode();
                        RandomCodeEmailSender.sendRandomCode(email, code);
                        MsgBox.alert(this, "Banj vui lòng kiểm tra email để nhập code");
                    }
            }

        }
    }

    }

    TaiKhoan getFromTaiKhoan() {
        TaiKhoan sp = new TaiKhoan();
        sp.setMaTaiKhoan(txtAccount.getText());
        sp.setMatKhau(txtNewPassWord.getText());
        return sp;
    }
    void doiMK(){
        TaiKhoan model = getFromTaiKhoan();
        try {
            taiKhoanDao.updateMK(model);
            MsgBox.alert(this, "Đổi mật khẩu thành công!");
            dispose();
        } catch (Exception e) {
            MsgBox.alert(this, "Đổi mật khẩu thất bại!");
        }

    }

}
