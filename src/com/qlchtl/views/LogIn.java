/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.qlchtl.views;

import com.qlchtl.dao.NhanVienDao;
import com.qlchtl.dao.TaiKhoanDao;
import com.qlchtl.entity.NhanVien;
import com.qlchtl.entity.TaiKhoan;
import com.qlchtl.utils.MsgBox;
import java.awt.Color;
import javax.swing.JFrame;
/**
 *
 * @author Dell
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public static String MaNV;
    public LogIn() {
    initComponents();
    setLocationRelativeTo(null);
    txtPassword.setText(""); // Đặt nội dung của JPasswordField thành chuỗi rỗng
    }
    
    private boolean passwordVisible = false;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        myPanel1 = new com.qlchtl.views.MyControls.MyPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        myPanel2 = new com.qlchtl.views.MyControls.MyPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAccount = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        myPanel3 = new com.qlchtl.views.MyControls.MyPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnShowPass = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLoggin = new com.qlchtl.views.MyControls.MyButton();
        lblForgetPass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(47, 41, 91));
        jPanel2.setPreferredSize(new java.awt.Dimension(840, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myPanel1.setBackground(new java.awt.Color(241, 247, 254));
        myPanel1.setPreferredSize(new java.awt.Dimension(293, 501));
        myPanel1.setRoundBottomLeft(10);
        myPanel1.setRoundBottomRight(10);
        myPanel1.setRoundTopLeft(10);
        myPanel1.setRoundTopRight(10);
        myPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchtl/image/quan-ly-cua-hang.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 0, 560, 370));

        jPanel5.setBackground(new java.awt.Color(131, 172, 254));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("QUẢN LÝ CỬA HÀNG TIỆN LỢI");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 390, 80));

        myPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 390, 450));

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabel1.setText("LOG IN");
        myPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 120, 50));

        myPanel2.setBackground(new java.awt.Color(255, 255, 255));
        myPanel2.setRoundBottomLeft(30);
        myPanel2.setRoundBottomRight(30);
        myPanel2.setRoundTopLeft(30);
        myPanel2.setRoundTopRight(30);
        myPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jLabel2.setText("Email/Account");
        myPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 111, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchtl/image/mail.png"))); // NOI18N
        myPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtAccount.setBorder(null);
        myPanel2.add(txtAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 170, 30));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        myPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 170, 2));
        jPanel4.getAccessibleContext().setAccessibleName("");

        myPanel1.add(myPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 260, 80));

        myPanel3.setBackground(new java.awt.Color(255, 255, 255));
        myPanel3.setRoundBottomLeft(30);
        myPanel3.setRoundBottomRight(30);
        myPanel3.setRoundTopLeft(30);
        myPanel3.setRoundTopRight(30);
        myPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        jLabel4.setText("Password");
        myPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchtl/image/padlock.png"))); // NOI18N
        myPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setName(""); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(170, 2));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        myPanel3.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 67, -1, -1));

        btnShowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchtl/image/view.png"))); // NOI18N
        btnShowPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShowPassMouseClicked(evt);
            }
        });
        myPanel3.add(btnShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        txtPassword.setText("jPasswordField1");
        txtPassword.setBorder(null);
        myPanel3.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 170, 30));

        myPanel1.add(myPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 260, 80));

        btnLoggin.setBorder(null);
        btnLoggin.setText("Login now");
        btnLoggin.setBorderColor(new java.awt.Color(62, 70, 132));
        btnLoggin.setColorClick(new java.awt.Color(62, 85, 199));
        btnLoggin.setColorOver(new java.awt.Color(102, 78, 185));
        btnLoggin.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 14)); // NOI18N
        btnLoggin.setRadius(50);
        btnLoggin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogginAncestorMoved(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogginMouseExited(evt);
            }
        });
        btnLoggin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogginActionPerformed(evt);
            }
        });
        myPanel1.add(btnLoggin, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 200, 50));

        lblForgetPass.setBackground(new java.awt.Color(47, 41, 91));
        lblForgetPass.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblForgetPass.setForeground(new java.awt.Color(47, 41, 91));
        lblForgetPass.setText("Forgot password");
        lblForgetPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblForgetPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgetPassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblForgetPassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblForgetPassMouseExited(evt);
            }
        });
        myPanel1.add(lblForgetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 100, -1));

        jPanel2.add(myPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 720, 470));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 910, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogginAncestorMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogginAncestorMoved
        // TODO add your handling code here:
        btnLoggin.setForeground(Color.white);
    }//GEN-LAST:event_btnLogginAncestorMoved

    private void btnLogginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogginMouseExited
        // TODO add your handling code here:
        btnLoggin.setForeground(Color.black);
    }//GEN-LAST:event_btnLogginMouseExited

    private void lblForgetPassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgetPassMouseEntered
        // TODO add your handling code here:
        lblForgetPass.setForeground(Color.red);
    }//GEN-LAST:event_lblForgetPassMouseEntered

    private void lblForgetPassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgetPassMouseExited
        // TODO add your handling code here:
        lblForgetPass.setForeground(new Color(47,41,91));
    }//GEN-LAST:event_lblForgetPassMouseExited

    private void btnLogginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogginMouseClicked
        // TODO add your handling code here:

         dangNhap();

    }//GEN-LAST:event_btnLogginMouseClicked

    private void btnShowPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShowPassMouseClicked
        if (passwordVisible) {
            txtPassword.setEchoChar('*'); 
            passwordVisible = false;
            btnShowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchtl/image/view.png")));
        } else {
            txtPassword.setEchoChar((char) 0); 
            passwordVisible = true;
            btnShowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchtl/image/hide.png")));
        }
    }//GEN-LAST:event_btnShowPassMouseClicked

    private void btnLogginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogginActionPerformed

    private void lblForgetPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgetPassMouseClicked
        // TODO add your handling code here:
        ResetPassword rsp = new ResetPassword(this, true);
        rsp.setVisible(true);
    }//GEN-LAST:event_lblForgetPassMouseClicked

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }
     TaiKhoanDao taiKhoanDao = new TaiKhoanDao();
     NhanVienDao nhanVienDao = new NhanVienDao();


    void dangNhap() {
        String taikhoan = txtAccount.getText();
        String matKhau = new String(txtPassword.getPassword());

        if (taikhoan.isEmpty() || matKhau.isEmpty()) {
            MsgBox.alert(this, "Vui lòng nhập tài khoản và mật khẩu.");
        } else {
            TaiKhoan acc = taiKhoanDao.selectById(taikhoan);

            if(acc == null) {
                MsgBox.alert(this, "Sai tên đăng nhập!");
            } else {
                String manv = acc.getMaNhanVien();

                if(manv == null || manv.isEmpty()) {
                    MsgBox.alert(this, "Mã nhân viên này không tồn tại");
                } else {
                    NhanVien nhanVien = nhanVienDao.selectById(manv);

                    if(!matKhau.equals(acc.getMatKhau())) {
                        MsgBox.alert(this, "Sai mật khẩu!");
                    } else if(nhanVien == null) {
                        MsgBox.alert(this, "Tài khoản nhân viên không tồn tại!");
                    } else if(!nhanVien.isTrangThai()) {
                        MsgBox.alert(this, "Tài khoản nhân viên đã bị khóa, vui lòng liên hệ admin biết thêm thông tin!");
                    } else if(acc.getIsRole() == 1) {
                        MaNV=nhanVien.getMaNV();
                        this.txtAccount.setText("");
                        this.txtPassword.setText("");
                        this.dispose();
                        System.out.println("Login: "+ acc.getIsRole());
                        FormMain formMenuAdmin = new FormMain(this,acc.getIsRole());
                        formMenuAdmin.setVisible(true);
                    } else {
                        MaNV=nhanVien.getMaNV();
                        this.dispose();
                        System.out.println("Login: "+ acc.getIsRole());
                        FormMain formMenuAdmin = new FormMain(this,acc.getIsRole());
                        formMenuAdmin.setVisible(true);
                        this.txtAccount.setText("");
                        this.txtPassword.setText("");
                    }
                }
            }
        }
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.qlchtl.views.MyControls.MyButton btnLoggin;
    private javax.swing.JLabel btnShowPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblForgetPass;
    private com.qlchtl.views.MyControls.MyPanel myPanel1;
    private com.qlchtl.views.MyControls.MyPanel myPanel2;
    private com.qlchtl.views.MyControls.MyPanel myPanel3;
    private javax.swing.JTextField txtAccount;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
    public static String getMaNV()
    {
        return MaNV;
    }
}
