package com.qlchtl.entity;

import java.time.LocalTime;

public class CaLamViec {
    private String maCa;
    private LocalTime gioBatDau;
    private LocalTime gioKetThuc;
    private int phanTramThuongThem;
    public CaLamViec()
    {
        
    }
    // Constructor
    public CaLamViec(String maCa, LocalTime gioBatDau, LocalTime gioKetThuc, int phanTramThuongThem) {
        this.maCa = maCa;
        this.gioBatDau = gioBatDau;
        this.gioKetThuc = gioKetThuc;
        this.phanTramThuongThem = phanTramThuongThem;
    }

    // Getters and Setters
    public String getMaCa() {
        return maCa;
    }

    public void setMaCa(String maCa) {
        this.maCa = maCa;
    }

    public LocalTime getGioBatDau() {
        return gioBatDau;
    }

    public void setGioBatDau(LocalTime gioBatDau) {
        this.gioBatDau = gioBatDau;
    }

    public LocalTime getGioKetThuc() {
        return gioKetThuc;
    }

    public void setGioKetThuc(LocalTime gioKetThuc) {
        this.gioKetThuc = gioKetThuc;
    }

    public int getPhanTramThuongThem() {
        return phanTramThuongThem;
    }

    public void setPhanTramThuongThem(int phanTramThuongThem) {
        this.phanTramThuongThem = phanTramThuongThem;
    }

    // toString method for debugging or logging
    @Override
    public String toString() {
        return "CaLamViec{" +
                "maCa='" + maCa + '\'' +
                ", gioBatDau=" + gioBatDau +
                ", gioKetThuc=" + gioKetThuc +
                ", phanTramThuongThem=" + phanTramThuongThem +
                '}';
    }
}

