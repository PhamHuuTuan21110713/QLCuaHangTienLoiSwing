/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.qlchtl.views;

import com.qlchtl.dao.ChucVuDao;
import com.qlchtl.dao.NhanVienDao;
import com.qlchtl.entity.*;
import com.qlchtl.utils.MsgBox;
import com.qlchtl.utils.XImage;
import com.qlchtl.views.MyControls.MyTable;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.qlchtl.views.DetailProduct.isValidDate;

/**
 *
 * @author Dell
 */
public class DetailStaff extends javax.swing.JFrame {

    /**
     * Creates new form DetailStaff
     */
    private String idStaff;
    private Boolean bool = false;
    private String img;
    private javax.swing.JFileChooser fileChooser;
    NhanVienDao nhanVienDao =  new NhanVienDao();

    ChucVuDao chucVuDao = new ChucVuDao();
    List<ChucVu> listcv = chucVuDao.selectAll();
    List<NhanVien> listnv = nhanVienDao.selectAll();
    private FormMain formMain;

    public DetailStaff(FormMain formMain,String idStaff) {
        this.formMain = formMain;
        fileChooser = new javax.swing.JFileChooser();
        initComponents();
        this.idStaff = idStaff;
        this.setLocationRelativeTo(null);
        MyTable.apply(scpStaffSchedule, MyTable.TableType.DEFAULT);
        setUpControl(false);
        load();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        myPanel1 = new com.qlchtl.views.MyControls.MyPanel();
        txtNameDetailStaff = new javax.swing.JTextField();
        txtCodeStaff = new javax.swing.JTextField();
        cboRankStaff = new javax.swing.JComboBox<>();
        myPanel2 = new com.qlchtl.views.MyControls.MyPanel();
        myPanel3 = new com.qlchtl.views.MyControls.MyPanel();
        lblAvatar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBirthdayStaff = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtWorkdayStaff = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPhoneStaff = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAddressStaff = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIndentifyStaff = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rdoMale = new javax.swing.JRadioButton();
        rdoFemale = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        btnConfirm = new com.qlchtl.views.MyControls.MyButton();
        cboStateStaff = new javax.swing.JComboBox<>();
        btnUpdateStaff1 = new com.qlchtl.views.MyControls.MyButton();
        myPanel4 = new com.qlchtl.views.MyControls.MyPanel();
        jLabel1 = new javax.swing.JLabel();
        scpStaffSchedule = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(237, 237, 237));

        myPanel1.setBackground(new java.awt.Color(255, 255, 255));
        myPanel1.setRoundBottomLeft(10);
        myPanel1.setRoundBottomRight(10);
        myPanel1.setRoundTopLeft(10);
        myPanel1.setRoundTopRight(10);

        txtNameDetailStaff.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtNameDetailStaff.setText("Phạm Hữu Tuấn");
        txtNameDetailStaff.setBorder(null);

        txtCodeStaff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCodeStaff.setForeground(new java.awt.Color(102, 102, 102));
        txtCodeStaff.setText("21110713");
        txtCodeStaff.setBorder(null);

        cboRankStaff.setBackground(new java.awt.Color(148, 209, 235));
        cboRankStaff.setEditable(true);
        cboRankStaff.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cboRankStaff.setForeground(new java.awt.Color(10, 144, 201));
        cboRankStaff.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout myPanel1Layout = new javax.swing.GroupLayout(myPanel1);
        myPanel1.setLayout(myPanel1Layout);
        myPanel1Layout.setHorizontalGroup(
            myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myPanel1Layout.createSequentialGroup()
                        .addComponent(txtNameDetailStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboRankStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCodeStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        myPanel1Layout.setVerticalGroup(
            myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(myPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameDetailStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboRankStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodeStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        myPanel2.setBackground(new java.awt.Color(255, 255, 255));
        myPanel2.setRoundBottomLeft(10);
        myPanel2.setRoundBottomRight(10);
        myPanel2.setRoundTopLeft(10);
        myPanel2.setRoundTopRight(10);
        myPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myPanel3.setMinimumSize(new java.awt.Dimension(100, 100));
        myPanel3.setOpaque(true);
        myPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlchtl/image/staff.jpg"))); // NOI18N
        lblAvatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAvatarMouseClicked(evt);
            }
        });
        myPanel3.add(lblAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        myPanel2.add(myPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 23, 137, 160));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Date of birth");
        myPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 15, 82, -1));

        txtBirthdayStaff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtBirthdayStaff.setText("24/11/2003");
        txtBirthdayStaff.setBorder(null);
        myPanel2.add(txtBirthdayStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 37, 102, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Date of work");
        myPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 77, 82, -1));

        txtWorkdayStaff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtWorkdayStaff.setText("24/11/2003");
        txtWorkdayStaff.setBorder(null);
        myPanel2.add(txtWorkdayStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 99, 102, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Phone number");
        myPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 136, -1, -1));

        txtPhoneStaff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPhoneStaff.setText("0928895717");
        txtPhoneStaff.setBorder(null);
        myPanel2.add(txtPhoneStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 160, 102, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Address");
        myPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 15, 82, -1));

        txtAddressStaff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAddressStaff.setText("Ho Chi Minh");
        txtAddressStaff.setBorder(null);
        myPanel2.add(txtAddressStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 37, 217, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Identification card");
        myPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 77, -1, -1));

        txtIndentifyStaff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIndentifyStaff.setText("0323123123");
        txtIndentifyStaff.setBorder(null);
        myPanel2.add(txtIndentifyStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 99, 102, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Gender");
        myPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 136, -1, -1));

        buttonGroup1.add(rdoMale);
        rdoMale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdoMale.setText("Male");
        myPanel2.add(rdoMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 158, -1, -1));

        buttonGroup1.add(rdoFemale);
        rdoFemale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdoFemale.setText("Female");
        myPanel2.add(rdoFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 158, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("State");
        myPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 15, -1, -1));

        btnConfirm.setForeground(new java.awt.Color(30, 136, 56));
        btnConfirm.setText("Confirm");
        btnConfirm.setColorClick(new java.awt.Color(100, 227, 131));
        btnConfirm.setColorOver(new java.awt.Color(19, 173, 57));
        btnConfirm.setEnabled(false);
        btnConfirm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConfirm.setRadius(15);
        btnConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfrimStaffClick(evt);
            }
        });
        myPanel2.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 89, 43));

        cboStateStaff.setBackground(new java.awt.Color(148, 209, 235));
        cboStateStaff.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cboStateStaff.setForeground(new java.awt.Color(10, 144, 201));
        cboStateStaff.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        myPanel2.add(cboStateStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 92, -1));

        btnUpdateStaff1.setForeground(new java.awt.Color(30, 136, 56));
        btnUpdateStaff1.setText("Update");
        btnUpdateStaff1.setColorClick(new java.awt.Color(100, 227, 131));
        btnUpdateStaff1.setColorOver(new java.awt.Color(19, 173, 57));
        btnUpdateStaff1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdateStaff1.setRadius(15);
        btnUpdateStaff1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateStaffClick(evt);
            }
        });
        myPanel2.add(btnUpdateStaff1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 89, 43));

        myPanel4.setBackground(new java.awt.Color(255, 255, 255));
        myPanel4.setRoundBottomLeft(20);
        myPanel4.setRoundBottomRight(20);
        myPanel4.setRoundTopLeft(20);
        myPanel4.setRoundTopRight(20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Employee schedule");

        scpStaffSchedule.setBackground(new java.awt.Color(102, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
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
                "Staff Code", "Work Date", "Code Shift", "StartTime", "End Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scpStaffSchedule.setViewportView(jTable1);

        javax.swing.GroupLayout myPanel4Layout = new javax.swing.GroupLayout(myPanel4);
        myPanel4.setLayout(myPanel4Layout);
        myPanel4Layout.setHorizontalGroup(
            myPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel4Layout.createSequentialGroup()
                .addGroup(myPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(myPanel4Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(scpStaffSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        myPanel4Layout.setVerticalGroup(
            myPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scpStaffSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(myPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
                    .addComponent(myPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(myPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(myPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(myPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(myPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setUpControl(Boolean b) {
        txtNameDetailStaff.setEditable(b);
        txtCodeStaff.setEditable(false);
        txtBirthdayStaff.setEditable(b);
        txtWorkdayStaff.setEditable(b);
        txtPhoneStaff.setEditable(b);
        txtAddressStaff.setEditable(b);
        txtIndentifyStaff.setEditable(b);
        rdoFemale.setEnabled(b);
        rdoMale.setEnabled(b);
        cboRankStaff.setEnabled(b);
        cboStateStaff.setEnabled(b);
        if(b==false) {
            cboRankStaff.setBackground(new Color(148,209,235));
            cboStateStaff.setBackground(new Color(148,209,235));
            Color colortxt = new Color(255,255,255);
            txtNameDetailStaff.setBackground(colortxt);
            txtCodeStaff.setBackground(colortxt);
            txtBirthdayStaff.setBackground(colortxt);
            txtWorkdayStaff.setBackground(colortxt);
            txtPhoneStaff.setBackground(colortxt);
            txtAddressStaff.setBackground(colortxt);
            txtIndentifyStaff.setBackground(colortxt);

        } else {
            Color colortxt = new Color(242, 242, 242);
            txtNameDetailStaff.setBackground(colortxt);
           //txtCodeStaff.setBackground(colortxt);
            txtBirthdayStaff.setBackground(colortxt);
            txtWorkdayStaff.setBackground(colortxt);
            txtPhoneStaff.setBackground(colortxt);
            txtAddressStaff.setBackground(colortxt);
            txtIndentifyStaff.setBackground(colortxt);
            cboRankStaff.setBackground(new Color(148,209,235));
            cboStateStaff.setBackground(new Color(148,209,235));

        }
    }
    private void UpdateStaffClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateStaffClick
        // TODO add your handling code here:
        bool = true;
        setUpControl(true);
        btnConfirm.setEnabled(true);
        System.out.println("123"+ idStaff);
        
    }//GEN-LAST:event_UpdateStaffClick

    private void ConfrimStaffClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfrimStaffClick
        // TODO add your handling code here:
        setUpControl(false);
        btnConfirm.setEnabled(false);
        update();
    }//GEN-LAST:event_ConfrimStaffClick

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowClosing

    private void lblAvatarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAvatarMouseClicked
        // TODO add your handling code here:
        if(bool){
            chonAnh();
        } 

    }//GEN-LAST:event_lblAvatarMouseClicked

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
            java.util.logging.Logger.getLogger(DetailStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailStaff(null,"ahihi").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.qlchtl.views.MyControls.MyButton btnConfirm;
    private com.qlchtl.views.MyControls.MyButton btnUpdateStaff1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboRankStaff;
    private javax.swing.JComboBox<String> cboStateStaff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAvatar;
    private com.qlchtl.views.MyControls.MyPanel myPanel1;
    private com.qlchtl.views.MyControls.MyPanel myPanel2;
    private com.qlchtl.views.MyControls.MyPanel myPanel3;
    private com.qlchtl.views.MyControls.MyPanel myPanel4;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JScrollPane scpStaffSchedule;
    private javax.swing.JTextField txtAddressStaff;
    private javax.swing.JTextField txtBirthdayStaff;
    private javax.swing.JTextField txtCodeStaff;
    private javax.swing.JTextField txtIndentifyStaff;
    private javax.swing.JTextField txtNameDetailStaff;
    private javax.swing.JTextField txtPhoneStaff;
    private javax.swing.JTextField txtWorkdayStaff;
    // End of variables declaration//GEN-END:variables

    final String[] firstChucVu = {null};
    final String[] stateStaff = {null};
    void load() {
        NhanVien nv = nhanVienDao.selectById(idStaff);
        txtNameDetailStaff.setText(nv.getHoTenNV());
        txtCodeStaff.setText(nv.getMaNV());

        ChucVu ChucVuinit = chucVuDao.selectById(nv.getMaCV());
        String initialRankValue = ChucVuinit.getTenChucVu();
        Set<String> chucvu = new HashSet<>();
        for (ChucVu cv : listcv) {
            ChucVu a = chucVuDao.selectById(cv.getMaCV());
            chucvu.add(a.getTenChucVu());
        }
        String[] promotionNamesWithNone = chucvu.toArray(new String[0]);
        cboRankStaff.setModel(new javax.swing.DefaultComboBoxModel<>(promotionNamesWithNone));
        cboRankStaff.setSelectedItem(initialRankValue);
        if (promotionNamesWithNone.length > 0) {
            firstChucVu[0] = promotionNamesWithNone[0];
        }
        cboRankStaff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) cboRankStaff.getSelectedItem();
                firstChucVu[0] = selectedItem;
            }
        });



        String importDate = nv.getNgaySinh().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        txtBirthdayStaff.setText(importDate);

        String WorkdayStaff = nv.getNgayVaoLam().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        txtWorkdayStaff.setText(WorkdayStaff);

        txtPhoneStaff.setText(nv.getSdt());
        txtAddressStaff.setText(nv.getDiaChi());
        txtIndentifyStaff.setText(nv.getCccd());

        if (nv.getGioiTinh().equals("Nam")) {
            rdoMale.setSelected(true);
        } else if (nv.getGioiTinh().equals("Nu")) {
            rdoFemale.setSelected(true);
        }



        boolean initTrangThai = nv.isTrangThai();
        String[] states = initTrangThai ? new String[] { "Còn làm", "Nghỉ làm" } : new String[] { "Nghỉ làm", "Còn làm" };
        cboStateStaff.setModel(new javax.swing.DefaultComboBoxModel<>(states));
        cboStateStaff.setSelectedItem(initTrangThai ? "Còn làm" : "Nghỉ làm");
        if (states.length > 0) {
            stateStaff[0] = states[0];
        }
        cboStateStaff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) cboStateStaff.getSelectedItem();
                stateStaff[0] = selectedItem;
            }
        });

        img =nv.getImg();
        String imagePath = "/com/qlchtl/image/imageSanPham/"+nv.getImg();
        java.net.URL imageURL = getClass().getResource(imagePath);
        javax.swing.ImageIcon originalImageIcon = new javax.swing.ImageIcon(imageURL);
        java.awt.Image originalImage = originalImageIcon.getImage();
        java.awt.Image scaledImage = originalImage.getScaledInstance(150, 180, java.awt.Image.SCALE_SMOOTH);
        javax.swing.ImageIcon scaledImageIcon = new javax.swing.ImageIcon(scaledImage);
        lblAvatar.setIcon(scaledImageIcon);
    }

    void chonAnh() {
        if(fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            XImage.save(file); // lưu hình vào thư mục logos
            ImageIcon icon = XImage.read(file.getName());
            java.awt.Image originalImage = icon.getImage();
            java.awt.Image scaledImage = originalImage.getScaledInstance(150, 180, java.awt.Image.SCALE_SMOOTH);
            javax.swing.ImageIcon scaledImageIcon = new javax.swing.ImageIcon(scaledImage);
            lblAvatar.setIcon(scaledImageIcon);
            lblAvatar.setToolTipText(file.getName());
            img = file.getName();
        }
    }

    NhanVien getFormNhanVien(){
        NhanVien nhanVien = new NhanVien();
        nhanVien.setMaNV(txtCodeStaff.getText());
        nhanVien.setHoTenNV(txtNameDetailStaff.getText());

        String inputDate = txtBirthdayStaff.getText();
        if (isValidDate(inputDate, "dd/MM/yyyy")) {
            LocalDate convertedDate = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            nhanVien.setNgaySinh(convertedDate);
        } else {
            return null;
        }
        String inputWork = txtWorkdayStaff.getText();
        if (isValidDate(inputWork, "dd/MM/yyyy")) {
            LocalDate convertedwork = LocalDate.parse(inputWork, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            nhanVien.setNgayVaoLam(convertedwork);
        } else {
            return null;
        }
        nhanVien.setSdt(txtPhoneStaff.getText());
        nhanVien.setDiaChi(txtAddressStaff.getText());
        nhanVien.setCccd(txtIndentifyStaff.getText());

        if(stateStaff[0].equals("Còn làm")) {
            nhanVien.setTrangThai(true);
        } else if (stateStaff[0].equals("Nghỉ làm")) {
            nhanVien.setTrangThai(false);
        }

        ChucVu chucVuinit = chucVuDao.selectByName(firstChucVu[0]);
        nhanVien.setMaCV(chucVuinit.getMaCV());
        nhanVien.setMaCH("CH00000001");
        nhanVien.setGioiTinh(rdoMale.isSelected() ? "Nam" : rdoFemale.isSelected() ? "Nu" : null);
        nhanVien.setImg(img);

        if (img==null) {
            return null;
        }
        return  nhanVien;
    }

    void update(){
        NhanVien modelnv = getFormNhanVien();
        System.out.println(modelnv.toString());
        if (modelnv != null) {
            try {
                nhanVienDao.update(modelnv);
                MsgBox.alert(this, "Cập nhật thành công!");
                if (formMain != null) {
                    formMain.onUpdateCompleteNhanVien();
                }
            } catch (Exception e) {
                MsgBox.alert(this, "Cập nhật thất bại!");
            }
        } else {
            MsgBox.alert(this, "Vui lòng kiểm tra và điền đầy đủ thông tin.");
        }
    }



}
