
package DAO;

import java.sql.*;
import java.util.ArrayList;

public class NhanVienDAO {
    
    public boolean kiemTraSuTonTai(int idNhanVien) throws SQLException {
        String sql = "SELECT COUNT(*) FROM NhanVien WHERE ID_NhanVien = ?";
        try (Connection conn = SQLServerConnect.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idNhanVien);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;  // Trả về true nếu có nhân viên với ID_NhanVien
            }
        }
        return false;
    }


    public ArrayList<DTO.NhanVienDTO> layDanhSachNhanVien() throws SQLException {
        ArrayList<DTO.NhanVienDTO> dsnv = new ArrayList<>();
        String sql = "SELECT * FROM NhanVien";
        try (Connection conn = SQLServerConnect.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                DTO.NhanVienDTO nv = new DTO.NhanVienDTO(
                    rs.getInt("ID_NhanVien"),
                    rs.getString("TenNhanVien"),
                    rs.getString("GioiTinh"),
                    rs.getDate("NgaySinh"),
                    rs.getString("DiaChi"),
                    rs.getString("SoDienThoai"),
                    rs.getString("Email"),
                    rs.getString("VaiTro"),
                    rs.getDouble("Luong"),
                    rs.getDate("NgayVaoLam")    
                      
                );
                dsnv.add(nv);
            }
        }
        return dsnv;
    }

    public void themNhanVien(DTO.NhanVienDTO nv) throws SQLException {
        String sql = "INSERT INTO NhanVien (TenNhanVien, GioiTinh, NgaySinh, DiaChi, SoDienThoai, Email, VaiTro, Luong, NgayVaoLam) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?)";
        try (Connection conn = SQLServerConnect.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nv.getTenNhanVien());
            stmt.setString(2, nv.getGioiTinh());
            stmt.setDate(3, nv.getNgaySinh());
            stmt.setString(4, nv.getDiaChi());
            stmt.setString(5, nv.getSoDienThoai());
            stmt.setString(6, nv.getEmail());
            stmt.setString(7, nv.getVaiTro());
            stmt.setDouble(8, nv.getLuong());
            stmt.setDate(9, nv.getNgayVaoLam());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Lỗi khi thêm nhân viên: " + ex.getMessage());
            throw ex;
        }
    }

    public void suaNhanVien(DTO.NhanVienDTO nv) throws SQLException {
        String sql = "UPDATE NhanVien SET TenNhanVien = ?, GioiTinh = ?, NgaySinh = ?, DiaChi = ?, SoDienThoai = ?, Email = ?, VaiTro = ?, Luong = ?, NgayVaoLam = ? WHERE ID_NhanVien = ?";
        try (Connection conn = SQLServerConnect.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nv.getTenNhanVien());
            stmt.setString(2, nv.getGioiTinh());
            stmt.setDate(3, nv.getNgaySinh());
            stmt.setString(4, nv.getDiaChi());
            stmt.setString(5, nv.getSoDienThoai());
            stmt.setString(6, nv.getEmail());
            stmt.setString(7, nv.getVaiTro());
            stmt.setDouble(8, nv.getLuong());
            stmt.setDate(9, nv.getNgayVaoLam());
            stmt.setInt(10, nv.getIdNhanVien());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Lỗi khi cập nhật nhân viên: " + ex.getMessage());
            throw ex;
        }
    }

    public void xoaNhanVien(int idNhanVien) throws SQLException {
        String sql = "DELETE FROM NhanVien WHERE ID_NhanVien = ?";
        try (Connection conn = SQLServerConnect.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idNhanVien);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("Lỗi khi xóa nhân viên: " + ex.getMessage());
            throw ex;
        }
    }

    public ArrayList<DTO.NhanVienDTO> timKiemNhanVien(String tuKhoa) throws SQLException {
        ArrayList<DTO.NhanVienDTO> ketQua = new ArrayList<>();
        String sql = "SELECT * FROM NhanVien WHERE " +
                     "CAST(ID_NhanVien AS NVARCHAR) LIKE ? OR " +
                     "TenNhanVien LIKE ? OR " +
                     "GioiTinh LIKE ? OR " +
                     "CAST(NgaySinh AS NVARCHAR) LIKE ? OR " +
                     "DiaChi LIKE ? OR " +
                     "SoDienThoai LIKE ? OR " +
                     "Email LIKE ? OR " +
                     "VaiTro LIKE ? OR " +
                     "CAST(Luong AS NVARCHAR) LIKE ? OR " +
                     "CAST(NgayVaoLam AS NVARCHAR) LIKE ? ";
        try (Connection conn = SQLServerConnect.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            for (int i = 1; i <= 10; i++) {
                stmt.setString(i, "%" + tuKhoa + "%");
            }
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ketQua.add(new DTO.NhanVienDTO(
                    rs.getInt("ID_NhanVien"),
                    rs.getString("TenNhanVien"),
                    rs.getString("GioiTinh"),
                    rs.getDate("NgaySinh"),
                    rs.getString("DiaChi"),
                    rs.getString("SoDienThoai"),
                    rs.getString("Email"),
                    rs.getString("VaiTro"),
                    rs.getDouble("Luong"),
                    rs.getDate("NgayVaoLam")    
                ));
            }
        }
        return ketQua;
    }
}

