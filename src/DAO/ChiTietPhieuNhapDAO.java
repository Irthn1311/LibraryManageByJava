package DAO;

import DTO.ChiTietPhieuNhapDTO;
import DTO.PhieuNhapDTO;
import java.sql.*;
import java.util.ArrayList;

public class ChiTietPhieuNhapDAO {
    private mySQLConnect db = new mySQLConnect();

        public void themChiTietPhieuNhap(ChiTietPhieuNhapDTO ct) throws SQLException {
            if (!kiemTraChiTietTonTai(ct)) { // Kiểm tra trước khi thêm
                String sql = "INSERT INTO ChiTietPhieuNhap(ma_phieu_nhap, loai_sach, don_gia, so_luong, thanh_tien) VALUES (?, ?, ?, ?, ?)";
                try (PreparedStatement stmt = db.getConnection().prepareStatement(sql)) {
                    stmt.setString(1, ct.getMaPhieuNhap());
                    stmt.setString(2, ct.getLoaiSach());
                    stmt.setInt(3, ct.getDonGia());
                    stmt.setInt(4, ct.getSoLuong());
                    stmt.setInt(5, ct.getThanhTien());
                    stmt.executeUpdate();
                }
            }
        }
        
    // Hàm kiểm tra chi tiết phiếu nhập đã tồn tại hay chưa
    private boolean kiemTraChiTietTonTai(ChiTietPhieuNhapDTO ct) throws SQLException {
        String sql = "SELECT 1 FROM ChiTietPhieuNhap WHERE ma_phieu_nhap = ? AND loai_sach = ? AND don_gia = ? AND so_luong = ?";
        try (PreparedStatement stmt = db.getConnection().prepareStatement(sql)) {
            stmt.setString(1, ct.getMaPhieuNhap());
            stmt.setString(2, ct.getLoaiSach());
            stmt.setInt(3, ct.getDonGia());
            stmt.setInt(4, ct.getSoLuong());
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        }
    }    
    
    public void xoaChiTietTheoMaPhieu(String maPhieu) throws SQLException {
        String sql = "DELETE FROM ChiTietPhieuNhap WHERE ma_phieu_nhap = ?";
        if (db.getConnection() == null || db.getConnection().isClosed()) {
            db = new mySQLConnect();
        }
        try (PreparedStatement stmt = db.getConnection().prepareStatement(sql)) {
            stmt.setString(1, maPhieu);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }


    public void xoaChiTietVaPhieuNhap(int maCTPN, String maPhieuNhap) throws SQLException {
        String sqlXoaCT = "DELETE FROM ChiTietPhieuNhap WHERE ma_ctpn = ?";
        String sqlXoaPhieu = "DELETE FROM PhieuNhap WHERE ma_phieu_nhap = ?";

        try (Connection conn = db.getConnection()) {
            conn.setAutoCommit(false);
            try (
                PreparedStatement stmtCT = conn.prepareStatement(sqlXoaCT);
                PreparedStatement stmtPhieu = conn.prepareStatement(sqlXoaPhieu)
            ) {
                stmtCT.setInt(1, maCTPN);
                stmtCT.executeUpdate();

                stmtPhieu.setString(1, maPhieuNhap);
                stmtPhieu.executeUpdate();

                conn.commit();
            } catch (SQLException ex) {
                conn.rollback();
                throw ex;
            } finally {
                conn.setAutoCommit(true);
            }
        }
    }


    public ArrayList<ChiTietPhieuNhapDTO> layDanhSachTheoMaPhieu(String maPhieuNhap) throws SQLException {
        ArrayList<ChiTietPhieuNhapDTO> ds = new ArrayList<>();
        String sql = "SELECT * FROM ChiTietPhieuNhap WHERE ma_phieu_nhap = ?";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Mở kết nối và chuẩn bị câu lệnh
            conn = db.getConnection(); 
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, maPhieuNhap);

            rs = stmt.executeQuery();
            while (rs.next()) {
                ChiTietPhieuNhapDTO ct = new ChiTietPhieuNhapDTO(
                    rs.getInt("ma_ctpn"),
                    rs.getString("ma_phieu_nhap"),
                    rs.getString("loai_sach"),
                    rs.getInt("don_gia"),
                    rs.getInt("so_luong"),
                    rs.getInt("thanh_tien")
                );
                ds.add(ct);
            }
        } finally {
            // Đảm bảo đóng kết nối và các đối tượng sau khi sử dụng
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        }

        return ds;
    }
    
    public ArrayList<ChiTietPhieuNhapDTO> timKiemChiTiet(String tuKhoa) throws SQLException {
        ArrayList<ChiTietPhieuNhapDTO> ketQua = new ArrayList<>();
        String sql = "SELECT * FROM chitietphieunhap WHERE " +
                     "CAST(ma_ctpn AS CHAR) LIKE ? OR " +
                     "ma_phieu_nhap LIKE ? OR " +
                     "loai_sach LIKE ? OR " +
                     "CAST(don_gia AS CHAR) LIKE ? OR " +
                     "CAST(so_luong AS CHAR) LIKE ? OR " +
                     "CAST(thanh_tien AS CHAR) LIKE ?";
        try (PreparedStatement stmt = db.getConnection().prepareStatement(sql)) {
            for (int i = 1; i <= 6; i++) {
                stmt.setString(i, "%" + tuKhoa + "%");
            }
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ketQua.add(new ChiTietPhieuNhapDTO(
                        rs.getInt("ma_ctpn"),
                        rs.getString("ma_phieu_nhap"),
                        rs.getString("loai_sach"),
                        rs.getInt("don_gia"),
                        rs.getInt("so_luong"),
                        rs.getInt("thanh_tien")
                ));
            }
        }
        return ketQua;
    }
    
    public ArrayList<ChiTietPhieuNhapDTO> layTatCaChiTietPhieuNhap() throws SQLException {
        ArrayList<ChiTietPhieuNhapDTO> ds = new ArrayList<>();
        String sql = "SELECT * FROM ChiTietPhieuNhap";

        try (PreparedStatement stmt = db.getConnection().prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                ChiTietPhieuNhapDTO ct = new ChiTietPhieuNhapDTO(
                    rs.getInt("ma_ctpn"),
                    rs.getString("ma_phieu_nhap"),
                    rs.getString("loai_sach"),
                    rs.getInt("don_gia"),
                    rs.getInt("so_luong"),
                    rs.getInt("thanh_tien")
                );
                ds.add(ct);
            }
        }

        return ds;
    }
    
    public ArrayList<String> layDanhSachLoaiSach() {
        ArrayList<String> danhSachLoaiSach = new ArrayList<>();
        try {
            // SQL query để lấy danh sách thể loại sách từ bảng ChiTietPhieuNhap
            String sql = "SELECT DISTINCT loai_sach FROM ChiTietPhieuNhap"; 
            try (PreparedStatement pst = db.getConnection().prepareStatement(sql)) {
                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    // Thêm thể loại sách vào danh sách
                    danhSachLoaiSach.add(rs.getString("loai_sach"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return danhSachLoaiSach;
    }


}
