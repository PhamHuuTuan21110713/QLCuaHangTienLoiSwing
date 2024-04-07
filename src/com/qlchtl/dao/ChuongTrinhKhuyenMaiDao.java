package com.qlchtl.dao;

import com.qlchtl.entity.ChuongTrinhKhuyenMai;
import com.qlchtl.entity.Kho;
import com.qlchtl.utils.XJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChuongTrinhKhuyenMaiDao extends qlchSysDao<ChuongTrinhKhuyenMai, String> {

    @Override
    public void insert(ChuongTrinhKhuyenMai entity) {
        String sql = "INSERT INTO chuongtrinhkhuyenmai(MaCT, TenChuongTrinh, PhanTramGiamGia) VALUES(?, ?, ?)";
        XJdbc.update(sql,
                entity.getMaCT(),
                entity.getTenChuongTrinh(),
                entity.getPhanTramGiamGia());
    }

    @Override
    public void update(ChuongTrinhKhuyenMai entity) {
        String sql = "UPDATE chuongtrinhkhuyenmai SET TenChuongTrinh=?, PhanTramGiamGia=? WHERE MaCT=?";
        XJdbc.update(sql,
                entity.getTenChuongTrinh(),
                entity.getPhanTramGiamGia(),
                entity.getMaCT());
    }

    @Override
    public void delete(String maCT) {
        String sql = "DELETE FROM chuongtrinhkhuyenmai WHERE MaCT=?";
        XJdbc.update(sql, maCT);
    }

    @Override
    public ChuongTrinhKhuyenMai selectById(String maCT) {
        String sql = "SELECT * FROM chuongtrinhkhuyenmai WHERE MaCT=?";
        List<ChuongTrinhKhuyenMai> list = selectBySql(sql, maCT);
        return list.size() > 0 ? list.get(0) : null;
    }


    public ChuongTrinhKhuyenMai selectByName(String Ten) {
        String sql = "SELECT * FROM chuongtrinhkhuyenmai WHERE TenChuongTring=?";
        List<ChuongTrinhKhuyenMai> list = selectBySql(sql, Ten);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<ChuongTrinhKhuyenMai> selectAll() {
        String sql = "SELECT * FROM chuongtrinhkhuyenmai";
        return selectBySql(sql);
    }

    @Override
    protected List<ChuongTrinhKhuyenMai> selectBySql(String sql, Object... args) {
        List<ChuongTrinhKhuyenMai> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    ChuongTrinhKhuyenMai entity = new ChuongTrinhKhuyenMai();
                    entity.setMaCT(rs.getString("MaCT"));
                    entity.setTenChuongTrinh(rs.getString("TenChuongTrinh"));
                    entity.setPhanTramGiamGia(rs.getInt("PhanTramGiamGia"));
                    list.add(entity);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                if (rs != null) {
                    rs.getStatement().getConnection().close();
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
}