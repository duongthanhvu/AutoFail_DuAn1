/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTOChuongTrinhKM;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author vudtpk0074
 */
public class DALChuongTrinhKM {

    public static int them(DTOChuongTrinhKM item) {
        String query = "INSERT into ChuongTrinhKM VALUES (N'"+item.getTenKM()+"', '"+item.getNgayBatDau()+"', '"+item.getNgayKetThuc()+"', '"+item.getKieuKhuyenMai()+"', "+item.getDoiTuongApDung()+", N'"+item.getMoTa()+"')";
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

//    public static int xoa(int maSP) {
//        String query = "Delete from SanPham where MaSP = " + maSP;
//        int result = Conn.connection.ExcuteNonQuery(query);
//        return result;
//    }
    
    public static int stopCTKM(int maKM) {
        String query = "Update ChuongTrinhKM set HetHangKM = 1 where MaKhuyenMai = "+maKM;
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static int sua(int maKM, DTOChuongTrinhKM newItem) {
        String query = "";
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static DTOChuongTrinhKM layDuLieu(int maKM){
        String query = "Select * from ChuongTrinhKM where MaKhuyenMai = "+maKM;
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            if (rs.next()) {
                DTOChuongTrinhKM km = new DTOChuongTrinhKM();
                km.setMaKhuyenMai(rs.getInt("MaKhuyenMai"));
                km.setTenKM(rs.getString("TenKM"));
                km.setNgayBatDau(rs.getDate("NgayBatDau"));
                km.setNgayKetThuc(rs.getDate("NgayKetThuc"));
                km.setKieuKhuyenMai(rs.getString("KieuKM"));
                km.setHetHangKM(rs.getBoolean("hetHangKM"));
                km.setDoiTuongApDung(rs.getString("DoiTuongApDung"));
                km.setMoTa(rs.getString("MoTa"));
                return km;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }

        return null;
    }

    public static DTOChuongTrinhKM[] layDuLieu() {
        String query = "Select count(MaKhuyenMai) from ChuongTrinhKM";
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        int soLuong = 0;
        try {
            if (rs.next()) {
                soLuong = rs.getInt(1);
            } else {
                return new DTOChuongTrinhKM[0];
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        DTOChuongTrinhKM[] arrKM = new DTOChuongTrinhKM[soLuong];
        query = "Select * from ChuongTrinhKM";
        rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            for (int i = 0; rs.next(); i++) {
                DTOChuongTrinhKM km = new DTOChuongTrinhKM();
                km.setMaKhuyenMai(rs.getInt("MaKhuyenMai"));
                km.setTenKM(rs.getString("TenKM"));
                km.setNgayBatDau(rs.getDate("NgayBatDau"));
                km.setNgayKetThuc(rs.getDate("NgayKetThuc"));
                km.setKieuKhuyenMai(rs.getString("KieuKM"));
                km.setHetHangKM(rs.getBoolean("hetHangKM"));
                km.setDoiTuongApDung(rs.getString("DoiTuongApDung"));
                km.setMoTa(rs.getString("MoTa"));
                arrKM[i] = km;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        return arrKM;
    }

//    public static DTOSanPham[] searchBy(String keyWord) {
//        if(keyWord.length() == 0){
//            return new DTOSanPham[0];
//        }
//        String query = "Select count(MaSP) from SanPham where Barcode like N'%" + keyWord + "%' or TenSP like N'%" + keyWord + "%'";
//        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
//        int soLuong = 0;
//        try {
//            if (rs.next()) {
//                soLuong = rs.getInt(1);
//            }
//        } catch (SQLException ex) {
//            System.out.println("Lỗi " + ex);
//        }
//        DTOSanPham[] arrSanPham = new DTOSanPham[soLuong];
//        query = "Select * from SanPham where Barcode like N'%" + keyWord + "%' or TenSP like N'%" + keyWord + "%'";
//        rs = Conn.connection.ExcuteQuerySelect(query);
//        try {
//            for (int i = 0; rs.next(); i++) {
//                DTOSanPham sp = new DTOSanPham();
//                sp.setMaSP(rs.getInt("MaSP"));
//                sp.setTenSP(rs.getString("TenSP"));
//                sp.setMaLoaiSP(rs.getInt("MaLoaiSP"));
//                sp.setGiaBanLe(rs.getInt("GiaBanLe"));
//                sp.setBarcode(rs.getString("Barcode"));
//                sp.setAvailable(rs.getBoolean("TinhTrang"));
//                //sp.setTenLoai(rs.getString("TenLoaiSP"));
//                arrSanPham[i] = sp;
//            }
//        } catch (SQLException ex) {
//            System.out.println("Lỗi " + ex);
//        }
//        return arrSanPham;
//    }
//    
//    public static DTOSanPham[] layDuLieuTheoMaLoai(int maLoaiSP) {
//        String query = "Select count(MaSP) from SanPham where MaLoaiSP = "+maLoaiSP;
//        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
//        int soLuong = 0;
//        try {
//            if (rs.next()) {
//                soLuong = rs.getInt(1);
//            } else {
//                return new DTOSanPham[0];
//            }
//        } catch (SQLException ex) {
//            System.out.println("Lỗi " + ex);
//        }
//        DTOSanPham[] arrSanPham = new DTOSanPham[soLuong];
//        query = "Select MaSP, TenSP, SanPham.MaLoaiSP, GiaBanLe, Barcode, TinhTrang, TenLoai from SanPham join LoaiSanPham on SanPham.MaLoaiSP = LoaiSanPham.MaLoaiSP where SanPham.MaLoaiSP = " + maLoaiSP;
//        rs = Conn.connection.ExcuteQuerySelect(query);
//        try {
//            for (int i = 0; rs.next(); i++) {
//                DTOSanPham sp = new DTOSanPham();
//                sp.setMaSP(rs.getInt("MaSP"));
//                sp.setTenSP(rs.getString("TenSP"));
//                sp.setMaLoaiSP(rs.getInt("MaLoaiSP"));
//                sp.setGiaBanLe(rs.getInt("GiaBanLe"));
//                sp.setBarcode(rs.getString("Barcode"));
//                sp.setAvailable(rs.getBoolean("TinhTrang"));
//                sp.setTenLoai(rs.getString("TenLoai"));
//                arrSanPham[i] = sp;
//            }
//        } catch (SQLException ex) {
//            System.out.println("Lỗi " + ex);
//        }
//        return arrSanPham;
//    }
    
    public static DTOChuongTrinhKM[] layKMDuocApDung(int maLoaiKH){
        String query = "Select Count(MaKhuyenMai) from ChuongTrinhKM where NgayBatDau < Getdate() and (NgayKetThuc > Getdate() or NgayKetThuc is null) and HetHangKM = 0 and DoiTuongApDung like '%"+maLoaiKH+"%'";
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        int soLuong = 0;
        try {
            if (rs.next()) {
                soLuong = rs.getInt(1);
            } else {
                return new DTOChuongTrinhKM[0];
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        DTOChuongTrinhKM[] arrKM = new DTOChuongTrinhKM[soLuong];
        query = "Select * from ChuongTrinhKM where NgayBatDau < Getdate() and (NgayKetThuc > Getdate() or NgayKetThuc is null) and HetHangKM = 0 and DoiTuongApDung like '%"+maLoaiKH+"%'";
        rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            for (int i = 0; rs.next(); i++) {
                DTOChuongTrinhKM km = new DTOChuongTrinhKM();
                km.setMaKhuyenMai(rs.getInt("MaKhuyenMai"));
                km.setTenKM(rs.getString("TenKM"));
                km.setNgayBatDau(rs.getDate("NgayBatDau"));
                km.setNgayKetThuc(rs.getDate("NgayKetThuc"));
                km.setKieuKhuyenMai(rs.getString("KieuKM"));
                km.setHetHangKM(rs.getBoolean("hetHangKM"));
                km.setDoiTuongApDung(rs.getString("DoiTuongApDung"));
                km.setMoTa(rs.getString("MoTa"));
                arrKM[i] = km;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        return arrKM;
    }
}
