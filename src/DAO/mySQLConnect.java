package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class mySQLConnect {
    private String user = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost:3306/lbr?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
    private Connection conn = null;
    private Statement statement = null;
    
    public mySQLConnect() {
        try {
            // Đăng ký MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Thiết lập kết nối
            conn = DriverManager.getConnection(url, user, password);
            
            if (conn != null) {
                System.out.println("Kết nối database thành công!");
            }
            
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Không tìm thấy Driver MySQL!\n" + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi kết nối database!\nVui lòng kiểm tra:\n1. MySQL đã được khởi động\n2. Database 'lbr' đã được tạo\n3. Username và password chính xác\n\nChi tiết lỗi: " + e.getMessage());
        }
    }
    
    public Connection getConnection() {
        return conn;
    }
    
    // Thực thi câu lệnh SELECT
    public ResultSet executeQuery(String sql) {
        ResultSet rs = null;
        try {
            if (conn != null) {
                statement = conn.createStatement();
                rs = statement.executeQuery(sql);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi thực thi câu lệnh SQL: " + e.getMessage() + "\nCâu lệnh: " + sql);
        }
        return rs;
    }
    
    // Thực thi INSERT, DELETE, UPDATE
    public int executeUpdate(String sql) {
        int result = 0;
        try {
            if (conn != null) {
                statement = conn.createStatement();
                result = statement.executeUpdate(sql);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi thực thi câu lệnh SQL: " + e.getMessage() + "\nCâu lệnh: " + sql);
        }
        return result;
    }
    
    // Đóng kết nối
    public void closeConnection() {
        try {
            if (statement != null) {
                statement.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Lỗi khi đóng kết nối: " + e.getMessage());
        }
    }
    
    // Phương thức kiểm tra kết nối
    public boolean isConnected() {
        return conn != null;
    }
}
