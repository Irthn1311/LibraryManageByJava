package BUS;

import DAO.DocGiaDAO;
import DTO.DocGiaDTO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;


public class DocGiaBUS {
    private final DocGiaDAO docGiaDAO;

    public DocGiaBUS() {
        docGiaDAO = new DocGiaDAO();
    }

    public ArrayList<DocGiaDTO> layDanhSachDocGia() throws SQLException {
        return docGiaDAO.getList();
    }

    public boolean themDocGia(DocGiaDTO dg) throws Exception {
        // Kiểm tra dữ liệu đầu vào
        if (dg == null) {
            throw new Exception("Dữ liệu độc giả không hợp lệ!");
        }
        
        // Kiểm tra thông tin bắt buộc
        if (dg.getTenDG() == null || dg.getTenDG().trim().isEmpty()) {
            throw new Exception("Tên độc giả không được để trống!");
        }
        
        if (dg.getNgaySinh() == null) {
            throw new Exception("Ngày sinh không được để trống!");
        }
        
        // Kiểm tra xem độc giả đã tồn tại chưa
        if (kiemTraDocGiaTonTai(dg.getTenDG(), dg.getSoDienThoai(), dg.getDiaChi(), dg.getNgaySinh())) {
            throw new Exception("Thông tin độc giả đã tồn tại trong hệ thống!");
        }
        
        // Tạo mã độc giả mới nếu chưa có
        if (dg.getMaDG() == null || dg.getMaDG().trim().isEmpty()) {
            dg.setMaDG(taoMaDocGiaMoi());
        }
        
        // Đặt trạng thái mặc định là hoạt động
        dg.setTrangThai(true);
        
        // Gọi phương thức thêm độc giả từ DAO
        return docGiaDAO.add(dg);
    }

    public boolean capNhatDocGia(DocGiaDTO dg) throws Exception {
        // Kiểm tra dữ liệu đầu vào
        if (dg == null) {
            throw new Exception("Dữ liệu độc giả không hợp lệ!");
        }
        
        // Kiểm tra mã độc giả
        if (dg.getMaDG() == null || dg.getMaDG().trim().isEmpty()) {
            throw new Exception("Mã độc giả không được để trống!");
        }
        
        // Kiểm tra thông tin bắt buộc
        if (dg.getTenDG() == null || dg.getTenDG().trim().isEmpty()) {
            throw new Exception("Tên độc giả không được để trống!");
        }
        
        if (dg.getNgaySinh() == null) {
            throw new Exception("Ngày sinh không được để trống!");
        }
        
        // Kiểm tra xem độc giả có tồn tại không
        ArrayList<DocGiaDTO> danhSachDocGia = layDanhSachDocGia();
        boolean docGiaTonTai = false;
        
        for (DocGiaDTO existingDocGia : danhSachDocGia) {
            if (existingDocGia.getMaDG().equals(dg.getMaDG())) {
                docGiaTonTai = true;
                break;
            }
        }
        
        if (!docGiaTonTai) {
            throw new Exception("Không tìm thấy độc giả với mã: " + dg.getMaDG());
        }
        
        // Gọi phương thức cập nhật độc giả từ DAO
        return docGiaDAO.update(dg);
    }

    public boolean xoaDocGia(String maDG) throws Exception {
        // Kiểm tra dữ liệu đầu vào
        if (maDG == null || maDG.trim().isEmpty()) {
            throw new Exception("Mã độc giả không được để trống!");
        }
        
        // Kiểm tra xem độc giả có tồn tại không
        ArrayList<DocGiaDTO> danhSachDocGia = layDanhSachDocGia();
        boolean docGiaTonTai = false;
        
        for (DocGiaDTO dg : danhSachDocGia) {
            if (dg.getMaDG().equals(maDG)) {
                docGiaTonTai = true;
                break;
            }
        }
        
        if (!docGiaTonTai) {
            throw new Exception("Không tìm thấy độc giả với mã: " + maDG);
        }
        
        // Gọi phương thức xóa độc giả từ DAO
        return docGiaDAO.delete(maDG);
    }

    public boolean khoiPhucDocGia(String maDG) throws Exception {
        // Kiểm tra dữ liệu đầu vào
        if (maDG == null || maDG.trim().isEmpty()) {
            throw new Exception("Mã độc giả không được để trống!");
        }
        
        // Kiểm tra xem độc giả có tồn tại không
        ArrayList<DocGiaDTO> danhSachDocGia = layDanhSachDocGia();
        boolean docGiaTonTai = false;
        
        for (DocGiaDTO dg : danhSachDocGia) {
            if (dg.getMaDG().equals(maDG)) {
                docGiaTonTai = true;
                break;
            }
        }
        
        if (!docGiaTonTai) {
            throw new Exception("Không tìm thấy độc giả với mã: " + maDG);
        }
        
        // Gọi phương thức khôi phục độc giả từ DAO
        return docGiaDAO.restore(maDG);
    }

    public ArrayList<DocGiaDTO> timKiemDocGia(String keyword, String selectedOption) throws Exception {
        // Kiểm tra dữ liệu đầu vào
        if (keyword == null) {
            throw new Exception("Từ khóa tìm kiếm không được để trống!");
        }
        
        if (selectedOption == null || selectedOption.trim().isEmpty()) {
            throw new Exception("Tiêu chí tìm kiếm không được để trống!");
        }
        
        // Gọi phương thức tìm kiếm độc giả từ DAO
        return docGiaDAO.search(keyword, selectedOption);
    }

    public boolean kiemTraDocGiaTonTai(String tenDG, String soDienThoai, String diaChi, Date ngaySinh) {
        try {
            ArrayList<DocGiaDTO> danhSachDocGia = layDanhSachDocGia();
            
            for (DocGiaDTO dg : danhSachDocGia) {
                if (dg.getTenDG().equals(tenDG) && 
                    dg.getSoDienThoai().equals(soDienThoai) && 
                    dg.getDiaChi().equals(diaChi) && 
                    dg.getNgaySinh().equals(ngaySinh)) {
                    return true;
                }
            }
        } catch (SQLException e) {
            // Xử lý lỗi SQL
            System.out.println("Lỗi khi kiểm tra độc giả tồn tại: " + e.getMessage());
        }
        
        return false;
    }

    public String taoMaDocGiaMoi() {
        try {
            ArrayList<DocGiaDTO> danhSachDocGia = layDanhSachDocGia();
            return "DG" + (danhSachDocGia.size() + 1);
        } catch (SQLException e) {
            // Xử lý lỗi SQL
            System.out.println("Lỗi khi tạo mã độc giả mới: " + e.getMessage());
            return "DG" + System.currentTimeMillis(); // Tạo mã dựa trên thời gian nếu không lấy được danh sách
        }
    }

    /**
     * Tính tuổi của độc giả
     * @param ngaySinh Ngày sinh của độc giả
     * @return int Tuổi của độc giả
     */
    public int tinhTuoi(Date ngaySinh) {
        if (ngaySinh == null) return 0;
        return java.time.LocalDate.now().getYear() - 
               (ngaySinh.getYear() + 1900);
    }
    
    public String kiemTraThongTinDocGia(DocGiaDTO dg) {
        if (dg == null) {
            return "Dữ liệu độc giả không hợp lệ!";
        }
        
        if (dg.getTenDG() == null || dg.getTenDG().trim().isEmpty()) {
            return "Tên độc giả không được để trống!";
        }
        
        if (dg.getNgaySinh() == null) {
            return "Ngày sinh không được để trống!";
        }
        
        // Kiểm tra tuổi
        int tuoi = tinhTuoi(dg.getNgaySinh());
        if (tuoi < 6 || tuoi > 100) {
            return "Tuổi độc giả không hợp lệ (phải từ 6-100 tuổi)!";
        }
        
        // Kiểm tra số điện thoại nếu có
        if (dg.getSoDienThoai() != null && !dg.getSoDienThoai().trim().isEmpty()) {
            if (!dg.getSoDienThoai().matches("\\d{10,11}")) {
                return "Số điện thoại không hợp lệ (phải có 10-11 chữ số)!";
            }
        }
        
        // Kiểm tra thông tin thẻ thành viên nếu có
        if (dg.getMaThe() != null && !dg.getMaThe().trim().isEmpty()) {
            if (dg.getNgayCap() == null) {
                return "Ngày cấp thẻ không được để trống!";
            }
            
            if (dg.getNgayHetHan() == null) {
                return "Ngày hết hạn thẻ không được để trống!";
            }
            
            // Kiểm tra ngày hết hạn phải sau ngày cấp
            if (dg.getNgayHetHan().before(dg.getNgayCap())) {
                return "Ngày hết hạn thẻ phải sau ngày cấp!";
            }
        }
        
        return null;
    }
} 