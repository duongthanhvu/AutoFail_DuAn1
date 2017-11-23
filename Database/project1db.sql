-- Tạo CSDL
Use master
go
If(db_id('AutoFail_Project1_db')is not null)
Drop database AutoFail_Project1_db
go 
Create Database AutoFail_Project1_db
go
Use AutoFail_Project1_db
go

-- Tạo các bảng
Create Table LoaiKhachHang (
	MaLoaiKH int not null Identity(1,1) Primary Key,
	TenLoai nvarchar(50) not null, --Gồm Member, Silver, Gold
	MoTa nvarchar(50) null
	)

Create Table KhachHang (
	ID_KH int not null Identity(1,1) Primary Key,
	MaKH varchar(5) not null, --Mã KH được in sẵn trên thẻ, khi tạo khách hàng mới nhân viên sẽ quét thẻ thể gán thông tin KH vào thẻ
	Constraint UC_MaKH Unique (MaKH), -- Mã Khách hàng là 1 dãy 5 ký tự và là duy nhất
	TenKH nvarchar(50) not null,
	MaLoaiKH int not null,
	GioiTinh bit not null, -- 1 là Nam, 0 là nữ
	SoDT varchar(11) not null,
	Email nvarchar(50) null,
	DiaChi nvarchar(100) null,
	NgaySinh date null,
	Diem int not null, --1 điểm tương đương 10.000 đồng giá trị hóa đơn
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
	GioiTinh bit not null, --1 là nam, 0 là nữ
	NgaySinh date not null,
	CMND varchar(12) not null,
	DiaChi nvarchar(100) not null,
	NgayTao datetime not null Default Getdate(),
	TenDangNhap varchar(20) not null, --Tên đăng nhập chỉ cho phép chữ, số, dấu - và _
	MatKhau varchar(20) not null, --Mật khẩu chỉ gồm ký tự thường, chữ in hoa và số (tránh SQL Injection)
	MaQuyen int not null,
	TinhTrang bit not null, --1 là chính thức, 0 là đã nghỉ việc
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
	HetHangKM bit not null, --1 là hết hàng, 0 là còn hàng
	DoiTuongApDung varchar(3) not null, -- Căn cứ vào loại Khách hàng (vd: 3 - chỉ dành cho Gold, 23 - dành cho Silver và Gold, 123 - áp dụng cho tất cả)
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

-- =============================================
-- Author:      Dương Thành Vũ
-- Create date: 12/11/2017
-- Description: Tạo các bảng và ràng buộc 
-- =============================================

-- Nhập bộ dữ liệu mẫu
INSERT into LoaiKhachHang VALUES (N'Member', N'Thành viên mới')
INSERT into LoaiKhachHang VALUES (N'Silver', N'Thành viên thân thiết')
INSERT into LoaiKhachHang VALUES (N'Gold', N'Thành viên V.I.P')

INSERT into KhachHang VALUES (N'00000', N'(No name)', 1, 1, N'0', NULL, NULL, NULL, 0, CAST(0x0000A41300000000 AS DateTime), NULL)
INSERT into KhachHang VALUES (N'ABCDE', N'Vũ Thành Dương', 1, 1, N'0984637234', N'vudt.93@gmail.com', NULL, NULL, 50, CAST(0x0000A77A00000000 AS DateTime), NULL)

INSERT into LoaiSanPham VALUES (N'Dinh dưỡng phụ nữ mang thai', NULL)
INSERT into LoaiSanPham VALUES (N'Dinh dưỡng trẻ em', NULL)
INSERT into LoaiSanPham VALUES (N'Dinh dưỡng người lớn', NULL)
INSERT into LoaiSanPham VALUES (N'Dinh dưỡng chuyên biệt', NULL)

INSERT into SanPham VALUES (N'NutriCare Mom', 1, 195000.0000, N'12345', 1)
INSERT into SanPham VALUES (N'GestCare Mom', 1, 100000.0000, N'12346', 1)
INSERT into SanPham VALUES (N'GestCare Mom Plus', 1, 150000.0000, N'11111', 1)

INSERT into Quyen VALUES (N'Admin')
INSERT into Quyen VALUES (N'Staff')

INSERT into NhanVien VALUES (N'Dương Thành Vũ', N'0986390134', 0, CAST(0x091B0B00 AS Date), N'241396557', N'20 Y Ơn, p. Tân Thành, tp. BMT, Đăk Lăk', CAST(0x0000A82A00CE8B13 AS DateTime), N'vudt', N'0000', 1, 0)


