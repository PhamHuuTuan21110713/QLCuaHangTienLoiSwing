/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.qlchtl.views;

/**
 *
 * @author Dell
 */
public class DetailStaff extends javax.swing.JFrame {

    /**
     * Creates new form DetailStaff
     */
    public DetailStaff() {
        initComponents();
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

        jPanel1.setBackground(new java.awt.Color(237, 237, 237));

        myPanel1.setBackground(new java.awt.Color(255, 255, 255));
        myPanel1.setRoundBottomLeft(10);
        myPanel1.setRoundBottomRight(10);
        myPanel1.setRoundTopLeft(10);
        myPanel1.setRoundTopRight(10);

        txtNameDetailStaff.setEditable(false);
        txtNameDetailStaff.setBackground(new java.awt.Color(255, 255, 255));
        txtNameDetailStaff.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtNameDetailStaff.setText("Phạm Hữu Tuấn");
        txtNameDetailStaff.setBorder(null);

        txtCodeStaff.setEditable(false);
        txtCodeStaff.setBackground(new java.awt.Color(255, 255, 255));
        txtCodeStaff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCodeStaff.setForeground(new java.awt.Color(102, 102, 102));
        txtCodeStaff.setText("21110713");
        txtCodeStaff.setBorder(null);

        cboRankStaff.setBackground(new java.awt.Color(148, 209, 235));
        cboRankStaff.setEditable(true);
        cboRankStaff.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cboRankStaff.setForeground(new java.awt.Color(10, 144, 201));
        cboRankStaff.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboRankStaff.setEnabled(false);

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
        myPanel3.add(lblAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        myPanel2.add(myPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 23, 137, 160));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Date of birth");
        myPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 15, 82, -1));

        txtBirthdayStaff.setEditable(false);
        txtBirthdayStaff.setBackground(new java.awt.Color(255, 255, 255));
        txtBirthdayStaff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtBirthdayStaff.setText("24/11/2003");
        txtBirthdayStaff.setBorder(null);
        myPanel2.add(txtBirthdayStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 37, 102, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Date of work");
        myPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 77, 82, -1));

        txtWorkdayStaff.setEditable(false);
        txtWorkdayStaff.setBackground(new java.awt.Color(255, 255, 255));
        txtWorkdayStaff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtWorkdayStaff.setText("24/11/2003");
        txtWorkdayStaff.setBorder(null);
        myPanel2.add(txtWorkdayStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 99, 102, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Phone number");
        myPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 136, -1, -1));

        txtPhoneStaff.setEditable(false);
        txtPhoneStaff.setBackground(new java.awt.Color(255, 255, 255));
        txtPhoneStaff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPhoneStaff.setText("0928895717");
        txtPhoneStaff.setBorder(null);
        myPanel2.add(txtPhoneStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 160, 102, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Address");
        myPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 15, 82, -1));

        txtAddressStaff.setEditable(false);
        txtAddressStaff.setBackground(new java.awt.Color(255, 255, 255));
        txtAddressStaff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAddressStaff.setText("Ho Chi Minh");
        txtAddressStaff.setBorder(null);
        myPanel2.add(txtAddressStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 37, 217, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Identification card");
        myPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 77, -1, -1));

        txtIndentifyStaff.setEditable(false);
        txtIndentifyStaff.setBackground(new java.awt.Color(255, 255, 255));
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
        rdoMale.setEnabled(false);
        myPanel2.add(rdoMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 158, -1, -1));

        buttonGroup1.add(rdoFemale);
        rdoFemale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdoFemale.setText("Female");
        rdoFemale.setEnabled(false);
        myPanel2.add(rdoFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 158, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("State");
        myPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 15, -1, -1));

        btnConfirm.setForeground(new java.awt.Color(30, 136, 56));
        btnConfirm.setText("Confirm");
        btnConfirm.setColorClick(new java.awt.Color(100, 227, 131));
        btnConfirm.setColorOver(new java.awt.Color(19, 173, 57));
        btnConfirm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConfirm.setRadius(15);
        myPanel2.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 89, 43));

        cboStateStaff.setBackground(new java.awt.Color(148, 209, 235));
        cboStateStaff.setEditable(true);
        cboStateStaff.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cboStateStaff.setForeground(new java.awt.Color(10, 144, 201));
        cboStateStaff.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboStateStaff.setEnabled(false);
        myPanel2.add(cboStateStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 92, -1));

        btnUpdateStaff1.setForeground(new java.awt.Color(30, 136, 56));
        btnUpdateStaff1.setText("Update");
        btnUpdateStaff1.setColorClick(new java.awt.Color(100, 227, 131));
        btnUpdateStaff1.setColorOver(new java.awt.Color(19, 173, 57));
        btnUpdateStaff1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdateStaff1.setRadius(15);
        myPanel2.add(btnUpdateStaff1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 87, 89, 43));

        myPanel4.setBackground(new java.awt.Color(255, 255, 255));
        myPanel4.setRoundBottomLeft(20);
        myPanel4.setRoundBottomRight(20);
        myPanel4.setRoundTopLeft(20);
        myPanel4.setRoundTopRight(20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Employee schedule");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
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
                .addGap(18, 18, 18)
                .addComponent(scpStaffSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
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
                new DetailStaff().setVisible(true);
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
}
