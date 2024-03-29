/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlchtl.entity;

/**
 *
 * @author admin
 */
public class taikhoan {
    private String maTaiKhoan;
    private String taiKhoan;
    private String matKhau;
    private String maNhanVien;

    public taikhoan(String maTaiKhoan, String taiKhoan, String matKhau, String maNhanVien) {
        this.maTaiKhoan = maTaiKhoan;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.maNhanVien = maNhanVien;
    }

    public taikhoan() {

    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
}
