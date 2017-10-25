/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTOSanPham;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author vudtpk0074
 */
public class DALSanPham {

    public static int them(DTOSanPham item) {
        String query = "Insert into SanPham Values('" + item.getMaSP() + "',N'" + item.getTenSP() + "'," + item.getSoLuong() + ",N'" + item.getDonViTinh() + "'," + item.getGiaNhap() + "," + item.getGiaBan() + "," + item.getMaLoaiSP() + ",N'" + item.getMoTa() + "')";
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static int xoa(int idSanPham) {
        String query = "Delete from SanPham where IDSanPham = " + idSanPham;
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static int sua(int idSanPham, DTOSanPham newItem) {
        String query = "Update SanPham set MaSP = N'" + newItem.getMaSP() + "', TenSP = N'" + newItem.getTenSP() + "', SoLuong = " + newItem.getSoLuong() + ", DonViTinh = N'" + newItem.getDonViTinh() + "', GiaNhap = " + newItem.getGiaNhap() + ", GiaBan = " + newItem.getGiaBan() + ", MaLoaiSP = " + newItem.getMaLoaiSP() + ", MoTa = N'" + newItem.getMoTa() + "' where IDSanPham = " + idSanPham;
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static DTOSanPham layDuLieu(int idSanPham){
        String query = "Select idSanPham, MaSP, TenSP, SoLuong, DonViTinh, GiaNhap, GiaBan, SanPham.MaLoaiSP, TenLoai, SanPham.MoTa from SanPham join LoaiSanPham on SanPham.MaLoaiSP = LoaiSanPham.MaLoaiSP where idSanPham = " + idSanPham;
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            if (rs.next()) {
                DTOSanPham sp = new DTOSanPham();
                sp.setiDSanPham(rs.getInt(1));
                sp.setMaSP(rs.getString(2));
                sp.setTenSP(rs.getString(3));
                sp.setSoLuong(rs.getInt(4));
                sp.setDonViTinh(rs.getString(5));
                sp.setGiaNhap(rs.getInt(6));
                sp.setGiaBan(rs.getInt(7));
                sp.setMaLoaiSP(rs.getInt(8));
                sp.setTenLoai(rs.getString(9));
                sp.setMoTa(rs.getString(10));
                return sp;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        return null;
    }

    public static DTOSanPham[] layDuLieu() {
        String query = "Select count(IDSanPham) from SanPham";
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
        query = "Select idSanPham, MaSP, TenSP, SoLuong, DonViTinh, GiaNhap, GiaBan, SanPham.MaLoaiSP, TenLoai, SanPham.MoTa from SanPham join LoaiSanPham on SanPham.MaLoaiSP = LoaiSanPham.MaLoaiSP";
        rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            for (int i = 0; rs.next(); i++) {
                DTOSanPham sp = new DTOSanPham();
                sp.setiDSanPham(rs.getInt(1));
                sp.setMaSP(rs.getString(2));
                sp.setTenSP(rs.getString(3));
                sp.setSoLuong(rs.getInt(4));
                sp.setDonViTinh(rs.getString(5));
                sp.setGiaNhap(rs.getInt(6));
                sp.setGiaBan(rs.getInt(7));
                sp.setMaLoaiSP(rs.getInt(8));
                sp.setTenLoai(rs.getString(9));
                sp.setMoTa(rs.getString(10));
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
        String query = "Select count(IDSanPham) from SanPham where MaSP like N'%" + keyWord + "%' or TenSP like N'%" + keyWord + "%'";
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
        query = "Select * from SanPham where MaSP like N'%" + keyWord + "%' or TenSP like N'%" + keyWord + "%'";
        rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            for (int i = 0; rs.next(); i++) {
                DTOSanPham sp = new DTOSanPham();
                sp.setiDSanPham(rs.getInt(1));
                sp.setMaSP(rs.getString(2));
                sp.setTenSP(rs.getString(3));
//                sp.setSoLuong(rs.getInt(4));
//                sp.setDonViTinh(rs.getString(5));
//                sp.setGiaNhap(rs.getInt(6));
//                sp.setGiaBan(rs.getInt(7));
//                sp.setMaLoaiSP(rs.getInt(8));
//                sp.setTenLoai(rs.getString(9));
//                sp.setMoTa(rs.getString(10));
                arrSanPham[i] = sp;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        return arrSanPham;
    }
    
    public static DTOSanPham[] layDuLieuTheoMaLoai(int maLoaiSP) {
        String query = "Select count(IDSanPham) from SanPham where MaLoaiSP = "+maLoaiSP;
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
        query = "Select idSanPham, MaSP, TenSP, SoLuong, DonViTinh, GiaNhap, GiaBan, SanPham.MaLoaiSP, TenLoai, SanPham.MoTa from SanPham join LoaiSanPham on SanPham.MaLoaiSP = LoaiSanPham.MaLoaiSP where SanPham.MaLoaiSP = "+maLoaiSP;
        rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            for (int i = 0; rs.next(); i++) {
                DTOSanPham sp = new DTOSanPham();
                sp.setiDSanPham(rs.getInt(1));
                sp.setMaSP(rs.getString(2));
                sp.setTenSP(rs.getString(3));
                sp.setSoLuong(rs.getInt(4));
                sp.setDonViTinh(rs.getString(5));
                sp.setGiaNhap(rs.getInt(6));
                sp.setGiaBan(rs.getInt(7));
                sp.setMaLoaiSP(rs.getInt(8));
                sp.setTenLoai(rs.getString(9));
                sp.setMoTa(rs.getString(10));
                arrSanPham[i] = sp;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        return arrSanPham;
    }
}
