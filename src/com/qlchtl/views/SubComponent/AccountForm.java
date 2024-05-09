/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.qlchtl.views.SubComponent;

import com.qlchtl.dao.NhanVienDao;
import com.qlchtl.dao.TaiKhoanDao;
import com.qlchtl.entity.NhanVien;
import com.qlchtl.entity.TaiKhoan;
import com.qlchtl.utils.MsgBox;
import com.qlchtl.views.FormMain;
import com.qlchtl.views.MyControls.MyTable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.util.List;

/**
 *
 * @author Dell
 */
public class AccountForm extends javax.swing.JPanel {

    /**
     * Creates new form AccountForm
     */
    private FormMain parentForm;

    private String img;
    TaiKhoanDao taiKhoanDao = new TaiKhoanDao();
    NhanVienDao nhanVienDao = new NhanVienDao();
    public AccountForm(FormMain parentForm) {
        initComponents();
        this.parentForm = parentForm;
        MyTable.apply(scpMain, MyTable.TableType.DEFAULT);
        List<TaiKhoan> listtk = taiKhoanDao.selectAll();
        fillTableTk(listtk);
        setUpControl(false);
        clickDataTaiKhoan();
    }


    TaiKhoan getFormTaiKhoan() {
        String maTK = txtCodeAccount.getText();
        String taiKhoan = txtUserName.getText();
        String matKhau = txtPassWord.getText();
        String maNV = txtCodeStaff.getText();
        String role = txtRole.getText();

        if (maTK.isEmpty() || taiKhoan.isEmpty() || matKhau.isEmpty() || maNV.isEmpty() || role.isEmpty()) {
            return null;
        }

        int roleValue;
        try {
            roleValue = Integer.parseInt(role);
            if (roleValue != 0 && roleValue != 1) {
                return null;
            }
        } catch (NumberFormatException e) {
            return null;
        }

        TaiKhoan tk = new TaiKhoan();
        tk.setMaTaiKhoan(maTK);
        tk.setTaiKhoan(taiKhoan);
        tk.setMatKhau(matKhau);
        tk.setMaNhanVien(maNV);
        tk.setIsRole(roleValue);

        return tk;
    }

    void clearTest(){
        txtCodeAccount.setText("");
        txtUserName.setText("");
        txtPassWord.setText("");
        txtCodeStaff.setText("");
        txtRole.setText("");
    }

    private void setUpControl(Boolean b) {
        txtCodeAccount.setEditable(b);
        txtUserName.setEditable(b);
        txtPassWord.setEditable(b);
        txtCodeStaff.setEditable(b);
        txtRole.setEditable(b);
        if(b==false) {
            Color colortxt = new Color(255,255,255);
            txtCodeAccount.setBackground(colortxt);
            txtUserName.setBackground(colortxt);
            txtPassWord.setBackground(colortxt);
            txtCodeStaff.setBackground(colortxt);
            txtRole.setBackground(colortxt);
        } else {
            Color colortxt = new Color(242, 242, 242);
            txtPassWord.setBackground(colortxt);
            txtRole.setBackground(colortxt);
        }
    }

    public void fillTableTk(List<TaiKhoan> list) {
        DefaultTableModel model = (DefaultTableModel) tblAccount.getModel();
        model.setRowCount(0);
        for (int i = 0; i < list.size(); i++) {
            TaiKhoan tk = list.get(i);
            if(tk.getIsRole()==0 || tk.getIsRole()==1){
                model.addRow(new Object[]{
                        tk.getMaTaiKhoan(),
                        tk.getTaiKhoan(),
                        tk.getMatKhau(),
                        tk.getMaNhanVien(),
                        tk.getIsRole()
                });
            }
        }
    }
    void clickDataTaiKhoan() {
        int selectedRow = tblAccount.getSelectedRow();

        if (selectedRow == -1) {
            selectedRow = 0;
        }

        Object maTKObject = tblAccount.getValueAt(selectedRow, 0);
        Object taiKhoanObject = tblAccount.getValueAt(selectedRow, 1);
        Object matKhauObject = tblAccount.getValueAt(selectedRow, 2);
        Object maNVObject = tblAccount.getValueAt(selectedRow, 3);
        Object roleObject = tblAccount.getValueAt(selectedRow, 4);

        String maTK = maTKObject != null ? maTKObject.toString() : "";
        String taiKhoan = taiKhoanObject != null ? taiKhoanObject.toString() : "";
        String matKhau = matKhauObject != null ? matKhauObject.toString() : "";
        String maNV = maNVObject != null ? maNVObject.toString() : "";
        int role = roleObject != null ? Integer.parseInt(roleObject.toString()) : 0;

        txtCodeAccount.setText(maTK);
        txtUserName.setText(taiKhoan);
        txtPassWord.setText(matKhau);
        txtCodeStaff.setText(maNV);
        txtRole.setText(String.valueOf(role));
        clickLoadNV(maNV);
    }

    void clickLoadNV(String manv){
        NhanVien nv = nhanVienDao.selectById(manv);
        if(nv!=null){
            lblCodeStaff.setText(nv.getMaNV());
            lblNameStaff.setText(nv.getHoTenNV());

            if(nv.getMaCV().equals("CV00000001")){
                lblRankStaff.setText("Quản lý");
            }else {
                lblRankStaff.setText("Nhân viên");
            }

            if(nv.isTrangThai()){
                lblStateStaff.setText("Còn làm");
            }else {
                lblStateStaff.setText("Nghỉ làm");
            }
            String imagePath = "/com/qlchtl/image/imageSanPham/"+nv.getImg();
            System.out.println(nv.getImg());
            ImageIcon imageIcon = new ImageIcon(getClass().getResource(imagePath));
            Image image = imageIcon.getImage(); // Chuyển đổi ImageIcon thành Image
            Image newImage = getScaledCircleImage(image, 79);
            lblAvatar.setIcon(new ImageIcon(newImage));
        }


    }

    public void searchTK(String nameClient) {
        List<TaiKhoan> nameClients = taiKhoanDao.selectByName(nameClient);
        if (nameClients.size() > 0) {
            fillTableTk(nameClients);
        } else {
            MsgBox.alert(this, "Không có tài khoản nào được tìm thấy");
            List<TaiKhoan> list = taiKhoanDao.selectAll();
            fillTableTk(list);
        }
    }


    void update(){
        TaiKhoan modelsp = getFormTaiKhoan();
        try {
            taiKhoanDao.update(modelsp);
            MsgBox.alert(this, "Cập nhật thành công!");
            List<TaiKhoan> listsp = taiKhoanDao.selectAll();
            fillTableTk(listsp);

        }
        catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại, Vui lòng kiểm tra và điền đầy đủ thông tin!");
            clickDataTaiKhoan();
            setUpControl(false);
        }
    }

    TaiKhoan getFormXoa() {
        TaiKhoan sp = new TaiKhoan();
        sp.setMaTaiKhoan(txtCodeAccount.getText());
        sp.setIsRole(3);
        return sp;
    }
    void delete() {
        int choice = JOptionPane.showConfirmDialog(
                this,
                "Bạn có chắc chắn muốn xóa tài khoản này?",
                "Xác nhận xóa",
                JOptionPane.OK_CANCEL_OPTION
        );

        if (choice == JOptionPane.OK_OPTION) {
            TaiKhoan sp = getFormXoa();
            NhanVien nv = getFormNhanVien();

            try {
                taiKhoanDao.updateRole(sp);
                nhanVienDao.updateTrangThai(nv);
                MsgBox.alert(this, "Xóa thành công!");
                List<TaiKhoan> listsp = taiKhoanDao.selectAll();
                fillTableTk(listsp);
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa thất bại!");
            }
        }
    }



    NhanVien getFormNhanVien() {
        NhanVien nv = new NhanVien();
        nv.setMaNV(txtCodeStaff.getText());
        nv.setTrangThai(false);
        return nv;
    }


    private Image getScaledCircleImage(Image srcImg, int size) {
        BufferedImage resizedImg = new BufferedImage(size, size, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();
        Ellipse2D.Double circle = new Ellipse2D.Double(0, 0, size, size);
        g2.setClip(circle);
        g2.drawImage(srcImg, 0, 0, size, size, null);
        g2.dispose();

        return resizedImg;
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
        tblAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAccountMouseClicked(evt);
            }
        });
        scpMain.setViewportView(tblAccount);

        myPanelBoxShadow1.setBackground(new java.awt.Color(255, 255, 255));
        myPanelBoxShadow1.setShadowColor(new java.awt.Color(102, 102, 102));
        myPanelBoxShadow1.setShadowSize(3);

        pnlAvatar.setRoundBottomLeft(100);
        pnlAvatar.setRoundBottomRight(100);
        pnlAvatar.setRoundTopLeft(100);
        pnlAvatar.setRoundTopRight(100);
        pnlAvatar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlAvatar.add(lblAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -30, 150, 160));

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
        jLabel9.setEnabled(false);

        myPanelBoxShadow6.setBackground(new java.awt.Color(255, 255, 255));
        myPanelBoxShadow6.setEnabled(false);
        myPanelBoxShadow6.setShadowColor(new java.awt.Color(82, 86, 204));
        myPanelBoxShadow6.setShadowSize(3);

        txtRole.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtRole.setForeground(new java.awt.Color(102, 102, 102));
        txtRole.setBorder(null);
        txtRole.setEnabled(false);

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
        btnCancle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancleMouseClicked(evt);
            }
        });

        btnConfirm.setBackground(new java.awt.Color(102, 102, 102));
        btnConfirm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Confirm");
        btnConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmMouseClicked(evt);
            }
        });

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
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(102, 102, 102));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

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

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // TODO add your handling code here:
        setUpControl(true);
        txtCodeAccount.setEditable(false);
        txtUserName.setEditable(false);
        txtCodeStaff.setEditable(false);
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
            delete();
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnCancleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancleMouseClicked
        // TODO add your handling code here:
        setUpControl(false);
        setUpControl(false);
    }//GEN-LAST:event_btnCancleMouseClicked

    private void btnConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseClicked
        // TODO add your handling code here:
         update();
    }//GEN-LAST:event_btnConfirmMouseClicked

    private void tblAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAccountMouseClicked
        // TODO add your handling code here:
        clickDataTaiKhoan();
    }//GEN-LAST:event_tblAccountMouseClicked


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
