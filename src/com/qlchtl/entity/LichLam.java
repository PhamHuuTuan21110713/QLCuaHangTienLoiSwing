package com.qlchtl.entity;

import java.time.LocalDate;

public class LichLam {
    private String maNV;
    private LocalDate ngayThangNam;
    private String maCa;

    // Constructor
    public LichLam(String maNV, LocalDate ngayThangNam, String maCa) {
        this.maNV = maNV;
        this.ngayThangNam = ngayThangNam;
        this.maCa = maCa;
    }

    public LichLam() {

    }

    @Override
    public String toString() {
        return "LichLam{" +
                "maNV='" + maNV + '\'' +
                ", ngayThangNam=" + ngayThangNam +
                ", maCa='" + maCa + '\'' +
                '}';
    }

    // Getters and Setters
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public LocalDate getNgayThangNam() {
        return ngayThangNam;
    }

    public void setNgayThangNam(LocalDate ngayThangNam) {
        this.ngayThangNam = ngayThangNam;
    }

    public String getMaCa() {
        return maCa;
    }

    public void setMaCa(String maCa) {
        this.maCa = maCa;
    }

}
