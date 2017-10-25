/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTOKhachHang;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author vudtpk0074
 */
public class DALKhachHang {

    public static int them(DTOKhachHang item) {
        String query = "Set Dateformat DMY Insert into KhachHang Values(N'"+item.getTenKH()+"',"+item.getGioiTinh()+",'"+item.getSoDT()+"','"+item.getNgaySinh()+"',N'"+item.getDiaChi()+"',N'"+item.getGhiChu()+"')";
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static int xoa(int maKH) {
        String query = "Delete from KhachHang where MaKH = " + maKH;
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static int sua(int maKH, DTOKhachHang newItem) {
        String query = "Set Dateformat DMY Update KhachHang set TenKH = N'"+newItem.getTenKH()+"', GioiTinh = "+newItem.getGioiTinh()+", SoDT = '"+newItem.getSoDT()+"', NgaySinh = '"+newItem.getNgaySinh()+"', DiaChi = N'"+newItem.getDiaChi()+"', GhiChu = N'"+newItem.getGhiChu()+"' where MaKH = "+maKH;
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static DTOKhachHang layDuLieu(int maKH) {
        String query = "Select MaKH, TenKH, GioiTinh, SoDT, Convert(varchar,NgaySinh,103) as NGaySinh , DiaChi, GhiChu from KhachHang where maKH = " + maKH;
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            if (rs.next()) {
                DTOKhachHang kh = new DTOKhachHang();
                kh.setMaKH(rs.getInt(1));
                kh.setTenKH(rs.getString(2));
                kh.setGioiTinh(rs.getInt(3));
                kh.setSoDT(rs.getString(4));
                kh.setNgaySinh(rs.getString(5));
                kh.setDiaChi(rs.getString(6));
                kh.setGhiChu(rs.getString(7));
                return kh;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);;
        }
        return null;
    }

    public static DTOKhachHang[] layDuLieu() {
        String query = "Select count(MaKH) from KhachHang";
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
        DTOKhachHang[] arrKhachHang = new DTOKhachHang[soLuong];
        query = "Select MaKH, TenKH, GioiTinh, SoDT, Convert(varchar,NgaySinh,103) as NGaySinh , DiaChi, GhiChu from KhachHang";
        rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            for (int i = 0; rs.next(); i++) {
                DTOKhachHang kh = new DTOKhachHang();
                kh.setMaKH(rs.getInt(1));
                kh.setTenKH(rs.getString(2));
                kh.setGioiTinh(rs.getInt(3));
                kh.setSoDT(rs.getString(4));
                kh.setNgaySinh(rs.getString(5));
                kh.setDiaChi(rs.getString(6));
                kh.setGhiChu(rs.getString(7));
                arrKhachHang[i] = kh;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        return arrKhachHang;
    }
    
    public static DTOKhachHang[] searchBy(String keyWord) {
        if(keyWord.length() == 0){
            return new DTOKhachHang[0];
        }
        String query = "Select count(MaKH) from KhachHang where TenKH like N'%" + keyWord + "%' or SoDT like N'%" + keyWord + "%'";
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        int soLuong = 0;
        try {
            if (rs.next()) {
                soLuong = rs.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        DTOKhachHang[] arrKhachHang = new DTOKhachHang[soLuong];
        query = "Select MaKH, TenKH, GioiTinh, SoDT, Convert(varchar,NgaySinh,103) as NGaySinh , DiaChi, GhiChu from KhachHang where TenKH like N'%" + keyWord + "%' or SoDT like N'%" + keyWord + "%'";
        rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            for (int i = 0; rs.next(); i++) {
                DTOKhachHang kh = new DTOKhachHang();
                kh.setMaKH(rs.getInt(1));
                kh.setTenKH(rs.getString(2));
                kh.setGioiTinh(rs.getInt(3));
                kh.setSoDT(rs.getString(4));
                kh.setNgaySinh(rs.getString(5));
                kh.setDiaChi(rs.getString(6));
                kh.setGhiChu(rs.getString(7));
                arrKhachHang[i] = kh;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        return arrKhachHang;
    }
    
    public static DTOKhachHang layKHVuaThem(){
        String query = "Select top 1 MaKH, TenKH, GioiTinh, SoDT, Convert(varchar,NgaySinh,103) as NGaySinh , DiaChi, GhiChu from KhachHang order by MaKH desc";
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            if (rs.next()) {
                DTOKhachHang kh = new DTOKhachHang();
                kh.setMaKH(rs.getInt(1));
                kh.setTenKH(rs.getString(2));
                kh.setGioiTinh(rs.getInt(3));
                kh.setSoDT(rs.getString(4));
                kh.setNgaySinh(rs.getString(5));
                kh.setDiaChi(rs.getString(6));
                kh.setGhiChu(rs.getString(7));
                return kh;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);;
        }
        return null;
    }
}
