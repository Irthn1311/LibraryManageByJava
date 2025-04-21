
package DTO;

public class ChiTietPhieuNhapDTO {
    private int maCTPN;
    private String maPhieuNhap;
    private String loaiSach;
    private int donGia;
    private int soLuong;
    private int thanhTien;

    public ChiTietPhieuNhapDTO() {
    }

    public ChiTietPhieuNhapDTO(int maCTPN, String maPhieuNhap, String loaiSach, int donGia, int soLuong, int thanhTien) {
        this.maCTPN = maCTPN;
        this.maPhieuNhap = maPhieuNhap;
        this.loaiSach = loaiSach;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }

    // Getter và Setter
    public int getMaCTPN() {
        return maCTPN;
    }

    public void setMaCTPN(int maCTPN) {
        this.maCTPN = maCTPN;
    }

    public String getMaPhieuNhap() {
        return maPhieuNhap;
    }

    public void setMaPhieuNhap(String maPhieuNhap) {
        this.maPhieuNhap = maPhieuNhap;
    }

    public String getLoaiSach() {
        return loaiSach;
    }

    public void setLoaiSach(String loaiSach) {
        this.loaiSach = loaiSach;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

}

