package DAO;

import DTO.NhanVienDTO;
import java.sql.*;
import java.util.ArrayList;

public class NhanVienDAO {
    private mySQLConnect db = new mySQLConnect();

    public boolean kiemTraSuTonTai(int idNhanVien) throws SQLException {
        String sql = "SELECT COUNT(*) FROM NhanVien WHERE ma_nhan_vien = ?";
        try (PreparedStatement stmt = db.getConnection().prepareStatement(sql)) {
            stmt.setInt(1, idNhanVien);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        }
        return false;
    }

    public ArrayList<NhanVienDTO> layDanhSachNhanVien() throws SQLException {
        ArrayList<NhanVienDTO> dsnv = new ArrayList<>();
        String sql = "SELECT * FROM NhanVien";
        try (PreparedStatement stmt = db.getConnection().prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                NhanVienDTO nv = new NhanVienDTO(
                    rs.getInt("ma_nhan_vien"), 
                    rs.getString("TenNhanVien"),
                    rs.getString("GioiTinh"),
                    rs.getDate("NgaySinh"),
                    rs.getString("DiaChi"),
                    rs.getString("SoDienThoai"),
                    rs.getString("Email"),
                    rs.getString("VaiTro"),
                    rs.getDate("NgayVaoLam"),
                    rs.getString("TrangThai")
                );
                dsnv.add(nv);
            }
        }
        return dsnv;
    }


    public void themNhanVien(NhanVienDTO nv) throws SQLException {
        String sql = "INSERT INTO NhanVien (TenNhanVien, GioiTinh, NgaySinh, DiaChi, SoDienThoai, Email, VaiTro, NgayVaoLam, TrangThai) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = db.getConnection().prepareStatement(sql)) {
            stmt.setString(1, nv.getTenNhanVien());
            stmt.setString(2, nv.getGioiTinh());
            stmt.setDate(3, nv.getNgaySinh());
            stmt.setString(4, nv.getDiaChi());
            stmt.setString(5, nv.getSoDienThoai());
            stmt.setString(6, nv.getEmail());
            stmt.setString(7, nv.getVaiTro());
            stmt.setDate(8, nv.getNgayVaoLam());
            stmt.setString(9, nv.getTrangThai());

            stmt.executeUpdate(); // Thực thi câu lệnh
        }
    }


    public void suaNhanVien(NhanVienDTO nv) throws SQLException {
        String sql = "UPDATE NhanVien SET TenNhanVien = ?, GioiTinh = ?, NgaySinh = ?, DiaChi = ?, SoDienThoai = ?, Email = ?, VaiTro = ?, NgayVaoLam = ?, TrangThai = ? WHERE ma_nhan_vien = ?";
        try (PreparedStatement stmt = db.getConnection().prepareStatement(sql)) {
            stmt.setString(1, nv.getTenNhanVien());
            stmt.setString(2, nv.getGioiTinh());
            stmt.setDate(3, nv.getNgaySinh());
            stmt.setString(4, nv.getDiaChi());
            stmt.setString(5, nv.getSoDienThoai());
            stmt.setString(6, nv.getEmail());
            stmt.setString(7, nv.getVaiTro());
            stmt.setDate(8, nv.getNgayVaoLam());
            stmt.setString(9, nv.getTrangThai());
            stmt.setInt(10, nv.getIdNhanVien());
            stmt.executeUpdate();
        }
    }

    public void xoaNhanVien(int idNhanVien) throws SQLException {
        String sql = "DELETE FROM NhanVien WHERE ma_nhan_vien = ?";
        try (PreparedStatement stmt = db.getConnection().prepareStatement(sql)) {
            stmt.setInt(1, idNhanVien);
            stmt.executeUpdate();
        }
    }

    public ArrayList<NhanVienDTO> timKiemNhanVien(String tuKhoa) throws SQLException {
        ArrayList<NhanVienDTO> ketQua = new ArrayList<>();
        String sql = "SELECT * FROM NhanVien WHERE " +
                     "CAST(ma_nhan_vien AS CHAR) LIKE ? OR " +
                     "TenNhanVien LIKE ? OR " +
                     "GioiTinh LIKE ? OR " +
                     "CAST(NgaySinh AS CHAR) LIKE ? OR " +
                     "DiaChi LIKE ? OR " +
                     "SoDienThoai LIKE ? OR " +
                     "Email LIKE ? OR " +
                     "VaiTro LIKE ? OR " +
                     "CAST(NgayVaoLam AS CHAR) LIKE ? OR " +
                     "TrangThai LIKE ?";
        try (PreparedStatement stmt = db.getConnection().prepareStatement(sql)) {
            for (int i = 1; i <= 10; i++) {
                stmt.setString(i, "%" + tuKhoa + "%");
            }
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ketQua.add(new NhanVienDTO(
                    rs.getInt("ma_nhan_vien"), 
                    rs.getString("TenNhanVien"),
                    rs.getString("GioiTinh"),
                    rs.getDate("NgaySinh"),
                    rs.getString("DiaChi"),
                    rs.getString("SoDienThoai"),
                    rs.getString("Email"),
                    rs.getString("VaiTro"),
                    rs.getDate("NgayVaoLam"),
                    rs.getString("TrangThai")
                ));
            }
        }
        return ketQua;
    }


    public void capNhatTrangThai(int maNhanVien, String trangThai) throws SQLException {
        String sql = "UPDATE NhanVien SET TrangThai = ? WHERE ma_nhan_vien = ?";
        try (PreparedStatement stmt = db.getConnection().prepareStatement(sql)) {
            stmt.setString(1, trangThai);
            stmt.setInt(2, maNhanVien);
            stmt.executeUpdate();
        }
    }
    
    

}
