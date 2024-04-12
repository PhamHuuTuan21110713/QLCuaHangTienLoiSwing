/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlchtl.dao;

import com.qlchtl.entity.ChiTietHoaDon;
import com.qlchtl.entity.KhachHang;
import com.qlchtl.entity.SanPham;
import com.qlchtl.utils.XJdbc;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author LENOVO
 */
public class KhachHangDao {
    public List<KhachHang> selectBySql(String sql, Object... args)
    {
        List<KhachHang>list=new ArrayList<>();
        try
        {
            ResultSet rs=null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    KhachHang entity = new KhachHang();
                    entity.setMaKH(rs.getString("MaKH"));
                    entity.setsDT(rs.getString("SDT"));
                    entity.setHoTenKH(rs.getString("HoTenKH"));
                    entity.setSoDiemDaTich(rs.getInt("SoDiemDaTich"));
                    entity.setSoDiemDaDung(rs.getInt("SoDiemDaDung"));
                    entity.setSoDiemHienCo(rs.getInt("SoDiemHienCo"));
                    list.add(entity);
                }
            }
            catch (SQLException e)
            {
                throw new RuntimeException(e);
            }
            finally {
                rs.getStatement().getConnection().close();
            }
        }
        catch (SQLException ex)
        {
            throw new RuntimeException(ex);
        }
        return list;
    }
    public void updateSuDungDiem(KhachHang khachhang, int diemSuDung)
    {
        String sql = "UPDATE khachhang SET SoDiemDaDung=?, SoDiemHienCo=? WHERE MaKH = ?";
        XJdbc.update(sql,
                khachhang.getSoDiemDaDung()+diemSuDung,
                khachhang.getSoDiemHienCo()-diemSuDung,
                khachhang.getMaKH());
    }
    public void updateThemDiem(KhachHang khachhang, int diemCong)
    {
        String sql = "UPDATE khachhang SET SoDiemDaTich=?, SoDiemHienCo=? WHERE MaKH = ?";
        XJdbc.update(sql,
                khachhang.getSoDiemDaTich()+diemCong,
                khachhang.getSoDiemHienCo()+diemCong,
                khachhang.getMaKH());
    }
    public KhachHang selectById(String maKH) {
        String sql = "SELECT * FROM khachhang WHERE MaKH = ?";
        List<KhachHang> list = selectBySql(sql, maKH);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<KhachHang> selectAll() {
        String sql = "SELECT * FROM khachhang";
        return selectBySql(sql);
    }
}