/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlchtl.dao;

import com.qlchtl.entity.NhanVien;
import com.qlchtl.utils.XJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class NhanVienDao extends qlchSysDao<NhanVien,String> {

    @Override
    public void insert(NhanVien nhanVien) {
        String sql = "INSERT INTO nhanvien(MaNV, HoTenNV, NgaySinh, NgayVaoLam, SDT, DiaChi, CCCD, GioiTinh, MaCV, MaCH, TrangThai, img) " +
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql, nhanVien.getMaNV(), nhanVien.getHoTenNV(), nhanVien.getNgaySinh(), nhanVien.getNgayVaoLam(),
                nhanVien.getSdt(), nhanVien.getDiaChi(), nhanVien.getCccd(), nhanVien.getGioiTinh(),
                nhanVien.getMaCV(), nhanVien.getMaCH(), nhanVien.isTrangThai(), nhanVien.getImg());
    }

    @Override
    public void update(NhanVien nhanVien) {
        String sql = "UPDATE nhanvien SET HoTenNV = ?, NgaySinh = ?, NgayVaoLam = ?, SDT = ?, DiaChi = ?, CCCD = ?, " +
                "GioiTinh = ?, MaCV = ?, MaCH = ?, TrangThai = ?, img = ? WHERE MaNV = ?";
        XJdbc.update(sql, nhanVien.getHoTenNV(), nhanVien.getNgaySinh(), nhanVien.getNgayVaoLam(), nhanVien.getSdt(),
                nhanVien.getDiaChi(), nhanVien.getCccd(), nhanVien.getGioiTinh(), nhanVien.getMaCV(),
                nhanVien.getMaCH(), nhanVien.isTrangThai(), nhanVien.getImg(), nhanVien.getMaNV());
    }

    @Override
    public void delete(String maNV) {
        String sql = "DELETE FROM nhanvien WHERE MaNV = ?";
        XJdbc.update(sql, maNV);    }

    @Override
    public NhanVien selectById(String maNV) {
        String sql = "SELECT * FROM nhanvien WHERE MaNV = ?";
        List<com.qlchtl.entity.NhanVien> list = selectBySql(sql, maNV);
        return list.size() > 0 ? list.get(0) : null;    }

    @Override
    public List<NhanVien> selectAll() {
        String sql = "SELECT * FROM nhanvien";
        return selectBySql(sql);    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {

        List<NhanVien> nhanVienList = new ArrayList<>();
        try {
            try (ResultSet resultSet = XJdbc.query(sql, args)) {
                while (resultSet.next()) {
                    NhanVien nhanVien = new NhanVien();
                    nhanVien.setMaNV(resultSet.getString("MaNV"));
                    nhanVien.setHoTenNV(resultSet.getString("HoTenNV"));

                    java.sql.Date ngaySinhSql = resultSet.getDate("NgaySinh");
                    nhanVien.setNgaySinh(ngaySinhSql.toLocalDate());

                    java.sql.Date ngayVaoLamSql = resultSet.getDate("NgayVaoLam");
                    nhanVien.setNgayVaoLam(ngayVaoLamSql.toLocalDate());

                    nhanVien.setSdt(resultSet.getString("SDT"));
                    nhanVien.setDiaChi(resultSet.getString("DiaChi"));
                    nhanVien.setCccd(resultSet.getString("CCCD"));
                    nhanVien.setGioiTinh(resultSet.getString("GioiTinh"));
                    nhanVien.setMaCV(resultSet.getString("MaCV"));
                    nhanVien.setMaCH(resultSet.getString("MaCH"));
                    nhanVien.setTrangThai(resultSet.getBoolean("TrangThai"));
                    nhanVien.setImg(resultSet.getString("img"));
                    nhanVienList.add(nhanVien);
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return nhanVienList;


    }
    
}
