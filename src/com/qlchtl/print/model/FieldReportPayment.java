/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlchtl.print.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Dell
 */
public class FieldReportPayment {
    private String tenSP;
    private String maHD;
    private String maCH;
    private BigDecimal giaThanhToan;
    private int soLuong;
    private BigDecimal tongTien;
    private Date ngayXuat;
    private BigDecimal giaTri;
    private String maKH;
    private String maNV;
    private int diemTich;
    private int diemSuDung;

    public FieldReportPayment() {
    }

    public FieldReportPayment(String tenSP, String maHD, String maCH, BigDecimal giaThanhToan, int soLuong, BigDecimal tongTien, Date ngayXuat, BigDecimal giaTri, String maKH, String maNV, int diemTich, int diemSuDung) {
        this.tenSP = tenSP;
        this.maHD = maHD;
        this.maCH = maCH;
        this.giaThanhToan = giaThanhToan;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
        this.ngayXuat = ngayXuat;
        this.giaTri = giaTri;
        this.maKH = maKH;
        this.maNV = maNV;
        this.diemTich = diemTich;
        this.diemSuDung = diemSuDung;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaCH() {
        return maCH;
    }

    public void setMaCH(String maCH) {
        this.maCH = maCH;
    }

    public BigDecimal getGiaThanhToan() {
        return giaThanhToan;
    }

    public void setGiaThanhToan(BigDecimal giaThanhToan) {
        this.giaThanhToan = giaThanhToan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getTongTien() {
        return tongTien;
    }

    public void setTongTien(BigDecimal tongTien) {
        this.tongTien = tongTien;
    }

    public Date getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(Date ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public BigDecimal getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(BigDecimal giaTri) {
        this.giaTri = giaTri;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getDiemTich() {
        return diemTich;
    }

    public void setDiemTich(int diemTich) {
        this.diemTich = diemTich;
    }

    public int getDiemSuDung() {
        return diemSuDung;
    }

    public void setDiemSuDung(int diemSuDung) {
        this.diemSuDung = diemSuDung;
    }

    
}