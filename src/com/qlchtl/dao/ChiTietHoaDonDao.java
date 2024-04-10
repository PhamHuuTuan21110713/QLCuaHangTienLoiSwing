/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlchtl.dao;

/**
 *
 * @author LENOVO
 */
import com.qlchtl.entity.ChiTietHoaDon;
import com.qlchtl.utils.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ChiTietHoaDonDao {
    public void insert(ChiTietHoaDon entity) {
        String sql = "INSERT INTO chitiethoadon(MaSP, MaHD, MaCH, GiaThanhToan, SoLuong, TongTien) VALUES(?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql,
                entity.getMaSp(),
                entity.getMaHD(),
                entity.getMaCH(),
                entity.getGiaThanhToan(),
                entity.getsL(),
                entity.getTongTien());
    }

    public void delete(String maSP,String maHD)
    {
        String sql = "DELETE FROM chitiethoadon WHERE MaSP = ? AND MaHD = ?";
        XJdbc.update(sql, maSP,maHD);
    }
    public ChiTietHoaDon selectByMaHD(String maHD)
    {
        String sql="SELECT * FROM ChiTietHoaDon WHERE MaHD=?";
        List<ChiTietHoaDon> list=selectBySql(sql, maHD);
        return !list.isEmpty() ?list.getFirst():null;
    }
    public List<ChiTietHoaDon> selectBySql(String sql, Object... args)
    {
        List<ChiTietHoaDon>list=new ArrayList<>();
        try
        {
            ResultSet rs=null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    ChiTietHoaDon entity = new ChiTietHoaDon();
                    entity.setMaSp(rs.getString("MaSP"));
                    entity.setMaHD(rs.getString("MaHD"));
                    entity.setMaCH(rs.getString("maCH"));
                    entity.setGiaThanhToan(rs.getString("GiaThanhToan"));
                    entity.setsL(rs.getInt("SoLuong"));
                    entity.setTongTien(rs.getString("TongTien"));
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
}

