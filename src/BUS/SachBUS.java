package BUS;

import DAO.SachDAO;
import DTO.SachDTO;
import java.sql.SQLException;
import java.util.List;

public class SachBUS {
    private SachDAO sachDAO;

    public SachBUS() {
        // Khởi tạo đối tượng SachDAO trực tiếp mà không cần tham số
        this.sachDAO = new SachDAO();  
    }

    // Thêm sách
    public boolean themSach(SachDTO sach) throws SQLException {
        return sachDAO.themSach(sach);
    }

    // Sửa sách
    public boolean suaSach(SachDTO sach) throws SQLException {
        return sachDAO.suaSach(sach);
    }

    // Xóa sách
    public boolean xoaSach(String maSach) throws SQLException {
        return sachDAO.xoaSach(maSach);
    }

    // Tìm kiếm tất cả các trường
    public List<SachDTO> timKiemTatCa(String tuKhoa) throws SQLException {
        return sachDAO.timKiemTatCa(tuKhoa);
    }
    
    public int laySoLuongSachDaThem(String theLoai) throws SQLException {
        return sachDAO.laySoLuongSachDaThem(theLoai);
    }

    // Giảm số lượng khi mượn sách
    public boolean giamSoLuong(String maSach, int soLuongGiam) throws SQLException {
        return sachDAO.giamSoLuong(maSach, soLuongGiam);
    }

    // Lấy tổng số lượng sách đã được nhập theo thể loại (từ ChiTietPhieuNhap)
    public int laySoLuongNhapTheoTheLoai(String theLoai) throws SQLException {
        return sachDAO.laySoLuongNhapTheoTheLoai(theLoai);
    }
    
    public int laySoLuongSach() throws SQLException {
        return sachDAO.laySoLuongSach();
    }

    // Lấy danh sách sách
    public List<SachDTO> layDanhSachSach() throws SQLException {
        return sachDAO.layDanhSachSach();
    }
    
    
}
