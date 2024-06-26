/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.qlchtl.views.SubComponent;

import com.qlchtl.dao.ChiTietHoaDonDao;
import com.qlchtl.dao.HoaDonDao;
import com.qlchtl.entity.ChiTietHoaDon;
import com.qlchtl.entity.HoaDon;
import com.qlchtl.utils.MsgBox;
import com.qlchtl.views.FormMain;
import com.qlchtl.views.JFHoaDon;
import com.qlchtl.views.MyControls.MyTable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class InvoiceForm extends javax.swing.JPanel {

    /**
     * Creates new form InvoiceForm
     */
    FormMain parentForm ;
    public InvoiceForm(FormMain parentForm) {
        initComponents();
        this.parentForm = parentForm;
        MyTable.apply(jScrollPane1, MyTable.TableType.DEFAULT);
        MyTable.apply(jScrollPane2, MyTable.TableType.DEFAULT);
        loadDataInvoice();
        String firstInvoiceID = getFirstInvoiceID();
        if (firstInvoiceID != null) {
            loadDataInvoicDetail(firstInvoiceID);
        }
        addTable1SelectionListener();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnFindInvoice = new com.qlchtl.views.MyControls.MyButton();
        btnMyInvoice = new com.qlchtl.views.MyControls.MyButton();
        jDateFrom = new com.toedter.calendar.JDateChooser();
        jDateTo = new com.toedter.calendar.JDateChooser();
        btnShowAll = new com.qlchtl.views.MyControls.MyButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Invoice ID", "Issued Date", "Price", "Invoice To", "Create By", "Added Score", "Used Score"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Invoice List");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Product List");

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product ID", "Price", "Quantity"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("From");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("To");

        btnFindInvoice.setForeground(new java.awt.Color(30, 136, 56));
        btnFindInvoice.setText("Go");
        btnFindInvoice.setColorClick(new java.awt.Color(204, 204, 204));
        btnFindInvoice.setColorOver(new java.awt.Color(250, 250, 250));
        btnFindInvoice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFindInvoice.setRadius(10);
        btnFindInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindInvoiceActionPerformed(evt);
            }
        });

        btnMyInvoice.setForeground(new java.awt.Color(53, 148, 219));
        btnMyInvoice.setText("New Invoice");
        btnMyInvoice.setBorderColor(new java.awt.Color(86, 162, 219));
        btnMyInvoice.setColorClick(new java.awt.Color(204, 204, 204));
        btnMyInvoice.setColorOver(new java.awt.Color(242, 242, 242));
        btnMyInvoice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMyInvoice.setRadius(10);
        btnMyInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewInvoiceClick(evt);
            }
        });

        jDateFrom.setDateFormatString("dd/MM/yyyy");

        jDateTo.setDateFormatString("dd/MM/yyyy");

        btnShowAll.setForeground(new java.awt.Color(30, 136, 56));
        btnShowAll.setText("Show All");
        btnShowAll.setColorClick(new java.awt.Color(204, 204, 204));
        btnShowAll.setColorOver(new java.awt.Color(250, 250, 250));
        btnShowAll.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnShowAll.setRadius(10);
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 73, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFindInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMyInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(btnFindInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMyInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateFrom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateTo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(btnShowAll, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NewInvoiceClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewInvoiceClick
        // TODO add your handling code here:
//        JFHoaDon hoadon = new JFHoaDon();
//        hoadon.setVisible(true);
//        hoadon.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            JFHoaDon hoadon = new JFHoaDon(this);
            hoadon.setVisible(true);
            hoadon.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_NewInvoiceClick

    private void btnFindInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindInvoiceActionPerformed
        // TODO add your handling code here:
        try
        { 
            loadDataFromTo();
        }     
        catch (Exception e)
        {
            MsgBox.alert(this, "Vui lòng chọn ngày phù hợp!");
            loadDataInvoice();
        }
         
    }//GEN-LAST:event_btnFindInvoiceActionPerformed

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
        // TODO add your handling code here:
        loadDataInvoice();
        
    }//GEN-LAST:event_btnShowAllActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.qlchtl.views.MyControls.MyButton btnFindInvoice;
    private com.qlchtl.views.MyControls.MyButton btnMyInvoice;
    private com.qlchtl.views.MyControls.MyButton btnShowAll;
    private com.toedter.calendar.JDateChooser jDateFrom;
    private com.toedter.calendar.JDateChooser jDateTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
private void loadDataInvoice()
    {
        HoaDonDao hoaDonDao=new HoaDonDao();
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<HoaDon> hoaDons=hoaDonDao.selectAll();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Invoice ID");
        model.addColumn("Issued Date");
        model.addColumn("Price");
        model.addColumn("Invoice To");
        model.addColumn("Create By");
        model.addColumn("Added Score");
        model.addColumn("Used Score");
        for(HoaDon hoaDon: hoaDons)
        {
            String[] rowdata={
                    hoaDon.getMaHD(),
                    outputFormatter.format(LocalDate.parse(String.valueOf(hoaDon.getNgayXuat()), inputFormatter)),
                    String.valueOf(hoaDon.getGiaTri()),
                    hoaDon.getMaKH(),
                    hoaDon.getMaNV(),
                    String.valueOf(hoaDon.getDiemTich()),
                    String.valueOf(hoaDon.getDiemSuDung()),   
            };
            model.addRow(rowdata);
        }
        jTable1.setModel(model);
    }

    private void loadDataFromTo() {
        Date fromDate=jDateFrom.getDate();
        Date toDate=jDateTo.getDate();
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        HoaDonDao hoaDonDao=new HoaDonDao();
        List<HoaDon> hoaDons=hoaDonDao.selectByDateRange(fromDate, toDate);
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Invoice ID");
        model.addColumn("Issued Date");
        model.addColumn("Price");
        model.addColumn("Invoice To");
        model.addColumn("Create By");
        model.addColumn("Added Score");
        model.addColumn("Used Score");
        for(HoaDon hoaDon: hoaDons)
        {
            String[] rowdata={
                    hoaDon.getMaHD(),
                    outputFormatter.format(LocalDate.parse(String.valueOf(hoaDon.getNgayXuat()), inputFormatter)),
                    String.valueOf(hoaDon.getGiaTri()),
                    hoaDon.getMaKH(),
                    hoaDon.getMaNV(),
                    String.valueOf(hoaDon.getDiemTich()),
                    String.valueOf(hoaDon.getDiemSuDung()),   
            };
            model.addRow(rowdata);
        }
        jTable1.setModel(model);
    }
    void loadDataInvoicDetail( String MaHD)
    {
        ChiTietHoaDonDao chitiethoadondao=new ChiTietHoaDonDao();
         
        List<ChiTietHoaDon> chitiethoadons=chitiethoadondao.selectByMaHD(MaHD);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Product ID");
        model.addColumn("Price");
        model.addColumn("Quantity");
        for(ChiTietHoaDon chitiethoadon: chitiethoadons)
        {
            String[] rowdata={
                    chitiethoadon.getMaSp(),
                    chitiethoadon.getGiaThanhToan(),
                    String.valueOf(chitiethoadon.getsL()),
            };
            model.addRow(rowdata);
        }
        jTable2.setModel(model);
    }
    private String getFirstInvoiceID(){
        int rowCount=jTable1.getRowCount();
        if(rowCount>0)
        {
            return (String) jTable1.getValueAt(0,0);
        }
        return null;
    }
    private void addTable1SelectionListener() {
    jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()) {
                int selectedRow = jTable1.getSelectedRow();
                if (selectedRow != -1) {
                    String selectedInvoiceID = (String) jTable1.getValueAt(selectedRow, 0);
                    if (selectedInvoiceID != null) {
                        loadDataInvoicDetail(selectedInvoiceID);
                    }
                }
            }
        }
    });
    
}
    public void reloadForm() {
        loadDataInvoice();
    }
    
}
