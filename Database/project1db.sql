-- Tạo CSDL
Use master
go
Create Database Project1_AutoFail
go
Use Project1_AutoFail
go

-- Tạo các bảng
Create Table LoaiKhachHang (
	MaLoaiKH int not null Identity(1,1) Primary Key,
	TenLoai nvarchar(50) not null, --Gồm Member, Silver, Gold
	MoTa nvarchar(50) null
	)

Create Table KhachHang (
	ID_KH int not null Identity(1,1) Primary Key,
	MaKH varchar(5) not null,
	Constraint UC_MaKH Unique (MaKH), -- Mã Khách hàng là 1 dãy 5 ký tự và là duy nhất
	TenKH nvarchar(50) not null,
	MaLoaiKH int not null,
	GioiTinh bit not null,
	SoDT varchar(11) not null,
	Email nvarchar(50) null,
	DiaChi nvarchar(100) null,
	NgaySinh date null,
	Diem int not null, --1 điểm tương đương 1000 đồng giá trị hóa đơn
	NgayTao datetime not null Default Getdate(),
	GhiChu nvarchar null,
	Constraint FK_LoaiKH_KH Foreign Key (MaLoaiKH) References LoaiKhachHang(MaLoaiKH)
	)

Create Table LoaiSanPham (
	MaLoaiSP int not null Identity(1,1) Primary key,
	TenLoaiSP nvarchar(50) not null,
	GhiChu nvarchar(50) null
	)

Create Table SanPham (
	MaSP int not null Identity(1,1) Primary key,
	TenSP nvarchar(50) not null,
	MaLoaiSP int not null,
	GiaBanLe money not null,
	Barcode varchar(10) not null,
	TinhTrang bit not null, --0 là Ngừng kinh doanh, 1 là Sẵn có
	Constraint FK_SanPham_LoaiSP Foreign Key (MaLoaiSP) References LoaiSanPham(MaLoaiSP),
	Constraint UC_BarcodeSP Unique (Barcode)
	)

Create Table Quyen (
	MaQuyen int not null Identity(1,1) Primary key,
	TenQuyen nvarchar(20) not null --Gồm admin và staff
	)

Create Table NhanVien (
	MaNV int not null Identity(1,1) Primary key,
	TenNV nvarchar(50) not null,
	SoDT varchar(11) not null,
	GioiTinh bit not null, --0 là nam, 1 là nữ
	NgaySinh date not null,
	CMND varchar(12) not null,
	DiaChi nvarchar(100) not null,
	NgayTao datetime not null Default Getdate(),
	TenDangNhap varchar(20) not null, --Tên đăng nhập chỉ cho phép chữ, số, dấu - và _
	MatKhau varchar(20) not null, --Mật khẩu chỉ gồm ký tự thường, chữ in hoa và số (tránh SQL Injection)
	MaQuyen int not null,
	TinhTrang bit not null, --0 là chính thức, 1 là đã nghỉ việc
	Constraint FK_Quyen_NhanVien Foreign Key (MaQuyen) References Quyen(MaQuyen),
	Constraint UC_TenDangNhap Unique (TenDangNhap) -- Tên đăng nhập là duy nhất
	)

Create Table HoaDon (
	MaHD int not null Identity(1,1) Primary key,
	MaNV int not null,
	ID_KH int not null,
	TongTien money not null,
	NgayTao datetime not null Default Getdate(),
	Constraint FK_HoaDon_NhanVien Foreign Key (MaNV) References NhanVien(MaNV),
	Constraint FK_HoaDon_KH Foreign Key (ID_KH) References KhachHang(ID_KH)
	)

Create Table ChiTietHoaDon (
	MaCTHD int not null Identity(1,1) Primary key,
	MaHD int not null,
	MaSP int not null,
	GiaBanLe money not null,
	SoLuong int not null,
	Constraint FK_CTHD_HD Foreign Key (MaHD) References HoaDon(MaHD),
	Constraint FK_CTHD_SanPham Foreign Key (MaSP) References SanPham(MaSP)
	)

Create Table NhaCungCap (
	MaNCC int not null Identity(1,1) Primary key,
	TenNCC nvarchar(50) not null,
	DiaChi nvarchar(100) not null,
	SoDienThoai varchar(11)
	)

Create Table PhieuNhap (
	MaPhieuNhap int not null Identity(1,1) Primary key,
	MaNV int not null,
	MaNCC int not null,
	TongTien money not null,
	NgayNhap datetime not null Default Getdate(),
	Constraint FK_PhieuNhap_NV Foreign Key (MaNV) References NhanVien(MaNV),
	Constraint FK_PhieuNhap_NCC Foreign Key (MaNCC) References NhaCungCap(MaNCC)
	)

Create Table ChiTietPhieuNhap (
	MaCTPN int not null Identity(1,1) Primary key,
	MaPhieuNhap int not null,
	MaSP int not null,
	GiaNhap money not null,
	SoLuong int not null,
	Constraint FK_CTPN_PN Foreign Key (MaPhieuNhap) References PhieuNhap(MaPhieuNhap),
	Constraint FK_CTPN_SanPham Foreign Key (MaSP) References SanPham(MaSP)
	)

Create Table Kho (
	MaLoSP int not null Identity(1,1) Primary key,
	MaSP int not null,
	MaCTPN int not null,
	SoLuong int not null,
	HanSuDung date not null,
	Constraint FK_Kho_SanPham Foreign Key (MaSP) References SanPham(MaSP),
	Constraint FK_Kho_CTPN Foreign Key (MaCTPN) References ChiTietPhieuNhap(MaCTPN)
	)

Create Table ChuongTrinhKM (
	MaKhuyenMai int not null Identity(1,1) Primary key,
	TenKM nvarchar(50) not null,
	NgayBatDau datetime not null,
	NgayKetThuc datetime null,
	KieuKM varchar(50) not null,
	DoiTuongApDung int not null, -- Căn cứ vào loại Khách hàng (vd: 3 - chỉ dành cho Gold, 23 - dành cho Silver và Gold, 123 - áp dụng cho tất cả)
	MoTa text not null
	)

Create Table SanPhamKhuyenMai (
	Ma int not null Identity(1,1) Primary key,
	TenSPKM nvarchar(50) not null,
	SoLuong int not null
	)

Create Table ChiTietKhuyenMai (
	MaCTKM int not null Identity(1,1) Primary Key,
	MaHD int not null,
	MaKhuyenMai int not null,
	MaSPKM int null,
	SoLuong int null,
	ChietKhau int null, --đơn vị phần trăm
	Constraint FK_CTKM_ChuongTrinhKM Foreign Key (MaKhuyenMai) References ChuongTrinhKM(MaKhuyenMai),
	Constraint FK_CTKM_HoaDon Foreign Key (MaHD) References HoaDon(MaHD),
	Constraint CHK_ChietKhau Check (ChietKhau > 0 AND ChietKhau <= 100)
	)


-- Tạo Procedure


-- Nhập bộ dữ liệu mẫu
