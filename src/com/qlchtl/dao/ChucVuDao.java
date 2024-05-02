package com.qlchtl.dao;

import com.qlchtl.entity.ChucVu;
import com.qlchtl.utils.XJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChucVuDao extends qlchSysDao<ChucVu, String> {
    @Override
    public void insert(ChucVu chucVu) {
        String sql = "INSERT INTO chucvu(MaCV, TenChucVu, GiaTienMotTieng) VALUES (?, ?, ?)";
        XJdbc.update(sql,
                chucVu.getMaCV(),
                chucVu.getTenChucVu(),
                chucVu.getGiaTienMotTieng());
    }

    @Override
    public void update(ChucVu chucVu) {
        String sql = "UPDATE chucvu SET TenChucVu = ?, GiaTienMotTieng = ? WHERE MaCV = ?";
        XJdbc.update(sql,
                chucVu.getTenChucVu(),
                chucVu.getGiaTienMotTieng(),
                chucVu.getMaCV());
    }

    @Override
    public void delete(String maCV) {
        String sql = "DELETE FROM chucvu WHERE MaCV = ?";
        XJdbc.update(sql, maCV);
    }

    @Override
    public ChucVu selectById(String maCV) {
        String sql = "SELECT * FROM chucvu WHERE MaCV = ?";
        List<ChucVu> list = selectBySql(sql, maCV);
        return list.size() > 0 ? list.get(0) : null;
    }


    public ChucVu selectByName(String name) {
        String sql = "SELECT * FROM chucvu WHERE TenChucVu = ?";
        List<ChucVu> list = selectBySql(sql, name);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<ChucVu> selectAll() {
        String sql = "SELECT * FROM chucvu";
        return selectBySql(sql);
    }

    @Override
    protected List<ChucVu> selectBySql(String sql, Object... args) {
        List<ChucVu> list = new ArrayList<>();
        try (ResultSet rs = XJdbc.query(sql, args)) {
            while (rs.next()) {
                ChucVu chucVu = new ChucVu(
                        rs.getString("MaCV"),
                        rs.getString("TenChucVu"),
                        rs.getDouble("GiaTienMotTieng")
                );
                list.add(chucVu);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public int tongChucVu()
    {
        String sql="SELECT COUNT(*) AS total FROM ChucVu";
        int tongchucvu = 0;
        try(ResultSet rs=XJdbc.query(sql))
        {
            while(rs.next())
            {
                tongchucvu=rs.getInt("total");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return tongchucvu;
    }
}
