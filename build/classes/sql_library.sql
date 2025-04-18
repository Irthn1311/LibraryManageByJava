 create database lbr;


CREATE TABLE lbr.Sach (
    ma_sach varchar(255) PRIMARY KEY,
    ten_sach VARCHAR(255) NOT NULL,
    tac_gia VARCHAR(255),
    the_loai VARCHAR(100),
    ngon_ngu VARCHAR(50),
    so_luong INT DEFAULT 0,
    nha_xuat_ban VARCHAR(255),
    nam_xuat_ban YEAR,
    file_pdf VARCHAR(255),
    trang_thai INT,
    chinh_sach_muon int
);

CREATE TABLE lbr.NhanVien (
    ma_nhan_vien varchar(255) PRIMARY KEY,
    ten_nhan_vien VARCHAR(255) NOT NULL,
    tuoi INT,
    dia_chi VARCHAR(255),
    ngay_vao_lam DATE,
    sdt VARCHAR(20),
    email VARCHAR(100),
    vai_tro VARCHAR(100),
    trang_thai BOOLEAN DEFAULT TRUE
);

CREATE TABLE lbr.CoSoNhap (
    ma_co_so varchar(255) PRIMARY KEY,
    ten_co_so VARCHAR(255),
    hinhthuc_chuyeu int,
    dia_chi VARCHAR(255),
    email varchar(255),
    ngay_hoptac date,
    sdt VARCHAR(20),
    trangthai int
);

CREATE TABLE lbr.PhieuNhap (
    ma_phieu_nhap varchar(255) PRIMARY KEY,
    ten_co_so VARCHAR(255),
    loai_nhap VARCHAR(100),
    so_luong_sach INT,
    tong_tien int,
    ngay_nhap DATE DEFAULT CURRENT_DATE,
    ma_nhan_vien varchar(255),
    ma_co_so varchar(255),

    FOREIGN KEY (ma_nhan_vien) REFERENCES NhanVien(ma_nhan_vien),
    FOREIGN KEY (ma_co_so) REFERENCES CoSoNhap(ma_co_so)
);

CREATE TABLE lbr.ChiTietPhieuNhap (
    ma_ctpn varchar(255) PRIMARY KEY,
    ma_phieu_nhap varchar(255),
    loai_sach VARCHAR(100),
    don_gia DECIMAL(12,2),
    so_luong INT,
    thanh_tien int,
  	tong_tien int,
    hinh_thuc_nhap VARCHAR(50),

    FOREIGN KEY (ma_phieu_nhap) REFERENCES PhieuNhap(ma_phieu_nhap)
);


CREATE TABLE lbr.DocGia (
    ma_doc_gia varchar(255) PRIMARY KEY,
    ten_doc_gia VARCHAR(255) NOT NULL,
    ngay_sinh DATE,
    dia_chi VARCHAR(255)
);


CREATE TABLE lbr.TheThanhVien (
    ma_the varchar(255) PRIMARY KEY,
    ma_doc_gia varchar(255) UNIQUE,
    ngay_cap DATE,
    ngay_het_han DATE,
    trang_thai BOOLEAN DEFAULT TRUE,

    FOREIGN KEY (ma_doc_gia) REFERENCES DocGia(ma_doc_gia)
);

CREATE TABLE lbr.TaiKhoan (
    ma_the varchar(255) PRIMARY KEY,
    mat_khau VARCHAR(255) DEFAULT '123456789',
    vai_tro VARCHAR(50) DEFAULT 'DocGia',

    FOREIGN KEY (ma_the) REFERENCES TheThanhVien(ma_the)
);

CREATE TABLE lbr.ThongBao (
    ma_thong_bao INT PRIMARY KEY AUTO_INCREMENT,
    ma_the VARCHAR(255),
    loai_thong_bao VARCHAR(100),
    noi_dung TEXT,
    ngay_tao DATETIME DEFAULT CURRENT_TIMESTAMP,

    FOREIGN KEY (ma_the) REFERENCES TaiKhoan(ma_the)
);

CREATE TABLE lbr.PhieuMuon (
    ma_phieu_muon varchar(255) PRIMARY KEY,
    ma_doc_gia varchar(255),    
    ma_sach varchar(255),        
    ngay_muon DATE,
    han_tra DATE,
    ngay_tra_thuc_te DATE,
    trang_thai VARCHAR(50),
  

    FOREIGN KEY (ma_doc_gia) REFERENCES DocGia(ma_doc_gia),
    FOREIGN KEY (ma_sach) REFERENCES Sach(ma_sach)
);

CREATE TABLE lbr.PhieuPhat (
    ma_phieu_phat varchar(255) PRIMARY KEY,
    ma_phieu_muon varchar(255) UNIQUE,
  	ma_doc_gia varchar(255),
  	ten_doc_gia varchar(255),
  	ma_sach varchar(255),
    ten_sach VARCHAR(255),
    so_ngay_qua_han INT,
    tien_phat int,

    FOREIGN KEY (ma_phieu_muon) REFERENCES PhieuMuon(ma_phieu_muon)
);


CREATE TABLE lbr.DatTruoc (
    ma_dat_truoc varchar(255) PRIMARY KEY,
    ma_doc_gia varchar(255),
    ma_sach varchar(255),
    ngay_dat DATE DEFAULT CURRENT_DATE,
    ma_phieu_muon varchar(255) UNIQUE,

    FOREIGN KEY (ma_doc_gia) REFERENCES DocGia(ma_doc_gia),
    FOREIGN KEY (ma_sach) REFERENCES Sach(ma_sach),
    FOREIGN KEY (ma_phieu_muon) REFERENCES PhieuMuon(ma_phieu_muon)
);

CREATE TABLE lbr.DanhGia (
    ma_danh_gia varchar(255) PRIMARY KEY,
    ma_doc_gia varchar(255),
    ma_sach varchar(255),
    so_sao INT CHECK (so_sao BETWEEN 1 AND 5),
    nhan_xet TEXT,
  	ngay_danh_gia date,

    FOREIGN KEY (ma_doc_gia) REFERENCES DocGia(ma_doc_gia),
    FOREIGN KEY (ma_sach) REFERENCES Sach(ma_sach)
);


CREATE TABLE lbr.ChucNang (
    ma_chuc_nang varchar(255) PRIMARY KEY,
    ten_chuc_nang VARCHAR(100) NOT NULL UNIQUE
);

insert into lbr.ChucNang values 
("Q1", "Quanlysach"),
('Q2', 'Quanlynhanvien'),
('Q3', 'Quanlyphieunhapsach'),
('Q4', 'Quanlydocgia'),
('Q5', 'Quanlyphanquyen'),
('Q6', 'Quanlyphieumuon'),
('Q7', 'Quanlytaikhoan'),
('Q8', 'Quanlythongke'),
('Q9', 'Quanlynguonnhap');



CREATE TABLE lbr.PhanQuyen (
    ma_phan_quyen varchar(255) PRIMARY KEY,
    ten_phan_quyen varchar(255),
    ma_the VARCHAR(255),
    ma_chuc_nang varchar(255),
    duoc_xem BOOLEAN DEFAULT FALSE,
    duoc_cap_nhat BOOLEAN DEFAULT FALSE,
    duoc_xoa BOOLEAN DEFAULT FALSE,

    FOREIGN KEY (ma_the) REFERENCES TaiKhoan(ma_the),
    FOREIGN KEY (ma_chuc_nang) REFERENCES ChucNang(ma_chuc_nang)
);