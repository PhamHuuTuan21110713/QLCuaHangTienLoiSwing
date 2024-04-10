/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.qlchtl.views;

import com.qlchtl.dao.NhaCungCapDao;
import com.qlchtl.dao.SanPhamDao;
import com.qlchtl.entity.ChiTietKhuyenMai;
import com.qlchtl.entity.Kho;
import com.qlchtl.entity.NhaCungCap;
import com.qlchtl.entity.SanPham;
import com.qlchtl.utils.MsgBox;
import com.qlchtl.utils.XImage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Dell
 */
public class AddProduct extends javax.swing.JFrame {

    /**
     * Creates new form AddProduct
     */
    public AddProduct() {
        fileChooser = new javax.swing.JFileChooser();
        initComponents();
        this.setLocationRelativeTo(null);
    }


    final String[] firstPromotionName = {null};
    NhaCungCapDao nhaCungCapDao = new NhaCungCapDao();
    List<NhaCungCap> listNCC = nhaCungCapDao.selectAll();


    SanPhamDao sanPhamDao = new SanPhamDao();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        fileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        myPanelBoxShadow1 = new com.qlchtl.views.MyControls.MyPanelBoxShadow();
        lblImageProd = new javax.swing.JLabel();
        btnAddImage = new com.qlchtl.views.MyControls.MyButton();
        btnClearImage = new com.qlchtl.views.MyControls.MyButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodeProd = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNameProd = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtManuFacPlaceProd = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        PriceProd = new javax.swing.JLabel();
        txtPriceProd = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        txtInputDateProd = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        PriceProd1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnCancel = new com.qlchtl.views.MyControls.MyButton();
        btnConfirm1 = new com.qlchtl.views.MyControls.MyButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtQuantityProd = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(585, 660));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myPanelBoxShadow1.setBackground(new java.awt.Color(24, 145, 143));
        myPanelBoxShadow1.setShadowColor(new java.awt.Color(24, 145, 143));
        myPanelBoxShadow1.setShadowOpacity(0.8F);

        lblImageProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        lblImageProd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnAddImage.setBackground(new java.awt.Color(24, 145, 143));
        btnAddImage.setForeground(new java.awt.Color(255, 255, 255));
        btnAddImage.setText("Add Image");
        btnAddImage.setBorderColor(new java.awt.Color(255, 255, 255));
        btnAddImage.setColor(new java.awt.Color(24, 145, 143));
        btnAddImage.setColorClick(new java.awt.Color(11, 143, 141));
        btnAddImage.setColorOver(new java.awt.Color(89, 179, 177));
        btnAddImage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddImage.setRadius(20);
        btnAddImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddImageActionPerformed(evt);
            }
        });

        btnClearImage.setForeground(new java.awt.Color(255, 255, 255));
        btnClearImage.setText("Clear Image");
        btnClearImage.setBorderColor(new java.awt.Color(255, 255, 255));
        btnClearImage.setColor(new java.awt.Color(24, 145, 143));
        btnClearImage.setColorClick(new java.awt.Color(11, 143, 141));
        btnClearImage.setColorOver(new java.awt.Color(89, 179, 177));
        btnClearImage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClearImage.setRadius(20);

        javax.swing.GroupLayout myPanelBoxShadow1Layout = new javax.swing.GroupLayout(myPanelBoxShadow1);
        myPanelBoxShadow1.setLayout(myPanelBoxShadow1Layout);
        myPanelBoxShadow1Layout.setHorizontalGroup(
            myPanelBoxShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(myPanelBoxShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(myPanelBoxShadow1Layout.createSequentialGroup()
                        .addComponent(btnClearImage, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddImage, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblImageProd, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        myPanelBoxShadow1Layout.setVerticalGroup(
            myPanelBoxShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblImageProd, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(myPanelBoxShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddImage, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(btnClearImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jPanel1.add(myPanelBoxShadow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 440));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Code");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 47, -1));

        txtCodeProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCodeProd.setForeground(new java.awt.Color(102, 102, 102));
        txtCodeProd.setBorder(null);
        jPanel2.add(txtCodeProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 188, 31));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(185, 2));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 200, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(24, 145, 143));
        jLabel1.setText("Add Product");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 240, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Name");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 47, -1));

        txtNameProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNameProd.setForeground(new java.awt.Color(102, 102, 102));
        txtNameProd.setBorder(null);
        jPanel4.add(txtNameProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 188, 31));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setForeground(new java.awt.Color(102, 102, 102));
        jPanel5.setPreferredSize(new java.awt.Dimension(185, 2));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 200, 60));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Manufacturing place");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, -1));

        txtManuFacPlaceProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtManuFacPlaceProd.setForeground(new java.awt.Color(102, 102, 102));
        txtManuFacPlaceProd.setBorder(null);
        jPanel6.add(txtManuFacPlaceProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 188, 31));

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel7.setForeground(new java.awt.Color(102, 102, 102));
        jPanel7.setPreferredSize(new java.awt.Dimension(185, 2));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 200, 60));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PriceProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PriceProd.setText("Price $");
        jPanel10.add(PriceProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 47, -1));

        txtPriceProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPriceProd.setForeground(new java.awt.Color(102, 102, 102));
        txtPriceProd.setBorder(null);
        jPanel10.add(txtPriceProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 188, 31));

        jPanel11.setBackground(new java.awt.Color(102, 102, 102));
        jPanel11.setForeground(new java.awt.Color(102, 102, 102));
        jPanel11.setPreferredSize(new java.awt.Dimension(185, 2));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 200, 60));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Input date");
        jPanel12.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, -1));

        jPanel13.setBackground(new java.awt.Color(102, 102, 102));
        jPanel13.setForeground(new java.awt.Color(102, 102, 102));
        jPanel13.setPreferredSize(new java.awt.Dimension(185, 2));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        txtInputDateProd.setBorder(null);
        jPanel12.add(txtInputDateProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 190, 30));

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 200, 60));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PriceProd1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PriceProd1.setText("Supplier code");
        jPanel14.add(PriceProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, -1));



        Set<String> uniquePromotionNames = new HashSet<>();
        for (NhaCungCap promotion : listNCC) {
            uniquePromotionNames.add(promotion.getMaNCC());
        }
        String[] promotionNamesWithNone = uniquePromotionNames.toArray(new String[0]);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(promotionNamesWithNone));


        if (promotionNamesWithNone.length > 0) {
            firstPromotionName[0] = promotionNamesWithNone[0];
        }
        jComboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) jComboBox1.getSelectedItem();
                firstPromotionName[0] = selectedItem;
            }
        });




        jComboBox1.setBorder(null);
        jPanel14.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 30));

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 200, 60));

        btnCancel.setForeground(new java.awt.Color(24, 145, 143));
        btnCancel.setText("Cancel");
        btnCancel.setBorderColor(new java.awt.Color(24, 145, 143));
        btnCancel.setColorClick(new java.awt.Color(153, 153, 153));
        btnCancel.setColorOver(new java.awt.Color(204, 204, 204));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancel.setRadius(20);
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 130, 50));

        btnConfirm1.setForeground(new java.awt.Color(24, 145, 143));
        btnConfirm1.setText("Confirm");
        btnConfirm1.setBorderColor(new java.awt.Color(24, 145, 143));
        btnConfirm1.setColorClick(new java.awt.Color(153, 153, 153));
        btnConfirm1.setColorOver(new java.awt.Color(204, 204, 204));
        btnConfirm1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConfirm1.setRadius(20);
        btnConfirm1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirm1MouseClicked(evt);
            }
        });
        jPanel1.add(btnConfirm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 130, 50));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Quantity");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        txtQuantityProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtQuantityProd.setForeground(new java.awt.Color(102, 102, 102));
        txtQuantityProd.setBorder(null);
        jPanel8.add(txtQuantityProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 188, 31));

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));
        jPanel9.setForeground(new java.awt.Color(102, 102, 102));
        jPanel9.setPreferredSize(new java.awt.Dimension(185, 2));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 200, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddImageActionPerformed
        // TODO add your handling code here:
        chonAnh();
    }//GEN-LAST:event_btnAddImageActionPerformed

    private void btnConfirm1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirm1MouseClicked
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_btnConfirm1MouseClicked

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
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PriceProd;
    private javax.swing.JLabel PriceProd1;
    private com.qlchtl.views.MyControls.MyButton btnAddImage;
    private com.qlchtl.views.MyControls.MyButton btnCancel;
    private com.qlchtl.views.MyControls.MyButton btnClearImage;
    private com.qlchtl.views.MyControls.MyButton btnConfirm1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblImageProd;
    private com.qlchtl.views.MyControls.MyPanelBoxShadow myPanelBoxShadow1;
    private javax.swing.JTextField txtCodeProd;
    private javax.swing.JTextField txtInputDateProd;
    private javax.swing.JTextField txtManuFacPlaceProd;
    private javax.swing.JTextField txtNameProd;
    private javax.swing.JTextField txtPriceProd;

    private javax.swing.JFileChooser fileChooser;


    private javax.swing.JTextField txtQuantityProd;

    // End of variables declaration//GEN-END:variables

    String img;

    void chonAnh() {
        if(fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            XImage.save(file); // lưu hình vào thư mục logos
            ImageIcon icon = XImage.read(file.getName());
            java.awt.Image originalImage = icon.getImage();
            java.awt.Image scaledImage = originalImage.getScaledInstance(270, 270, java.awt.Image.SCALE_SMOOTH);
            javax.swing.ImageIcon scaledImageIcon = new javax.swing.ImageIcon(scaledImage);
            lblImageProd.setIcon(scaledImageIcon);
            lblImageProd.setToolTipText(file.getName());
            img = file.getName();
        }
    }


    SanPham getFormSanPham() {
        SanPham sp = new SanPham();
        sp.setMaSP(txtCodeProd.getText());
        sp.setTenSP(txtNameProd.getText());
        sp.setNoiSanXuat(txtManuFacPlaceProd.getText());
        sp.setTrangThai("1");
        sp.setTienGoc(txtPriceProd.getText());
        sp.setTienThanhToan(txtPriceProd.getText());
        sp.setNgayNhapHang(LocalDate.now());
        sp.setMaNCC(firstPromotionName[0]);
        sp.setImg(img);
        return sp;
    }

    void resetText(){
        txtCodeProd.setText("");
        txtNameProd.setText("");
        txtManuFacPlaceProd.setText("");
        txtPriceProd.setText("");
        txtInputDateProd.setText("");
        lblImageProd.setText("");
        jComboBox1.setSelectedIndex(0);

    }

    void insert(){
        SanPham modelsp = getFormSanPham();
        try {
            sanPhamDao.insert(modelsp);
            MsgBox.alert(this, "Thêm sản phẩm thành công!");
        }
        catch (Exception e) {
            MsgBox.alert(this, "Thêm sản phẩm thất bại!");
        }
        resetText();
    }
}
