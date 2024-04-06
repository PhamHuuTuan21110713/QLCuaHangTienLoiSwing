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
public class NhanVien {
    private String maNV;
    private String hoTenNV;
    private LocalDate ngaySinh;
    private LocalDate ngayVaoLam;
    private String sdt;
    private String diaChi;
    private String cccd;
    private String gioiTinh;
    private String maCV;
    private String maCH;
    private boolean trangThai = true;
    private String img;

    public NhanVien(){}

    public NhanVien(String maNV, String hoTenNV, LocalDate ngaySinh, LocalDate ngayVaoLam, String sdt, String diaChi, String cccd, String gioiTinh, String maCV, String maCH, boolean trangThai, String img) {
        this.maNV = maNV;
        this.hoTenNV = hoTenNV;
        this.ngaySinh = ngaySinh;
        this.ngayVaoLam = ngayVaoLam;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.cccd = cccd;
        this.gioiTinh = gioiTinh;
        this.maCV = maCV;
        this.maCH = maCH;
        this.trangThai = trangThai;
        this.img = img;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTenNV() {
        return hoTenNV;
    }

    public void setHoTenNV(String hoTenNV) {
        this.hoTenNV = hoTenNV;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public LocalDate getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(LocalDate ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getMaCV() {
        return maCV;
    }

    public void setMaCV(String maCV) {
        this.maCV = maCV;
    }

    public String getMaCH() {
        return maCH;
    }

    public void setMaCH(String maCH) {
        this.maCH = maCH;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
