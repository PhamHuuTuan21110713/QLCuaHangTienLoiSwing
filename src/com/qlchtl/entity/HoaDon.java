/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlchtl.entity;

/**
 *
 * @author LENOVO
 */
import java.util.Date;

public class HoaDon {
    private String maHD;
    private Date ngayXuat;
    private String giaTri;
    private String maKH;
    private String maNV;
    private  int diemTich;
    private int diemSuDung;

    public HoaDon() {
    }

    public HoaDon(String maHD, Date ngayXuat, String giaTri, String maKH, String maNV, int diemTich, int diemSuDung) {
        this.maHD = maHD;
        this.ngayXuat = ngayXuat;
        this.giaTri = giaTri;
        this.maKH = maKH;
        this.maNV = maNV;
        this.diemTich = diemTich;
        this.diemSuDung = diemSuDung;
    }

    public HoaDon(String maHD, Date ngayXuat, String giaTri, String maNV, int diemTich, int diemSuDung) {
        this.maHD = maHD;
        this.ngayXuat = ngayXuat;
        this.giaTri = giaTri;
        this.maNV = maNV;
        this.diemTich = diemTich;
        this.diemSuDung = diemSuDung;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public Date getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(Date ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public String getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(String giaTri) {
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
