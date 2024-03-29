package com.qlchtl.dao;

import com.qlchtl.entity.taikhoan;
import com.qlchtl.utils.XJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TaiKhoanDao extends qlchSysDao<taikhoan,String> {

    @Override
    public void insert(taikhoan entity) {
        String sql="INSERT INTO taikhoan(MaTK, TaiKhoan, MatKhau,MaNV) VALUES(?, ?, ?,?)";
        XJdbc.update(sql,
                entity.getMaTaiKhoan(),
                entity.getTaiKhoan(),
                entity.getMatKhau(),
                entity.getMaNhanVien());

    }

    @Override
    public void update(taikhoan entity) {
        String sql="UPDATE taikhoan SET TaiKhoan=?, MatKhau=? WHERE MaTK=?";
        XJdbc.update(sql,
                entity.getTaiKhoan(),
                entity.getMatKhau(),
                entity.getMaTaiKhoan());
    }

    @Override
    public void delete(String matk) {
        String sql="DELETE FROM taikhoan WHERE matk=?";
        XJdbc.update(sql, matk);
    }

    @Override
    public taikhoan selectById(String TaiKhoan) {
        String sql="SELECT * FROM taikhoan WHERE TaiKhoan=?";
        List<taikhoan> list = selectBySql(sql, TaiKhoan);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<taikhoan> selectAll() {
        String sql="SELECT * FROM taikhoan";
        return selectBySql(sql);

    }

    @Override
    protected List<taikhoan> selectBySql(String sql, Object... args) {
        List<taikhoan> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    taikhoan entity=new taikhoan();
                    entity.setMaTaiKhoan(rs.getString("MaTK"));
                    entity.setTaiKhoan(rs.getString("TaiKhoan"));
                    entity.setMatKhau(rs.getString("MatKhau"));
                    entity.setMaNhanVien(rs.getString("MaNV"));
                    list.add(entity);
                }
            }
            finally{
                rs.getStatement().getConnection().close();
            }
        }
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;

    }
}
