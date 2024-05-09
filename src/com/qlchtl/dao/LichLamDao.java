package com.qlchtl.dao;

import com.qlchtl.entity.LichLam;
import com.qlchtl.utils.XJdbc;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LichLamDao extends qlchSysDao<LichLam, String> {

    @Override
    public void insert(LichLam entity) {
        String sql = "INSERT INTO lichlam(MaNV, NgayThangNam, MaCa) VALUES (?, ?, ?)";
        XJdbc.update(sql,
                entity.getMaNV(),
                entity.getNgayThangNam(),
                entity.getMaCa());
    }

    @Override
    public void update(LichLam entity) {
        String sql = "UPDATE lichlam SET MaCa=? WHERE MaNV=? AND NgayThangNam=?";
        XJdbc.update(sql,
                entity.getMaCa(),
                entity.getMaNV(),
                entity.getNgayThangNam());
    }
    public void updateCa(LichLam entity) {
        String sql = "UPDATE lichlam SET MaCa=? WHERE MaNV=?";
        XJdbc.update(sql,
                entity.getMaCa(),
                entity.getMaNV()
                );
    }
    @Override
    public void delete(String MaCA) {
        String sql = "DELETE FROM lichlam WHERE MaCA=?";
        XJdbc.update(sql, MaCA);
    }

    @Override
    public LichLam selectById(String maNV) {
        String sql = "SELECT * FROM lichlam WHERE MaNV=?";
        List<LichLam> list = selectBySql(sql, maNV);
        return list.size() > 0 ? list.get(0) : null;
    }
    public List<LichLam> selectByMaCa(String maCa) {
        String sql = "SELECT * FROM lichlam WHERE MaNV=?";
        return selectBySql(sql, maCa);
    }



    public List<LichLam> selectByIdList(String maNV) {
        String sql = "SELECT * FROM lichlam WHERE MaNV=?";
        return selectBySql(sql, maNV);
    }

    @Override
    public List<LichLam> selectAll() {
        String sql = "SELECT * FROM lichlam";
        return selectBySql(sql);
    }

    @Override
    protected List<LichLam> selectBySql(String sql, Object... args) {
        List<LichLam> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    LichLam entity = new LichLam(
                            rs.getString("MaNV"),
                            rs.getDate("NgayThangNam").toLocalDate(),
                            rs.getString("MaCa")
                    );
                    list.add(entity);
                }
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

    public int isNgayThangNamExists(LocalDate ngayThangNam,String MaNV) {
        int count = 0;
        String sql = "SELECT COUNT(*) AS count FROM lichlam WHERE NgayThangNam = ? and MaNV = ?";
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, Date.valueOf(ngayThangNam),MaNV);
                if (rs.next()) {
                    count = rs.getInt("count");
                }
            } finally {
                if (rs != null) {
                    rs.getStatement().getConnection().close();
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return count;
    }

}
