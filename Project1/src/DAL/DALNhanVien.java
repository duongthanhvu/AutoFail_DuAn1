/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTONhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vudtpk0074
 */
public class DALNhanVien {

    public static int them(DTONhanVien item) {
        String query = "Set Dateformat DMY Insert into NhanVien Values(N'" + item.getTenNV() + "'," + item.getGioiTinh() + ",'" + item.getSoDT() + "','" + item.getNgaySinh() + "',N'" + item.getDiaChi() + "','" + item.getSoCMND() + "',N'" + item.getGhiChu() + "')";
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static int xoa(int maNV) {
        String query = "Delete from NhanVien where MaNV = " + maNV;
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static int sua(int maNV, DTONhanVien newItem) {
        String query = "Set Dateformat DMY Update NhanVien set TenNV = N'" + newItem.getTenNV() + "', GioiTinh = " + newItem.getGioiTinh() + ", SoDT = '" + newItem.getSoDT() + "', NgaySinh = '" + newItem.getNgaySinh() + "', DiaChi = '" + newItem.getDiaChi() + "', SoCMND = " + newItem.getSoCMND() + ", GhiChu = N'" + newItem.getGhiChu() + "' where MaNV = " + maNV;
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static DTONhanVien layDuLieu(int maNV) throws SQLException {
        String query = "Select * from NhanVien where MaNV = " + maNV;
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            if (rs.next()) {
                DTONhanVien nv = new DTONhanVien();
                nv.setMaNV(rs.getInt(1));
                nv.setTenNV(rs.getString(2));
                nv.setGioiTinh(rs.getInt(3));
                nv.setSoDT(rs.getString(4));
                nv.setNgaySinh(rs.getString(5));
                nv.setDiaChi(rs.getString(6));
                nv.setSoCMND(rs.getString(7));
                nv.setGhiChu(rs.getString(8));
                return nv;
            }
        } catch (SQLException ex) {
            throw ex;
        }
        return null;
    }

    public static DTONhanVien[] layDuLieu(){
        String query = "Select count(MaNV) from NhanVien";
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        int soLuong = 0;
        try {
            if (rs.next()) {
                soLuong = rs.getInt(1);
            } else {
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi DALNhanVien " + ex);
        }
        DTONhanVien[] arrNhanVien = new DTONhanVien[soLuong];
        query = "Select * from NhanVien";
        rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            for (int i = 0; rs.next(); i++) {
                DTONhanVien nv = new DTONhanVien();
                nv.setMaNV(rs.getInt(1));
                nv.setTenNV(rs.getString(2));
                nv.setGioiTinh(rs.getInt(3));
                nv.setSoDT(rs.getString(4));
                nv.setNgaySinh(rs.getString(5));
                nv.setDiaChi(rs.getString(6));
                nv.setSoCMND(rs.getString(7));
                nv.setGhiChu(rs.getString(8));
                arrNhanVien[i] = nv;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi DALNhanVien " + ex);
        }
        return arrNhanVien;
    }
}
