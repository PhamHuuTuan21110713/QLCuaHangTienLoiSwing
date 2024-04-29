package com.qlchtl.dao;

import com.qlchtl.entity.CaLamViec;
import com.qlchtl.utils.XJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class CaLamViecDao extends qlchSysDao<CaLamViec, String> {
    public void insert(CaLamViec entity) {
        String sql = "INSERT INTO calamviec(MaCa, GioBatDau, GiaKetThuc, PhanTramThuongThem) VALUES (?, ?, ?, ?)";
        XJdbc.update(sql,
                entity.getMaCa(),
                entity.getGioBatDau(),
                entity.getGioKetThuc(),
                entity.getPhanTramThuongThem());
    }

    @Override
    public void update(CaLamViec entity) {
        String sql = "UPDATE calamviec SET GioBatDau=?, GiaKetThuc=?, PhanTramThuongThem=? WHERE MaCa=?";
        XJdbc.update(sql,
                entity.getGioBatDau(),
                entity.getGioKetThuc(),
                entity.getPhanTramThuongThem(),
                entity.getMaCa());
    }

    @Override
    public void delete(String maCa) {
        String sql = "DELETE FROM calamviec WHERE MaCa=?";
        XJdbc.update(sql, maCa);
    }

    @Override
    public CaLamViec selectById(String maCa) {
        String sql = "SELECT * FROM calamviec WHERE MaCa=?";
        List<CaLamViec> list = selectBySql(sql, maCa);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<CaLamViec> selectAll() {
        String sql = "SELECT * FROM calamviec";
        return selectBySql(sql);
    }

    @Override
    protected List<CaLamViec> selectBySql(String sql, Object... args) {
        List<CaLamViec> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    CaLamViec entity = new CaLamViec(
                            rs.getString("MaCa"),
                            LocalTime.parse(rs.getString("GioBatDau")),
                            LocalTime.parse(rs.getString("GiaKetThuc")),
                            rs.getInt("PhanTramThuongThem")
                    );
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
    public int tongCa()
    {
        String sql="SELECT COUNT(*) AS total FROM CaLamViec";
        int tongca = 0;
        try(ResultSet rs=XJdbc.query(sql))
        {
            while(rs.next())
            {
                tongca=rs.getInt("total");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return tongca;
    }
}
