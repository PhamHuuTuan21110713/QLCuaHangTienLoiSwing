/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlchtl.entity;

/**
 *
 * @author LENOVO
 */
public class ChiTietHoaDon {
    private String maSp;
    private String maHD;
    private String maCH;
    private String giaThanhToan;
    private int sL;
    private String tongTien;

    public ChiTietHoaDon()
    {
    }
    public ChiTietHoaDon(String MaSP, String MaHD, String MaCH, String GiaThanhToan, int SL, String TongTien)
    {
        this.maHD=MaHD;
        this.maSp=MaSP;
        this.maCH=MaCH;
        this.giaThanhToan=GiaThanhToan;
        this.sL=SL;
        this.tongTien=TongTien;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
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

    public String getGiaThanhToan() {
        return giaThanhToan;
    }

    public void setGiaThanhToan(String giaThanhToan) {
        this.giaThanhToan = giaThanhToan;
    }

    public int getsL() {
        return sL;
    }

    public void setsL(int sL) {
        this.sL = sL;
    }

    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }
}

