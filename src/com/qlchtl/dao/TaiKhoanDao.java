package com.qlchtl.dao;

import com.qlchtl.entity.TaiKhoan;
import com.qlchtl.utils.XJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TaiKhoanDao extends qlchSysDao<TaiKhoan,String> {

    @Override
    public void insert(TaiKhoan entity) {
        String sql="INSERT INTO taikhoan(MaTK, TaiKhoan, MatKhau,MaNV, role) VALUES(?, ?, ?,?,?)";
        XJdbc.update(sql,
                entity.getMaTaiKhoan(),
                entity.getTaiKhoan(),
                entity.getMatKhau(),
                entity.getMaNhanVien(),
                entity.getIsRole());

    }


    public void updateMK(TaiKhoan entity) {
        String sql="UPDATE taikhoan SET MatKhau=? WHERE MaTK=?";
        XJdbc.update(sql,
                entity.getMatKhau(),
                entity.getMaTaiKhoan());
    }

    @Override
    public void update(TaiKhoan entity) {
        String sql="UPDATE taikhoan SET TaiKhoan=?, MatKhau=?, role = ? WHERE MaTK=?";
        XJdbc.update(sql,
                entity.getTaiKhoan(),
                entity.getMatKhau(),
                entity.getIsRole(),
                entity.getMaTaiKhoan());
    }


    public void updateRole(TaiKhoan entity) {
        String sql="UPDATE taikhoan SET role = ? WHERE MaTK=?";
        XJdbc.update(sql,
                entity.getIsRole(),
                entity.getMaTaiKhoan());
    }

    @Override
    public void delete(String matk) {
        String sql="DELETE FROM taikhoan WHERE matk=?";
        XJdbc.update(sql, matk);
    }

    @Override
    public TaiKhoan selectById(String TaiKhoan) {
        String sql="SELECT * FROM taikhoan WHERE TaiKhoan=?";
        List<com.qlchtl.entity.TaiKhoan> list = selectBySql(sql, TaiKhoan);
        return list.size() > 0 ? list.get(0) : null;
    }


    public  List<TaiKhoan>  selectByName(String tenNV) {
        String sql = "SELECT * FROM taikhoan WHERE TaiKhoan LIKE ?";
        List<TaiKhoan> list = selectBySql(sql, "%" + tenNV + "%");
        return list;
    }

    public TaiKhoan selectByTK(String TaiKhoan) {
        String sql="SELECT * FROM taikhoan WHERE matk=?";
        List<com.qlchtl.entity.TaiKhoan> list = selectBySql(sql, TaiKhoan);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<TaiKhoan> selectAll() {
        String sql="SELECT * FROM taikhoan";
        return selectBySql(sql);

    }

    @Override
    protected List<TaiKhoan> selectBySql(String sql, Object... args) {
        List<TaiKhoan> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while(rs.next()){
                    TaiKhoan entity=new TaiKhoan();
                    entity.setMaTaiKhoan(rs.getString("MaTK"));
                    entity.setTaiKhoan(rs.getString("TaiKhoan"));
                    entity.setMatKhau(rs.getString("MatKhau"));
                    entity.setMaNhanVien(rs.getString("MaNV"));
                    entity.setIsRole(rs.getInt("Role"));
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
    
    
     public int tongTaiKhoan()
    {
        String sql="SELECT COUNT(*) AS total FROM taikhoan";
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
