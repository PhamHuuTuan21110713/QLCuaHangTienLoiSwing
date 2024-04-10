/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlchtl.entity;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class ChiTietKhuyenMai {
    private String maSP;
    private String maCT;
    private LocalDate ngayApDung;
    private LocalDate ngayKetThuc;

    public ChiTietKhuyenMai() {
    }

    public ChiTietKhuyenMai(String maSP,String maCT) {
        this.maSP = maSP;
        this.maCT = maCT;
    }

    public ChiTietKhuyenMai(String maSP, String maCT, LocalDate ngayApDung, LocalDate ngayKetThuc) {
        this.maSP = maSP;
        this.maCT = maCT;
        this.ngayApDung = ngayApDung;
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getMaCT() {
        return maCT;
    }

    public void setMaCT(String maCT) {
        this.maCT = maCT;
    }

    public LocalDate getNgayApDung() {
        return ngayApDung;
    }

    public void setNgayApDung(LocalDate ngayApDung) {
        this.ngayApDung = ngayApDung;
    }

    public LocalDate getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(LocalDate ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }
}
