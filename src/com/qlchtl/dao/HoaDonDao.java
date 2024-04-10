/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlchtl.dao;

import com.qlchtl.entity.HoaDon;
import com.qlchtl.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;

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
}
