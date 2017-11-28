-- =============================================
-- Author:      Dương Thành Vũ
-- Create date: 12/11/2017
-- Description: Tạo CSDL và import data samples
-- =============================================

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
	MaKH varchar(6) not null, -- chuẩn BarCode 93, Mã KH được in sẵn trên thẻ, khi tạo khách hàng mới nhân viên sẽ quét thẻ thể gán thông tin KH vào thẻ
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
	KieuKM varchar(50) not null, -- Gồm CK (chiết khấu), TQ (tặng quà), vd CK 10 -> Chiết khấu 10%, TQ 3 -> tặng quà có ma = 3
	HetHangKM bit not null, --1 là hết hàng, 0 là còn hàng
	DoiTuongApDung varchar(3) not null, -- Căn cứ vào loại Khách hàng (vd: 3 - chỉ dành cho Gold, 23 - dành cho Silver và Gold, 123 - áp dụng cho tất cả)
	MoTa nvarchar(1000) not null
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

-- Nhập bộ dữ liệu mẫu

-- Thêm data vào bảng LoaiKhachHang
INSERT into LoaiKhachHang VALUES (N'Member', N'Thành viên mới')
INSERT into LoaiKhachHang VALUES (N'Silver', N'Thành viên thân thiết')
INSERT into LoaiKhachHang VALUES (N'Gold', N'Thành viên V.I.P')

-- Thêm data vào bảng KhachHang
INSERT into KhachHang VALUES (N'00000', N'(No name)', 1, 1, N'0', NULL, NULL, NULL, 0, CAST(0x0000A41300000000 AS DateTime), NULL)
INSERT into KhachHang VALUES (N'KHN001', N'Quách Thị Ngọn', 1, 1, N'0954124465', N'ngoqt@gmail.com', N'Dăk Nông', CAST(0x3C230B00 AS Date), 10, CAST(0x0000A41300000000 AS DateTime), NULL)
INSERT into KhachHang VALUES (N'KHN002', N'Lê Nguyễn Đức Trung', 2, 0, N'0984637234', N'trunglnd@gmail.com', N'Kom TUm', CAST(0xEE220B00 AS Date), 50, CAST(0x0000A77A00000000 AS DateTime), NULL)
INSERT into KhachHang VALUES (N'KHN003', N'Vũ Duy Nguyên', 3, 0, N'01258976543', N'nguyenvd@gmail.com', N'Hòa Thắng - Tp.Buôn Ma Thuột', CAST(0xFF1F0B00 AS Date), 20, CAST(0x0000A62600000000 AS DateTime), NULL)
INSERT into KhachHang VALUES (N'KHN004', N'Phạm Thị Thúy', 1, 1, N'0965473281', N'thuypt@gmail.com', N'Đinh Núp - Tp.Buôn Ma Thuột', CAST(0xC0220B00 AS Date), 30, CAST(0x0000A7EC00000000 AS DateTime), NULL)
INSERT into KhachHang VALUES (N'KHN005', N'Nguyễn Công Thịnh', 2, 0, N'01223456789', N'thinhnc@gmail.com', N'Hùng Vương - Tp.Buôn Ma Thuột', CAST(0x70210B00 AS Date), 40, CAST(0x0000A46500000000 AS DateTime), NULL)
INSERT into KhachHang VALUES (N'KHN006', N'Đạo Thị Mộng Kha', 3, 1, N'01656483293', N'khadtm@gmail.com', N'Bùi Thị Diểm - Tp.Buôn Ma Thuột', CAST(0xA83C0B00 AS Date), 25, CAST(0x0000A82800000000 AS DateTime), NULL)
INSERT into KhachHang VALUES (N'KHN007', N'Hồ Trọng Hưng', 1, 0, N'0945674532', N'hunght@gmail.com', N'Lý Thái Tổ - Tp.Buôn Ma Thuột', CAST(0xCF220B00 AS Date), 35, CAST(0x0000A7EC00000000 AS DateTime), NULL)
INSERT into KhachHang VALUES (N'KHN008', N'Huỳnh Thị Thùy Dung', 2, 1, N'0983632442', N'dunghtt@gmail.com', N'Gia Lai - KonTum', CAST(0x49230B00 AS Date), 10, CAST(0x0000A83400000000 AS DateTime), NULL)
INSERT into KhachHang VALUES (N'KHN009', N'Nguyễn Ly Na', 3, 1, N'0987571484', N'nanl@gmail.com', N'tp.Đà Nẵng', CAST(0x3A1D0B00 AS Date), 20, CAST(0x0000A83400B1A497 AS DateTime), NULL)
INSERT into KhachHang VALUES (N'KHN010', N'Vũ Nguyễn Đức Anh', 1, 0, N'0984048032', N'anhvnd@gmail.com', N'tp.Hồ Chí Minh', CAST(0xC8180B00 AS Date), 10, CAST(0x0000A83400B1A9AD AS DateTime), NULL)
INSERT into KhachHang VALUES (N'KHN011', N'Nguyễn Đình Khang', 2, 0, N'0982017459', N'khangnd@gmail.com', N'Thị xã Buôn Hồ', CAST(0x381A0B00 AS Date), 40, CAST(0x0000A83400B1AD0C AS DateTime), NULL)
INSERT into KhachHang VALUES (N'KHN012', N'Huỳnh Ngọc Cảnh', 3, 0, N'0983628958', N'canhhn@gmail.com', N'Trần Khanh Dư - Tp.Buôn Ma Thuột', CAST(0x36190B00 AS Date), 60, CAST(0x0000A83400B1AF63 AS DateTime), NULL)
INSERT into KhachHang VALUES (N'KHN013', N'Châu Văn Khanh', 1, 0, N'0988240524', N'khanhcv@gmail.com', N'Thị trấn Phước An', CAST(0x86260B00 AS Date), 30, CAST(0x0000A83400B1B86C AS DateTime), NULL)
INSERT into KhachHang VALUES (N'KHN014', N'Trần Văn Hoàng', 2, 0, N'0983741352', N'hoangdv@gmail.com', N'Tp.Buôn Ma Thuột', CAST(0x831E0B00 AS Date), 20, CAST(0x0000A83400B1BAFE AS DateTime), NULL)
INSERT into KhachHang VALUES (N'KHN015', N'Hữu Văn Huy', 3, 0, N'0989639462', N'huyhv@gmail.com', N'Thị trấn Phước An', CAST(0xF71E0B00 AS Date), 50, CAST(0x0000A83400B1C219 AS DateTime), NULL)
INSERT into KhachHang VALUES (N'KHN016', N'Lương Thị Minh Huệ', 1, 1, N'0981637823', N'hueltm@gmail.com', N'Tp.Hồ Chí Minh', CAST(0x50200B00 AS Date), 60, CAST(0x0000A83400B1C45F AS DateTime), NULL)
INSERT into KhachHang VALUES (N'KHN017', N'Đoàn Minh Hoàng', 2, 0, N'0984985946', N'hoangdm@gmail.com', N'Tp.Buôn Ma Thuột', CAST(0xD1180B00 AS Date), 50, CAST(0x0000A83400B1C68D AS DateTime), NULL)
INSERT into KhachHang VALUES (N'KHN018', N'Trần Công Thức', 3, 0, N'0988423039', N'thuct@gmail.com', N'Tp.Hồ Chí Minh', CAST(0xF3210B00 AS Date), 30, CAST(0x0000A83400B1C914 AS DateTime), NULL)
INSERT into KhachHang VALUES (N'KHN019', N'Trương Minh Hiếu', 1, 0, N'0982884518', N'hieutm@gmail.com', N'Hòa Thắng - Tp.Buôn Ma Thuột', CAST(0x2B1C0B00 AS Date), 70, CAST(0x0000A83400B1CBE2 AS DateTime), NULL)
INSERT into KhachHang VALUES (N'KHN020', N'Đoàn Thị Thanh Thúy', 2, 1, N'0989778882', N'thuydtt@gmail.com', N'Thị trấn Phước An', CAST(0xE2220B00 AS Date), 90, CAST(0x0000A83400B1CFE9 AS DateTime), NULL)

--Thêm data vào bảng LoaiSanPham
INSERT into LoaiSanPham VALUES (N'Dinh dưỡng phụ nữ mang thai', NULL)
INSERT into LoaiSanPham VALUES (N'Dinh dưỡng trẻ em', NULL)
INSERT into LoaiSanPham VALUES (N'Dinh dưỡng người lớn', NULL)
INSERT into LoaiSanPham VALUES (N'Dinh dưỡng chuyên biệt', NULL)

-- Thêm data vào bảng SanPham
INSERT into SanPham VALUES (N'NutriCare Mom', 1, 195000.0000, N'4902430504577', 1)
INSERT into SanPham VALUES (N'GestCare Mom', 1, 100000.0000, N'4902430512800', 0)
INSERT into SanPham VALUES (N'GestCare Mom Plus', 1, 150000.0000, N'8934868112297', 1)
INSERT into SanPham VALUES (N'MetaCare 3 Olive', 2, 100000.0000, N'8935212800266', 1)
INSERT into SanPham VALUES (N'MetaCare 4 Olive', 2, 100000.0000, N'8934868126867', 1)
INSERT into SanPham VALUES (N'Metacare 5 Olive', 2, 100000.0000, N'9786042004107', 1)
INSERT into SanPham VALUES (N'Care 100 Plus', 2, 1000000.0000, N'4007817527221', 1)
INSERT into SanPham VALUES (N'Smarta IQ 3', 2, 319000.0000, N'8938503632041', 1)
INSERT into SanPham VALUES (N'Smarta IQ 4', 2, 310000.0000, N'8938503275040', 1)
INSERT into SanPham VALUES (N'Nutricare Gold', 3, 430000.0000, N'8992222051613', 0)
INSERT into SanPham VALUES (N'Nutricare Bone', 3, 175000.0000, N'8938508407019', 1)
INSERT into SanPham VALUES (N'GluCare Gold', 3, 430000.0000, N'8936011776271', 1)
INSERT into SanPham VALUES (N'Nutricare Senor', 3, 420000.0000, N'8934614021637', 1)
INSERT into SanPham VALUES (N'Leanmax', 4, 520000.0000, N'8934964124422', 1)
INSERT into SanPham VALUES (N'HanieKid', 4, 450000.0000, N'8934588023064', 1)
INSERT into SanPham VALUES (N'LeanMax Ligos', 4, 250000.0000, N'8850007800071', 1)
INSERT into SanPham VALUES (N'Leanmax Hope', 4, 520000.0000, N'8936052530108', 1)
INSERT into SanPham VALUES (N'Nutricare Cerna', 4, 510000.0000, N'8934588843051', 1)
INSERT into SanPham VALUES (N'GrandCare', 4, 320000.0000, N'8938502868014', 1)
INSERT into SanPham VALUES (N'Leanmax Rena 1', 4, 240000.0000, N'8936017361082', 1)
INSERT into SanPham VALUES (N'Leanmax Rena 2', 4, 255000.0000, N'8934988020533', 1)
INSERT into SanPham VALUES (N'Leanmax Bone', 4, 226000.0000, N'8936017368395', 1)
INSERT into SanPham VALUES (N'Leanmax Mom', 4, 555000.0000, N'8936017367091', 1)
INSERT into SanPham VALUES (N'sữa chua vinamilk', 1, 23000.0000, N'8934673607827', 0)

-- Thêm data vào bảng Quyen
INSERT into Quyen VALUES (N'Admin')
INSERT into Quyen VALUES (N'Staff')

--Thêm data vào bảng NhanVien
INSERT into NhanVien VALUES (N'Dương Thành Vũ', N'0986390134', 0, CAST(0x091B0B00 AS Date), N'241396557', N'20 Y Ơn, p. Tân Thành, tp. BMT, Đăk Lăk', CAST(0x0000A82A00CE8B13 AS DateTime), N'vudt', N'0000', 1, 0)
INSERT into NhanVien VALUES (N'Nguyễn Văn Tuấn', N'01666063015', 0, CAST(0x4F220B00 AS Date), N'241702956', N'Nguyễn Tất Thành - Tp.Buôn Ma Thuột', CAST(0x0000A82F00000000 AS DateTime), N'tuannv', N'1111', 2, 0)
INSERT into NhanVien VALUES (N'Đỗ Quốc Bảo', N'01673037567', 0, CAST(0x1D220B00 AS Date), N'241688966', N'Ama Khê - Tp.Buôn Ma Thuôt', CAST(0x0000A82F00000000 AS DateTime), N'baodq', N'2222', 2, 0)
INSERT into NhanVien VALUES (N'Dương Thị Cẩm Tiên', N'0987654342', 0, CAST(0xB11D0B00 AS Date), N'241576859', N'Ngô Quy?n - Tp.Buôn Ma Thu?c', CAST(0x0000A83401783308 AS DateTime), N'tiendtc', N'3333', 2, 1)
INSERT into NhanVien VALUES (N'Trần Thị Hồng Nhung', N'0123457765', 1, CAST(0x7C1E0B00 AS Date), N'241465744', N'Nơ Trang Long - Tp.Buôn Ma Thuột', CAST(0x0000A81800000000 AS DateTime), N'nhungtth', N'4444', 3, 0)
INSERT into NhanVien VALUES (N'Vũ Văn Anh', N'0166785943', 0, CAST(0x291E0B00 AS Date), N'241556789', N'Phan Bội Châu - Tp.Buôn Ma Thuột', CAST(0x0000A75200000000 AS DateTime), N'anhvv', N'5555', 3, 1)
INSERT into NhanVien VALUES (N'Vương Thị Tuyết Ngân', N'0987654567', 1, CAST(0x8E1D0B00 AS Date), N'241345876', N'Y Ngông - Tp.Buôn Ma Thuột', CAST(0x0000A83500000000 AS DateTime), N'nganvtt', N'6666', 3, 0)

--Thêm data vào bảng NhaCungCap
INSERT into NhaCungCap VALUES (N'Công ty TNHH Dinh Dưỡng NUTRICARE', N'Tòa nhà NUTRICARE, Số 1, Liền kề 2, Khu đô thị Vạn Phúc, Hà Đông, Hà Nội', N'1800 6011')

--Thêm data vào bảng SanPhamKhuyenMai
INSERT into SanPhamKhuyenMai VALUES (N'Cốc thủy tinh chia vạch ml', 100)
INSERT into SanPhamKhuyenMai VALUES (N'Tô Sứ Cao cấp 14 cm', 100)
INSERT into SanPhamKhuyenMai VALUES (N'Thau inox 43cm', 100)
INSERT into SanPhamKhuyenMai VALUES (N'1 Bộ 2 bình tập uống hữu cơ cho bé Thái Lan', 100)
INSERT into SanPhamKhuyenMai VALUES (N'Xe Ôtô tải đồ chơi cho bé', 100)
INSERT into SanPhamKhuyenMai VALUES (N'Áo mưa cao cấp cho người lớn', 100)
INSERT into SanPhamKhuyenMai VALUES (N'1 bình nước thể thao 500ml', 100)
INSERT into SanPhamKhuyenMai VALUES (N'1 bộ xép xình dành cho bé', 100)
INSERT into SanPhamKhuyenMai VALUES (N'1 tô thủy tinh', 100)
INSERT into SanPhamKhuyenMai VALUES (N'1 bộ dao dùng trong nhà bếp', 100)

