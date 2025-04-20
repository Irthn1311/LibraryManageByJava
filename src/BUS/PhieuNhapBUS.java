package BUS;

import DAO.PhieuNhapDAO;
import DTO.PhieuNhapDTO;
import DTO.ChiTietPhieuNhapDTO;
import java.sql.SQLException;
import java.util.ArrayList;

public class PhieuNhapBUS {
    private PhieuNhapDAO phieuNhapDAO = new PhieuNhapDAO();

    // Lập phiếu nhập
    public void lapPhieuNhap(PhieuNhapDTO phieu, ArrayList<ChiTietPhieuNhapDTO> chiTiets) throws SQLException {
        phieuNhapDAO.lapPhieuNhap(phieu, chiTiets);
    }
    
    // Xóa phiếu nhập và chi tiết phiếu nhập
    public void xoaPhieuNhap(String maPhieuNhap) throws SQLException {
        phieuNhapDAO.xoaPhieuNhap(maPhieuNhap);
    }

    // Tìm kiếm phiếu nhập
    public ArrayList<PhieuNhapDTO> timKiemPhieuNhap(String tuKhoa) throws SQLException {
        return phieuNhapDAO.timKiemPhieuNhap(tuKhoa);
    }
    
    public ArrayList<PhieuNhapDTO> layDanhSachPhieuNhap() throws SQLException {
        return phieuNhapDAO.layDanhSachPhieuNhap();
    }
    
    public ArrayList<String> layDanhSachMaCoSo() throws SQLException {
        return phieuNhapDAO.layDanhSachMaCoSo();
    }
}
