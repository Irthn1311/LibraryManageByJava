/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

public class mySQLConnect {
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String URL = "jdbc:mysql://localhost:3306/cnm";
    private static Connection conn = null;
    private static final Logger logger = System.getLogger(mySQLConnect.class.getName());

    // Lấy kết nối
    public static Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
                logger.log(Level.INFO, "Kết nối thành công đến cơ sở dữ liệu.");
            } catch (ClassNotFoundException | SQLException ex) {
                logger.log(Level.ERROR, "Kết nối thất bại.", ex);
            }
        }
        return conn;
    }

    // Ngắt kết nối
    public static void disconnect() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                logger.log(Level.INFO, "Đã ngắt kết nối cơ sở dữ liệu.");
            }
        } catch (SQLException ex) {
            logger.log(Level.ERROR, "Lỗi khi ngắt kết nối.", ex);
        }
    }

    // Test nhanh
    public static void main(String[] args) {
        Connection testConn = mySQLConnect.getConnection();
        if (testConn != null) {
            System.out.println("Kết nối thành công!");
            mySQLConnect.disconnect();
        } else {
            System.out.println("Kết nối thất bại!");
        }
    }
}
