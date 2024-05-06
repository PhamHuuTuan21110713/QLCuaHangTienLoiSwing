/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlchtl.print.model;
import java.text.DecimalFormat;

/**
 *
 * @author Dell
 */
public class ModelItemSell {
    private String TenSP;
    private String MaHD;
    private String MaCH;
    private String GiaThanhToan;
    private String SoLuong;
    private String TongTien;
    private String NgayXuat;
    private String GiaTri;
    private String MaKH;
    private String MaNV;
    private String DiemTich;
    private String DiemSuDung;

    public ModelItemSell(String TenSP, String MaHD, String MaCH, String GiaThanhToan, String SoLuong, String TongTien, String NgayXuat, String GiaTri, String MaKH, String MaNV, String DiemTich, String DiemSuDung) {
        this.TenSP = TenSP;
        this.MaHD = MaHD;
        this.MaCH = MaCH;
        this.GiaThanhToan = GiaThanhToan;
        this.SoLuong = SoLuong;
        this.TongTien = TongTien;
        this.NgayXuat = NgayXuat;
        this.GiaTri = GiaTri;
        this.MaKH = MaKH;
        this.MaNV = MaNV;
        this.DiemTich = DiemTich;
        this.DiemSuDung = DiemSuDung;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaCH() {
        return MaCH;
    }

    public void setMaCH(String MaCH) {
        this.MaCH = MaCH;
    }

    public String getGiaThanhToan() {
        return GiaThanhToan;
    }

    public void setGiaThanhToan(String GiaThanhToan) {
        this.GiaThanhToan = GiaThanhToan;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getTongTien() {
        return TongTien;
    }

    public void setTongTien(String TongTien) {
        this.TongTien = TongTien;
    }

    public String getNgayXuat() {
        return NgayXuat;
    }

    public void setNgayXuat(String NgayXuat) {
        this.NgayXuat = NgayXuat;
    }

    public String getGiaTri() {
        return GiaTri;
    }

    public void setGiaTri(String GiaTri) {
        this.GiaTri = GiaTri;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getDiemTich() {
        return DiemTich;
    }

    public void setDiemTich(String DiemTich) {
        this.DiemTich = DiemTich;
    }

    public String getDiemSuDung() {
        return DiemSuDung;
    }

    public void setDiemSuDung(String DiemSuDung) {
        this.DiemSuDung = DiemSuDung;
    }
//    public Object[] toTableRow(int rowNum) {
//        DecimalFormat df = new DecimalFormat("#,##0.##");
//        return new Object[]{this, df.format(rowNum), M, df.format(qty), "$ " + df.format(price), "$ " + df.format(total)};
//    }
}
