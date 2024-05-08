/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.qlchtl.views.SubComponent;

import com.qlchtl.dao.CaLamViecDao;

import com.qlchtl.entity.CaLamViec;
import com.qlchtl.utils.MsgBox;

import com.qlchtl.views.FormMain;
import com.qlchtl.views.MyControls.MyTable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class ShiftForm extends javax.swing.JPanel {

    /**
     * Creates new form ShiftForm
     */
    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    private FormMain parentForm;
    public ShiftForm(FormMain parentForm) {
        initComponents();
        this.parentForm = parentForm;
        decentralizate();
        MyTable.apply(scpMain, MyTable.TableType.DEFAULT);
        loadData();
        disabledButtonAccept();
        disabledTextInput();
        enabledButtonCUD();
        String firstCodeShift = getFirstCodeShift();
        if (firstCodeShift != null) {
            loadFirstData(firstCodeShift);
        }
        addTable1SelectionListener();
    }
    private void decentralizate() {
        System.out.println("Shift: " + parentForm.getRole());
        if(parentForm.getRole()==1) {
            return;
        } else if(parentForm.getRole()==0) {
            btnUpdate.setVisible(false);
            btnCancel.setVisible(false);
            btnConfirm.setVisible(false);
            btnNew.setVisible(false);
            btnDelete.setVisible(false);
        }
    }
    private boolean addShift=true;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        myPanel1 = new com.qlchtl.views.MyControls.MyPanel();
        myPanelBoxShadow1 = new com.qlchtl.views.MyControls.MyPanelBoxShadow();
        scpMain = new javax.swing.JScrollPane();
        tblShift = new javax.swing.JTable();
        myPanel2 = new com.qlchtl.views.MyControls.MyPanel();
        myPanelBoxShadow2 = new com.qlchtl.views.MyControls.MyPanelBoxShadow();
        myPanel3 = new com.qlchtl.views.MyControls.MyPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        myPanelBoxShadow3 = new com.qlchtl.views.MyControls.MyPanelBoxShadow();
        txtCodeShift = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        myPanelBoxShadow4 = new com.qlchtl.views.MyControls.MyPanelBoxShadow();
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        SpinnerDateModel sm= new SpinnerDateModel(calendar.getTime(), null, null, Calendar.HOUR_OF_DAY);
        jSStart = new javax.swing.JSpinner(sm);
        jLabel4 = new javax.swing.JLabel();
        myPanelBoxShadow5 = new com.qlchtl.views.MyControls.MyPanelBoxShadow();
        SpinnerDateModel model2 = new SpinnerDateModel(calendar.getTime(), null, null, Calendar.HOUR_OF_DAY);
        jSEnd = new javax.swing.JSpinner(model2);
        jLabel5 = new javax.swing.JLabel();
        myPanelBoxShadow6 = new com.qlchtl.views.MyControls.MyPanelBoxShadow();
        txtAllowance = new javax.swing.JTextField();
        myPanel4 = new com.qlchtl.views.MyControls.MyPanel();
        btnNew = new com.qlchtl.views.MyControls.MyButton();
        btnUpdate = new com.qlchtl.views.MyControls.MyButton();
        btnConfirm = new com.qlchtl.views.MyControls.MyButton();
        btnCancel = new com.qlchtl.views.MyControls.MyButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        myPanel1.setBackground(new java.awt.Color(255, 255, 255));
        myPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(82, 86, 204), 2));
        myPanel1.setRoundBottomLeft(10);
        myPanel1.setRoundBottomRight(10);
        myPanel1.setRoundTopLeft(10);
        myPanel1.setRoundTopRight(10);

        myPanelBoxShadow1.setBackground(new java.awt.Color(255, 255, 255));
        myPanelBoxShadow1.setShadowSize(3);

        scpMain.setBackground(new java.awt.Color(255, 255, 255));

        tblShift.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tblShift.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "CodeShift", "Start Time", "End Time", "Allowance"
            }
        ));
        scpMain.setViewportView(tblShift);

        javax.swing.GroupLayout myPanelBoxShadow1Layout = new javax.swing.GroupLayout(myPanelBoxShadow1);
        myPanelBoxShadow1.setLayout(myPanelBoxShadow1Layout);
        myPanelBoxShadow1Layout.setHorizontalGroup(
            myPanelBoxShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scpMain, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                .addContainerGap())
        );
        myPanelBoxShadow1Layout.setVerticalGroup(
            myPanelBoxShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scpMain)
                .addContainerGap())
        );

        javax.swing.GroupLayout myPanel1Layout = new javax.swing.GroupLayout(myPanel1);
        myPanel1.setLayout(myPanel1Layout);
        myPanel1Layout.setHorizontalGroup(
            myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(myPanelBoxShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        myPanel1Layout.setVerticalGroup(
            myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(myPanelBoxShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        myPanel2.setBackground(new java.awt.Color(255, 255, 255));
        myPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(82, 86, 204), 2));

        myPanelBoxShadow2.setBackground(new java.awt.Color(255, 255, 255));
        myPanelBoxShadow2.setShadowSize(2);
        myPanelBoxShadow2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myPanel3.setBackground(new java.awt.Color(82, 86, 204));
        myPanel3.setRoundTopLeft(10);
        myPanel3.setRoundTopRight(10);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tools");

        javax.swing.GroupLayout myPanel3Layout = new javax.swing.GroupLayout(myPanel3);
        myPanel3.setLayout(myPanel3Layout);
        myPanel3Layout.setHorizontalGroup(
            myPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanel3Layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(143, 143, 143))
        );
        myPanel3Layout.setVerticalGroup(
            myPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        myPanelBoxShadow2.add(myPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("CodeShift");
        myPanelBoxShadow2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        myPanelBoxShadow3.setBackground(new java.awt.Color(255, 255, 255));
        myPanelBoxShadow3.setShadowColor(new java.awt.Color(82, 86, 204));
        myPanelBoxShadow3.setShadowSize(2);
        myPanelBoxShadow3.setShadowType(com.qlchtl.views.MyControls.ShadowType.BOT);

        txtCodeShift.setBorder(null);
        txtCodeShift.setEnabled(false);

        javax.swing.GroupLayout myPanelBoxShadow3Layout = new javax.swing.GroupLayout(myPanelBoxShadow3);
        myPanelBoxShadow3.setLayout(myPanelBoxShadow3Layout);
        myPanelBoxShadow3Layout.setHorizontalGroup(
            myPanelBoxShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCodeShift, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        myPanelBoxShadow3Layout.setVerticalGroup(
            myPanelBoxShadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCodeShift, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        myPanelBoxShadow2.add(myPanelBoxShadow3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 240, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("StartTime");
        myPanelBoxShadow2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        myPanelBoxShadow4.setBackground(new java.awt.Color(255, 255, 255));
        myPanelBoxShadow4.setShadowColor(new java.awt.Color(82, 86, 204));
        myPanelBoxShadow4.setShadowSize(2);
        myPanelBoxShadow4.setShadowType(com.qlchtl.views.MyControls.ShadowType.BOT);

        JSpinner.DateEditor de= new JSpinner.DateEditor(jSStart, "HH:mm:ss");
        jSStart.setEditor(de);
        // Code adding the component to the parent container - not shown here

        javax.swing.GroupLayout myPanelBoxShadow4Layout = new javax.swing.GroupLayout(myPanelBoxShadow4);
        myPanelBoxShadow4.setLayout(myPanelBoxShadow4Layout);
        myPanelBoxShadow4Layout.setHorizontalGroup(
            myPanelBoxShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelBoxShadow4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSStart, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        myPanelBoxShadow4Layout.setVerticalGroup(
            myPanelBoxShadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelBoxShadow4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        myPanelBoxShadow2.add(myPanelBoxShadow4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 240, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("EndTime");
        myPanelBoxShadow2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        myPanelBoxShadow5.setBackground(new java.awt.Color(255, 255, 255));
        myPanelBoxShadow5.setShadowColor(new java.awt.Color(82, 86, 204));
        myPanelBoxShadow5.setShadowSize(2);
        myPanelBoxShadow5.setShadowType(com.qlchtl.views.MyControls.ShadowType.BOT);

        JSpinner.DateEditor de1= new JSpinner.DateEditor(jSEnd, "HH:mm:ss");
        jSEnd.setEditor(de1);

        javax.swing.GroupLayout myPanelBoxShadow5Layout = new javax.swing.GroupLayout(myPanelBoxShadow5);
        myPanelBoxShadow5.setLayout(myPanelBoxShadow5Layout);
        myPanelBoxShadow5Layout.setHorizontalGroup(
            myPanelBoxShadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelBoxShadow5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addContainerGap())
        );
        myPanelBoxShadow5Layout.setVerticalGroup(
            myPanelBoxShadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelBoxShadow5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        myPanelBoxShadow2.add(myPanelBoxShadow5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 240, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Allowance");
        myPanelBoxShadow2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        myPanelBoxShadow6.setBackground(new java.awt.Color(255, 255, 255));
        myPanelBoxShadow6.setShadowColor(new java.awt.Color(82, 86, 204));
        myPanelBoxShadow6.setShadowSize(2);
        myPanelBoxShadow6.setShadowType(com.qlchtl.views.MyControls.ShadowType.BOT);

        txtAllowance.setBorder(null);

        javax.swing.GroupLayout myPanelBoxShadow6Layout = new javax.swing.GroupLayout(myPanelBoxShadow6);
        myPanelBoxShadow6.setLayout(myPanelBoxShadow6Layout);
        myPanelBoxShadow6Layout.setHorizontalGroup(
            myPanelBoxShadow6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAllowance, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );
        myPanelBoxShadow6Layout.setVerticalGroup(
            myPanelBoxShadow6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelBoxShadow6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAllowance, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        myPanelBoxShadow2.add(myPanelBoxShadow6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 240, 40));

        myPanel4.setBackground(new java.awt.Color(82, 86, 204));

        btnNew.setForeground(new java.awt.Color(82, 86, 204));
        btnNew.setText("New");
        btnNew.setBorderColor(new java.awt.Color(255, 255, 255));
        btnNew.setColorClick(new java.awt.Color(153, 153, 153));
        btnNew.setColorOver(new java.awt.Color(204, 204, 204));
        btnNew.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNew.setRadius(5);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnUpdate.setForeground(new java.awt.Color(82, 86, 204));
        btnUpdate.setText("Update");
        btnUpdate.setToolTipText("");
        btnUpdate.setBorderColor(new java.awt.Color(255, 255, 255));
        btnUpdate.setColorClick(new java.awt.Color(153, 153, 153));
        btnUpdate.setColorOver(new java.awt.Color(204, 204, 204));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setRadius(5);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout myPanel4Layout = new javax.swing.GroupLayout(myPanel4);
        myPanel4.setLayout(myPanel4Layout);
        myPanel4Layout.setHorizontalGroup(
            myPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel4Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        myPanel4Layout.setVerticalGroup(
            myPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(myPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        myPanelBoxShadow2.add(myPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 310, 100));

        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Confirm");
        btnConfirm.setBorderColor(new java.awt.Color(82, 86, 204));
        btnConfirm.setColor(new java.awt.Color(82, 86, 204));
        btnConfirm.setColorClick(new java.awt.Color(61, 65, 179));
        btnConfirm.setColorOver(new java.awt.Color(115, 119, 222));
        btnConfirm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConfirm.setRadius(5);
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        myPanelBoxShadow2.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, 90, 40));

        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.setBorderColor(new java.awt.Color(82, 86, 204));
        btnCancel.setColor(new java.awt.Color(82, 86, 204));
        btnCancel.setColorClick(new java.awt.Color(61, 65, 179));
        btnCancel.setColorOver(new java.awt.Color(115, 119, 222));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancel.setRadius(5);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        myPanelBoxShadow2.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 90, 40));

        javax.swing.GroupLayout myPanel2Layout = new javax.swing.GroupLayout(myPanel2);
        myPanel2.setLayout(myPanel2Layout);
        myPanel2Layout.setHorizontalGroup(
            myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(myPanelBoxShadow2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        myPanel2Layout.setVerticalGroup(
            myPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(myPanelBoxShadow2, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(myPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(myPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(myPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
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

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        txtAllowance.setText("");
        try {
                Date defaultTime = dateFormat.parse("00:00:00");
                jSStart.setValue(defaultTime);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        try {
                Date defaultTime = dateFormat.parse("00:00:00");
                jSEnd.setValue(defaultTime);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        addShift=true;
        enabledButtonAccept();
        enabledTextInput();
        disabledButtonCUD();
        txtCodeShift.setText(createMaCa());
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        addShift=false;
        enabledButtonAccept();
        enabledTextInput();
        disabledButtonCUD();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        txtAllowance.setText("");
        txtCodeShift.setText("");
        try {
                Date defaultTime = dateFormat.parse("00:00:00");
                jSStart.setValue(defaultTime);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        try {
                Date defaultTime = dateFormat.parse("00:00:00");
                jSEnd.setValue(defaultTime);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        disabledButtonAccept();
        disabledTextInput();
        enabledButtonCUD();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
         try {
                String allowanceText = txtAllowance.getText();
                if (!allowanceText.isEmpty()) {
                    int allowance = Integer.parseInt(allowanceText);

                    // Parse start time
                    String startTimeText = ((JSpinner.DateEditor) jSStart.getEditor()).getTextField().getText();
                    LocalTime startTime = LocalTime.parse(startTimeText, DateTimeFormatter.ofPattern("HH:mm:ss"));

                    // Parse end time
                    String endTimeText = ((JSpinner.DateEditor) jSEnd.getEditor()).getTextField().getText();
                    LocalTime endTime = LocalTime.parse(endTimeText, DateTimeFormatter.ofPattern("HH:mm:ss"));

                    // Create CaLamViec object
                    CaLamViec caLamViec = new CaLamViec();
                    caLamViec.setMaCa(txtCodeShift.getText());
                    caLamViec.setGioBatDau(startTime);
                    caLamViec.setGioKetThuc(endTime);
                    caLamViec.setPhanTramThuongThem(allowance);

                    // Insert or update data
                    CaLamViecDao caLamViecDao = new CaLamViecDao();
                    if (addShift) {
                        caLamViecDao.insert(caLamViec);
                    } else {
                        caLamViecDao.update(caLamViec);
                    }

                    // Reload data and update UI
                    loadData();
                    disabledButtonAccept();
                    disabledTextInput();
                    enabledButtonCUD();
                } else {
                    MsgBox.alert(this, "Vui lòng nhập phần trăm thưởng!!!");
                }
            } catch (NumberFormatException e) {
                MsgBox.alert(this, "Vui lòng nhập số nguyên cho phần trăm thưởng!!!");
            } catch (DateTimeParseException e) {
                MsgBox.alert(this, "Vui lòng nhập thời gian theo định dạng HH:mm:ss!!!");
            } catch (Exception e) {
                MsgBox.alert(this, "Đã xảy ra lỗi khi xác nhận!!!");
            }
    }//GEN-LAST:event_btnConfirmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.qlchtl.views.MyControls.MyButton btnCancel;
    private com.qlchtl.views.MyControls.MyButton btnConfirm;
    private com.qlchtl.views.MyControls.MyButton btnNew;
    private com.qlchtl.views.MyControls.MyButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSEnd;
    private javax.swing.JSpinner jSStart;
    private com.qlchtl.views.MyControls.MyPanel myPanel1;
    private com.qlchtl.views.MyControls.MyPanel myPanel2;
    private com.qlchtl.views.MyControls.MyPanel myPanel3;
    private com.qlchtl.views.MyControls.MyPanel myPanel4;
    private com.qlchtl.views.MyControls.MyPanelBoxShadow myPanelBoxShadow1;
    private com.qlchtl.views.MyControls.MyPanelBoxShadow myPanelBoxShadow2;
    private com.qlchtl.views.MyControls.MyPanelBoxShadow myPanelBoxShadow3;
    private com.qlchtl.views.MyControls.MyPanelBoxShadow myPanelBoxShadow4;
    private com.qlchtl.views.MyControls.MyPanelBoxShadow myPanelBoxShadow5;
    private com.qlchtl.views.MyControls.MyPanelBoxShadow myPanelBoxShadow6;
    private javax.swing.JScrollPane scpMain;
    private javax.swing.JTable tblShift;
    private javax.swing.JTextField txtAllowance;
    private javax.swing.JTextField txtCodeShift;
    // End of variables declaration//GEN-END:variables
   void enabledTextInput()
    {
        jSStart.setEnabled(true);
        jSEnd.setEnabled(true);
        txtAllowance.setEnabled(true);
    }
    void enabledButtonAccept()
    {
        btnCancel.setEnabled(true);
        btnConfirm.setEnabled(true);
    }
    void enabledButtonCUD()
    {
        btnNew.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
    }
    void disabledTextInput()
    {
        jSStart.setEnabled(false);
        jSEnd.setEnabled(false);
        txtAllowance.setEnabled(false);
    }
    void disabledButtonAccept()
    {
        btnCancel.setEnabled(false);
        btnConfirm.setEnabled(false);
    }
    void disabledButtonCUD()
    {
        btnNew.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
    }
    void loadData()
    {
        CaLamViecDao caLamViecDao=new CaLamViecDao();
         
        List<CaLamViec> caLamViecs=caLamViecDao.selectAll();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("CodeShift");
        model.addColumn("Start Time");
        model.addColumn("End Time");
        model.addColumn("Allowance");
        for(CaLamViec caLamViec: caLamViecs)
        {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String startTime = caLamViec.getGioBatDau().format(formatter);
            String endTime = caLamViec.getGioKetThuc().format(formatter);
            String[] rowdata={
                    
                    caLamViec.getMaCa(),
                    startTime,
                    endTime,
                    String.valueOf(caLamViec.getPhanTramThuongThem())
            };
            model.addRow(rowdata);
        }
        tblShift.setModel(model);
    }
    private String createMaCa()
    {
        CaLamViecDao caLamViecDao=new CaLamViecDao();
        int SoLuongCa=caLamViecDao.tongCa();
        return String.format("CA%02d",SoLuongCa+1);
    }
    private void addTable1SelectionListener() {
        tblShift.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = tblShift.getSelectedRow();
                    if (selectedRow != -1) {
                        String selectedCodeShift = (String) tblShift.getValueAt(selectedRow, 0);
                        String selectedStartTime = (String) tblShift.getValueAt(selectedRow, 1);
                        String selectedEndTime  = (String) tblShift.getValueAt(selectedRow, 2);
                        String  selectedAllowance = (String) tblShift.getValueAt(selectedRow, 3);
                        txtCodeShift.setText(selectedCodeShift);
                        try {          
                            Date selectedDate = dateFormat.parse(selectedStartTime);
                            jSStart.setValue(selectedDate);
                        } catch (ParseException ex) {
                            ex.printStackTrace(); 
                        }
                        try {          
                            Date selectedDate = dateFormat.parse(selectedEndTime);
                            jSEnd.setValue(selectedDate);
                        } catch (ParseException ex) {
                            ex.printStackTrace(); 
                        }
                        txtAllowance.setText(selectedAllowance);
                    }
                }
            }
        });
    }

    private String getFirstCodeShift() {
        int rowCount=tblShift.getRowCount();
        if(rowCount>0)
        {
            return (String) tblShift.getValueAt(0,0);
        }
        return null;
    }

    private void loadFirstData(String firstCodeShift) {
                        
                        String selectedStartTime = (String) tblShift.getValueAt(0, 1);
                        String selectedEndTime  = (String) tblShift.getValueAt(0, 2);
                        String  selectedAllowance = (String) tblShift.getValueAt(0, 3);
                        txtCodeShift.setText(firstCodeShift);
                        try {          
                            Date selectedDate = dateFormat.parse(selectedStartTime);
                            jSStart.setValue(selectedDate);
                        } catch (ParseException ex) {
                            ex.printStackTrace(); 
                        }
                        try {          
                            Date selectedDate = dateFormat.parse(selectedEndTime);
                            jSEnd.setValue(selectedDate);
                        } catch (ParseException ex) {
                            ex.printStackTrace(); 
                        }
                        txtAllowance.setText(selectedAllowance);
    }
}
