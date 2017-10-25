/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTOChiTietHoaDon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vudtpk0074
 */
public class DALChiTietHoaDon {

    public static int them(DTOChiTietHoaDon item) {
        String query = "Insert into ChiTietHoaDon Values("+item.getIdSanPham()+","+item.getSoLuongMua()+","+item.getGiaBan()+","+item.getMaHD()+","+item.getTongTien()+","+item.getGhiChu()+")";
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static int xoa(int maCTHD) {
        String query = "Delete from ChiTietHoaDon where MaCTHD = " + maCTHD;
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static int sua(int maCTHD, DTOChiTietHoaDon newItem) {
        String query = "Update ChiTietHoaDon set IDSanPham = "+newItem.getIdSanPham()+", SoLuongMua = "+newItem.getSoLuongMua()+", GiaBan = "+newItem.getGiaBan()+", MaHD = "+newItem.getMaHD()+",TongTien = "+newItem.getTongTien()+", GhiChu = "+newItem.getGhiChu()+" where MaCTHD = "+maCTHD;
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static DTOChiTietHoaDon layDuLieu(int maCTHD) throws SQLException {
        String query = "Select MaCTHD, ChiTietHoaDon.IDSanPham, SanPham.TenSP, SoLuongMua, DonViTinh, ChiTietHoaDon.GiaBan, MaHD, TongTien, GhiChu from ChiTietHoaDon join SanPham on ChiTietHoaDon.IDSanPham = SanPham.IDSanPham where MaCTHD = "+maCTHD;
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            if (rs.next()) {
                DTOChiTietHoaDon cthd = new DTOChiTietHoaDon();
                cthd.setMaCTHD(rs.getInt(1));
                cthd.setIdSanPham(rs.getInt(2));
                cthd.setTenSP(rs.getString(3));
                cthd.setSoLuongMua(rs.getInt(4));
                cthd.setDonViTinh(rs.getString(5));
                cthd.setGiaBan(rs.getInt(6));
                cthd.setMaHD(rs.getInt(7));
                cthd.setTongTien(rs.getInt(8));
                cthd.setGhiChu(rs.getString(9));
                return cthd;
            }
        } catch (SQLException ex) {
            throw ex;
        }
        return null;
    }

    public static DTOChiTietHoaDon[] layDuLieuHD(int maHD){
        String query = "Select count(MaCTHD) from ChiTietHoaDon where maHD = "+maHD;
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        int soLuong = 0;
        try {
            if (rs.next()) {
                soLuong = rs.getInt(1);
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        DTOChiTietHoaDon[] arrCTHoaDon = new DTOChiTietHoaDon[soLuong];
        query = "Select MaCTHD, ChiTietHoaDon.IDSanPham, SanPham.TenSP, SoLuongMua, DonViTinh, ChiTietHoaDon.GiaBan, MaHD, TongTien, GhiChu from ChiTietHoaDon join SanPham on ChiTietHoaDon.IDSanPham = SanPham.IDSanPham where MaHD = "+maHD;
        rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            for (int i = 0; rs.next(); i++) {
                DTOChiTietHoaDon cthd = new DTOChiTietHoaDon();
                cthd.setMaCTHD(rs.getInt(1));
                cthd.setIdSanPham(rs.getInt(2));
                cthd.setTenSP(rs.getString(3));
                cthd.setSoLuongMua(rs.getInt(4));
                cthd.setDonViTinh(rs.getString(5));
                cthd.setGiaBan(rs.getInt(6));
                cthd.setMaHD(rs.getInt(7));
                cthd.setTongTien(rs.getInt(8));
                cthd.setGhiChu(rs.getString(9));
                arrCTHoaDon[i] = cthd;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        return arrCTHoaDon;
    }
}
