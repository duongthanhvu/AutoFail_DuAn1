/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTOSanPham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vudtpk0074
 */
public class DALSanPham {

    public static int them(DTOSanPham item) {
        String query = "INSERT into SanPham VALUES (N'"+item.getTenSP()+"', "+item.getMaLoaiSP()+", "+item.getGiaBanLe()+", N'"+item.getBarcode()+"', '"+item.isAvailable()+"')";
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static int xoa(int maSP) {
        String query = "Delete from SanPham where MaSP = " + maSP;
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static int sua(int maSP, DTOSanPham newItem) {
        String query = "Update SanPham set TenSP = N'"+newItem.getTenSP()+"', MaLoaiSP = "+newItem.getMaLoaiSP()+", GiaBanLe = "+newItem.getGiaBanLe()+", TinhTrang = '"+newItem.isAvailable()+"' where MaSP = "+maSP;
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static DTOSanPham layDuLieu(int maSP){
        String query = "Select MaSP, TenSP, SanPham.MaLoaiSP, GiaBanLe, Barcode, TinhTrang, TenLoaiSP from SanPham join LoaiSanPham on SanPham.MaLoaiSP = LoaiSanPham.MaLoaiSP where MaSP = " + maSP;
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            if (rs.next()) {
                DTOSanPham sp = new DTOSanPham();
                sp.setMaSP(rs.getInt("MaSP"));
                sp.setTenSP(rs.getString("TenSP"));
                sp.setMaLoaiSP(rs.getInt("MaLoaiSP"));
                sp.setGiaBanLe(rs.getInt("GiaBanLe"));
                sp.setBarcode(rs.getString("Barcode"));
                sp.setAvailable(rs.getBoolean("TinhTrang"));
                sp.setTenLoai(rs.getString("TenLoaiSP"));
                return sp;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        //Tạo string query số lượng sản phẩm từ bản "Kho" và gán vào sp.setSoLuong
        return null;
    }

    public static DTOSanPham[] layDuLieu() {
        String query = "Select count(MaSP) from SanPham";
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        int soLuong = 0;
        try {
            if (rs.next()) {
                soLuong = rs.getInt(1);
            } else {
                return new DTOSanPham[0];
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        DTOSanPham[] arrSanPham = new DTOSanPham[soLuong];
        query = "Select MaSP, TenSP, SanPham.MaLoaiSP, GiaBanLe, Barcode, TinhTrang, TenLoaiSP from SanPham join LoaiSanPham on SanPham.MaLoaiSP = LoaiSanPham.MaLoaiSP";
        rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            for (int i = 0; rs.next(); i++) {
                DTOSanPham sp = new DTOSanPham();
                sp.setMaSP(rs.getInt("MaSP"));
                sp.setTenSP(rs.getString("TenSP"));
                sp.setMaLoaiSP(rs.getInt("MaLoaiSP"));
                sp.setGiaBanLe(rs.getInt("GiaBanLe"));
                sp.setBarcode(rs.getString("Barcode"));
                sp.setAvailable(rs.getBoolean("TinhTrang"));
                sp.setTenLoai(rs.getString("TenLoaiSP"));
                arrSanPham[i] = sp;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        return arrSanPham;
    }

    public static DTOSanPham[] searchBy(String keyWord) {
        if(keyWord.length() == 0){
            return new DTOSanPham[0];
        }
        String query = "Select count(MaSP) from SanPham where Barcode like N'%" + keyWord + "%' or TenSP like N'%" + keyWord + "%'";
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        int soLuong = 0;
        try {
            if (rs.next()) {
                soLuong = rs.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        DTOSanPham[] arrSanPham = new DTOSanPham[soLuong];
        query = "Select * from SanPham where Barcode like N'%" + keyWord + "%' or TenSP like N'%" + keyWord + "%'";
        rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            for (int i = 0; rs.next(); i++) {
                DTOSanPham sp = new DTOSanPham();
                sp.setMaSP(rs.getInt("MaSP"));
                sp.setTenSP(rs.getString("TenSP"));
                sp.setMaLoaiSP(rs.getInt("MaLoaiSP"));
                sp.setGiaBanLe(rs.getInt("GiaBanLe"));
                sp.setBarcode(rs.getString("Barcode"));
                sp.setAvailable(rs.getBoolean("TinhTrang"));
                //sp.setTenLoai(rs.getString("TenLoaiSP"));
                arrSanPham[i] = sp;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        return arrSanPham;
    }
    
    public static int layMaSPQuaBarcode(String Barcode) {
        String query = "Select MaSP from SanPham where Barcode = '"+Barcode+"'";
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            if(rs.next()){
                return rs.getInt(1);
            }else{
                return -1;
            }
        } catch (SQLException ex) {
            return -1;
        }
    }
    
    public static DTOSanPham[] layDuLieuTheoMaLoai(int maLoaiSP) {
        String query = "Select count(MaSP) from SanPham where MaLoaiSP = "+maLoaiSP;
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        int soLuong = 0;
        try {
            if (rs.next()) {
                soLuong = rs.getInt(1);
            } else {
                return new DTOSanPham[0];
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        DTOSanPham[] arrSanPham = new DTOSanPham[soLuong];
        query = "Select MaSP, TenSP, SanPham.MaLoaiSP, GiaBanLe, Barcode, TinhTrang, TenLoai from SanPham join LoaiSanPham on SanPham.MaLoaiSP = LoaiSanPham.MaLoaiSP where SanPham.MaLoaiSP = " + maLoaiSP;
        rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            for (int i = 0; rs.next(); i++) {
                DTOSanPham sp = new DTOSanPham();
                sp.setMaSP(rs.getInt("MaSP"));
                sp.setTenSP(rs.getString("TenSP"));
                sp.setMaLoaiSP(rs.getInt("MaLoaiSP"));
                sp.setGiaBanLe(rs.getInt("GiaBanLe"));
                sp.setBarcode(rs.getString("Barcode"));
                sp.setAvailable(rs.getBoolean("TinhTrang"));
                sp.setTenLoai(rs.getString("TenLoai"));
                arrSanPham[i] = sp;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        return arrSanPham;
    }
}
