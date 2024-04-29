package com.qlchtl.entity;

public class ChucVu {
    private String maCV;
    private String tenChucVu;
    private double giaTienMotTieng;
    public ChucVu()
    {
        
    }
    public ChucVu(String maCV, String tenChucVu, double giaTienMotTieng) {
        this.maCV = maCV;
        this.tenChucVu = tenChucVu;
        this.giaTienMotTieng = giaTienMotTieng;
    }

    public String getMaCV() {
        return maCV;
    }

    public void setMaCV(String maCV) {
        this.maCV = maCV;
    }

    public String getTenChucVu() {
        return tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
    }

    public double getGiaTienMotTieng() {
        return giaTienMotTieng;
    }

    public void setGiaTienMotTieng(double giaTienMotTieng) {
        this.giaTienMotTieng = giaTienMotTieng;
    }

    @Override
    public String toString() {
        return "ChucVu{" +
                "maCV='" + maCV + '\'' +
                ", tenChucVu='" + tenChucVu + '\'' +
                ", giaTienMotTieng=" + giaTienMotTieng +
                '}';
    }
}
