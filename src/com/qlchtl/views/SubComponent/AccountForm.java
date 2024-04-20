/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.qlchtl.views.SubComponent;

import com.qlchtl.views.FormMain;
import com.qlchtl.views.MyControls.MyTable;

/**
 *
 * @author Dell
 */
public class AccountForm extends javax.swing.JPanel {

    /**
     * Creates new form AccountForm
     */
    private FormMain parentForm;
    public AccountForm(FormMain parentForm) {
        initComponents();
        this.parentForm = parentForm;
        MyTable.apply(scpMain, MyTable.TableType.DEFAULT);
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
        jPanel2 = new javax.swing.JPanel();
        scpMain = new javax.swing.JScrollPane();
        tblAccount = new javax.swing.JTable();
        myPanelBoxShadow1 = new com.qlchtl.views.MyControls.MyPanelBoxShadow();
        pnlAvatar = new com.qlchtl.views.MyControls.MyPanel();
        lblAvatar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblCodeStaff = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNameStaff = new javax.swing.JLabel();
        lblRankStaff = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblStateStaff = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        myPanelBoxShadow2 = new com.qlchtl.views.MyControls.MyPanelBoxShadow();
        txtCodeAccount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        myPanelBoxShadow3 = new com.qlchtl.views.MyControls.MyPanelBoxShadow();
        txtUserName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        myPanelBoxShadow4 = new com.qlchtl.views.MyControls.MyPanelBoxShadow();
        txtPassWord = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        myPanelBoxShadow5 = new com.qlchtl.views.MyControls.MyPanelBoxShadow();
        txtCodeStaff = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        myPanelBoxShadow6 = new com.qlchtl.views.MyControls.MyPanelBoxShadow();
        txtRole = new javax.swing.JTextField();
        myPanel1 = new com.qlchtl.views.MyControls.MyPanel();
        btnCancle = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(82, 86, 204), 2));

        scpMain.setBackground(new java.awt.Color(255, 255, 255));

        tblAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CodeAccount", "UserName", "Password", "CodeStaff", "Role"
            }
        ));
        scpMain.setViewportView(tblAccount);

        myPanelBoxShadow1.setBackground(new java.awt.Color(255, 255, 255));
        myPanelBoxShadow1.setShadowColor(new java.awt.Color(102, 102, 102));
        myPanelBoxShadow1.setShadowSize(3);

        pnlAvatar.setRoundBottomLeft(100);
        pnlAvatar.setRoundBottomRight(100);
        pnlAvatar.setRoundTopLeft(100);
        pnlAvatar.setRoundTopRight(100);
        pnlAvatar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlAvatar.add(lblAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 39, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Code:");

        lblCodeStaff.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodeStaff.setForeground(new java.awt.Color(102, 102, 102));
        lblCodeStaff.setText("21110713");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Name:");

        lblNameStaff.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNameStaff.setForeground(new java.awt.Color(102, 102, 102));
        lblNameStaff.setText("Pham Huu Tuan");

        lblRankStaff.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRankStaff.setForeground(new java.awt.Color(102, 102, 102));
        lblRankStaff.setText("Nhan vien");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Rank:");

        lblStateStaff.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStateStaff.setForeground(new java.awt.Color(102, 102, 102));
        lblStateStaff.setText("Dang lam");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("State:");

        javax.swing.GroupLayout myPanelBoxShadow1Layout = new javax.swing.GroupLayout(myPanelBoxShadow1);
        myPanelBoxShadow1.setLayout(myPanelBoxShadow1Layout);
        myPanelBoxShadow1Layout.setHorizontalGroup(
            myPanelBoxShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow1Layout.createSequentialGroup()
                .addGroup(myPanelBoxShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myPanelBoxShadow1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCodeStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(myPanelBoxShadow1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(pnlAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(myPanelBoxShadow1Layout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNameStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelBoxShadow1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(myPanelBoxShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelBoxShadow1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblRankStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelBoxShadow1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblStateStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        myPanelBoxShadow1Layout.setVerticalGroup(
            myPanelBoxShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(pnlAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(myPanelBoxShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblCodeStaff))
                .addGap(18, 18, 18)
                .addGroup(myPanelBoxShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblNameStaff))
                .addGap(18, 18, 18)
                .addGroup(myPanelBoxShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblRankStaff))
                .addGap(18, 18, 18)
                .addGroup(myPanelBoxShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblStateStaff))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scpMain, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(myPanelBoxShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scpMain, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(myPanelBoxShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(82, 86, 204), 2));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(82, 86, 204));
        jLabel5.setText("CodeAccount:");

        myPanelBoxShadow2.setBackground(new java.awt.Color(255, 255, 255));
        myPanelBoxShadow2.setShadowColor(new java.awt.Color(82, 86, 204));
        myPanelBoxShadow2.setShadowSize(3);

        txtCodeAccount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCodeAccount.setForeground(new java.awt.Color(102, 102, 102));
        txtCodeAccount.setBorder(null);

        javax.swing.GroupLayout myPanelBoxShadow2Layout = new javax.swing.GroupLayout(myPanelBoxShadow2);
        myPanelBoxShadow2.setLayout(myPanelBoxShadow2Layout);
        myPanelBoxShadow2Layout.setHorizontalGroup(
            myPanelBoxShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtCodeAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        myPanelBoxShadow2Layout.setVerticalGroup(
            myPanelBoxShadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCodeAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(82, 86, 204));
        jLabel6.setText("UserName:");

        myPanelBoxShadow3.setBackground(new java.awt.Color(255, 255, 255));
        myPanelBoxShadow3.setShadowColor(new java.awt.Color(82, 86, 204));
        myPanelBoxShadow3.setShadowSize(3);

        txtUserName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(102, 102, 102));
        txtUserName.setBorder(null);

        javax.swing.GroupLayout myPanelBoxShadow3Layout = new javax.swing.GroupLayout(myPanelBoxShadow3);
        myPanelBoxShadow3.setLayout(myPanelBoxShadow3Layout);
        myPanelBoxShadow3Layout.setHorizontalGroup(
            myPanelBoxShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        myPanelBoxShadow3Layout.setVerticalGroup(
            myPanelBoxShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(82, 86, 204));
        jLabel7.setText("Password:");

        myPanelBoxShadow4.setBackground(new java.awt.Color(255, 255, 255));
        myPanelBoxShadow4.setShadowColor(new java.awt.Color(82, 86, 204));
        myPanelBoxShadow4.setShadowSize(3);

        txtPassWord.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPassWord.setForeground(new java.awt.Color(102, 102, 102));
        txtPassWord.setBorder(null);

        javax.swing.GroupLayout myPanelBoxShadow4Layout = new javax.swing.GroupLayout(myPanelBoxShadow4);
        myPanelBoxShadow4.setLayout(myPanelBoxShadow4Layout);
        myPanelBoxShadow4Layout.setHorizontalGroup(
            myPanelBoxShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        myPanelBoxShadow4Layout.setVerticalGroup(
            myPanelBoxShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPassWord, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(82, 86, 204));
        jLabel8.setText("CodeStaff:");

        myPanelBoxShadow5.setBackground(new java.awt.Color(255, 255, 255));
        myPanelBoxShadow5.setShadowColor(new java.awt.Color(82, 86, 204));
        myPanelBoxShadow5.setShadowSize(3);

        txtCodeStaff.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCodeStaff.setForeground(new java.awt.Color(102, 102, 102));
        txtCodeStaff.setBorder(null);

        javax.swing.GroupLayout myPanelBoxShadow5Layout = new javax.swing.GroupLayout(myPanelBoxShadow5);
        myPanelBoxShadow5.setLayout(myPanelBoxShadow5Layout);
        myPanelBoxShadow5Layout.setHorizontalGroup(
            myPanelBoxShadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtCodeStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        myPanelBoxShadow5Layout.setVerticalGroup(
            myPanelBoxShadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCodeStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(82, 86, 204));
        jLabel9.setText("Role:");

        myPanelBoxShadow6.setBackground(new java.awt.Color(255, 255, 255));
        myPanelBoxShadow6.setShadowColor(new java.awt.Color(82, 86, 204));
        myPanelBoxShadow6.setShadowSize(3);

        txtRole.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtRole.setForeground(new java.awt.Color(102, 102, 102));
        txtRole.setBorder(null);

        javax.swing.GroupLayout myPanelBoxShadow6Layout = new javax.swing.GroupLayout(myPanelBoxShadow6);
        myPanelBoxShadow6.setLayout(myPanelBoxShadow6Layout);
        myPanelBoxShadow6Layout.setHorizontalGroup(
            myPanelBoxShadow6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        myPanelBoxShadow6Layout.setVerticalGroup(
            myPanelBoxShadow6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtRole, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        myPanel1.setBackground(new java.awt.Color(255, 255, 255));
        myPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        btnCancle.setBackground(new java.awt.Color(102, 102, 102));
        btnCancle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancle.setForeground(new java.awt.Color(255, 255, 255));
        btnCancle.setText("Cancle");

        btnConfirm.setBackground(new java.awt.Color(102, 102, 102));
        btnConfirm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Confirm");

        javax.swing.GroupLayout myPanel1Layout = new javax.swing.GroupLayout(myPanel1);
        myPanel1.setLayout(myPanel1Layout);
        myPanel1Layout.setHorizontalGroup(
            myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        myPanel1Layout.setVerticalGroup(
            myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnUpdate.setBackground(new java.awt.Color(102, 102, 102));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");

        btnDelete.setBackground(new java.awt.Color(102, 102, 102));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myPanelBoxShadow5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myPanelBoxShadow4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myPanelBoxShadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myPanelBoxShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(myPanelBoxShadow6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(myPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(myPanelBoxShadow6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myPanelBoxShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel9)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel6))
                            .addComponent(myPanelBoxShadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel7))
                            .addComponent(myPanelBoxShadow4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel8))
                            .addComponent(myPanelBoxShadow5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(myPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancle;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAvatar;
    private javax.swing.JLabel lblCodeStaff;
    private javax.swing.JLabel lblNameStaff;
    private javax.swing.JLabel lblRankStaff;
    private javax.swing.JLabel lblStateStaff;
    private com.qlchtl.views.MyControls.MyPanel myPanel1;
    private com.qlchtl.views.MyControls.MyPanelBoxShadow myPanelBoxShadow1;
    private com.qlchtl.views.MyControls.MyPanelBoxShadow myPanelBoxShadow2;
    private com.qlchtl.views.MyControls.MyPanelBoxShadow myPanelBoxShadow3;
    private com.qlchtl.views.MyControls.MyPanelBoxShadow myPanelBoxShadow4;
    private com.qlchtl.views.MyControls.MyPanelBoxShadow myPanelBoxShadow5;
    private com.qlchtl.views.MyControls.MyPanelBoxShadow myPanelBoxShadow6;
    private com.qlchtl.views.MyControls.MyPanel pnlAvatar;
    private javax.swing.JScrollPane scpMain;
    private javax.swing.JTable tblAccount;
    private javax.swing.JTextField txtCodeAccount;
    private javax.swing.JTextField txtCodeStaff;
    private javax.swing.JTextField txtPassWord;
    private javax.swing.JTextField txtRole;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
