/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlchtl.dao;

import com.qlchtl.print.model.FieldReportPayment;
import com.qlchtl.utils.XJdbc;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
/**
 *
 * @author Dell
 */
public class PrintedHoaDonDAO {
    public List<FieldReportPayment> getInvoiceById(String id) {
        List<FieldReportPayment> invoices = new ArrayList<>();
        String query = "select *\n" +
"from (select sp.TenSP, fhd.MaHD, fhd.MaCH, fhd.GiaThanhToan, fhd.SoLuong, fhd.TongTien, fhd.NgayXuat,fhd.GiaTri, fhd.MaKH, fhd.MaNV,fhd.DiemTich,fhd.DiemSuDung\n" +
"from (select ct.MaSP, ct.MaHD, ct.MaCH, ct.GiaThanhToan, ct.SoLuong, ct.TongTien, hd.NgayXuat,hd.GiaTri, hd.MaKH, hd.MaNV,hd.DiemTich,hd.DiemSuDung\n" +
"	from chitiethoadon as ct inner join hoadon as hd on ct.MaHD = hd.MaHD\n" +
"order by ct.MaHD) as fhd inner join sanpham as sp on fhd.MaSP = sp.MaSP) as s\n" +
"where s.MaHD = ?";

        try (ResultSet rs = XJdbc.query(query, id)) {
            while (rs.next()) {
                FieldReportPayment invoice = new FieldReportPayment();
                invoice.setTenSP(rs.getString("TenSP"));
                invoice.setMaHD(rs.getString("MaHD"));
                invoice.setMaCH(rs.getString("MaCH"));
                invoice.setGiaThanhToan(rs.getBigDecimal("GiaThanhToan"));
                invoice.setSoLuong(rs.getInt("SoLuong"));
                invoice.setTongTien(rs.getBigDecimal("TongTien"));
                invoice.setNgayXuat(rs.getDate("NgayXuat"));
                invoice.setGiaTri(rs.getBigDecimal("GiaTri"));
                invoice.setMaKH(rs.getString("MaKH"));
                invoice.setMaNV(rs.getString("MaNV"));
                invoice.setDiemTich(rs.getInt("DiemTich"));
                invoice.setDiemSuDung(rs.getInt("DiemSuDung"));
                invoices.add(invoice);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return invoices;
    }
}
