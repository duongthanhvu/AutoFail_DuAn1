/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTOLoaiSanPham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vudtpk0074
 */
public class DALLoaiSanPham {

    public static int them(DTOLoaiSanPham item) {
        String query = "Insert into LoaiSanPham Values(N'"+item.getTenLoai()+"',N'"+item.getMoTa()+"')";
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static int xoa(int maLoaiSP) {
        String query = "Delete from LoaiSanPham where MaLoaiSP = " + maLoaiSP;
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static int sua(int maLoaiSP, DTOLoaiSanPham newItem) {
        String query = "Update LoaiSanPham set TenLoai = N'"+newItem.getTenLoai()+"', MoTa = N'"+newItem.getMoTa()+"' where MaLoaiSP = "+maLoaiSP;
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static DTOLoaiSanPham layDuLieu(int maLoaiSP) {
        String query = "Select * from LoaiSanPham where maLoaiSP = " + maLoaiSP;
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            if (rs.next()) {
                DTOLoaiSanPham lsp = new DTOLoaiSanPham();
                lsp.setMaLoaiSP(rs.getInt(1));
                lsp.setTenLoai(rs.getString(2));
                lsp.setMoTa(rs.getString(3));
                return lsp;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);;
        }
        return null;
    }

    public static DTOLoaiSanPham[] layDuLieu() {
        String query = "Select count(MaLoaiSP) from LoaiSanPham";
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
        DTOLoaiSanPham[] arrLoaiSanPham = new DTOLoaiSanPham[soLuong];
        query = "Select * from LoaiSanPham";
        rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            for (int i = 0; rs.next(); i++) {
                DTOLoaiSanPham lsp = new DTOLoaiSanPham();
                lsp.setMaLoaiSP(rs.getInt(1));
                lsp.setTenLoai(rs.getString(2));
                lsp.setMoTa(rs.getString(3));
                arrLoaiSanPham[i] = lsp;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        return arrLoaiSanPham;
    }
}
