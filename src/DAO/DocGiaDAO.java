package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

import DTO.DocGiaDTO;

import java.text.SimpleDateFormat;

public class DocGiaDAO {
    private mySQLConnect mySQL;
    
    public DocGiaDAO() {
        mySQL = new mySQLConnect();
    }
    
    // Lấy danh sách tất cả độc giả
    public ArrayList<DocGiaDTO> getList() {
        ArrayList<DocGiaDTO> list = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM docgia WHERE trangthai = 1";
            System.out.println("Executing SQL: " + sql); // Debug
            
            ResultSet rs = mySQL.executeQuery(sql);
            if (rs == null) {
                System.out.println("ResultSet is null"); // Debug
                return list;
            }
            
            while(rs.next()) {
                DocGiaDTO dg = new DocGiaDTO(
                    rs.getString("madg"),
                    rs.getString("tendg"),
                    rs.getString("gioitinh"),
                    rs.getDate("ngaysinh"),
                    rs.getString("sdt"),
                    rs.getString("ma_ttv"),
                    rs.getDate("ngaycap"),
                    rs.getDate("ngayhethan"),
                    rs.getInt("trangthai")
                );
                list.add(dg);
            }
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi khi đọc dữ liệu từ database: " + ex.getMessage());
            ex.printStackTrace(); // In stack trace để debug
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Lỗi không xác định: " + ex.getMessage());
            ex.printStackTrace(); // In stack trace để debug
        }
        
        return list;
    }
    
    // Thêm độc giả mới
    public boolean add(DocGiaDTO dg) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String sql = "INSERT INTO docgia(madg, tendg, gioitinh, ngaysinh, sdt, ma_ttv, ngaycap, ngayhethan, trangthai) VALUES(";
            sql += "'" + dg.getMaDG()+ "',";
            sql += "'" + dg.getTenDG()+ "',";
            sql += "'" + dg.getGioiTinh()+ "',";
            sql += "'" + sdf.format(dg.getNgaySinh())+ "',";
            sql += "'" + dg.getSDT()+ "',";
            sql += "'" + dg.getMaThe()+ "',";
            sql += "'" + sdf.format(dg.getNgayCap())+ "',";
            sql += "'" + sdf.format(dg.getNgayHetHan())+ "',";
            sql += "1)";
            
            System.out.println("Executing SQL: " + sql); // Debug
            return mySQL.executeUpdate(sql) > 0;
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Lỗi khi thêm độc giả: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        }
    }
    
    // Cập nhật thông tin độc giả
    public boolean update(DocGiaDTO dg) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String sql = "UPDATE docgia SET ";
            sql += "tendg = '" + dg.getTenDG()+ "',";
            sql += "gioitinh = '" + dg.getGioiTinh()+ "',";
            sql += "ngaysinh = '" + sdf.format(dg.getNgaySinh())+ "',";
            sql += "sdt = '" + dg.getSDT()+ "',";
            sql += "ma_ttv = '" + dg.getMaThe()+ "',";
            sql += "ngaycap = '" + sdf.format(dg.getNgayCap())+ "',";
            sql += "ngayhethan = '" + sdf.format(dg.getNgayHetHan())+ "'";
            sql += " WHERE madg = '" + dg.getMaDG()+ "'";
            
            System.out.println("Executing SQL: " + sql); // Debug
            return mySQL.executeUpdate(sql) > 0;
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Lỗi khi cập nhật độc giả: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        }
    }
    
    // Xóa độc giả (cập nhật trạng thái = 0)
    public boolean delete(String madg) {
        try {
            String sql = "UPDATE docgia SET trangthai = 0 WHERE madg = '" + madg + "'";
            System.out.println("Executing SQL: " + sql); // Debug
            return mySQL.executeUpdate(sql) > 0;
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Lỗi khi xóa độc giả: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        }
    }
    
    // Khôi phục độc giả đã xóa
    public boolean restore(String madg) {
        try {
            String sql = "UPDATE docgia SET trangthai = 1 WHERE madg = '" + madg + "'";
            System.out.println("Executing SQL: " + sql); // Debug
            return mySQL.executeUpdate(sql) > 0;
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Lỗi khi khôi phục độc giả: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        }
    }
    
    // Tìm kiếm độc giả
    public ArrayList<DocGiaDTO> search(String keyword) {
        ArrayList<DocGiaDTO> list = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM docgia WHERE trangthai = 1 AND (madg LIKE '%" + keyword + "%' "
                    + "OR tendg LIKE '%" + keyword + "%' "
                    + "OR sdt LIKE '%" + keyword + "%' "
                    + "OR ma_ttv LIKE '%" + keyword + "%')";
                    
            System.out.println("Executing SQL: " + sql); // Debug
            ResultSet rs = mySQL.executeQuery(sql);
            
            if (rs == null) {
                System.out.println("ResultSet is null in search"); // Debug
                return list;
            }
            
            while(rs.next()) {
                DocGiaDTO dg = new DocGiaDTO(
                    rs.getString("madg"),
                    rs.getString("tendg"),
                    rs.getString("gioitinh"),
                    rs.getDate("ngaysinh"),
                    rs.getString("sdt"),
                    rs.getString("ma_ttv"),
                    rs.getDate("ngaycap"),
                    rs.getDate("ngayhethan"),
                    rs.getInt("trangthai")
                );
                list.add(dg);
            }
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi khi tìm kiếm dữ liệu: " + ex.getMessage());
            ex.printStackTrace();
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Lỗi không xác định khi tìm kiếm: " + ex.getMessage());
            ex.printStackTrace();
        }
        
        return list;
    }
} 