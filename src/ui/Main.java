package ui;

public class Main {
    public static void main(String[] args) {
        // Hiển thị màn hình đăng nhập khi khởi động ứng dụng
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}