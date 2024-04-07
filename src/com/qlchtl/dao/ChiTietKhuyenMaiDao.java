package com.qlchtl.dao;

import com.qlchtl.entity.ChiTietKhuyenMai;
import com.qlchtl.entity.Kho;
import com.qlchtl.utils.XJdbc;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChiTietKhuyenMaiDao {
    public void insert(ChiTietKhuyenMai entity) {
        String sql = "INSERT INTO chitietkhuyenmai(MaSP, MaCT, NgayApDung, NgayKetThuc) VALUES(?, ?, ?, ?)";
        XJdbc.update(sql,
                entity.getMaSP(),
                entity.getMaCT(),
                Date.valueOf(entity.getNgayApDung()),
                Date.valueOf(entity.getNgayKetThuc()));
    }

    public void update(ChiTietKhuyenMai entity) {
        String sql = "UPDATE chitietkhuyenmai SET NgayApDung=?, NgayKetThuc=? WHERE MaSP=? AND MaCT=?";
        XJdbc.update(sql,
                Date.valueOf(entity.getNgayApDung()),
                Date.valueOf(entity.getNgayKetThuc()),
                entity.getMaSP(),
                entity.getMaCT());
    }



    public void updateMACT(ChiTietKhuyenMai entity) {
        String sql = "UPDATE chitietkhuyenmai SET  MaCT=? WHERE MaSP=? ";
        XJdbc.update(sql,
                entity.getMaCT(),
                entity.getMaSP());
    }

    public void delete(String maSP, String maCT) {
        String sql = "DELETE FROM chitietkhuyenmai WHERE MaSP=? AND MaCT=?";
        XJdbc.update(sql, maSP, maCT);
    }

    public ChiTietKhuyenMai selectById(String maSP) {
        String sql = "SELECT * FROM chitietkhuyenmai WHERE MaSP=?";
        List<ChiTietKhuyenMai> list = selectBySql(sql, maSP);
        return list.size() > 0 ? list.get(0) : null;
    }


    public ChiTietKhuyenMai selectByMaCT(String maSP) {
        String sql = "SELECT * FROM chitietkhuyenmai WHERE MaCT=?";
        List<ChiTietKhuyenMai> list = selectBySql(sql, maSP);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<ChiTietKhuyenMai> selectAll() {
        String sql = "SELECT * FROM chitietkhuyenmai";
        return selectBySql(sql);
    }

    protected List<ChiTietKhuyenMai> selectBySql(String sql, Object... args) {
        List<ChiTietKhuyenMai> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    ChiTietKhuyenMai entity = new ChiTietKhuyenMai();
                    entity.setMaSP(rs.getString("MaSP"));
                    entity.setMaCT(rs.getString("MaCT"));
                    entity.setNgayApDung(rs.getDate("NgayApDung").toLocalDate());
                    entity.setNgayKetThuc(rs.getDate("NgayKetThuc").toLocalDate());
                    list.add(entity);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
}