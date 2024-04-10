package com.qlchtl.dao;

import com.qlchtl.entity.NhaCungCap;
import com.qlchtl.utils.XJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NhaCungCapDao extends qlchSysDao<NhaCungCap,String> {
    public void insert(NhaCungCap nhaCungCap) {
        String sql = "INSERT INTO nhacungcap(MaNCC, TenNCC, DiaChi, SDT) VALUES (?, ?, ?, ?)";
        XJdbc.update(sql,
                nhaCungCap.getMaNCC(),
                nhaCungCap.getTenNCC(),
                nhaCungCap.getDiaChi(),
                nhaCungCap.getSdt());
    }

    @Override
    public void update(NhaCungCap nhaCungCap) {
        String sql = "UPDATE nhacungcap SET TenNCC = ?, DiaChi = ?, SDT = ? WHERE MaNCC = ?";
        XJdbc.update(sql,
                nhaCungCap.getTenNCC(),
                nhaCungCap.getDiaChi(),
                nhaCungCap.getSdt(),
                nhaCungCap.getMaNCC());
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM nhacungcap WHERE MaNCC = ?";
        XJdbc.update(sql, id);
    }

    @Override
    public NhaCungCap selectById(String maNCC) {
        String sql = "SELECT * FROM nhacungcap WHERE MaNCC = ?";
        List<NhaCungCap> list = selectBySql(sql, maNCC);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<NhaCungCap> selectAll() {
        String sql = "SELECT * FROM nhacungcap";
        return selectBySql(sql);
    }

    @Override
    protected List<NhaCungCap> selectBySql(String sql, Object... args) {
        List<NhaCungCap> list = new ArrayList<>();
        try (ResultSet rs = XJdbc.query(sql, args)) {
            while (rs.next()) {
                NhaCungCap nhaCungCap = new NhaCungCap(
                        rs.getString("MaNCC"),
                        rs.getString("TenNCC"),
                        rs.getString("DiaChi"),
                        rs.getString("SDT")
                );
                list.add(nhaCungCap);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
