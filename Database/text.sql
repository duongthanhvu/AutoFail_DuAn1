USE [master]
GO
/****** Object:  Database [PM_BanSua_DuAn1]    Script Date: 7/11/2017 12:10:09 PM ******/
CREATE DATABASE [PM_BanSua_DuAn1]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'PM_BanSua_DuAn1', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.TUAN\MSSQL\DATA\PM_BanSua_DuAn1.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'PM_BanSua_DuAn1_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.TUAN\MSSQL\DATA\PM_BanSua_DuAn1_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [PM_BanSua_DuAn1].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET ARITHABORT OFF 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET  DISABLE_BROKER 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET  MULTI_USER 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET DB_CHAINING OFF 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [PM_BanSua_DuAn1]
GO
/****** Object:  Table [dbo].[ChiTietHoaDon]    Script Date: 7/11/2017 12:10:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietHoaDon](
	[MaCTHD] [int] IDENTITY(1,1) NOT NULL,
	[MaHD] [int] NOT NULL,
	[MaSP] [int] NOT NULL,
	[GiaBanLe] [money] NULL,
	[SoLuong] [int] NULL,
 CONSTRAINT [PK_ChiTietHoaDon] PRIMARY KEY CLUSTERED 
(
	[MaCTHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ChiTietKhuyenMai]    Script Date: 7/11/2017 12:10:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietKhuyenMai](
	[MaCTKM] [int] IDENTITY(1,1) NOT NULL,
	[MaKhuyenMai] [int] NOT NULL,
	[MaSPKM] [int] NOT NULL,
	[MaHD] [int] NOT NULL,
	[SoLuong] [int] NOT NULL,
 CONSTRAINT [PK_ChiTietKhuyenMai] PRIMARY KEY CLUSTERED 
(
	[MaCTKM] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ChiTietPhieuNhap]    Script Date: 7/11/2017 12:10:09 PM ******/
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
 CONSTRAINT [PK_ChiTietPhieuNhap] PRIMARY KEY CLUSTERED 
(
	[MaCTPN] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ChuongTrinhKM]    Script Date: 7/11/2017 12:10:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChuongTrinhKM](
	[MaKhuyenMai] [int] IDENTITY(1,1) NOT NULL,
	[TenKM] [nvarchar](30) NOT NULL,
	[NgayBatDau] [date] NOT NULL,
	[MoTa] [nvarchar](50) NULL,
 CONSTRAINT [PK_ChuongTrinhKM] PRIMARY KEY CLUSTERED 
(
	[MaKhuyenMai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 7/11/2017 12:10:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[MaHD] [int] IDENTITY(1,1) NOT NULL,
	[MaNV] [int] NOT NULL,
	[ID_KH] [int] NOT NULL,
	[TongTien] [money] NOT NULL,
	[NgayTao] [date] NOT NULL,
 CONSTRAINT [PK_HoaDon] PRIMARY KEY CLUSTERED 
(
	[MaHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 7/11/2017 12:10:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[KhachHang](
	[ID_KH] [int] IDENTITY(1,1) NOT NULL,
	[MaKH] [varchar](10) NOT NULL,
	[TenKH] [nvarchar](30) NOT NULL,
	[MaLoaiKH] [int] NOT NULL,
	[GioiTinh] [bit] NOT NULL,
	[SoDT] [nvarchar](11) NULL,
	[Email] [nvarchar](50) NULL,
	[DiaChi] [nvarchar](50) NOT NULL,
	[NgaySinh] [date] NULL,
	[Diem] [int] NULL,
	[NgayTao] [date] NULL,
	[GhiChu] [nvarchar](50) NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[ID_KH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Kho]    Script Date: 7/11/2017 12:10:09 PM ******/
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
 CONSTRAINT [PK_Kho] PRIMARY KEY CLUSTERED 
(
	[MaLoSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[LoaiKhachHang]    Script Date: 7/11/2017 12:10:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiKhachHang](
	[MaLoaiKH] [int] IDENTITY(1,1) NOT NULL,
	[TenLoai] [nvarchar](50) NOT NULL,
	[ChietKhau] [nvarchar](10) NOT NULL,
	[MoTa] [nvarchar](50) NULL,
 CONSTRAINT [PK_LoaiKhachHang] PRIMARY KEY CLUSTERED 
(
	[MaLoaiKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[LoaiSanPham]    Script Date: 7/11/2017 12:10:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiSanPham](
	[MaLoaiSP] [int] IDENTITY(1,1) NOT NULL,
	[TenLoaiSP] [nvarchar](30) NOT NULL,
	[GhiChu] [nvarchar](50) NULL,
 CONSTRAINT [PK_LoaiSanPham] PRIMARY KEY CLUSTERED 
(
	[MaLoaiSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[NhaCungCap]    Script Date: 7/11/2017 12:10:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaCungCap](
	[MaNCC] [int] IDENTITY(1,1) NOT NULL,
	[TenNCC] [nvarchar](50) NOT NULL,
	[DiaChi] [nvarchar](100) NOT NULL,
	[SoDienThoai] [nvarchar](11) NULL,
 CONSTRAINT [PK_NhaCungCap] PRIMARY KEY CLUSTERED 
(
	[MaNCC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 7/11/2017 12:10:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaNV] [int] IDENTITY(1,1) NOT NULL,
	[TenNV] [nvarchar](30) NOT NULL,
	[SoDT] [nvarchar](11) NULL,
	[GioiTinh] [bit] NULL,
	[NgaySinh] [date] NULL,
	[CMND] [int] NULL,
	[DiaChi] [nvarchar](50) NULL,
	[NgayTao] [date] NULL,
	[TenDangNhap] [nvarchar](30) NOT NULL,
	[MatKhau] [nvarchar](30) NOT NULL,
	[MaQuyen] [int] NOT NULL,
	[TinhTrang] [bit] NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[MaNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[PhieuNhap]    Script Date: 7/11/2017 12:10:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuNhap](
	[MaPhieuNhap] [int] IDENTITY(1,1) NOT NULL,
	[MANV] [int] NOT NULL,
	[MaNCC] [int] NOT NULL,
	[TongTien] [money] NOT NULL,
	[NgayNhap] [date] NOT NULL,
 CONSTRAINT [PK_PhieuNhap] PRIMARY KEY CLUSTERED 
(
	[MaPhieuNhap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Quyen]    Script Date: 7/11/2017 12:10:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Quyen](
	[MaQuyen] [int] IDENTITY(1,1) NOT NULL,
	[TenQuyen] [nvarchar](30) NOT NULL,
	[GhiChu] [nvarchar](50) NULL,
 CONSTRAINT [PK_Quyen] PRIMARY KEY CLUSTERED 
(
	[MaQuyen] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 7/11/2017 12:10:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[MaSP] [int] IDENTITY(1,1) NOT NULL,
	[TenSP] [nvarchar](30) NOT NULL,
	[MaLoaiSP] [int] NOT NULL,
	[GiaBanLe] [money] NOT NULL,
	[TinhTrang] [bit] NOT NULL,
 CONSTRAINT [PK_SanPham] PRIMARY KEY CLUSTERED 
(
	[MaSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[SanPhamKM]    Script Date: 7/11/2017 12:10:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPhamKM](
	[Ma] [int] IDENTITY(1,1) NOT NULL,
	[TenSPKM] [nvarchar](60) NOT NULL,
	[SoLuong] [int] NOT NULL,
 CONSTRAINT [PK_SanPhamKM] PRIMARY KEY CLUSTERED 
(
	[Ma] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET IDENTITY_INSERT [dbo].[ChiTietHoaDon] ON 

INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [GiaBanLe], [SoLuong]) VALUES (1, 1, 2, 169000.0000, 5)
INSERT [dbo].[ChiTietHoaDon] ([MaCTHD], [MaHD], [MaSP], [GiaBanLe], [SoLuong]) VALUES (2, 2, 5, 139000.0000, 10)
SET IDENTITY_INSERT [dbo].[ChiTietHoaDon] OFF
SET IDENTITY_INSERT [dbo].[ChiTietKhuyenMai] ON 

INSERT [dbo].[ChiTietKhuyenMai] ([MaCTKM], [MaKhuyenMai], [MaSPKM], [MaHD], [SoLuong]) VALUES (1, 1, 2, 1, 1)
INSERT [dbo].[ChiTietKhuyenMai] ([MaCTKM], [MaKhuyenMai], [MaSPKM], [MaHD], [SoLuong]) VALUES (2, 2, 3, 2, 2)
SET IDENTITY_INSERT [dbo].[ChiTietKhuyenMai] OFF
SET IDENTITY_INSERT [dbo].[ChiTietPhieuNhap] ON 

INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPhieuNhap], [MaSP], [GiaNhap], [SoLuong]) VALUES (1, 1, 2, 150000.0000, 10)
INSERT [dbo].[ChiTietPhieuNhap] ([MaCTPN], [MaPhieuNhap], [MaSP], [GiaNhap], [SoLuong]) VALUES (2, 2, 6, 100000.0000, 20)
SET IDENTITY_INSERT [dbo].[ChiTietPhieuNhap] OFF
SET IDENTITY_INSERT [dbo].[ChuongTrinhKM] ON 

INSERT [dbo].[ChuongTrinhKM] ([MaKhuyenMai], [TenKM], [NgayBatDau], [MoTa]) VALUES (1, N'Mua 2 lon tặng 1', CAST(0x8C3D0B00 AS Date), N'Mua 2 lon tặng 1 trong các quà tặng')
INSERT [dbo].[ChuongTrinhKM] ([MaKhuyenMai], [TenKM], [NgayBatDau], [MoTa]) VALUES (2, N'Mua 3 lon tặng 1', CAST(0x823D0B00 AS Date), N'Mua 3 lon tặng 1 trong các quà tặng')
SET IDENTITY_INSERT [dbo].[ChuongTrinhKM] OFF
SET IDENTITY_INSERT [dbo].[HoaDon] ON 

INSERT [dbo].[HoaDon] ([MaHD], [MaNV], [ID_KH], [TongTien], [NgayTao]) VALUES (1, 31, 5, 200000.0000, CAST(0x803D0B00 AS Date))
INSERT [dbo].[HoaDon] ([MaHD], [MaNV], [ID_KH], [TongTien], [NgayTao]) VALUES (2, 31, 6, 250000.0000, CAST(0x803D0B00 AS Date))
SET IDENTITY_INSERT [dbo].[HoaDon] OFF
SET IDENTITY_INSERT [dbo].[KhachHang] ON 

INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (5, N'101', N'Quách Thị Ngọc', 2, 1, N'098765432', N'ngocqt@gmail.com', N'Dăk Nông', CAST(0x3C230B00 AS Date), NULL, CAST(0x7F3D0B00 AS Date), NULL)
INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (6, N'102', N'Lê Nguyễn Đức Trung', 2, 0, N'0123456789', N'trunglnd@gmail.com', N'Kom Tum', CAST(0xEE220B00 AS Date), NULL, CAST(0x7F3D0B00 AS Date), NULL)
INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (7, N'103', N'Vũ Duy Nguyên', 2, 0, N'0164323421', N'nguyenvd@gmail.com', N'Hòa Thắng - tp.Buôn Ma Thuột', CAST(0xFF1F0B00 AS Date), NULL, CAST(0x7F3D0B00 AS Date), NULL)
INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (8, N'104', N'Phạm Thị Thúy', 3, 1, N'0129876543', N'thuypt@gmail.com', N'tp.Buôn Ma Thuột', CAST(0xC0220B00 AS Date), NULL, CAST(0x7F3D0B00 AS Date), NULL)
INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (9, N'105', N'Nguyễn Công Thịnh', 3, 0, N'098765344', N'thinhnc@gmail.com', N'Gia Lai - Dăk Lăk', CAST(0x70210B00 AS Date), NULL, CAST(0x7F3D0B00 AS Date), NULL)
INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (12, N'106', N'Hồ Trọng Hưng', 3, 0, N'092345432', N'hunght', N'tp.Buôn Ma Thuột', CAST(0x581F0B00 AS Date), NULL, CAST(0x7F3D0B00 AS Date), NULL)
INSERT [dbo].[KhachHang] ([ID_KH], [MaKH], [TenKH], [MaLoaiKH], [GioiTinh], [SoDT], [Email], [DiaChi], [NgaySinh], [Diem], [NgayTao], [GhiChu]) VALUES (13, N'107', N'Đào Thị Mộng Kha', 4, 1, N'0163278494', N'khadtm@gmail.com', N'Đà Nẵng', CAST(0x17210B00 AS Date), NULL, CAST(0x7F3D0B00 AS Date), NULL)
SET IDENTITY_INSERT [dbo].[KhachHang] OFF
SET IDENTITY_INSERT [dbo].[Kho] ON 

INSERT [dbo].[Kho] ([MaLoSP], [MaSP], [MaCTPN], [SoLuong], [HanSuDung]) VALUES (1, 2, 1, 10, CAST(0x84400B00 AS Date))
INSERT [dbo].[Kho] ([MaLoSP], [MaSP], [MaCTPN], [SoLuong], [HanSuDung]) VALUES (3, 6, 1, 20, CAST(0x84400B00 AS Date))
SET IDENTITY_INSERT [dbo].[Kho] OFF
SET IDENTITY_INSERT [dbo].[LoaiKhachHang] ON 

INSERT [dbo].[LoaiKhachHang] ([MaLoaiKH], [TenLoai], [ChietKhau], [MoTa]) VALUES (2, N'YoungMember', N'0%', NULL)
INSERT [dbo].[LoaiKhachHang] ([MaLoaiKH], [TenLoai], [ChietKhau], [MoTa]) VALUES (3, N'Member', N'10%', NULL)
INSERT [dbo].[LoaiKhachHang] ([MaLoaiKH], [TenLoai], [ChietKhau], [MoTa]) VALUES (4, N'V.I.P', N'20%', NULL)
SET IDENTITY_INSERT [dbo].[LoaiKhachHang] OFF
SET IDENTITY_INSERT [dbo].[LoaiSanPham] ON 

INSERT [dbo].[LoaiSanPham] ([MaLoaiSP], [TenLoaiSP], [GhiChu]) VALUES (1, N'Dinh dưỡng phụ nữ mang thai', NULL)
INSERT [dbo].[LoaiSanPham] ([MaLoaiSP], [TenLoaiSP], [GhiChu]) VALUES (2, N'Dinh dưỡng trẻ em', NULL)
INSERT [dbo].[LoaiSanPham] ([MaLoaiSP], [TenLoaiSP], [GhiChu]) VALUES (3, N'Dinh dưỡng người lớn', NULL)
INSERT [dbo].[LoaiSanPham] ([MaLoaiSP], [TenLoaiSP], [GhiChu]) VALUES (4, N'Dinh dưỡng chuyên biệt', NULL)
SET IDENTITY_INSERT [dbo].[LoaiSanPham] OFF
SET IDENTITY_INSERT [dbo].[NhaCungCap] ON 

INSERT [dbo].[NhaCungCap] ([MaNCC], [TenNCC], [DiaChi], [SoDienThoai]) VALUES (1, N'Công ty TNHH Dinh Dưỡng NUTRICARE', N'Tòa nhà NUTRICARE, Số 1, Liền kề 2, Khu đô thị Vạn Phúc, Hà Đông, Hà Nội', N'1800 6011')
SET IDENTITY_INSERT [dbo].[NhaCungCap] OFF
SET IDENTITY_INSERT [dbo].[NhanVien] ON 

INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [SoDT], [GioiTinh], [NgaySinh], [CMND], [DiaChi], [NgayTao], [TenDangNhap], [MatKhau], [MaQuyen], [TinhTrang]) VALUES (29, N'Nguyễn Văn Tuấn', N'01666063015', 0, CAST(0x4F220B00 AS Date), 241702956, N'tp.Buôn Ma Thuột - Đăk Lăk', CAST(0x7F3D0B00 AS Date), N'TuanNV', N'123456', 8, 1)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [SoDT], [GioiTinh], [NgaySinh], [CMND], [DiaChi], [NgayTao], [TenDangNhap], [MatKhau], [MaQuyen], [TinhTrang]) VALUES (31, N'Đỗ Quốc Bảo', N'01673037567', 1, CAST(0x1D220B00 AS Date), 241688966, N'tp.Buôn Ma Thuột - Đăk Lăk', CAST(0x7F3D0B00 AS Date), N'BaoDQ', N'123456', 10, 0)
INSERT [dbo].[NhanVien] ([MaNV], [TenNV], [SoDT], [GioiTinh], [NgaySinh], [CMND], [DiaChi], [NgayTao], [TenDangNhap], [MatKhau], [MaQuyen], [TinhTrang]) VALUES (40, N'Dương Thành Vũ', N'0985390134', 0, CAST(0xD41A0B00 AS Date), 241395598, N'tp.Buôn Ma Thuột - Dăk Lăk', CAST(0x7F3D0B00 AS Date), N'VuDT', N'123456', 9, 1)
SET IDENTITY_INSERT [dbo].[NhanVien] OFF
SET IDENTITY_INSERT [dbo].[PhieuNhap] ON 

INSERT [dbo].[PhieuNhap] ([MaPhieuNhap], [MANV], [MaNCC], [TongTien], [NgayNhap]) VALUES (1, 40, 1, 1000000.0000, CAST(0x7F3D0B00 AS Date))
INSERT [dbo].[PhieuNhap] ([MaPhieuNhap], [MANV], [MaNCC], [TongTien], [NgayNhap]) VALUES (2, 40, 1, 500000.0000, CAST(0x7F3D0B00 AS Date))
SET IDENTITY_INSERT [dbo].[PhieuNhap] OFF
SET IDENTITY_INSERT [dbo].[Quyen] ON 

INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen], [GhiChu]) VALUES (8, N'Admin', N'Quản Trị Viên')
INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen], [GhiChu]) VALUES (9, N'Quản Lý', N'Quản Lý Kho(Quản Lý Tổng)')
INSERT [dbo].[Quyen] ([MaQuyen], [TenQuyen], [GhiChu]) VALUES (10, N'Nhân Viên', N'Nhân Viên')
SET IDENTITY_INSERT [dbo].[Quyen] OFF
SET IDENTITY_INSERT [dbo].[SanPham] ON 

INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [TinhTrang]) VALUES (2, N'Nutricare Mon', 1, 169000.0000, 0)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [TinhTrang]) VALUES (3, N'Metacare 1', 2, 235000.0000, 0)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [TinhTrang]) VALUES (4, N'Metacare 2', 2, 196000.0000, 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [TinhTrang]) VALUES (5, N'Metacare 3', 2, 139000.0000, 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [TinhTrang]) VALUES (6, N'Metacare 4', 2, 133000.0000, 0)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [TinhTrang]) VALUES (7, N'Metacare 5', 3, 129000.0000, 0)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [TinhTrang]) VALUES (8, N'Care 100 Plus', 3, 172000.0000, 0)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [TinhTrang]) VALUES (9, N'Nutricare Gold', 4, 235000.0000, 0)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [TinhTrang]) VALUES (10, N'Nutricare Bone', 4, 185000.0000, 1)
INSERT [dbo].[SanPham] ([MaSP], [TenSP], [MaLoaiSP], [GiaBanLe], [TinhTrang]) VALUES (11, N'Glucare Gold', 4, 239000.0000, 0)
SET IDENTITY_INSERT [dbo].[SanPham] OFF
SET IDENTITY_INSERT [dbo].[SanPhamKM] ON 

INSERT [dbo].[SanPhamKM] ([Ma], [TenSPKM], [SoLuong]) VALUES (2, N'Cốc thủy tinh chia vạch ml', 100)
INSERT [dbo].[SanPhamKM] ([Ma], [TenSPKM], [SoLuong]) VALUES (3, N'Tô Sứ Cao cấp 14 cm', 100)
INSERT [dbo].[SanPhamKM] ([Ma], [TenSPKM], [SoLuong]) VALUES (4, N'Thau inox 43cm', 100)
INSERT [dbo].[SanPhamKM] ([Ma], [TenSPKM], [SoLuong]) VALUES (5, N'1 Bộ 2 bình tập uống hữu cơ cho bé Thái Lan', 100)
INSERT [dbo].[SanPhamKM] ([Ma], [TenSPKM], [SoLuong]) VALUES (6, N'Xe Ôtô tải đồ chơi cho bé', 50)
INSERT [dbo].[SanPhamKM] ([Ma], [TenSPKM], [SoLuong]) VALUES (7, N'Áo mưa cao cấp cho người lớn', 100)
SET IDENTITY_INSERT [dbo].[SanPhamKM] OFF
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietHoaDon_HoaDon] FOREIGN KEY([MaHD])
REFERENCES [dbo].[HoaDon] ([MaHD])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FK_ChiTietHoaDon_HoaDon]
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietHoaDon_SanPham] FOREIGN KEY([MaSP])
REFERENCES [dbo].[SanPham] ([MaSP])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FK_ChiTietHoaDon_SanPham]
GO
ALTER TABLE [dbo].[ChiTietKhuyenMai]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietKhuyenMai_ChuongTrinhKM] FOREIGN KEY([MaKhuyenMai])
REFERENCES [dbo].[ChuongTrinhKM] ([MaKhuyenMai])
GO
ALTER TABLE [dbo].[ChiTietKhuyenMai] CHECK CONSTRAINT [FK_ChiTietKhuyenMai_ChuongTrinhKM]
GO
ALTER TABLE [dbo].[ChiTietKhuyenMai]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietKhuyenMai_HoaDon] FOREIGN KEY([MaHD])
REFERENCES [dbo].[HoaDon] ([MaHD])
GO
ALTER TABLE [dbo].[ChiTietKhuyenMai] CHECK CONSTRAINT [FK_ChiTietKhuyenMai_HoaDon]
GO
ALTER TABLE [dbo].[ChiTietPhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietPhieuNhap_PhieuNhap] FOREIGN KEY([MaPhieuNhap])
REFERENCES [dbo].[PhieuNhap] ([MaPhieuNhap])
GO
ALTER TABLE [dbo].[ChiTietPhieuNhap] CHECK CONSTRAINT [FK_ChiTietPhieuNhap_PhieuNhap]
GO
ALTER TABLE [dbo].[ChiTietPhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietPhieuNhap_SanPham] FOREIGN KEY([MaSP])
REFERENCES [dbo].[SanPham] ([MaSP])
GO
ALTER TABLE [dbo].[ChiTietPhieuNhap] CHECK CONSTRAINT [FK_ChiTietPhieuNhap_SanPham]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_KhachHang] FOREIGN KEY([ID_KH])
REFERENCES [dbo].[KhachHang] ([ID_KH])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_KhachHang]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_NhanVien] FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNV])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_NhanVien]
GO
ALTER TABLE [dbo].[KhachHang]  WITH CHECK ADD  CONSTRAINT [FK_KhachHang_LoaiKhachHang] FOREIGN KEY([MaLoaiKH])
REFERENCES [dbo].[LoaiKhachHang] ([MaLoaiKH])
GO
ALTER TABLE [dbo].[KhachHang] CHECK CONSTRAINT [FK_KhachHang_LoaiKhachHang]
GO
ALTER TABLE [dbo].[Kho]  WITH CHECK ADD  CONSTRAINT [FK_Kho_ChiTietPhieuNhap] FOREIGN KEY([MaCTPN])
REFERENCES [dbo].[ChiTietPhieuNhap] ([MaCTPN])
GO
ALTER TABLE [dbo].[Kho] CHECK CONSTRAINT [FK_Kho_ChiTietPhieuNhap]
GO
ALTER TABLE [dbo].[Kho]  WITH CHECK ADD  CONSTRAINT [FK_Kho_SanPham] FOREIGN KEY([MaSP])
REFERENCES [dbo].[SanPham] ([MaSP])
GO
ALTER TABLE [dbo].[Kho] CHECK CONSTRAINT [FK_Kho_SanPham]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_Quyen] FOREIGN KEY([MaQuyen])
REFERENCES [dbo].[Quyen] ([MaQuyen])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_Quyen]
GO
ALTER TABLE [dbo].[PhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_PhieuNhap_NhaCungCap] FOREIGN KEY([MaNCC])
REFERENCES [dbo].[NhaCungCap] ([MaNCC])
GO
ALTER TABLE [dbo].[PhieuNhap] CHECK CONSTRAINT [FK_PhieuNhap_NhaCungCap]
GO
ALTER TABLE [dbo].[PhieuNhap]  WITH CHECK ADD  CONSTRAINT [FK_PhieuNhap_NhanVien] FOREIGN KEY([MANV])
REFERENCES [dbo].[NhanVien] ([MaNV])
GO
ALTER TABLE [dbo].[PhieuNhap] CHECK CONSTRAINT [FK_PhieuNhap_NhanVien]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_LoaiSanPham] FOREIGN KEY([MaLoaiSP])
REFERENCES [dbo].[LoaiSanPham] ([MaLoaiSP])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_LoaiSanPham]
GO
USE [master]
GO
ALTER DATABASE [PM_BanSua_DuAn1] SET  READ_WRITE 
GO
