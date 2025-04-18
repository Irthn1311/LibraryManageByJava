CREATE DATABASE QuanLiThuVien;
GO

USE QuanLiThuVien;
GO

SELECT name FROM sys.sql_logins;
CREATE USER tnptp FOR LOGIN tnptp;
EXEC sp_addrolemember 'db_owner', 'tnptp';
ALTER LOGIN tnptp WITH PASSWORD = '123';
EXEC sp_addrolemember 'db_owner', 'tnptp';

-- Bảng Nhân viên
CREATE TABLE NhanVien (
    ID_NhanVien INT IDENTITY(1,1) PRIMARY KEY,
    TenNhanVien NVARCHAR(100),
    GioiTinh NVARCHAR(10),
    NgaySinh DATE,
    DiaChi NVARCHAR(50),
    SoDienThoai NVARCHAR(15),
    Email NVARCHAR(30),
    VaiTro NVARCHAR(50),
	Luong DECIMAL(18, 2),
	NgayVaoLam DATE
);

select * from NhanVien


-- Bảng Tài khoản trực tuyến
CREATE TABLE TaiKhoanTrucTuyen (
    ID_TKTT INT PRIMARY KEY,
    VaiTro NVARCHAR(50) CHECK (VaiTro IN ('Admin', 'NhanVien', 'DocGia')),
    TaiKhoan NVARCHAR(100) NOT NULL,
    MatKhau NVARCHAR(100) NOT NULL,
    Email NVARCHAR(100),
    ID_NhanVien INT NULL,
    ID_DocGia INT NULL,
    FOREIGN KEY (ID_NhanVien) REFERENCES NhanVien(ID_NhanVien),
    FOREIGN KEY (ID_DocGia) REFERENCES DocGia(ID_DocGia)
);


-- Bảng Độc giả
CREATE TABLE DocGia (
    ID_DocGia INT PRIMARY KEY,
    TenDocGia NVARCHAR(100),
    GioiTinh NVARCHAR(10),
    Tuoi INT,
    DiaChi NVARCHAR(200)
);

-- Bảng Thẻ thành viên
CREATE TABLE TheThanhVien (
    ID_TheTV INT PRIMARY KEY,
    NgayCap DATE,
    NgayHetHan DATE,
    TrangThai NVARCHAR(20),
    ID_DocGia INT UNIQUE,
    FOREIGN KEY (ID_DocGia) REFERENCES DocGia(ID_DocGia)
);

-- Bảng Sách
CREATE TABLE Sach (
    ID_Sach INT PRIMARY KEY,
    TenSach NVARCHAR(200),
    TacGia NVARCHAR(100),
    TheLoai NVARCHAR(100),
    NhaXuatBan NVARCHAR(100),
    NamXuatBan INT,
    NgonNgu NVARCHAR(50),
    FilePDF NVARCHAR(200),
    ChinhSachMuon NVARCHAR(200),
    SoLuong INT,
    TrangThai NVARCHAR(20)
);

-- Bảng Phiếu mượn
CREATE TABLE PhieuMuon (
    ID_PhieuMuon INT PRIMARY KEY,
    NgayMuon DATE,
    HanTra DATE,
    NgayTraThucTe DATE,
    ID_TheTV INT,
    FOREIGN KEY (ID_TheTV) REFERENCES TheThanhVien(ID_TheTV)
);

-- Bảng Chi tiết phiếu mượn (sách trong mỗi phiếu)
CREATE TABLE ChiTietPhieuMuon (
    ID_PhieuMuon INT,
    ID_Sach INT,
    PRIMARY KEY (ID_PhieuMuon, ID_Sach),
    FOREIGN KEY (ID_PhieuMuon) REFERENCES PhieuMuon(ID_PhieuMuon),
    FOREIGN KEY (ID_Sach) REFERENCES Sach(ID_Sach)
);

-- Bảng Phiếu phạt
CREATE TABLE PhieuPhat (
    ID_PhieuPhat INT PRIMARY KEY,
    SoTienPhat DECIMAL(10, 2),
    LyDo NVARCHAR(200),
    TrangThai NVARCHAR(20),
    NgayBiPhat DATE,
    ID_PhieuMuon INT,
    FOREIGN KEY (ID_PhieuMuon) REFERENCES PhieuMuon(ID_PhieuMuon)
);

-- Bảng Đánh giá
CREATE TABLE DanhGia (
    ID_DanhGia INT PRIMARY KEY,
    SoSao INT CHECK (SoSao BETWEEN 1 AND 5),
    NhanXet NVARCHAR(500),
    NgayDanhGia DATE,
    ID_Sach INT,
    FOREIGN KEY (ID_Sach) REFERENCES Sach(ID_Sach)
);

-- Bảng Yêu cầu nhập sách mới
CREATE TABLE YeuCauNhapSachMoi (
    ID_YeuCau INT PRIMARY KEY,
    TenSachYeuCau NVARCHAR(200),
    NgayYeuCau DATE,
    LyDoYeuCau NVARCHAR(200),
    TrangThai NVARCHAR(20),
    ID_TKTT INT,
    FOREIGN KEY (ID_TKTT) REFERENCES TaiKhoanTrucTuyen(ID_TKTT)
);

-- Bảng Thông báo
CREATE TABLE ThongBao (
    ID_ThongBao INT PRIMARY KEY,
    LoaiThongBao NVARCHAR(200),
    NgayGui DATE,
    ID_TKTT INT,
    FOREIGN KEY (ID_TKTT) REFERENCES TaiKhoanTrucTuyen(ID_TKTT)
);

-- Bảng Nguồn nhập sách
CREATE TABLE NguonNhapSach (
    ID_NguonNhap INT PRIMARY KEY,
    TenNguonNhap NVARCHAR(200),
    LoaiNhap NVARCHAR(100),
    DiaChi NVARCHAR(200),
    SDT NVARCHAR(20),
    Email NVARCHAR(100)
);

-- Bảng Phiếu nhập sách
CREATE TABLE PhieuNhapSach (
    ID_PhieuNhap INT PRIMARY KEY,
    NgayNhap DATE,
    TongSoLuong INT,
    TongTien DECIMAL(18, 2),
    ID_NguonNhap INT,
    FOREIGN KEY (ID_NguonNhap) REFERENCES NguonNhapSach(ID_NguonNhap)
);

-- Bảng Chi tiết phiếu nhập
CREATE TABLE ChiTietPhieuNhap (
    ID_PhieuNhap INT,
    ID_Sach INT,
    SoLuongNhap INT,
    PRIMARY KEY (ID_PhieuNhap, ID_Sach),
    FOREIGN KEY (ID_PhieuNhap) REFERENCES PhieuNhapSach(ID_PhieuNhap),
    FOREIGN KEY (ID_Sach) REFERENCES Sach(ID_Sach)
);

-- Bảng Đặt trước sách
CREATE TABLE DatTruoc (
    ID_DocGia INT,
    ID_Sach INT,
    NgayDat DATE,
    PRIMARY KEY (ID_DocGia, ID_Sach),
    FOREIGN KEY (ID_DocGia) REFERENCES DocGia(ID_DocGia),
    FOREIGN KEY (ID_Sach) REFERENCES Sach(ID_Sach)
);

-- Bảng Gia hạn mượn sách
CREATE TABLE YeuCauGiaHan (
    ID_PhieuMuon INT PRIMARY KEY,
    SoNgayGiaHan INT,
    FOREIGN KEY (ID_PhieuMuon) REFERENCES PhieuMuon(ID_PhieuMuon)
);
