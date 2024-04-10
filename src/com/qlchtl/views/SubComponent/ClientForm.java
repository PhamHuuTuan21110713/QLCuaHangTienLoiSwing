/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.qlchtl.views.SubComponent;

import com.qlchtl.views.FormMain;
import com.qlchtl.views.MyControls.MyTable;
import java.awt.Dimension;
import javax.swing.SwingUtilities;

/**
 *
 * @author Dell
 */
public class ClientForm extends javax.swing.JPanel {

    /**
     * Creates new form ClientForm
     */
    private Boolean isOpenButton = true;
    private FormMain parentForm;
    public ClientForm(FormMain parentForm) {
        initComponents();
        this.parentForm = parentForm;
         MyTable.apply(scpClient, MyTable.TableType.DEFAULT);
         pnlBtnAdd.setVisible(false);
         pnlBtnUpdate.setVisible(false);
         pnlBtnDelete.setVisible(false);
         lblCreate.setVisible(false);
         lblDelete.setVisible(false);
         lblUpdate.setVisible(false);
         btnConfirm.setVisible(false);
         btnCancel.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodeClientFound = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNameClientFound = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtPhoneClientFound = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtStoredScore = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtUsedScore = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCurrentScore = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        pnlBtnUpdate = new com.qlchtl.views.MyControls.MyPanelBoxShadow();
        lblBtnUpdate = new javax.swing.JLabel();
        pnlBtnDelete = new com.qlchtl.views.MyControls.MyPanelBoxShadow();
        lblBtnDelete = new javax.swing.JLabel();
        pnlBtnAdd = new com.qlchtl.views.MyControls.MyPanelBoxShadow();
        lblBtnAdd = new javax.swing.JLabel();
        pnlBtnShowMoreOption = new com.qlchtl.views.MyControls.MyPanelBoxShadow();
        lblBtnShowMoreOption = new javax.swing.JLabel();
        scpClient = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblCreate = new javax.swing.JLabel();
        lblDelete = new javax.swing.JLabel();
        lblUpdate = new javax.swing.JLabel();
        btnConfirm = new com.qlchtl.views.MyControls.MyButton();
        btnCancel = new com.qlchtl.views.MyControls.MyButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(900, 700));
        setMinimumSize(new java.awt.Dimension(900, 700));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(900, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Client Information");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(796, 4));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 796, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Code");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 68, -1));

        txtCodeClientFound.setBorder(null);
        jPanel3.add(txtCodeClientFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 200, 30));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 200, 2));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Name");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 68, -1));

        txtNameClientFound.setBorder(null);
        jPanel5.add(txtNameClientFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 200, 30));

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 200, 2));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Phone Number");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, -1));

        txtPhoneClientFound.setBorder(null);
        jPanel7.add(txtPhoneClientFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 200, 30));

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 200, 2));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Stored Score");
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, -1));

        txtStoredScore.setBorder(null);
        jPanel9.add(txtStoredScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 200, 30));

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 200, 2));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Used Score");
        jLabel6.setToolTipText("");
        jPanel11.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, -1));

        txtUsedScore.setBorder(null);
        jPanel11.add(txtUsedScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 200, 30));

        jPanel12.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 200, 2));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Current Score");
        jPanel13.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, -1));

        txtCurrentScore.setBorder(null);
        jPanel13.add(txtCurrentScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 200, 30));

        jPanel14.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 200, 2));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBtnUpdate.setBackground(new java.awt.Color(153, 153, 153));
        pnlBtnUpdate.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlBtnUpdate.setShadowColor(new java.awt.Color(153, 153, 153));
        pnlBtnUpdate.setShadowOpacity(0.8F);
        pnlBtnUpdate.setShadowSize(3);

        lblBtnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBtnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnUpdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnUpdate.setText("U");
        lblBtnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlBtnUpdateLayout = new javax.swing.GroupLayout(pnlBtnUpdate);
        pnlBtnUpdate.setLayout(pnlBtnUpdateLayout);
        pnlBtnUpdateLayout.setHorizontalGroup(
            pnlBtnUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBtnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        pnlBtnUpdateLayout.setVerticalGroup(
            pnlBtnUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBtnUpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBtnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel15.add(pnlBtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        pnlBtnDelete.setBackground(new java.awt.Color(153, 153, 153));
        pnlBtnDelete.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlBtnDelete.setShadowColor(new java.awt.Color(153, 153, 153));
        pnlBtnDelete.setShadowOpacity(0.8F);
        pnlBtnDelete.setShadowSize(3);

        lblBtnDelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblBtnDelete.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnDelete.setText("-");
        lblBtnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlBtnDeleteLayout = new javax.swing.GroupLayout(pnlBtnDelete);
        pnlBtnDelete.setLayout(pnlBtnDeleteLayout);
        pnlBtnDeleteLayout.setHorizontalGroup(
            pnlBtnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBtnDeleteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlBtnDeleteLayout.setVerticalGroup(
            pnlBtnDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBtnDeleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBtnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel15.add(pnlBtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        pnlBtnAdd.setBackground(new java.awt.Color(153, 153, 153));
        pnlBtnAdd.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlBtnAdd.setShadowColor(new java.awt.Color(153, 153, 153));
        pnlBtnAdd.setShadowOpacity(0.8F);
        pnlBtnAdd.setShadowSize(3);
        pnlBtnAdd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBtnAdd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblBtnAdd.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnAdd.setText("+");
        lblBtnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlBtnAdd.add(lblBtnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 30));

        jPanel15.add(pnlBtnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        pnlBtnShowMoreOption.setBackground(new java.awt.Color(153, 153, 153));
        pnlBtnShowMoreOption.setPreferredSize(new java.awt.Dimension(50, 50));
        pnlBtnShowMoreOption.setShadowColor(new java.awt.Color(153, 153, 153));
        pnlBtnShowMoreOption.setShadowOpacity(0.8F);
        pnlBtnShowMoreOption.setShadowSize(3);
        pnlBtnShowMoreOption.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowMoreOptionClick(evt);
            }
        });
        pnlBtnShowMoreOption.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBtnShowMoreOption.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblBtnShowMoreOption.setForeground(new java.awt.Color(255, 255, 255));
        lblBtnShowMoreOption.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBtnShowMoreOption.setText("...");
        lblBtnShowMoreOption.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBtnShowMoreOption.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowMoreOptionClick(evt);
            }
        });
        pnlBtnShowMoreOption.add(lblBtnShowMoreOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 50, 40));

        jPanel15.add(pnlBtnShowMoreOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scpClient.setViewportView(jTable1);

        lblCreate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCreate.setForeground(new java.awt.Color(102, 102, 102));
        lblCreate.setText("Create");

        lblDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDelete.setForeground(new java.awt.Color(102, 102, 102));
        lblDelete.setText("Delete");

        lblUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUpdate.setForeground(new java.awt.Color(102, 102, 102));
        lblUpdate.setText("Update");

        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Confirm");
        btnConfirm.setBorderColor(new java.awt.Color(153, 153, 153));
        btnConfirm.setColor(new java.awt.Color(153, 153, 153));
        btnConfirm.setColorClick(new java.awt.Color(153, 153, 153));
        btnConfirm.setColorOver(new java.awt.Color(204, 204, 204));
        btnConfirm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConfirm.setRadius(20);

        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.setBorderColor(new java.awt.Color(153, 153, 153));
        btnCancel.setColor(new java.awt.Color(153, 153, 153));
        btnCancel.setColorClick(new java.awt.Color(153, 153, 153));
        btnCancel.setColorOver(new java.awt.Color(204, 204, 204));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancel.setRadius(20);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDelete)
                            .addComponent(lblUpdate)
                            .addComponent(lblCreate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scpClient, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lblCreate)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDelete)
                                .addGap(41, 41, 41)
                                .addComponent(lblUpdate))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(scpClient, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private Runnable resetSizeofContainButton(Boolean b) {
        
        if(b == true) {
            return new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                        pnlBtnAdd.setVisible(true);
                        lblCreate.setVisible(true);
                        btnConfirm.setVisible(true);
                        btnCancel.setVisible(true);
                         Thread.sleep(100);
                        pnlBtnDelete.setVisible(true);
                        lblDelete.setVisible(true);
                        Thread.sleep(100);
                         pnlBtnUpdate.setVisible(true);
                         lblUpdate.setVisible(true);
                        System.out.println("Loi1");

                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                }
            };
        } else {
            return new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                        pnlBtnUpdate.setVisible(false);
                        lblUpdate.setVisible(false);
                        btnConfirm.setVisible(false);
                        btnCancel.setVisible(false);
                        Thread.sleep(100);
                        pnlBtnDelete.setVisible(false);
                        lblDelete.setVisible(false);
                        Thread.sleep(100);
                        pnlBtnAdd.setVisible(false);
                        lblCreate.setVisible(false);
                        System.out.println("Loi2");
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                }
            };
        }
        
    }
    private void updateSizeContainButton(Boolean b) {
        Thread a = new Thread(resetSizeofContainButton(b));
        a.start();
    }
    
    private void ShowMoreOptionClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowMoreOptionClick
        // TODO add your handling code here:
        
            updateSizeContainButton(isOpenButton);
            this.isOpenButton = !this.isOpenButton;
        
    }//GEN-LAST:event_ShowMoreOptionClick


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.qlchtl.views.MyControls.MyButton btnCancel;
    private com.qlchtl.views.MyControls.MyButton btnConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBtnAdd;
    private javax.swing.JLabel lblBtnDelete;
    private javax.swing.JLabel lblBtnShowMoreOption;
    private javax.swing.JLabel lblBtnUpdate;
    private javax.swing.JLabel lblCreate;
    private javax.swing.JLabel lblDelete;
    private javax.swing.JLabel lblUpdate;
    private com.qlchtl.views.MyControls.MyPanelBoxShadow pnlBtnAdd;
    private com.qlchtl.views.MyControls.MyPanelBoxShadow pnlBtnDelete;
    private com.qlchtl.views.MyControls.MyPanelBoxShadow pnlBtnShowMoreOption;
    private com.qlchtl.views.MyControls.MyPanelBoxShadow pnlBtnUpdate;
    private javax.swing.JScrollPane scpClient;
    private javax.swing.JTextField txtCodeClientFound;
    private javax.swing.JTextField txtCurrentScore;
    private javax.swing.JTextField txtNameClientFound;
    private javax.swing.JTextField txtPhoneClientFound;
    private javax.swing.JTextField txtStoredScore;
    private javax.swing.JTextField txtUsedScore;
    // End of variables declaration//GEN-END:variables
}