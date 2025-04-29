CREATE DATABASE lbr;


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
    doc_tai_cho Boolean default false,
    muon_ve Boolean default false,
    doc_file_pdf Boolean default false
);

INSERT INTO lbr.Sach (ma_sach, ten_sach, tac_gia, the_loai, ngon_ngu, so_luong, nha_xuat_ban, nam_xuat_ban, file_pdf, doc_tai_cho, muon_ve, doc_file_pdf)
VALUES
('S001', 'Chuyện Xưa Tích Cũ', 'Nguyễn Văn A', 'Văn học', 'Tiếng Việt', 5, 'NXB Kim Đồng', 2020, 'chuyenxua.pdf', true, true, true),
('S002', 'Khoa Học Vui', 'Trần B', 'Khoa học', 'Tiếng Việt', 5, 'NXB Trẻ', 2021, 'khoahocvui.pdf', true, false, true),
('S003', 'Câu Chuyện Thiếu Nhi', 'Nguyễn C', 'Thiếu nhi', 'Tiếng Việt', 4, 'NXB Kim Đồng', 2019, 'thieunhi.pdf', true, true, false),
('S004', 'Lược Sử Thế Giới', 'John Doe', 'Lịch sử', 'Tiếng Anh', 5, 'NXB Giáo Dục', 2018, 'lichsu.pdf', false, true, true),
('S005', 'Học Tiếng Anh Cơ Bản', 'Jane Smith', 'Ngoại ngữ', 'Tiếng Anh', 5, 'NXB Ngoại Ngữ', 2022, 'tienganh.pdf', true, true, true),
('S006', 'Tập Làm Văn', 'Nguyễn D', 'Văn học', 'Tiếng Việt', 5, 'NXB Giáo Dục', 2023, 'taplamvan.pdf', true, false, false),
('S007', 'Toán Cho Mọi Người', 'Trần E', 'Toán học', 'Tiếng Việt', 5, 'NXB Giáo Dục', 2020, 'toan.pdf', true, true, true),
('S008', 'Lập Trình Python', 'Nguyễn F', 'Tin học', 'Tiếng Việt', 5, 'NXB Khoa Học', 2021, 'python.pdf', true, false, true),
('S009', 'Kinh Tế Vĩ Mô', 'Trần G', 'Kinh tế', 'Tiếng Việt', 5, 'NXB Kinh Tế', 2022, 'kinhte.pdf', true, true, false),
('S010', 'Hiểu Luật Giao Thông', 'Nguyễn H', 'Pháp luật', 'Tiếng Việt', 5, 'NXB Tư Pháp', 2017, 'phapluat.pdf', false, true, true);

CREATE TABLE lbr.NhanVien (
    ma_nhan_vien INT AUTO_INCREMENT primary key,
    ten_nhan_vien VARCHAR(100) NOT NULL,
    gioi_tinh VARCHAR(20),
    ngay_sinh DATE,
    dia_chi VARCHAR(20),
    so_dien_thoai VARCHAR(15),
    email VARCHAR(20),
    ngay_vao_lam DATE,
    trang_thai VARCHAR(20)
);

INSERT INTO lbr.NhanVien (ten_nhan_vien, gioi_tinh, ngay_sinh, dia_chi, so_dien_thoai, email, ngay_vao_lam, trang_thai)
VALUES
('Nguyễn Văn A', 'Nam', '1990-05-15', 'Hà Nội', '0912345678', 'a.nguyen@example.com', '2022-01-10', 'Đang làm'),
('Trần Thị B', 'Nữ', '1992-08-20', 'Hồ Chí Minh', '0987654321', 'b.tran@example.com', '2023-03-01', 'Đang làm'),
('Lê Văn C', 'Nam', '1988-12-01', 'Đà Nẵng', '0909123456', 'c.le@example.com', '2021-11-15', 'Đang làm'),
('Phạm Thị D', 'Nữ', '1995-04-22', 'Cần Thơ', '0934567890', 'd.pham@example.com', '2024-06-20', 'Đang làm'),
('Hoàng Văn E', 'Nam', '1993-07-09', 'Hải Phòng', '0978123456', 'e.hoang@example.com', '2020-09-05', 'Đang làm');


CREATE TABLE lbr.CoSoNhap (
    ma_co_so varchar(255) PRIMARY KEY,
    ten_co_so VARCHAR(255),
    hinhthuc_chuyeu int,
    dia_chi VARCHAR(255),
    email varchar(255),
    ngay_hoptac date,
    sdt VARCHAR(20),
    trangthai Boolean default true
);

INSERT INTO lbr.CoSoNhap (ma_co_so, ten_co_so, hinhthuc_chuyeu, dia_chi, email, ngay_hoptac, sdt, trangthai) VALUES
('CS001', 'Công ty Sách ABC',         1, 'Hà Nội',        'abc@sach.vn',      '2020-01-15', '0901234561', TRUE),
('CS002', 'Nhà Xuất Bản Trẻ',         2, 'TP. HCM',       'nxbtre@sach.vn',   '2019-05-10', '0901234562', TRUE),
('CS003', 'Tổ chức Thiện nguyện A',   3, 'Đà Nẵng',        'thiennguyenA@gmail.com', '2021-03-20', '0901234563', TRUE),
('CS004', 'Công ty Văn hóa B',        1, 'Huế',           'vanhoaB@gmail.com','2018-07-30', '0901234564', FALSE),
('CS005', 'Nhà Xuất Bản Kim Đồng',    2, 'TP. HCM',       'kimdong@nxb.vn',   '2017-11-25', '0901234565', TRUE),
('CS006', 'Nhóm Tình Nguyện X',       3, 'Cần Thơ',       'tnx@gmail.com',    '2022-02-18', '0901234566', TRUE),
('CS007', 'Công ty Sách Minh Long',   1, 'Bình Dương',    'minhlong@sach.vn', '2019-08-05', '0901234567', FALSE),
('CS008', 'Nhà Xuất Bản Giáo Dục',    2, 'Hà Nội',        'giaoduc@nxb.vn',   '2015-12-12', '0901234568', TRUE),
('CS009', 'Tổ chức Sách Cho Em',      3, 'Quảng Ninh',    'sachem@gmail.com', '2023-06-01', '0901234569', TRUE),
('CS010', 'Công ty Phát hành Sách Z', 1, 'Nha Trang',     'phsz@sach.vn',     '2020-09-09', '0901234570', FALSE);


CREATE TABLE lbr.PhieuNhap (
    ma_phieu_nhap VARCHAR(255) primary key,
    loai_nhap VARCHAR(100),
    so_luong_sach INT,
    tong_tien INT,
    ngay_nhap DATE,
    ma_nhan_vien int,
    ma_co_so VARCHAR(255),
    FOREIGN KEY (ma_nhan_vien) REFERENCES NhanVien(ma_nhan_vien),
    FOREIGN KEY (ma_co_so) REFERENCES CoSoNhap(ma_co_so)
);


CREATE TABLE lbr.ChiTietPhieuNhap (
    ma_ctpn INT AUTO_INCREMENT PRIMARY KEY,
    ma_phieu_nhap varchar(255),
    loai_sach VARCHAR(100),
    don_gia int,
    so_luong INT,
    thanh_tien int
);

INSERT INTO lbr.PhieuNhap (ma_phieu_nhap, loai_nhap, so_luong_sach, tong_tien, ngay_nhap, ma_nhan_vien, ma_co_so)
VALUES 
('PN001', 'Mua-bán', 20, 400000, '2025-04-01', 1, 'CS001'),
('PN002', 'Nhà xuất bản tài trợ', 18, 360000, '2025-04-05', 1, 'CS001'),
('PN003', 'Mua-bán', 22, 440000, '2025-04-10', 1, 'CS002'),
('PN004', 'Nhà xuất bản tài trợ', 16, 320000, '2025-04-12', 1, 'CS001'),
('PN005', 'Mua-bán', 24, 480000, '2025-04-15', 1, 'CS002');



INSERT INTO lbr.ChiTietPhieuNhap (ma_phieu_nhap, loai_sach, don_gia, so_luong, thanh_tien)
VALUES 
-- PN001
('PN001', 'Văn học', 10000, 10, 100000),
('PN001', 'Khoa học', 15000, 10, 150000),
-- PN002
('PN002', 'Thiếu nhi', 12000, 8, 96000),
('PN002', 'Lịch sử', 18000, 10, 180000),
-- PN003
('PN003', 'Ngoại ngữ', 20000, 12, 240000),
('PN003', 'Văn học', 20000, 10, 200000),
-- PN004
('PN004', 'Toán học', 16000, 8, 128000),
('PN004', 'Tin học', 16000, 8, 128000),
-- PN005
('PN005', 'Kinh tế', 20000, 12, 240000),
('PN005', 'Pháp luật', 20000, 12, 240000);


CREATE TABLE lbr.DocGia (
    ma_doc_gia varchar(255) PRIMARY KEY,
    ten_doc_gia VARCHAR(255) NOT NULL,
    gioi_tinh VARCHAR(10),
    so_dien_thoai VARCHAR(15),
    ngay_sinh DATE,
    dia_chi VARCHAR(255)
);

INSERT INTO lbr.DocGia (ma_doc_gia, ten_doc_gia, gioi_tinh, so_dien_thoai, ngay_sinh, dia_chi) VALUES
('DG001', 'Nguyễn Văn A', 'Nam', '0901000001', '1995-01-10', 'Hà Nội'),
('DG002', 'Trần Thị B', 'Nữ', '0901000002', '1997-05-20', 'TP. Hồ Chí Minh'),
('DG003', 'Lê Văn C', 'Nam', '0901000003', '1990-12-15', 'Đà Nẵng'),
('DG004', 'Phạm Thị D', 'Nữ', '0901000004', '2000-07-30', 'Hải Phòng'),
('DG005', 'Hoàng Văn E', 'Nam', '0901000005', '1988-09-22', 'Cần Thơ'),
('DG006', 'Đặng Thị F', 'Nữ', '0901000006', '1993-03-11', 'Huế'),
('DG007', 'Ngô Văn G', 'Nam', '0901000007', '1998-06-17', 'Nha Trang'),
('DG008', 'Bùi Thị H', 'Nữ', '0901000008', '1996-04-08', 'Vũng Tàu'),
('DG009', 'Vũ Văn I', 'Nam', '0901000009', '1992-11-25', 'Quảng Ninh'),
('DG010', 'Lý Thị J', 'Nữ', '0901000010', '1994-08-05', 'Bình Dương');


CREATE TABLE lbr.TheThanhVien (
    ma_the varchar(255) PRIMARY KEY,
    ma_doc_gia varchar(255) UNIQUE,
    ngay_cap DATE,
    ngay_het_han DATE,
    trang_thai BOOLEAN DEFAULT TRUE,

    FOREIGN KEY (ma_doc_gia) REFERENCES DocGia(ma_doc_gia)
);

INSERT INTO lbr.TheThanhVien (ma_the, ma_doc_gia, ngay_cap, ngay_het_han, trang_thai) VALUES
('0901000001', 'DG001', '2023-01-01', '2026-01-01', TRUE),
('0901000002', 'DG002', '2023-02-01', '2026-02-01', TRUE),
('0901000003', 'DG003', '2023-03-01', '2026-03-01', TRUE),
('0901000004', 'DG004', '2023-04-01', '2026-04-01', TRUE),
('0901000005', 'DG005', '2023-05-01', '2026-05-01', TRUE),
('0901000006', 'DG006', '2023-06-01', '2026-06-01', TRUE),
('0901000007', 'DG007', '2023-07-01', '2026-07-01', TRUE),
('0901000008', 'DG008', '2023-08-01', '2026-08-01', TRUE),
('0901000009', 'DG009', '2023-09-01', '2026-09-01', TRUE),
('0901000010', 'DG010', '2023-10-01', '2026-10-01', TRUE);

CREATE TABLE lbr.PhieuMuon (
    ma_phieu_muon varchar(255) PRIMARY KEY,
    ma_doc_gia varchar(255),    
    ma_sach varchar(255),        
    ngay_muon DATE,
    han_tra DATE,
    ngay_tra_thuc_te DATE,
    trang_thai VARCHAR(50),
    tien_phat int,
  

    FOREIGN KEY (ma_doc_gia) REFERENCES DocGia(ma_doc_gia),
    FOREIGN KEY (ma_sach) REFERENCES Sach(ma_sach)
);

INSERT INTO lbr.PhieuMuon (ma_phieu_muon, ma_doc_gia, ma_sach, ngay_muon, han_tra, ngay_tra_thuc_te, trang_thai, tien_phat)
VALUES 
-- -- 0: Đã trả (ngày trả thực tế có, trước hoặc đúng hạn)
('PM001', 'DG001', 'S001', '2025-04-01', '2025-04-10', '2025-04-09', '0', 0),
('PM004', 'DG004', 'S004', '2025-04-03', '2025-04-12', '2025-04-12', '0', 0),
('PM008', 'DG008', 'S008', '2025-03-30', '2025-04-09', '2025-04-09', '0', 0),

-- 1: Đang mượn (có ngày mượn và hạn trả, chưa có ngày trả thực tế)
('PM003', 'DG003', 'S003', '2025-04-15', '2025-04-25', NULL, '1', 0),
('PM005', 'DG005', 'S005', '2025-04-17', '2025-04-27', NULL, '1', 0),
('PM007', 'DG007', 'S007', '2025-04-18', '2025-04-28', NULL, '1', 0),
('PM010', 'DG010', 'S010', '2025-04-19', '2025-04-29', NULL, '1', 0),

-- 3: Trả quá hạn (ngày trả thực tế lớn hơn hạn trả)
('PM002', 'DG002', 'S002', '2025-04-02', '2025-04-11', '2025-04-13', '3', 5000),
('PM006', 'DG006', 'S006', '2025-03-25', '2025-04-05', '2025-04-07', '3', 10000),
('PM009', 'DG009', 'S009', '2025-04-01', '2025-04-10', '2025-04-12', '3', 5000),

-- 2: Đặt trước (không có ngày mượn, hạn trả hay ngày trả thực tế)
('PM011', 'DG001', 'S005', NULL, NULL, NULL, '2', 0),
('PM012', 'DG004', 'S001', NULL, NULL, NULL, '2', 0);

create table lbr.PhieuPhat (
    ma_phieu_phat varchar(255) primary key,
    ma_phieu_muon varchar(255),
    tienphat int,
    foreign key (ma_phieu_muon) references PhieuMuon(ma_phieu_muon)
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
    ma_phan_quyen varchar(255),
    ten_phan_quyen varchar(255),
    ma_chuc_nang varchar(255),
  

    PRIMARY KEY (ma_phan_quyen, ma_chuc_nang),
    FOREIGN KEY (ma_chuc_nang) REFERENCES lbr.ChucNang(ma_chuc_nang)
);

-- Phân quyền cho Thủ thư
INSERT INTO lbr.PhanQuyen VALUES 
('PQ1', 'Thủ thư', 'Q1', TRUE, TRUE, TRUE),   -- Quản lý Sách
('PQ2', 'Thủ thư', 'Q4', TRUE, TRUE, FALSE),  -- Quản lý Độc giả
('PQ3', 'Thủ thư', 'Q6', TRUE, TRUE, FALSE),  -- Quản lý Phiếu mượn
('PQ4', 'Thủ thư', 'Q3', TRUE, FALSE, FALSE); -- Quản lý Phiếu nhập sách (chỉ xem)

-- Phân quyền cho Admin
INSERT INTO lbr.PhanQuyen VALUES 
('PQ5', 'Admin', 'Q1', TRUE, TRUE, TRUE),
('PQ6', 'Admin', 'Q2', TRUE, TRUE, TRUE),
('PQ7', 'Admin', 'Q3', TRUE, TRUE, TRUE),
('PQ8', 'Admin', 'Q4', TRUE, TRUE, TRUE),
('PQ9', 'Admin', 'Q5', TRUE, TRUE, TRUE),
('PQ10', 'Admin', 'Q6', TRUE, TRUE, TRUE);


CREATE TABLE lbr.TaiKhoan (
    ma_tai_khoan VARCHAR(255) PRIMARY KEY,
    ten_dang_nhap VARCHAR(255) UNIQUE,
    mat_khau VARCHAR(255) DEFAULT '123456789',

    ma_phan_quyen VARCHAR(255),
    ma_nhan_vien INT,
    ma_the VARCHAR(255),

    FOREIGN KEY (ma_nhan_vien) REFERENCES lbr.NhanVien(ma_nhan_vien),
    FOREIGN KEY (ma_the) REFERENCES lbr.TheThanhVien(ma_the),
    FOREIGN KEY (ma_phan_quyen) REFERENCES lbr.PhanQuyen(ma_phan_quyen),

    CHECK (
        (ma_nhan_vien IS NOT NULL AND ma_the IS NULL) OR 
        (ma_nhan_vien IS NULL AND ma_the IS NOT NULL)
    )
);

CREATE TABLE lbr.ThongBao (
    ma_thong_bao varchar(255) PRIMARY KEY,
    ma_the VARCHAR(255),
    noi_dung TEXT,
    ngay_tao DATETIME DEFAULT CURRENT_TIMESTAMP,

    FOREIGN KEY (ma_the) REFERENCES TaiKhoan(ma_the)
);