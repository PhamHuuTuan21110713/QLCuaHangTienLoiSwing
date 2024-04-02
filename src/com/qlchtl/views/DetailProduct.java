/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.qlchtl.views;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Dell
 */
public class DetailProduct extends javax.swing.JFrame  {

    /**
     * Creates new form DetailProduct
     */
    private String idProduct;
    public DetailProduct(String idProduct) {
        initComponents();
        this.idProduct = idProduct;
        this.setLocationRelativeTo(null);
        setButton(false);
        setTextField(false);
    }
    
    private void setButton(Boolean state) {
        btnCancelProd.setEnabled(state);
        btnConfirmProduct.setEnabled(state);
    }
    private void setTextField(Boolean state) {
        txtNameProduct.setFocusable(state);
        txtNameProduct.setEditable(state);
        txtCodePrd.setEditable(state);
        txtPlacePrd.setEditable(state);
        txtStatePrd.setEditable(state);
        txtRootPriceProd.setEditable(state);
        txtPricePrd.setEditable(state);
        txtQuantityProd.setEditable(state);
        txtImportDatePrd.setEditable(state);
        txtSupplier.setEditable(state);
        cboCodePromotionProd.setEnabled(state);
        txtStartDayProd.setEditable(state);
        txtEndDayProd.setEditable(state);
        setButton(state);
        if (state) {
            txtNameProduct.setBackground(new Color(240, 240, 240));
            txtCodePrd.setBackground(new Color(240, 240, 240));
            txtPlacePrd.setBackground(new Color(240, 240, 240));
            txtStatePrd.setBackground(new Color(240, 240, 240));
            txtRootPriceProd.setBackground(new Color(240, 240, 240));
            txtPricePrd.setBackground(new Color(240, 240, 240));
            txtQuantityProd.setBackground(new Color(240, 240, 240));
            txtImportDatePrd.setBackground(new Color(240, 240, 240));
            txtSupplier.setBackground(new Color(240, 240, 240));
            txtStartDayProd.setBackground(new Color(255,255,255));
            txtEndDayProd.setBackground(new Color(255,255,255));
            
        } else {
            txtNameProduct.setBackground(new Color(255,255,255));
            txtCodePrd.setBackground(new Color(255,255,255));
            txtPlacePrd.setBackground(new Color(255,255,255));
            txtStatePrd.setBackground(new Color(255,255,255));
            txtRootPriceProd.setBackground(new Color(255,255,255));
            txtPricePrd.setBackground(new Color(255,255,255));
            txtQuantityProd.setBackground(new Color(255,255,255));
            txtImportDatePrd.setBackground(new Color(255,255,255));
            txtSupplier.setBackground(new Color(255,255,255));
            txtStartDayProd.setBackground(new Color(240, 240, 240));
            txtEndDayProd.setBackground(new Color(240, 240, 240));
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNameProduct = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPromotionProd = new javax.swing.JTextField();
        txtCodePrd = new javax.swing.JTextField();
        txtPlacePrd = new javax.swing.JTextField();
        txtStatePrd = new javax.swing.JTextField();
        txtRootPriceProd = new javax.swing.JTextField();
        txtQuantityProd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtImportDatePrd = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSupplier = new javax.swing.JTextField();
        myPanel1 = new com.qlchtl.views.MyControls.MyPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cboCodePromotionProd = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtStartDayProd = new javax.swing.JTextField();
        txtEndDayProd = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtPricePrd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        myPanel2 = new com.qlchtl.views.MyControls.MyPanel();
        btnConfirmProduct = new com.qlchtl.views.MyControls.MyButton();
        btnCancelProd = new com.qlchtl.views.MyControls.MyButton();
        btnUpdateProd = new com.qlchtl.views.MyControls.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtNameProduct.setEditable(false);
        txtNameProduct.setBackground(new java.awt.Color(255, 255, 255));
        txtNameProduct.setColumns(20);
        txtNameProduct.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        txtNameProduct.setForeground(new java.awt.Color(21, 123, 142));
        txtNameProduct.setRows(5);
        txtNameProduct.setText("Headphone version 0.2");
        txtNameProduct.setBorder(null);
        txtNameProduct.setFocusable(false);
        jScrollPane1.setViewportView(txtNameProduct);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 320, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Promotion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 100, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Code");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 60, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Manufacturing place");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 150, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("State");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 50, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Root price");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 80, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Quantity");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 70, -1));

        txtPromotionProd.setEditable(false);
        txtPromotionProd.setBackground(new java.awt.Color(255, 255, 255));
        txtPromotionProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPromotionProd.setForeground(new java.awt.Color(102, 102, 102));
        txtPromotionProd.setText("None");
        txtPromotionProd.setBorder(null);
        txtPromotionProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPromotionProdActionPerformed(evt);
            }
        });
        jPanel1.add(txtPromotionProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 140, 20));

        txtCodePrd.setEditable(false);
        txtCodePrd.setBackground(new java.awt.Color(255, 255, 255));
        txtCodePrd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCodePrd.setForeground(new java.awt.Color(102, 102, 102));
        txtCodePrd.setText("21110713");
        txtCodePrd.setBorder(null);
        jPanel1.add(txtCodePrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 120, 20));

        txtPlacePrd.setEditable(false);
        txtPlacePrd.setBackground(new java.awt.Color(255, 255, 255));
        txtPlacePrd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPlacePrd.setForeground(new java.awt.Color(102, 102, 102));
        txtPlacePrd.setText("Đà Nẵng");
        txtPlacePrd.setBorder(null);
        jPanel1.add(txtPlacePrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 160, 20));

        txtStatePrd.setEditable(false);
        txtStatePrd.setBackground(new java.awt.Color(255, 255, 255));
        txtStatePrd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtStatePrd.setForeground(new java.awt.Color(102, 102, 102));
        txtStatePrd.setText("Còn hàng");
        txtStatePrd.setBorder(null);
        txtStatePrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatePrdActionPerformed(evt);
            }
        });
        jPanel1.add(txtStatePrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 160, 20));

        txtRootPriceProd.setEditable(false);
        txtRootPriceProd.setBackground(new java.awt.Color(255, 255, 255));
        txtRootPriceProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtRootPriceProd.setForeground(new java.awt.Color(102, 102, 102));
        txtRootPriceProd.setText("12.000");
        txtRootPriceProd.setBorder(null);
        txtRootPriceProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRootPriceProdActionPerformed(evt);
            }
        });
        jPanel1.add(txtRootPriceProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 160, 20));

        txtQuantityProd.setEditable(false);
        txtQuantityProd.setBackground(new java.awt.Color(255, 255, 255));
        txtQuantityProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtQuantityProd.setForeground(new java.awt.Color(102, 102, 102));
        txtQuantityProd.setText("10");
        txtQuantityProd.setBorder(null);
        txtQuantityProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityProdActionPerformed(evt);
            }
        });
        jPanel1.add(txtQuantityProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 160, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Import date");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 90, -1));

        txtImportDatePrd.setEditable(false);
        txtImportDatePrd.setBackground(new java.awt.Color(255, 255, 255));
        txtImportDatePrd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtImportDatePrd.setForeground(new java.awt.Color(102, 102, 102));
        txtImportDatePrd.setText("2024/11/20");
        txtImportDatePrd.setBorder(null);
        txtImportDatePrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImportDatePrdActionPerformed(evt);
            }
        });
        jPanel1.add(txtImportDatePrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 160, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Supplier code");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 110, -1));

        txtSupplier.setEditable(false);
        txtSupplier.setBackground(new java.awt.Color(255, 255, 255));
        txtSupplier.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSupplier.setForeground(new java.awt.Color(102, 102, 102));
        txtSupplier.setText("21110713");
        txtSupplier.setBorder(null);
        txtSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSupplierActionPerformed(evt);
            }
        });
        jPanel1.add(txtSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 160, 20));

        myPanel1.setBackground(new java.awt.Color(240, 240, 240));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Add a promotion");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Code program");

        cboCodePromotionProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Start day");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("End day");

        txtStartDayProd.setBackground(new java.awt.Color(240, 240, 240));
        txtStartDayProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtStartDayProd.setForeground(new java.awt.Color(102, 102, 102));
        txtStartDayProd.setText("2024/11/20");
        txtStartDayProd.setBorder(null);

        txtEndDayProd.setBackground(new java.awt.Color(240, 240, 240));
        txtEndDayProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEndDayProd.setForeground(new java.awt.Color(102, 102, 102));
        txtEndDayProd.setText("2024/11/20");
        txtEndDayProd.setBorder(null);

        javax.swing.GroupLayout myPanel1Layout = new javax.swing.GroupLayout(myPanel1);
        myPanel1.setLayout(myPanel1Layout);
        myPanel1Layout.setHorizontalGroup(
            myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel1Layout.createSequentialGroup()
                .addGroup(myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel10))
                    .addGroup(myPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtStartDayProd)
                            .addComponent(txtEndDayProd, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(cboCodePromotionProd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        myPanel1Layout.setVerticalGroup(
            myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cboCodePromotionProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtStartDayProd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtEndDayProd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(myPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 400, 170));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Price");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 70, -1));

        txtPricePrd.setEditable(false);
        txtPricePrd.setBackground(new java.awt.Color(255, 255, 255));
        txtPricePrd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPricePrd.setForeground(new java.awt.Color(102, 102, 102));
        txtPricePrd.setText("12.000");
        txtPricePrd.setBorder(null);
        txtPricePrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPricePrdActionPerformed(evt);
            }
        });
        jPanel1.add(txtPricePrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 160, 20));

        jLabel1.setBackground(new java.awt.Color(109, 216, 234));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchtl/image/prod_prf.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 320, 316));

        myPanel2.setBackground(new java.awt.Color(240, 240, 240));

        btnConfirmProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmProduct.setText("Confirm");
        btnConfirmProduct.setBorderColor(new java.awt.Color(121, 181, 164));
        btnConfirmProduct.setColor(new java.awt.Color(121, 181, 164));
        btnConfirmProduct.setColorClick(new java.awt.Color(60, 171, 139));
        btnConfirmProduct.setColorOver(new java.awt.Color(167, 214, 201));
        btnConfirmProduct.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConfirmProduct.setRadius(15);
        btnConfirmProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmClick(evt);
            }
        });

        btnCancelProd.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelProd.setText("Cancel");
        btnCancelProd.setBorderColor(new java.awt.Color(219, 96, 96));
        btnCancelProd.setColor(new java.awt.Color(219, 96, 96));
        btnCancelProd.setColorClick(new java.awt.Color(199, 48, 48));
        btnCancelProd.setColorOver(new java.awt.Color(237, 133, 133));
        btnCancelProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelProd.setRadius(15);
        btnCancelProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelClick(evt);
            }
        });

        javax.swing.GroupLayout myPanel2Layout = new javax.swing.GroupLayout(myPanel2);
        myPanel2.setLayout(myPanel2Layout);
        myPanel2Layout.setHorizontalGroup(
            myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnCancelProd, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnConfirmProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        myPanel2Layout.setVerticalGroup(
            myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConfirmProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnCancelProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.add(myPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 350, 110));

        btnUpdateProd.setText("Update Information");
        btnUpdateProd.setColorOver(new java.awt.Color(167, 214, 201));
        btnUpdateProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdateProd.setRadius(10);
        btnUpdateProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateClick(evt);
            }
        });
        jPanel1.add(btnUpdateProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 150, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPromotionProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPromotionProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPromotionProdActionPerformed

    private void txtStatePrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatePrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatePrdActionPerformed

    private void txtRootPriceProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRootPriceProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRootPriceProdActionPerformed

    private void txtQuantityProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityProdActionPerformed

    private void txtImportDatePrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImportDatePrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImportDatePrdActionPerformed

    private void txtSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSupplierActionPerformed

    private void txtPricePrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPricePrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPricePrdActionPerformed

    private void UpdateClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateClick
        // TODO add your handling code here:
        setButton(true);
        setTextField(true);
    }//GEN-LAST:event_UpdateClick

    private void CancelClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelClick
        // TODO add your handling code here:
        setButton(false);
        setTextField(false);
    }//GEN-LAST:event_CancelClick

    private void ConfirmClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmClick
        // TODO add your handling code here:
        setButton(false);
        setTextField(false);
    }//GEN-LAST:event_ConfirmClick

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
            java.util.logging.Logger.getLogger(DetailProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailProduct("hihi").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.qlchtl.views.MyControls.MyButton btnCancelProd;
    private com.qlchtl.views.MyControls.MyButton btnConfirmProduct;
    private com.qlchtl.views.MyControls.MyButton btnUpdateProd;
    private javax.swing.JComboBox<String> cboCodePromotionProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane1;
    private com.qlchtl.views.MyControls.MyPanel myPanel1;
    private com.qlchtl.views.MyControls.MyPanel myPanel2;
    private javax.swing.JTextField txtCodePrd;
    private javax.swing.JTextField txtEndDayProd;
    private javax.swing.JTextField txtImportDatePrd;
    private javax.swing.JTextArea txtNameProduct;
    private javax.swing.JTextField txtPlacePrd;
    private javax.swing.JTextField txtPricePrd;
    private javax.swing.JTextField txtPromotionProd;
    private javax.swing.JTextField txtQuantityProd;
    private javax.swing.JTextField txtRootPriceProd;
    private javax.swing.JTextField txtStartDayProd;
    private javax.swing.JTextField txtStatePrd;
    private javax.swing.JTextField txtSupplier;
    // End of variables declaration//GEN-END:variables
}
