/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlchtl.entity;

/**
 *
 * @author LENOVO
 */
public class KhachHang {
    private String maKH;
    private String sDT;
    private String hoTenKH;
    private int soDiemDaTich;
    private int soDiemDaDung;
    private int soDiemHienCo;

    public KhachHang() {
        this.soDiemDaDung=0;
        this.soDiemHienCo=0;
        this.soDiemDaTich=0;
    }

    public KhachHang(String maKH, String sDT, String hoTenKH) {
        this.maKH = maKH;
        this.sDT = sDT;
        this.hoTenKH = hoTenKH;
        this.soDiemDaDung=0;
        this.soDiemHienCo=0;
        this.soDiemDaTich=0;
    }
    public KhachHang(String maKH, String sDT, String hoTenKH, int soDiemDaTich, int soDiemDaDung, int soDiemHienCo) {
        this.maKH = maKH;
        this.sDT = sDT;
        this.hoTenKH = hoTenKH;
        this.soDiemDaTich = soDiemDaTich;
        this.soDiemDaDung = soDiemDaDung;
        this.soDiemHienCo = soDiemHienCo;
    }
    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String getHoTenKH() {
        return hoTenKH;
    }

    public void setHoTenKH(String hoTenKH) {
        this.hoTenKH = hoTenKH;
    }

    public int getSoDiemDaTich() {
        return soDiemDaTich;
    }

    public void setSoDiemDaTich(int soDiemDaTich) {
        this.soDiemDaTich = soDiemDaTich;
    }

    public int getSoDiemDaDung() {
        return soDiemDaDung;
    }

    public void setSoDiemDaDung(int soDiemDaDung) {
        this.soDiemDaDung = soDiemDaDung;
    }

    public int getSoDiemHienCo() {
        return soDiemHienCo;
    }

    public void setSoDiemHienCo(int soDiemHienCo) {
        this.soDiemHienCo = soDiemHienCo;
    }
}
