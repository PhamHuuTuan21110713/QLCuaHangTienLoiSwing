package com.qlchtl.entity;

public class ChuongTrinhKhuyenMai {
    private String maCT;
    private String tenChuongTrinh;
    private int phanTramGiamGia;

    public ChuongTrinhKhuyenMai() {
    }

    public ChuongTrinhKhuyenMai(String maCT, String tenChuongTrinh, int phanTramGiamGia) {
        this.maCT = maCT;
        this.tenChuongTrinh = tenChuongTrinh;
        this.phanTramGiamGia = phanTramGiamGia;
    }

    public String getMaCT() {
        return maCT;
    }

    public void setMaCT(String maCT) {
        this.maCT = maCT;
    }

    public String getTenChuongTrinh() {
        return tenChuongTrinh;
    }

    public void setTenChuongTrinh(String tenChuongTrinh) {
        this.tenChuongTrinh = tenChuongTrinh;
    }

    public int getPhanTramGiamGia() {
        return phanTramGiamGia;
    }

    public void setPhanTramGiamGia(int phanTramGiamGia) {
        this.phanTramGiamGia = phanTramGiamGia;
    }
}
