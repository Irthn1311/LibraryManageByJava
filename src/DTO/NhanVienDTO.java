
package DTO;


public class NhanVienDTO {
    private int idNhanVien;
    private String tenNhanVien;
    private String gioiTinh;
    private java.sql.Date ngaySinh;
    private String diaChi;
    private String soDienThoai;
    private String email;
    private String vaiTro;
    private double luong;
    private java.sql.Date ngayVaoLam;


    // Constructor không tham số
    public NhanVienDTO() {}

    // Constructor đầy đủ
    public NhanVienDTO(int idNhanVien, String tenNhanVien, String gioiTinh, java.sql.Date ngaySinh,
                       String diaChi, String soDienThoai, String email, String vaiTro, double luong,java.sql.Date ngayVaoLam) {
        this.idNhanVien = idNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.vaiTro = vaiTro;
        this.luong = luong;
        this.ngayVaoLam = ngayVaoLam;
    }

    // Getters và Setters
    public int getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(int idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public java.sql.Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(java.sql.Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    public java.sql.Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(java.sql.Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }
}

