/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlchtl.dao;

import com.qlchtl.entity.HoaDon;
import com.qlchtl.entity.KhachHang;
import com.qlchtl.entity.SanPham;
import com.qlchtl.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class HoaDonDao {
    public void insert(HoaDon entity) {
        String sql = "INSERT INTO hoadon(MaHD, NgayXuat, GiaTri, MaKH, DiemTich, DiemSuDung) VALUES(?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql,
                entity.getMaHD(),
                entity.getNgayXuat(),
                entity.getGiaTri(),
                entity.getMaKH(),
                entity.getDiemTich(),
                entity.getDiemSuDung());
    }
    public void insertMaHD(HoaDon entity)
    {
        String sql = "INSERT INTO hoadon(MaHD) VALUES(?)";
        XJdbc.update(sql,
                entity.getMaHD());
    }
    public int tongHoaDon()
    {
        String sql="SELECT COUNT(*) AS total FROM HoaDon";
        int tonghoadon = 0;
        try(ResultSet rs=XJdbc.query(sql))
        {
            while(rs.next())
            {
                tonghoadon=rs.getInt("total");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return tonghoadon;
    }
    public HoaDon selectById(String maHD) {
        String sql = "SELECT * FROM HoaDon WHERE MaHD = ?";
        List<HoaDon> list = selectBySql(sql, maHD);
        return list.size() > 0 ? list.get(0) : null;
    }
    protected List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try (ResultSet rs = XJdbc.query(sql, args)) {
            while (rs.next()) {
                HoaDon hoadon = new HoaDon(
                        rs.getString("MaHD"),
                        rs.getDate("NgayXuat").toLocalDate(),
                        rs.getString("GiaTri"),
                        rs.getString("MaKH"),
                        rs.getString("MaNV"),
                        rs.getInt("DiemTich"),
                        rs.getInt("DiemSuDung"));
                list.add(hoadon);
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
    public void update(HoaDon hoadon) {
        String sql = "UPDATE hoadon SET NgayXuat = ?, GiaTri = ?, MaKH = ?, MaNV = ?, DiemTich = ?, DiemSuDung = ? WHERE MaHD = ?";
        XJdbc.update(sql,
                hoadon.getNgayXuat(),
                hoadon.getGiaTri(),
                hoadon.getMaKH(),
                hoadon.getMaNV(),
                hoadon.getDiemTich(),
                hoadon.getDiemSuDung(),    
                hoadon.getMaHD());
    }
}
