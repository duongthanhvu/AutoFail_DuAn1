USE [master]
GO
/****** Object:  Database [AutoFail_Project1_db]    Script Date: 25/11/2017 10:06:44 PM ******/
CREATE DATABASE [AutoFail_Project1_db]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'AutoFail_Project1_db', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.TUAN\MSSQL\DATA\AutoFail_Project1_db.mdf' , SIZE = 3136KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'AutoFail_Project1_db_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.TUAN\MSSQL\DATA\AutoFail_Project1_db_log.ldf' , SIZE = 832KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [AutoFail_Project1_db] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [AutoFail_Project1_db].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [AutoFail_Project1_db] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [AutoFail_Project1_db] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [AutoFail_Project1_db] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [AutoFail_Project1_db] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [AutoFail_Project1_db] SET ARITHABORT OFF 
GO
ALTER DATABASE [AutoFail_Project1_db] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [AutoFail_Project1_db] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [AutoFail_Project1_db] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [AutoFail_Project1_db] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [AutoFail_Project1_db] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [AutoFail_Project1_db] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [AutoFail_Project1_db] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [AutoFail_Project1_db] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [AutoFail_Project1_db] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [AutoFail_Project1_db] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [AutoFail_Project1_db] SET  DISABLE_BROKER 
GO
ALTER DATABASE [AutoFail_Project1_db] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [AutoFail_Project1_db] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [AutoFail_Project1_db] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [AutoFail_Project1_db] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [AutoFail_Project1_db] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [AutoFail_Project1_db] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [AutoFail_Project1_db] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [AutoFail_Project1_db] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [AutoFail_Project1_db] SET  MULTI_USER 
GO
ALTER DATABASE [AutoFail_Project1_db] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [AutoFail_Project1_db] SET DB_CHAINING OFF 
GO
ALTER DATABASE [AutoFail_Project1_db] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [AutoFail_Project1_db] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [AutoFail_Project1_db]
GO
/****** Object:  Table [dbo].[ChiTietHoaDon]    Script Date: 25/11/2017 10:06:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietHoaDon](
	[MaCTHD] [int] IDENTITY(1,1) NOT NULL,
	[MaHD] [int] NOT NULL,
	[MaSP] [int] NOT NULL,
	[GiaBanLe] [money] NOT NULL,
	[SoLuong] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaCTHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ChiTietKhuyenMai]    Script Date: 25/11/2017 10:06:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietKhuyenMai](
	[MaCTKM] [int] IDENTITY(1,1) NOT NULL,
	[MaHD] [int] NOT NULL,
	[MaKhuyenMai] [int] NOT NULL,
	[MaSPKM] [int] NULL,
	[SoLuong] [int] NULL,
	[ChietKhau] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[MaCTKM] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ChiTietPhieuNhap]    Script Date: 25/11/2017 10:06:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietPhieuNhap](
	[MaCTPN] [int] IDENTITY(1,1) NOT NULL,
	[MaPhieuNhap] [int] NOT NULL,
	[MaSP] [int] NOT NULL,
	[GiaNhap] [money] NOT NULL,
	[SoLuong] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaCTPN] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ChuongTrinhKM]    Script Date: 25/11/2017 10:06:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[ChuongTrinhKM](
	[MaKhuyenMai] [int] IDENTITY(1,1) NOT NULL,
	[TenKM] [nvarchar](50) NOT NULL,
	[NgayBatDau] [datetime] NOT NULL,
	[NgayKetThuc] [datetime] NULL,
	[KieuKM] [varchar](50) NOT NULL,
	[DoiTuongApDung] [int] NOT NULL,
	[MoTa] [text] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaKhuyenMai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 25/11/2017 10:06:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[MaHD] [int] IDENTITY(1,1) NOT NULL,
	[MaNV] [int] NOT NULL,
	[ID_KH] [int] NOT NULL,
	[TongTien] [money] NOT NULL,
	[NgayTao] [datetime] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 25/11/2017 10:06:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[KhachHang](
	[ID_KH] [int] IDENTITY(1,1) NOT NULL,
	[MaKH] [varchar](5) NOT NULL,
	[TenKH] [nvarchar](50) NOT NULL,
	[MaLoaiKH] [int] NOT NULL,
	[GioiTinh] [bit] NOT NULL,
	[SoDT] [varchar](11) NOT NULL,
	[Email] [nvarchar](50) NULL,
	[DiaChi] [nvarchar](100) NULL,
	[NgaySinh] [date] NULL,
	[Diem] [int] NOT NULL,
	[NgayTao] [datetime] NOT NULL,
	[GhiChu] [nvarchar](1) NULL,
 CONSTRAINT [PK__KhachHan__8B62EC8915B76B90] PRIMARY KEY CLUSTERED 
(
	[ID_KH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Kho]    Script Date: 25/11/2017 10:06:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Kho](
	[MaLoSP] [int] IDENTITY(1,1) NOT NULL,
	[MaSP] [int] NOT NULL,
	[MaCTPN] [int] NOT NULL,
	[SoLuong] [int] NOT NULL,
	[HanSuDung] [date] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaLoSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[LoaiKhachHang]    Script Date: 25/11/2017 10:06:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiKhachHang](
	[MaLoaiKH] [int] IDENTITY(1,1) NOT NULL,
	[TenLoai] [nvarchar](50) NOT NULL,
	[MoTa] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaLoaiKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[LoaiSanPham]    Script Date: 25/11/2017 10:06:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiSanPham](
	[MaLoaiSP] [int] IDENTITY(1,1) NOT NULL,
	[TenLoaiSP] [nvarchar](50) NOT NULL,
	[GhiChu] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaLoaiSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[NhaCungCap]    Script Date: 25/11/2017 10:06:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[NhaCungCap](
	[MaNCC] [int] IDENTITY(1,1) NOT NULL,
	[TenNCC] [nvarchar](50) NOT NULL,
	[DiaChi] [nvarchar](100) NOT NULL,
	[SoDienThoai] [varchar](11) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaNCC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 25/11/2017 10:06:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaNV] [int] IDENTITY(1,1) NOT NULL,
	[TenNV] [nvarchar](50) NOT NULL,
	[SoDT] [varchar](11) NOT NULL,
	[GioiTinh] [bit] NOT NULL,
	[NgaySinh] [date] NOT NULL,
	[CMND] [varchar](12) NOT NULL,
	[DiaChi] [nvarchar](100) NOT NULL,
	[NgayTao] [datetime] NOT NULL,
	[TenDangNhap] [varchar](20) NOT NULL,
	[MatKhau] [varchar](20) NOT NULL,
	[MaQuyen] [int] NOT NULL,
	[TinhTrang] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[PhieuNhap]    Script Date: 25/11/2017 10:06:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuNhap](
	[MaPhieuNhap] [int] IDENTITY(1,1) NOT NULL,
	[MaNV] [int] NOT NULL,
	[MaNCC] [int] NOT NULL,
	[TongTien] [money] NOT NULL,
	[NgayNhap] [datetime] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaPhieuNhap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Quyen]    Script Date: 25/11/2017 10:06:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Quyen](
	[MaQuyen] [int] IDENTITY(1,1) NOT NULL,
	[TenQuyen] [nvarchar](20) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaQuyen] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 25/11/2017 10:06:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[SanPham](
	[MaSP] [int] IDENTITY(1,1) NOT NULL,
	[TenSP] [nvarchar](50) NOT NULL,
	[MaLoaiSP] [int] NOT NULL,
	[GiaBanLe] [money] NOT NULL,
	[Barcode] [varchar](10) NOT NULL,
	[TinhTrang] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[SanPhamKhuyenMai]    Script Date: 25/11/2017 10:06:44 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPhamKhuyenMai](
	[Ma] [int] IDENTITY(1,1) NOT NULL,
	[TenSPKM] [nvarchar](50) NOT NULL,
	[SoLuong] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Ma] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET IDENTITY_INSERT [dbo].[ChiTietHoaDon] ON 

INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [GiaBanLe], [SoLuong]) VALUES (1, 1, 1, 195000.0000, 10)
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [GiaBanLe], [SoLuong]) VALUES (2, 2, 3, 150000.0000, 20)
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [GiaBanLe], [SoLuong]) VALUES (3, 3, 2, 100000.0000, 5)
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [GiaBanLe], [SoLuong]) VALUES (4, 4, 4, 230000.0000, 10)
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [GiaBanLe], [SoLuong]) VALUES (5, 5, 5, 230000.0000, 15)
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [GiaBanLe], [SoLuong]) VALUES (6, 6, 6, 286000.0000, 20)
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [GiaBanLe], [SoLuong]) VALUES (7, 7, 7, 243500.0000, 11)
SET IDENTITY_INSERT [dbo].[ChiTietHoaDon] OFF
SET IDENTITY_INSERT [dbo].[ChiTietKhuyenMai] ON 

INSERT [dbo].[ChiTietKhuyenMai] ([MaCTKM], [MaHD], [MaKhuyenMai], [MaSPKM], [SoLuong], [ChietKhau]) VALUES (1, 1, 2, 3, 1, NULL)
INSERT [dbo].[ChiTietKhuyenMai] ([MaCTKM], [MaHD], [MaKhuyenMai], [MaSPKM], [SoLuong], [ChietKhau]) VALUES (2, 2, 3, 5, 1, NULL)
SET IDENTITY_INSERT [dbo].[ChiTietKhuyenMai] OFF
SET IDENTITY_INSERT [dbo].[ChiTietPhieuNhap] ON 

INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPhieuNhap], [MaSP], [GiaNhap], [SoLuong]) VALUES (1, 1, 1, 150000.0000, 50)
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPhieuNhap], [MaSP], [GiaNhap], [SoLuong]) VALUES (2, 2, 2, 130000.0000, 50)
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPhieuNhap], [MaSP], [GiaNhap], [SoLuong]) VALUES (3, 3, 3, 150000.0000, 43)
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPhieuNhap], [MaSP], [GiaNhap], [SoLuong]) VALUES (4, 4, 4, 230000.0000, 22)
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPhieuNhap], [MaSP], [GiaNhap], [SoLuong]) VALUES (6, 6, 5, 230000.0000, 70)
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPhieuNhap], [MaSP], [GiaNhap], [SoLuong]) VALUES (7, 7, 6, 286000.0000, 39)
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPhieuNhap], [MaSP], [GiaNhap], [SoLuong]) VALUES (8, 8, 7, 243500.0000, 34)
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPhieuNhap], [MaSP], [GiaNhap], [SoLuong]) VALUES (9, 9, 8, 319000.0000, 14)
SET IDENTITY_INSERT [dbo].[ChiTietPhieuNhap] OFF
SET IDENTITY_INSERT [dbo].[ChuongTrinhKM] ON 

INSERT [dbo].[ChuongTrinhKM] ([MaKhuyenMai], [TenKM], [NgayBatDau], [NgayKetThuc], [KieuKM], [DoiTuongApDung], [MoTa]) VALUES (2, N'Khuyến mãi 20/11', CAST(0x0000A82C00000000 AS DateTime), CAST(0x0000A83100000000 AS DateTime), N'Nhân d?p l? 20/11', 2, N'Mua 2 t?ng 1')
INSERT [dbo].[ChuongTrinhKM] ([MaKhuyenMai], [TenKM], [NgayBatDau], [NgayKetThuc], [KieuKM], [DoiTuongApDung], [MoTa]) VALUES (3, N'Khuyễn Mãi 8/3', CAST(0x0000A72B00000000 AS DateTime), CAST(0x0000A73000000000 AS DateTime), N'Nhân d?p l? 8/3', 2, N'Mua 3 t?ng 1')
INSERT [dbo].[ChuongTrinhKM] ([MaKhuyenMai], [TenKM], [NgayBatDau], [NgayKetThuc], [KieuKM], [DoiTuongApDung], [MoTa]) VALUES (7, N'Khuyến mãi 20/10', CAST(0x0000A81200000000 AS DateTime), CAST(0x0000A81300000000 AS DateTime), N'Nhâp d?p l? 20/10', 1, N'Mua 1 t?ng 1')
INSERT [dbo].[ChuongTrinhKM] ([MaKhuyenMai], [TenKM], [NgayBatDau], [NgayKetThuc], [KieuKM], [DoiTuongApDung], [MoTa]) VALUES (8, N'Khuyến mãi đặc biệt', CAST(0x0000A7FF00000000 AS DateTime), CAST(0x0000A81C00000000 AS DateTime), N'Tri ân khách hàng', 3, N'T?ng kèm s?n ph?m có giá tr? tinh th?n')
INSERT [dbo].[ChuongTrinhKM] ([MaKhuyenMai], [TenKM], [NgayBatDau], [NgayKetThuc], [KieuKM], [DoiTuongApDung], [MoTa]) VALUES (9, N'Khuyến mãi Giảm Giá cực sóc', CAST(0x0000A76600000000 AS DateTime), CAST(0x0000A77400000000 AS DateTime), N'Gi?m giá các s?n ph?m', 1, N'Gi?m giá s?n ph?m')
SET IDENTITY_INSERT [dbo].[ChuongTrinhKM] OFF
SET IDENTITY_INSERT [dbo].[HoaDon] ON 

INSERT [dbo].[HoaDon] ([MaHD], [MaNV], [ID_KH], [TongTien], [NgayTao]) VALUES (1, 3, 2, 1000000.0000, CAST(0x0000A84700000000 AS DateTime))
INSERT [dbo].[HoaDon] ([MaHD], [MaNV], [ID_KH], [TongTien], [NgayTao]) VALUES (2, 4, 5, 1500000.0000, CAST(0x0000A6BD00000000 AS DateTime))
INSERT [dbo].[HoaDon] ([MaHD], [MaNV], [ID_KH], [TongTien], [NgayTao]) VALUES (3, 1, 1, 2200000.0000, CAST(0x0000A8360168FF82 AS DateTime))
INSERT [dbo].[HoaDon] ([MaHD], [MaNV], [ID_KH], [TongTien], [NgayTao]) VALUES (4, 5, 30, 2500000.0000, CAST(0x0000A83601692110 AS DateTime))
INSERT [dbo].[HoaDon] ([MaHD], [MaNV], [ID_KH], [TongTien], [NgayTao]) VALUES (5, 6, 29, 1000000.0000, CAST(0x0000A83601693183 AS DateTime))
INSERT [dbo].[HoaDon] ([MaHD], [MaNV], [ID_KH], [TongTien], [NgayTao]) VALUES (6, 7, 28, 500000.0000, CAST(0x0000A83601694A07 AS DateTime))
INSERT [dbo].[HoaDon] ([MaHD], [MaNV], [ID_KH], [TongTien], [NgayTao]) VALUES (7, 9, 27, 2400000.0000, CAST(0x0000A836016963E2 AS DateTime))
SET IDENTITY_INSERT [dbo].[HoaDon] OFF
SET IDENTITY_INSERT [dbo].[KhachHang] ON 

INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (1, N'pt001', N'Quách Thị Ngọn', 1, 1, N'0954124465', N'ngoqt@gmail.com', N'Dăk Nông', CAST(0x3C230B00 AS Date), 10, CAST(0x0000A41300000000 AS DateTime), NULL)
INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (2, N'pt002', N'Lê Nguyễn Đức Trung', 2, 0, N'0984637234', N'trunglnd@gmail.com', N'Kom TUm', CAST(0xEE220B00 AS Date), 50, CAST(0x0000A77A00000000 AS DateTime), NULL)
INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (5, N'pt003', N'Vũ Duy Nguyên', 3, 0, N'01258976543', N'nguyenvd@gmail.com', N'Hòa Thắng - Tp.Buôn Ma Thuột', CAST(0xFF1F0B00 AS Date), 20, CAST(0x0000A62600000000 AS DateTime), NULL)
INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (7, N'pt004', N'Phạm Thị Thúy', 1, 1, N'0965473281', N'thuypt@gmail.com', N'Đinh Núp - Tp.Buôn Ma Thuột', CAST(0xC0220B00 AS Date), 30, CAST(0x0000A7EC00000000 AS DateTime), NULL)
INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (8, N'pt005', N'Nguyễn Công Thịnh', 2, 0, N'01223456789', N'thinhnc@gmail.com', N'Hùng Vương - Tp.Buôn Ma Thuột', CAST(0x70210B00 AS Date), 40, CAST(0x0000A46500000000 AS DateTime), NULL)
INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (9, N'pt006', N'Đạo Thị Mộng Kha', 3, 1, N'01656483293', N'khadtm@gmail.com', N'Bùi Thị Diểm - Tp.Buôn Ma Thuột', CAST(0xA83C0B00 AS Date), 25, CAST(0x0000A82800000000 AS DateTime), NULL)
INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (10, N'pt007', N'Hồ Trọng Hưng', 1, 0, N'0945674532', N'hunght@gmail.com', N'Lý Thái Tổ - Tp.Buôn Ma Thuột', CAST(0xCF220B00 AS Date), 35, CAST(0x0000A7EC00000000 AS DateTime), NULL)
INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (18, N'pt008', N'Huỳnh Thị Thùy Dung', 2, 1, N'0983632442', N'dunghtt@gmail.com', N'Gia Lai - KonTum', CAST(0x49230B00 AS Date), 10, CAST(0x0000A83400000000 AS DateTime), NULL)
INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (19, N'pt009', N'Nguyễn Ly Na', 3, 1, N'0987571484', N'nanl@gmail.com', N'tp.Đà Nẵng', CAST(0x3A1D0B00 AS Date), 20, CAST(0x0000A83400B1A497 AS DateTime), NULL)
INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (20, N'pt010', N'Vũ Nguyễn Đức Anh', 1, 0, N'0984048032', N'anhvnd@gmail.com', N'tp.Hồ Chí Minh', CAST(0xC8180B00 AS Date), 10, CAST(0x0000A83400B1A9AD AS DateTime), NULL)
INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (21, N'pt011', N'Nguyễn Đình Khang', 2, 0, N'0982017459', N'khangnd@gmail.com', N'Thị xã Buôn Hồ', CAST(0x381A0B00 AS Date), 40, CAST(0x0000A83400B1AD0C AS DateTime), NULL)
INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (22, N'pt012', N'Huỳnh Ngọc Cảnh', 3, 0, N'0983628958', N'canhhn@gmail.com', N'Trần Khanh Dư - Tp.Buôn Ma Thuột', CAST(0x36190B00 AS Date), 60, CAST(0x0000A83400B1AF63 AS DateTime), NULL)
INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (23, N'pt013', N'Châu Văn Khanh', 1, 0, N'0988240524', N'khanhcv@gmail.com', N'Thị trấn Phước An', CAST(0x86260B00 AS Date), 30, CAST(0x0000A83400B1B86C AS DateTime), NULL)
INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (24, N'pt014', N'Trần Văn Hoàng', 2, 0, N'0983741352', N'hoangdv@gmail.com', N'Tp.Buôn Ma Thuột', CAST(0x831E0B00 AS Date), 20, CAST(0x0000A83400B1BAFE AS DateTime), NULL)
INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (25, N'pt015', N'Hữu Văn Huy', 3, 0, N'0989639462', N'huyhv@gmail.com', N'Thị trấn Phước An', CAST(0xF71E0B00 AS Date), 50, CAST(0x0000A83400B1C219 AS DateTime), NULL)
INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (26, N'pt016', N'Lương Thị Minh Huệ', 1, 1, N'0981637823', N'hueltm@gmail.com', N'Tp.Hồ Chí Minh', CAST(0x50200B00 AS Date), 60, CAST(0x0000A83400B1C45F AS DateTime), NULL)
INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (27, N'pt017', N'Đoàn Minh Hoàng', 2, 0, N'0984985946', N'hoangdm@gmail.com', N'Tp.Buôn Ma Thuột', CAST(0xD1180B00 AS Date), 50, CAST(0x0000A83400B1C68D AS DateTime), NULL)
INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (28, N'pt018', N'Trần Công Thức', 3, 0, N'0988423039', N'thuct@gmail.com', N'Tp.Hồ Chí Minh', CAST(0xF3210B00 AS Date), 30, CAST(0x0000A83400B1C914 AS DateTime), NULL)
INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (29, N'pt019', N'Trương Minh Hiếu', 1, 0, N'0982884518', N'hieutm@gmail.com', N'Hòa Thắng - Tp.Buôn Ma Thuột', CAST(0x2B1C0B00 AS Date), 70, CAST(0x0000A83400B1CBE2 AS DateTime), NULL)
INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (30, N'pt020', N'Đoàn Thị Thanh Thúy', 2, 1, N'0989778882', N'thuydtt@gmail.com', N'Thị trấn Phước An', CAST(0xE2220B00 AS Date), 90, CAST(0x0000A83400B1CFE9 AS DateTime), NULL)
SET IDENTITY_INSERT [dbo].[KhachHang] OFF
SET IDENTITY_INSERT [dbo].[Kho] ON 

INSERT [dbo].[Kho] ([MaLoSP], [MaSP], [MaCTPN], [SoLuong], [HanSuDung]) VALUES (2, 1, 1, 50, CAST(0x8C3D0B00 AS Date))
INSERT [dbo].[Kho] ([MaLoSP], [MaSP], [MaCTPN], [SoLuong], [HanSuDung]) VALUES (3, 3, 2, 50, CAST(0x8C3D0B00 AS Date))
INSERT [dbo].[Kho] ([MaLoSP], [MaSP], [MaCTPN], [SoLuong], [HanSuDung]) VALUES (6, 2, 1, 11, CAST(0x913D0B00 AS Date))
INSERT [dbo].[Kho] ([MaLoSP], [MaSP], [MaCTPN], [SoLuong], [HanSuDung]) VALUES (7, 4, 3, 20, CAST(0x8C3D0B00 AS Date))
INSERT [dbo].[Kho] ([MaLoSP], [MaSP], [MaCTPN], [SoLuong], [HanSuDung]) VALUES (8, 5, 4, 60, CAST(0x8D3D0B00 AS Date))
INSERT [dbo].[Kho] ([MaLoSP], [MaSP], [MaCTPN], [SoLuong], [HanSuDung]) VALUES (9, 6, 6, 30, CAST(0x8D3D0B00 AS Date))
INSERT [dbo].[Kho] ([MaLoSP], [MaSP], [MaCTPN], [SoLuong], [HanSuDung]) VALUES (10, 7, 7, 20, CAST(0x8E3D0B00 AS Date))
SET IDENTITY_INSERT [dbo].[Kho] OFF
SET IDENTITY_INSERT [dbo].[LoaiKhachHang] ON 

INSERT [dbo].[LoaiKhachHang] ([MaLoaiKH], [TenLoai], [MoTa]) VALUES (1, N'Member', N'Thành viên mới')
INSERT [dbo].[LoaiKhachHang] ([MaLoaiKH], [TenLoai], [MoTa]) VALUES (2, N'Silver', N'Thành viên thân thiết')
INSERT [dbo].[LoaiKhachHang] ([MaLoaiKH], [TenLoai], [MoTa]) VALUES (3, N'Gold', N'Thành viên V.I.P')
SET IDENTITY_INSERT [dbo].[LoaiKhachHang] OFF
SET IDENTITY_INSERT [dbo].[LoaiSanPham] ON 

INSERT [dbo].[LoaiSanPham] ([MaLoaiSP], [TenLoaiSP], [GhiChu]) VALUES (1, N'Dinh dưỡng phụ nữ mang thai', N'Sản phẩm dành cho các bà mẹ đang mang thai')
INSERT [dbo].[LoaiSanPham] ([MaLoaiSP], [TenLoaiSP], [GhiChu]) VALUES (2, N'Dinh dưỡng trẻ em', N'Sản phẩm dành cho trẻ em từ 1 - 10 tuổi')
INSERT [dbo].[LoaiSanPham] ([MaLoaiSP], [TenLoaiSP], [GhiChu]) VALUES (3, N'Dinh dưỡng người lớn', N'Sản phẩm dành cho người từ 10 tuổi trở lên')
INSERT [dbo].[LoaiSanPham] ([MaLoaiSP], [TenLoaiSP], [GhiChu]) VALUES (4, N'Dinh dưỡng chuyên biệt', N'Sản phẩm dành cho người lớn và người già')
SET IDENTITY_INSERT [dbo].[LoaiSanPham] OFF
SET IDENTITY_INSERT [dbo].[NhaCungCap] ON 

INSERT [dbo].[NhaCungCap] ([MaNCC], [TenNCC], [DiaChi], [SoDienThoai]) VALUES (1, N'Công ty TNHH Dinh Dưỡng NUTRICARE', N'Tòa nhà NUTRICARE, Số 1, Liền kề 2, Khu đô thị Vạn Phúc, Hà Đông, Hà Nội', N'1800 6011')
SET IDENTITY_INSERT [dbo].[NhaCungCap] OFF
SET IDENTITY_INSERT [dbo].[NhanVien] ON 

INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [SoDT], [GioiTinh], [NgaySinh], [CMND], [DiaChi], [NgayTao], [TenDangNhap], [MatKhau], [MaQuyen], [TinhTrang]) VALUES (1, N'Dương Thành Vũ', N'0986390134', 0, CAST(0x091B0B00 AS Date), N'241396557', N'20 Y Ơn, p. Tân Thành, tp. BMT, Đăk Lăk', CAST(0x0000A82A00CE8B13 AS DateTime), N'vudt', N'0000', 1, 0)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [SoDT], [GioiTinh], [NgaySinh], [CMND], [DiaChi], [NgayTao], [TenDangNhap], [MatKhau], [MaQuyen], [TinhTrang]) VALUES (3, N'Nguyễn Văn Tuấn', N'01666063015', 0, CAST(0x4F220B00 AS Date), N'241702956', N'Nguyễn Tất Thành - Tp.Buôn Ma Thuột', CAST(0x0000A82F00000000 AS DateTime), N'tuannv', N'1111', 2, 0)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [SoDT], [GioiTinh], [NgaySinh], [CMND], [DiaChi], [NgayTao], [TenDangNhap], [MatKhau], [MaQuyen], [TinhTrang]) VALUES (4, N'Đỗ Quốc Bảo', N'01673037567', 0, CAST(0x1D220B00 AS Date), N'241688966', N'Ama Khê - Tp.Buôn Ma Thuôt', CAST(0x0000A82F00000000 AS DateTime), N'baodq', N'2222', 2, 0)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [SoDT], [GioiTinh], [NgaySinh], [CMND], [DiaChi], [NgayTao], [TenDangNhap], [MatKhau], [MaQuyen], [TinhTrang]) VALUES (5, N'Dương Thị Cẩm Tiên', N'0987654342', 1, CAST(0xB11D0B00 AS Date), N'241576859', N'Ngô Quyền - Tp.Buôn Ma Thuộc', CAST(0x0000A81200000000 AS DateTime), N'tiendtc', N'3333', 3, 1)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [SoDT], [GioiTinh], [NgaySinh], [CMND], [DiaChi], [NgayTao], [TenDangNhap], [MatKhau], [MaQuyen], [TinhTrang]) VALUES (6, N'Trần Thị Hồng Nhung', N'0123457765', 1, CAST(0x7C1E0B00 AS Date), N'241465744', N'Nơ Trang Long - Tp.Buôn Ma Thuột', CAST(0x0000A81800000000 AS DateTime), N'nhungtth', N'4444', 3, 0)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [SoDT], [GioiTinh], [NgaySinh], [CMND], [DiaChi], [NgayTao], [TenDangNhap], [MatKhau], [MaQuyen], [TinhTrang]) VALUES (7, N'Vũ Văn Anh', N'0166785943', 0, CAST(0x291E0B00 AS Date), N'241556789', N'Phan Bội Châu - Tp.Buôn Ma Thuột', CAST(0x0000A75200000000 AS DateTime), N'anhvv', N'5555', 3, 1)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [SoDT], [GioiTinh], [NgaySinh], [CMND], [DiaChi], [NgayTao], [TenDangNhap], [MatKhau], [MaQuyen], [TinhTrang]) VALUES (9, N'Vương Thị Tuyết Ngân', N'0987654567', 1, CAST(0x8E1D0B00 AS Date), N'241345876', N'Y Ngông - Tp.Buôn Ma Thuột', CAST(0x0000A83500000000 AS DateTime), N'nganvtt', N'6666', 3, 0)
SET IDENTITY_INSERT [dbo].[NhanVien] OFF
SET IDENTITY_INSERT [dbo].[PhieuNhap] ON 

INSERT [dbo].[PhieuNhap] ([MaPhieuNhap], [MaNV], [MaNCC], [TongTien], [NgayNhap]) VALUES (1, 1, 1, 1500000.0000, CAST(0x0000A82F014E6542 AS DateTime))
INSERT [dbo].[PhieuNhap] ([MaPhieuNhap], [MaNV], [MaNCC], [TongTien], [NgayNhap]) VALUES (2, 1, 1, 2000000.0000, CAST(0x0000A82F014E944D AS DateTime))
INSERT [dbo].[PhieuNhap] ([MaPhieuNhap], [MaNV], [MaNCC], [TongTien], [NgayNhap]) VALUES (3, 3, 1, 2340000.0000, CAST(0x0000A83601663202 AS DateTime))
INSERT [dbo].[PhieuNhap] ([MaPhieuNhap], [MaNV], [MaNCC], [TongTien], [NgayNhap]) VALUES (4, 3, 1, 1150000.0000, CAST(0x0000A83601664C91 AS DateTime))
INSERT [dbo].[PhieuNhap] ([MaPhieuNhap], [MaNV], [MaNCC], [TongTien], [NgayNhap]) VALUES (6, 4, 1, 3000000.0000, CAST(0x0000A836016663C1 AS DateTime))
INSERT [dbo].[PhieuNhap] ([MaPhieuNhap], [MaNV], [MaNCC], [TongTien], [NgayNhap]) VALUES (7, 4, 1, 2530000.0000, CAST(0x0000A8360166876B AS DateTime))
INSERT [dbo].[PhieuNhap] ([MaPhieuNhap], [MaNV], [MaNCC], [TongTien], [NgayNhap]) VALUES (8, 5, 1, 2250000.0000, CAST(0x0000A8360166ADAB AS DateTime))
INSERT [dbo].[PhieuNhap] ([MaPhieuNhap], [MaNV], [MaNCC], [TongTien], [NgayNhap]) VALUES (9, 5, 1, 2340000.0000, CAST(0x0000A8360166B7E6 AS DateTime))
SET IDENTITY_INSERT [dbo].[PhieuNhap] OFF
SET IDENTITY_INSERT [dbo].[Quyen] ON 

INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen]) VALUES (1, N'Admin')
INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen]) VALUES (2, N'Quản lý')
INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen]) VALUES (3, N'Nhân viên')
SET IDENTITY_INSERT [dbo].[Quyen] OFF
SET IDENTITY_INSERT [dbo].[SanPham] ON 

INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [Barcode], [TinhTrang]) VALUES (1, N'NutriCare Mom', 1, 195000.0000, N'12345', 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [Barcode], [TinhTrang]) VALUES (2, N'GestCare Mom', 1, 100000.0000, N'12346', 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [Barcode], [TinhTrang]) VALUES (3, N'GestCare Mom Plus', 1, 150000.0000, N'11111', 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [Barcode], [TinhTrang]) VALUES (4, N'METACARE 3 Olive', 2, 230000.0000, N'32232', 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [Barcode], [TinhTrang]) VALUES (5, N'METACARE 4 Olive', 2, 230000.0000, N'76543', 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [Barcode], [TinhTrang]) VALUES (6, N'METACARE 5 Olive', 2, 286000.0000, N'65232', 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [Barcode], [TinhTrang]) VALUES (7, N'CARE 100 PLUS', 2, 243500.0000, N'87654', 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [Barcode], [TinhTrang]) VALUES (8, N'SMARTA IQ 3', 2, 319000.0000, N'65748', 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [Barcode], [TinhTrang]) VALUES (9, N'SMARTA IQ 4', 2, 310000.0000, N'12523', 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [Barcode], [TinhTrang]) VALUES (10, N'NUTRICARE GOLD', 3, 405000.0000, N'65481', 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [Barcode], [TinhTrang]) VALUES (11, N'NUTRICARE BONE', 3, 386000.0000, N'98768', 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [Barcode], [TinhTrang]) VALUES (12, N'GLUCARE GOLD', 3, 478000.0000, N'34672', 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [Barcode], [TinhTrang]) VALUES (13, N'NUTRICARE SENOR', 3, 325000.0000, N'76549', 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [Barcode], [TinhTrang]) VALUES (14, N'LEANMAX', 4, 280000.0000, N'87652', 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [Barcode], [TinhTrang]) VALUES (15, N'HANIE KID', 4, 450000.0000, N'12356', 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [Barcode], [TinhTrang]) VALUES (16, N'LEANMAX LIGOS', 4, 250000.0000, N'76542', 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [Barcode], [TinhTrang]) VALUES (17, N'LEANMAX HOPE', 4, 520000.0000, N'65433', 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [Barcode], [TinhTrang]) VALUES (18, N'NUTRICARE CERNA', 4, 250000.0000, N'42345', 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [Barcode], [TinhTrang]) VALUES (19, N'GRANDCARE', 4, 300000.0000, N'67584', 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [Barcode], [TinhTrang]) VALUES (20, N'LEANMAX RENA 1', 4, 240000.0000, N'98234', 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [Barcode], [TinhTrang]) VALUES (21, N'LEANMAX RENA 2', 4, 255000.0000, N'67548', 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [Barcode], [TinhTrang]) VALUES (22, N'LEANMAX BONE', 4, 226000.0000, N'23121', 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [Barcode], [TinhTrang]) VALUES (23, N'LEANMAX MOM', 4, 260000.0000, N'12343', 1)
SET IDENTITY_INSERT [dbo].[SanPham] OFF
SET IDENTITY_INSERT [dbo].[SanPhamKhuyenMai] ON 

INSERT [dbo].[SanPhamKhuyenMai] ([Ma], [TenSPKM], [SoLuong]) VALUES (1, N'Cốc thủy tinh chia vạch ml', 100)
INSERT [dbo].[SanPhamKhuyenMai] ([Ma], [TenSPKM], [SoLuong]) VALUES (2, N'Tô Sứ Cao cấp 14 cm', 100)
INSERT [dbo].[SanPhamKhuyenMai] ([Ma], [TenSPKM], [SoLuong]) VALUES (3, N'Thau inox 43cm', 100)
INSERT [dbo].[SanPhamKhuyenMai] ([Ma], [TenSPKM], [SoLuong]) VALUES (4, N'1 Bộ 2 bình tập uống hữu cơ cho bé Thái Lan', 100)
INSERT [dbo].[SanPhamKhuyenMai] ([Ma], [TenSPKM], [SoLuong]) VALUES (5, N'Xe Ôtô tải đồ chơi cho bé', 100)
INSERT [dbo].[SanPhamKhuyenMai] ([Ma], [TenSPKM], [SoLuong]) VALUES (6, N'Áo mưa cao cấp cho người lớn', 100)
INSERT [dbo].[SanPhamKhuyenMai] ([Ma], [TenSPKM], [SoLuong]) VALUES (7, N'1 bình nước thể thao 500ml', 100)
INSERT [dbo].[SanPhamKhuyenMai] ([Ma], [TenSPKM], [SoLuong]) VALUES (8, N'1 bộ xép xình dành cho bé', 100)
INSERT [dbo].[SanPhamKhuyenMai] ([Ma], [TenSPKM], [SoLuong]) VALUES (9, N'1 tô thủy tinh', 100)
INSERT [dbo].[SanPhamKhuyenMai] ([Ma], [TenSPKM], [SoLuong]) VALUES (10, N'1 bộ dao dùng trong nhà bếp', 100)
SET IDENTITY_INSERT [dbo].[SanPhamKhuyenMai] OFF
SET ANSI_PADDING ON

GO
/****** Object:  Index [UC_MaKH]    Script Date: 25/11/2017 10:06:44 PM ******/
ALTER TABLE [dbo].[KhachHang] ADD  CONSTRAINT [UC_MaKH] UNIQUE NONCLUSTERED 
(
	[MaKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON

GO
/****** Object:  Index [UC_TenDangNhap]    Script Date: 25/11/2017 10:06:44 PM ******/
ALTER TABLE [dbo].[NhanVien] ADD  CONSTRAINT [UC_TenDangNhap] UNIQUE NONCLUSTERED 
(
	[TenDangNhap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
SET ANSI_PADDING ON

GO
/****** Object:  Index [UC_BarcodeSP]    Script Date: 25/11/2017 10:06:44 PM ******/
ALTER TABLE [dbo].[SanPham] ADD  CONSTRAINT [UC_BarcodeSP] UNIQUE NONCLUSTERED 
(
	[Barcode] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [dbo].[HoaDon] ADD  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[KhachHang] ADD  CONSTRAINT [DF__KhachHang__NgayT__1367E606]  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[NhanVien] ADD  DEFAULT (getdate()) FOR [NgayTao]
GO
ALTER TABLE [dbo].[PhieuNhap] ADD  DEFAULT (getdate()) FOR [NgayNhap]
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_CTHD_HD] FOREIGN KEY([MaHD])
REFERENCES [dbo].[HoaDon] ([MaHD])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FK_CTHD_HD]
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_CTHD_SanPham] FOREIGN KEY([MaSP])
REFERENCES [dbo].[SanPham] ([MaSP])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FK_CTHD_SanPham]
GO
ALTER TABLE [dbo].[ChiTietKhuyenMai]  WITH CHECK ADD  CONSTRAINT [FK_CTKM_ChuongTrinhKM] FOREIGN KEY([MaKhuyenMai])
REFERENCES [dbo].[ChuongTrinhKM] ([MaKhuyenMai])
GO
ALTER TABLE [dbo].[ChiTietKhuyenMai] CHECK CONSTRAINT [FK_CTKM_ChuongTrinhKM]
GO
ALTER TABLE [dbo].[ChiTietKhuyenMai]  WITH CHECK ADD  CONSTRAINT [FK_CTKM_HoaDon] FOREIGN KEY([MaHD])
REFERENCES [dbo].[HoaDon] ([MaHD])
GO
ALTER TABLE [dbo].[ChiTietKhuyenMai] CHECK CONSTRAINT [FK_CTKM_HoaDon]
GO
ALTER TABLE [dbo].[ChiTietPhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_CTPN_PN] FOREIGN KEY([MaPhieuNhap])
REFERENCES [dbo].[PhieuNhap] ([MaPhieuNhap])
GO
ALTER TABLE [dbo].[ChiTietPhieuNhap] CHECK CONSTRAINT [FK_CTPN_PN]
GO
ALTER TABLE [dbo].[ChiTietPhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_CTPN_SanPham] FOREIGN KEY([MaSP])
REFERENCES [dbo].[SanPham] ([MaSP])
GO
ALTER TABLE [dbo].[ChiTietPhieuNhap] CHECK CONSTRAINT [FK_CTPN_SanPham]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_KH] FOREIGN KEY([ID_KH])
REFERENCES [dbo].[KhachHang] ([ID_KH])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_KH]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_NhanVien] FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNV])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_NhanVien]
GO
ALTER TABLE [dbo].[Kho]  WITH CHECK ADD  CONSTRAINT [FK_Kho_CTPN] FOREIGN KEY([MaCTPN])
REFERENCES [dbo].[ChiTietPhieuNhap] ([MaCTPN])
GO
ALTER TABLE [dbo].[Kho] CHECK CONSTRAINT [FK_Kho_CTPN]
GO
ALTER TABLE [dbo].[Kho]  WITH CHECK ADD  CONSTRAINT [FK_Kho_SanPham] FOREIGN KEY([MaSP])
REFERENCES [dbo].[SanPham] ([MaSP])
GO
ALTER TABLE [dbo].[Kho] CHECK CONSTRAINT [FK_Kho_SanPham]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_Quyen_NhanVien] FOREIGN KEY([MaQuyen])
REFERENCES [dbo].[Quyen] ([MaQuyen])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_Quyen_NhanVien]
GO
ALTER TABLE [dbo].[PhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_PhieuNhap_NCC] FOREIGN KEY([MaNCC])
REFERENCES [dbo].[NhaCungCap] ([MaNCC])
GO
ALTER TABLE [dbo].[PhieuNhap] CHECK CONSTRAINT [FK_PhieuNhap_NCC]
GO
ALTER TABLE [dbo].[PhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_PhieuNhap_NV] FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNV])
GO
ALTER TABLE [dbo].[PhieuNhap] CHECK CONSTRAINT [FK_PhieuNhap_NV]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_LoaiSP] FOREIGN KEY([MaLoaiSP])
REFERENCES [dbo].[LoaiSanPham] ([MaLoaiSP])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_LoaiSP]
GO
ALTER TABLE [dbo].[ChiTietKhuyenMai]  WITH CHECK ADD  CONSTRAINT [CHK_ChietKhau] CHECK  (([ChietKhau]>(0) AND [ChietKhau]<=(100)))
GO
ALTER TABLE [dbo].[ChiTietKhuyenMai] CHECK CONSTRAINT [CHK_ChietKhau]
GO
USE [master]
GO
ALTER DATABASE [AutoFail_Project1_db] SET  READ_WRITE 
GO
