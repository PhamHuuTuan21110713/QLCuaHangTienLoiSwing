package com.qlchtl.entity;

public class Kho {
    private String maCH;
    private String maSP;
    private String tenKho;
    private int soLuong;

    public Kho() {
    }

    public Kho(String maCH, String maSP, String tenKho, int soLuong) {
        this.maCH = maCH;
        this.maSP = maSP;
        this.tenKho = tenKho;
        this.soLuong = soLuong;
    }

    public String getMaCH() {
        return maCH;
    }

    public void setMaCH(String maCH) {
        this.maCH = maCH;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenKho() {
        return tenKho;
    }

    public void setTenKho(String tenKho) {
        this.tenKho = tenKho;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
