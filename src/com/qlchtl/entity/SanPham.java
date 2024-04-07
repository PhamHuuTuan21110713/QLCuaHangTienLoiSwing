package com.qlchtl.entity;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;

public class SanPham {
    private String maSP;
    private String tenSP;
    private String noiSanXuat;
    private String trangThai;
    private String tienGoc;
    private String tienThanhToan;
    private LocalDate ngayNhapHang;
    private String maNCC;
    private String img;

    public SanPham(){}

    public SanPham(String maSP, String tenSP, String noiSanXuat, String trangThai, String tienGoc, String tienThanhToan, LocalDate ngayNhapHang, String maNCC) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.noiSanXuat = noiSanXuat;
        this.trangThai = trangThai;
        this.tienGoc = tienGoc;
        this.tienThanhToan = tienThanhToan;
        this.ngayNhapHang = ngayNhapHang;
        this.maNCC = maNCC;
    }

    public SanPham(String maSP, String tenSP, String noiSanXuat, String trangThai, String tienGoc, String tienThanhToan, LocalDate ngayNhapHang, String maNCC, String img) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.noiSanXuat = noiSanXuat;
        this.trangThai = trangThai;
        this.tienGoc = tienGoc;
        this.tienThanhToan = tienThanhToan;
        this.ngayNhapHang = ngayNhapHang;
        this.maNCC = maNCC;
        this.img = img;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getNoiSanXuat() {
        return noiSanXuat;
    }

    public void setNoiSanXuat(String noiSanXuat) {
        this.noiSanXuat = noiSanXuat;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getTienGoc() {
        return tienGoc;
    }

    public void setTienGoc(String tienGoc) {
        this.tienGoc = tienGoc;
    }

    public String getTienThanhToan() {
        return tienThanhToan;
    }

    public void setTienThanhToan(String tienThanhToan) {
        this.tienThanhToan = tienThanhToan;
    }

    public LocalDate getNgayNhapHang() {
        return ngayNhapHang;
    }

    public void setNgayNhapHang(LocalDate ngayNhapHang) {
        this.ngayNhapHang = ngayNhapHang;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
