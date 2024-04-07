package com.qlchtl.dao;

import com.qlchtl.entity.Kho;
import com.qlchtl.utils.XJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class KhoDao extends qlchSysDao<Kho,String>{
    @Override
    public void insert(Kho kho) {
        String sql = "INSERT INTO kho(MaCH, MaSP, TenKho, SoLuong) VALUES (?, ?, ?, ?)";
        XJdbc.update(sql,
                kho.getMaCH(),
                kho.getMaSP(),
                kho.getTenKho(),
                kho.getSoLuong());
    }

    @Override
    public void update(Kho kho) {
        String sql = "UPDATE kho SET TenKho = ?, SoLuong = ? WHERE MaCH = ? AND MaSP = ?";
        XJdbc.update(sql,
                kho.getTenKho(),
                kho.getSoLuong(),
                kho.getMaCH(),
                kho.getMaSP());
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Kho selectById(String maSP) {
        String sql = "SELECT * FROM kho WHERE MaSP = ?";
        List<Kho> list = selectBySql(sql,maSP);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<Kho> selectAll() {
        String sql = "SELECT * FROM kho";
        return selectBySql(sql);
    }

    @Override
    protected List<Kho> selectBySql(String sql, Object... args) {
        List<Kho> list = new ArrayList<>();
        try (ResultSet rs = XJdbc.query(sql, args)) {
            while (rs.next()) {
                Kho kho = new Kho(
                        rs.getString("MaCH"),
                        rs.getString("MaSP"),
                        rs.getString("TenKho"),
                        rs.getInt("SoLuong")
                );
                list.add(kho);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
