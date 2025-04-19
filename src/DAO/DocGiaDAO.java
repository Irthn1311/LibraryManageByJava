package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

import DTO.DocGiaDTO;
import DTO.TheThanhVienDTO;

import java.text.SimpleDateFormat;

public class DocGiaDAO {
    private mySQLConnect mySQL;
    private TheThanhVienDAO theThanhVienDAO;
    
    public DocGiaDAO() {
        mySQL = new mySQLConnect();
        theThanhVienDAO = new TheThanhVienDAO();
    }
    
    // Lấy danh sách tất cả độc giả
    public ArrayList<DocGiaDTO> getList() {
        ArrayList<DocGiaDTO> list = new ArrayList<>();
        
        try {
            // Kiểm tra kết nối
            if (!mySQL.isConnected()) {
                throw new SQLException("Không có kết nối database!");
            }
            
            String sql = "SELECT dg.ma_doc_gia, dg.ten_doc_gia, dg.gioi_tinh, dg.so_dien_thoai, " +
                        "dg.ngay_sinh, dg.dia_chi, " +
                        "ttv.ma_the, ttv.ngay_cap, ttv.ngay_het_han, COALESCE(ttv.trang_thai, true) as trang_thai " +
                        "FROM DocGia dg " +
                        "LEFT JOIN TheThanhVien ttv ON dg.ma_doc_gia = ttv.ma_doc_gia";
            System.out.println("Executing SQL: " + sql);
            
            ResultSet rs = mySQL.executeQuery(sql);
            if (rs == null) {
                throw new SQLException("Không thể lấy dữ liệu từ database!");
            }
            
            while(rs.next()) {
                DocGiaDTO dg = new DocGiaDTO(
                    rs.getString("ma_doc_gia"),
                    rs.getString("ten_doc_gia"),
                    rs.getString("gioi_tinh"),
                    rs.getString("so_dien_thoai"),
                    rs.getDate("ngay_sinh"),
                    rs.getString("dia_chi"),
                    rs.getString("ma_the"),
                    rs.getDate("ngay_cap"),
                    rs.getDate("ngay_het_han"),
                    rs.getBoolean("trang_thai")
                );
                list.add(dg);
            }
            
            rs.close();
            
        } catch(SQLException ex) {
            System.out.println("Lỗi SQL: " + ex.getMessage());
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi đọc dữ liệu từ database: " + ex.getMessage());
        } catch(Exception ex) {
            System.out.println("Lỗi: " + ex.getMessage());
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi không xác định: " + ex.getMessage());
        }
        
        return list;
    }
    
    // Thêm độc giả mới
    public boolean add(DocGiaDTO dg) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            
            // Thêm độc giả
            String sql = "INSERT INTO DocGia(ma_doc_gia, ten_doc_gia, gioi_tinh, so_dien_thoai, ngay_sinh, dia_chi) VALUES(";
            sql += "'" + dg.getMaDG() + "',";
            sql += "'" + dg.getTenDG() + "',";
            sql += "'" + dg.getGioiTinh() + "',";
            sql += (dg.getSoDienThoai() != null ? "'" + dg.getSoDienThoai() + "'" : "NULL") + ",";
            sql += "'" + sdf.format(dg.getNgaySinh()) + "',";
            sql += (dg.getDiaChi() != null ? "'" + dg.getDiaChi() + "'" : "NULL") + ")";
            
            System.out.println("Executing SQL: " + sql);
            if (mySQL.executeUpdate(sql) <= 0) {
                return false;
            }
            
            // Thêm thẻ thành viên nếu có
            if (dg.getMaThe() != null) {
                TheThanhVienDTO the = new TheThanhVienDTO(
                    dg.getMaThe(),
                    dg.getMaDG(),
                    dg.getNgayCap(),
                    dg.getNgayHetHan(),
                    true
                );
                return theThanhVienDAO.add(the);
            }
            
            return true;
            
        } catch(Exception ex) {
            System.out.println("Lỗi thêm độc giả: " + ex.getMessage());
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi thêm độc giả: " + ex.getMessage());
            return false;
        }
    }
    
    // Cập nhật thông tin độc giả
    public boolean update(DocGiaDTO dg) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            boolean success = true;
            
            // Cập nhật độc giả
            String sql = "UPDATE DocGia SET ";
            sql += "ten_doc_gia = '" + dg.getTenDG() + "',";
            sql += "gioi_tinh = '" + dg.getGioiTinh() + "',";
            sql += "so_dien_thoai = " + (dg.getSoDienThoai() != null ? "'" + dg.getSoDienThoai() + "'" : "NULL") + ",";
            sql += "ngay_sinh = '" + sdf.format(dg.getNgaySinh()) + "',";
            sql += "dia_chi = " + (dg.getDiaChi() != null ? "'" + dg.getDiaChi() + "'" : "NULL");
            sql += " WHERE ma_doc_gia = '" + dg.getMaDG() + "'";
            
            System.out.println("Executing SQL DocGia update: " + sql);
            int docGiaResult = mySQL.executeUpdate(sql);
            if (docGiaResult < 0) {
                System.out.println("Lỗi khi cập nhật DocGia");
                return false;
            }
            
            // Cập nhật thẻ thành viên nếu có
            if (dg.getMaThe() != null && !dg.getMaThe().trim().isEmpty()) {
                // Kiểm tra xem thẻ đã tồn tại chưa
                String checkSql = "SELECT ma_the FROM TheThanhVien WHERE ma_doc_gia = '" + dg.getMaDG() + "'";
                ResultSet rs = mySQL.executeQuery(checkSql);
                
                if (rs != null && rs.next()) {
                    String oldMaThe = rs.getString("ma_the");
                    // Nếu mã thẻ thay đổi, kiểm tra xem mã thẻ mới có tồn tại không
                    if (!oldMaThe.equals(dg.getMaThe())) {
                        String checkNewCardSql = "SELECT ma_the FROM TheThanhVien WHERE ma_the = '" + dg.getMaThe() + "'";
                        ResultSet rsNewCard = mySQL.executeQuery(checkNewCardSql);
                        
                        if (rsNewCard != null && rsNewCard.next()) {
                            // Nếu mã thẻ đã tồn tại, thông báo lỗi
                            JOptionPane.showMessageDialog(null, "Mã thẻ " + dg.getMaThe() + " đã tồn tại trong hệ thống!");
                            if (rsNewCard != null) rsNewCard.close();
                            if (rs != null) rs.close();
                            return false;
                        }
                        if (rsNewCard != null) rsNewCard.close();
                    }
                    
                    // Cập nhật thông tin thẻ
                    sql = "UPDATE TheThanhVien SET ";
                    sql += "ma_the = '" + dg.getMaThe() + "',";
                    if (dg.getNgayCap() != null) {
                        sql += "ngay_cap = '" + sdf.format(dg.getNgayCap()) + "',";
                    }
                    if (dg.getNgayHetHan() != null) {
                        sql += "ngay_het_han = '" + sdf.format(dg.getNgayHetHan()) + "',";
                    }
                    sql += "trang_thai = " + dg.isTrangThai();
                    sql += " WHERE ma_doc_gia = '" + dg.getMaDG() + "'";
                } else {
                    // Kiểm tra xem mã thẻ mới có tồn tại không
                    String checkNewCardSql = "SELECT ma_the FROM TheThanhVien WHERE ma_the = '" + dg.getMaThe() + "'";
                    ResultSet rsNewCard = mySQL.executeQuery(checkNewCardSql);
                    
                    if (rsNewCard != null && rsNewCard.next()) {
                        // Nếu mã thẻ đã tồn tại, thông báo lỗi
                        JOptionPane.showMessageDialog(null, "Mã thẻ " + dg.getMaThe() + " đã tồn tại trong hệ thống!");
                        if (rsNewCard != null) rsNewCard.close();
                        if (rs != null) rs.close();
                        return false;
                    }
                    
                    // Nếu chưa có thẻ và mã thẻ mới chưa tồn tại thì thêm mới
                    sql = "INSERT INTO TheThanhVien(ma_the, ma_doc_gia, ngay_cap, ngay_het_han, trang_thai) VALUES(";
                    sql += "'" + dg.getMaThe() + "',";
                    sql += "'" + dg.getMaDG() + "',";
                    sql += (dg.getNgayCap() != null ? "'" + sdf.format(dg.getNgayCap()) + "'" : "NULL") + ",";
                    sql += (dg.getNgayHetHan() != null ? "'" + sdf.format(dg.getNgayHetHan()) + "'" : "NULL") + ",";
                    sql += dg.isTrangThai() + ")";
                    
                    if (rsNewCard != null) rsNewCard.close();
                }
                
                System.out.println("Executing SQL TheThanhVien update/insert: " + sql);
                if (rs != null) rs.close();
                
                int theThanhVienResult = mySQL.executeUpdate(sql);
                if (theThanhVienResult < 0) {
                    System.out.println("Lỗi khi cập nhật TheThanhVien");
                    success = false;
                }
            }
            
            return success;
            
        } catch(Exception ex) {
            System.out.println("Lỗi cập nhật độc giả: " + ex.getMessage());
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi cập nhật độc giả: " + ex.getMessage());
            return false;
        }
    }
    
    // Xóa độc giả (cập nhật trạng thái = false trong thẻ thành viên)
    public boolean delete(String maDG) {
        try {
            // Kiểm tra xem độc giả có thẻ thành viên không
            String checkSql = "SELECT ma_the FROM TheThanhVien WHERE ma_doc_gia = '" + maDG + "'";
            ResultSet rs = mySQL.executeQuery(checkSql);
            
            if (rs != null && rs.next()) {
                // Nếu có thẻ thành viên thì cập nhật trạng thái
                String sql = "UPDATE TheThanhVien SET trang_thai = false " +
                           "WHERE ma_doc_gia = '" + maDG + "'";
                System.out.println("Executing SQL: " + sql);
                boolean result = mySQL.executeUpdate(sql) > 0;
                rs.close();
                return result;
            } else {
                // Nếu không có thẻ thành viên thì thêm mới với trạng thái false
                String sql = "INSERT INTO TheThanhVien(ma_the, ma_doc_gia, trang_thai) " +
                           "VALUES('THE" + System.currentTimeMillis() + "', '" + maDG + "', false)";
                System.out.println("Executing SQL: " + sql);
                boolean result = mySQL.executeUpdate(sql) > 0;
                if (rs != null) rs.close();
                return result;
            }
        } catch(Exception ex) {
            System.out.println("Lỗi xóa độc giả: " + ex.getMessage());
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi xóa độc giả: " + ex.getMessage());
            return false;
        }
    }
    
    // Khôi phục độc giả đã xóa
    public boolean restore(String maDG) {
        try {
            String sql = "UPDATE TheThanhVien SET trang_thai = true " +
                        "WHERE ma_doc_gia = '" + maDG + "'";
            System.out.println("Executing SQL: " + sql);
            return mySQL.executeUpdate(sql) > 0;
        } catch(Exception ex) {
            System.out.println("Lỗi khôi phục độc giả: " + ex.getMessage());
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi khôi phục độc giả: " + ex.getMessage());
            return false;
        }
    }
    
    // Tìm kiếm độc giả
    public ArrayList<DocGiaDTO> search(String keyword, String selectedOption) {
        ArrayList<DocGiaDTO> list = new ArrayList<>();
        
        try {
            String sql = "SELECT dg.ma_doc_gia, dg.ten_doc_gia, dg.gioi_tinh, dg.so_dien_thoai, " +
                        "dg.ngay_sinh, dg.dia_chi, " +
                        "ttv.ma_the, ttv.ngay_cap, ttv.ngay_het_han, ttv.trang_thai " +
                        "FROM DocGia dg " +
                        "LEFT JOIN TheThanhVien ttv ON dg.ma_doc_gia = ttv.ma_doc_gia " +
                        "WHERE ";
            
            // Thêm điều kiện tìm kiếm dựa trên option được chọn
            switch(selectedOption) {
                case "Mã độc giả":
                    sql += "dg.ma_doc_gia LIKE '%" + keyword + "%'";
                    break;
                case "Tên độc giả":
                    sql += "dg.ten_doc_gia LIKE '%" + keyword + "%'";
                    break;
                case "Số điện thoại":
                    sql += "dg.so_dien_thoai LIKE '%" + keyword + "%'";
                    break;
                case "Địa chỉ":
                    sql += "dg.dia_chi LIKE '%" + keyword + "%'";
                    break;
                case "Mã thẻ":
                    sql += "ttv.ma_the LIKE '%" + keyword + "%'";
                    break;
                default: // Tất cả
                    sql += "dg.ma_doc_gia LIKE '%" + keyword + "%' OR " +
                           "dg.ten_doc_gia LIKE '%" + keyword + "%' OR " +
                           "dg.so_dien_thoai LIKE '%" + keyword + "%' OR " +
                           "dg.dia_chi LIKE '%" + keyword + "%' OR " +
                           "ttv.ma_the LIKE '%" + keyword + "%'";
            }
                    
            System.out.println("Executing SQL: " + sql);
            ResultSet rs = mySQL.executeQuery(sql);
            
            if (rs == null) {
                throw new SQLException("Không thể lấy dữ liệu từ database!");
            }
            
            while(rs.next()) {
                DocGiaDTO dg = new DocGiaDTO(
                    rs.getString("ma_doc_gia"),
                    rs.getString("ten_doc_gia"),
                    rs.getString("gioi_tinh"),
                    rs.getString("so_dien_thoai"),
                    rs.getDate("ngay_sinh"),
                    rs.getString("dia_chi"),
                    rs.getString("ma_the"),
                    rs.getDate("ngay_cap"),
                    rs.getDate("ngay_het_han"),
                    rs.getBoolean("trang_thai")
                );
                list.add(dg);
            }
            
            rs.close();
            
        } catch(SQLException ex) {
            System.out.println("Lỗi SQL: " + ex.getMessage());
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi tìm kiếm dữ liệu: " + ex.getMessage());
        } catch(Exception ex) {
            System.out.println("Lỗi: " + ex.getMessage());
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi không xác định khi tìm kiếm: " + ex.getMessage());
        }
        
        return list;
    }
} 