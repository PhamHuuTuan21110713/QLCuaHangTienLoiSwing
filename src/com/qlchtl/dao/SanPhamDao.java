package com.qlchtl.dao;

import com.qlchtl.entity.SanPham;
import com.qlchtl.utils.XJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SanPhamDao extends qlchSysDao<SanPham,String> {
    @Override
    public void insert(SanPham sanPham) {
        String sql = "INSERT INTO sanpham(MaSP, TenSP, NoiSanXuat, TrangThai, TienGoc, TienThanhToan, NgayNhapHang, MaNCC, img) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        XJdbc.update(sql,
                sanPham.getMaSP(),
                sanPham.getTenSP(),
                sanPham.getNoiSanXuat(),
                sanPham.getTrangThai(),
                sanPham.getTienGoc(),
                sanPham.getTienThanhToan(),
                sanPham.getNgayNhapHang(),
                sanPham.getMaNCC(),
                sanPham.getImg());
    }

    public void update(SanPham sanPham) {
        String sql = "UPDATE sanpham SET TenSP = ?, NoiSanXuat = ?, TrangThai = ?, TienGoc = ?, TienThanhToan = ?, " +
                "NgayNhapHang = ?, MaNCC = ?, img = ? WHERE MaSP = ?";
        XJdbc.update(sql,
                sanPham.getTenSP(),
                sanPham.getNoiSanXuat(),
                sanPham.getTrangThai(),
                sanPham.getTienGoc(),
                sanPham.getTienThanhToan(),
                sanPham.getNgayNhapHang(),
                sanPham.getMaNCC(),
                sanPham.getImg(),
                sanPham.getMaSP());

    }


    public void updateTrangThai(SanPham sanPham) {
        String sql = "UPDATE sanpham SET TrangThai = ? WHERE MaSP = ?";
        XJdbc.update(sql,
                sanPham.getTrangThai(),
                sanPham.getMaSP());

    }




    public void updatekHinh(SanPham sanPham) {
        String sql = "UPDATE sanpham SET TenSP = ?, NoiSanXuat = ?, TrangThai = ?, TienGoc = ?, TienThanhToan = ?, " +
                "NgayNhapHang = ?, MaNCC = ? WHERE MaSP = ?";
        XJdbc.update(sql,
                sanPham.getTenSP(),
                sanPham.getNoiSanXuat(),
                sanPham.getTrangThai(),
                sanPham.getTienGoc(),
                sanPham.getTienThanhToan(),
                sanPham.getNgayNhapHang(),
                sanPham.getMaNCC(),
                sanPham.getMaSP());
    }

    @Override
    public void delete(String maSP) {
        String sql = "DELETE FROM sanpham WHERE MaSP = ?";
        XJdbc.update(sql, maSP);
    }

    @Override
    public SanPham selectById(String maSP) {
        String sql = "SELECT * FROM sanpham WHERE MaSP = ?";
        List<SanPham> list = selectBySql(sql, maSP);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<SanPham> selectAll() {
        String sql = "SELECT * FROM sanpham";
        return selectBySql(sql);
    }


    public  SanPham spLIMIT (){
        String sql = "SELECT * FROM sanpham LIMIT 1";
        List<SanPham> list = selectBySql(sql);
        return list.isEmpty() ? null : list.get(0);
    }

    protected List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try (ResultSet rs = XJdbc.query(sql, args)) {
            while (rs.next()) {
                SanPham sanPham = new SanPham(
                        rs.getString("MaSP"),
                        rs.getString("TenSP"),
                        rs.getString("NoiSanXuat"),
                        rs.getString("TrangThai"),
                        rs.getString("TienGoc"),
                        rs.getString("TienThanhToan"),
                        rs.getDate("NgayNhapHang").toLocalDate(),
                        rs.getString("MaNCC"),
                        rs.getString("img")
                );
                list.add(sanPham);
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
}
