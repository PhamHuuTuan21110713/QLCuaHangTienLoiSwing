/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlchtl.dao;
import com.qlchtl.entity.KhachHang;
import com.qlchtl.entity.NhanVien;
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
public class KhachHangDao extends qlchSysDao<KhachHang, String> {
    @Override
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
                    entity.setTrangThai(rs.getString("TrangThai"));
                    list.add(entity);
                }
            }
            catch (SQLException e)
            {
                throw new RuntimeException(e);
            }
            finally {
                 if (rs != null) 
                 {
                    rs.getStatement().getConnection().close();
                 }
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
    @Override
    public KhachHang selectById(String maKH) {
        String sql = "SELECT * FROM khachhang WHERE MaKH = ?";
        List<KhachHang> list = selectBySql(sql, maKH);
        return !list.isEmpty() ? list.get(0) : null;
    }


    public  List<KhachHang>  selectByName(String tenNV) {
        String sql = "SELECT * FROM khachhang WHERE HoTenKH LIKE ?";
        List<KhachHang> list = selectBySql(sql, "%" + tenNV + "%");
        return list;
    }


    public void updateTrangThai(KhachHang khachhang) {
        String sql = "UPDATE khachhang SET TrangThai = ? WHERE MaKH = ?";
        XJdbc.update(sql,
                khachhang.getTrangThai(),
                khachhang.getMaKH());
    }

    public List<KhachHang> selectAll() {
        String sql = "SELECT * FROM khachhang";
        return selectBySql(sql);
    }

    @Override
    public void insert(KhachHang entity) {
        String sql = "INSERT INTO khachhang(MaKH, SDT, HoTenKH, SoDiemDaTich, SoDiemDaDung, SoDiemHienCo, TrangThai) VALUES (?, ?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql,
                entity.getMaKH(),
                entity.getsDT(),
                entity.getHoTenKH(),
                entity.getSoDiemDaTich(),
                entity.getSoDiemDaDung(),
                entity.getSoDiemHienCo(),
                entity.getTrangThai());
    }

    @Override
    public void update(KhachHang entity) {
        String sql = "UPDATE khachhang SET SDT = ?, HoTenKH = ?, SoDiemDaTich = ?, SoDiemDaDung = ?, SoDiemHienCo = ?, TrangThai = ? WHERE MaKH = ?";
        XJdbc.update(sql,
                entity.getsDT(),
                entity.getHoTenKH(),
                entity.getSoDiemDaTich(),
                entity.getSoDiemDaDung(),
                entity.getSoDiemHienCo(),
                entity.getTrangThai(),
                entity.getMaKH());
    }

    @Override
    public void delete(String maKH) {
         String sql = "DELETE FROM khachhang WHERE MaKH = ?";
         XJdbc.update(sql, maKH);
    }

    public int tongKhachHang()
       {
           String sql="SELECT COUNT(*) AS total FROM khachhang";
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