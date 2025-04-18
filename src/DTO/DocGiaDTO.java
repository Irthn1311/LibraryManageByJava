package DTO;

import java.util.Date;

public class DocGiaDTO {
    private String maDG;
    private String tenDG;
    private String gioiTinh;
    private Date ngaySinh;
    private String sdt;
    private String maThe;
    private Date ngayCap;
    private Date ngayHetHan;
    private int trangThai;
    
    public DocGiaDTO() {
    }
    
    public DocGiaDTO(String maDG, String tenDG, String gioiTinh, Date ngaySinh, 
            String sdt, String maThe, Date ngayCap, Date ngayHetHan, int trangThai) {
        this.maDG = maDG;
        this.tenDG = tenDG;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.maThe = maThe;
        this.ngayCap = ngayCap;
        this.ngayHetHan = ngayHetHan;
        this.trangThai = trangThai;
    }

    public String getMaDG() {
        return maDG;
    }

    public void setMaDG(String maDG) {
        this.maDG = maDG;
    }

    public String getTenDG() {
        return tenDG;
    }

    public void setTenDG(String tenDG) {
        this.tenDG = tenDG;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSDT() {
        return sdt;
    }

    public void setSDT(String sdt) {
        this.sdt = sdt;
    }

    public String getMaThe() {
        return maThe;
    }

    public void setMaThe(String maThe) {
        this.maThe = maThe;
    }

    public Date getNgayCap() {
        return ngayCap;
    }

    public void setNgayCap(Date ngayCap) {
        this.ngayCap = ngayCap;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
} 