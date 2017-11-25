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
        String query = "Insert into KhachHang Values('"+item.getMaKH()+"', N'"+item.getTenKH()+"', "+item.getMaLoaiKH()+", "+item.getGioiTinh_int()+", '"+item.getSoDT()+"', '"+item.getEmail()+"', N'"+item.getDiaChi()+"', '"+item.getNgaySinh_forSQL()+"', "+item.getDiem()+", '"+item.getNgayTao_forSQL()+"', N'"+item.getGhiChu()+"')";
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static int xoa(int id_KH) {
        String query = "Delete from KhachHang where ID_KH = " + id_KH;
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static int sua(int id_KH, DTOKhachHang newItem) {
        String query = "Update KhachHang set MaKH = '"+newItem.getMaKH()+"', TenKH = N'"+newItem.getTenKH()+"', MaLoaiKH = "+newItem.getMaLoaiKH()+", GioiTinh = "+newItem.getGioiTinh_int()+", SoDT = '"+newItem.getSoDT()+"', Email = '"+newItem.getEmail()+"', DiaChi = N'"+newItem.getDiaChi()+"', NgaySinh = '"+newItem.getNgaySinh_forSQL()+"', Diem = "+newItem.getDiem()+", GhiChu = N'"+newItem.getGhiChu()+"' where id_KH = " + id_KH;
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static DTOKhachHang layDuLieu(int id_KH) {
        String query = "Select ID_KH, MaKH, TenKH, KhachHang.MaLoaiKH, GioiTinh, SoDT, Email, DiaChi, NgaySinh, Diem, NgayTao, GhiChu, TenLoai from KhachHang join LoaiKhachHang on KhachHang.MaLoaiKH = LoaiKhachHang.MaLoaiKH where ID_KH = " + id_KH;
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            if (rs.next()) {
                DTOKhachHang kh = new DTOKhachHang();
                kh.setID_KH(rs.getInt("ID_KH"));
                kh.setMaKH(rs.getString("MaKH"));
                kh.setTenKH(rs.getString("TenKH"));
                kh.setMaLoaiKH(rs.getInt("MaLoaiKH"));
                kh.setGioiTinhNam(rs.getBoolean("GioiTinh"));
                kh.setSoDT(rs.getString("SoDT"));
                kh.setEmail(rs.getString("Email"));
                kh.setDiaChi(rs.getString("DiaChi"));
                kh.setNgaySinh(rs.getTimestamp("NgaySinh"));
                kh.setDiem(rs.getInt("Diem"));
                kh.setNgayTao(rs.getTimestamp("NgayTao"));
                kh.setGhiChu(rs.getString("GhiChu"));
                kh.setTenLoai(rs.getString("TenLoai"));
                return kh;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);;
        }
        return null;
    }

    public static DTOKhachHang[] layDuLieu() {
        String query = "Select count(ID_KH) from KhachHang";
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
        query = "Select ID_KH, MaKH, TenKH, KhachHang.MaLoaiKH, GioiTinh, SoDT, Email, DiaChi, NgaySinh, Diem, NgayTao, GhiChu from KhachHang";
        rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            for (int i = 0; rs.next(); i++) {
                DTOKhachHang kh = new DTOKhachHang();
                kh.setID_KH(rs.getInt("ID_KH"));
                kh.setMaKH(rs.getString("MaKH"));
                kh.setTenKH(rs.getString("TenKH"));
                kh.setMaLoaiKH(rs.getInt("MaLoaiKH"));
                kh.setGioiTinhNam(rs.getBoolean("GioiTinh"));
                kh.setSoDT(rs.getString("SoDT"));
                kh.setEmail(rs.getString("Email"));
                kh.setDiaChi(rs.getString("DiaChi"));
                kh.setNgaySinh(rs.getTimestamp("NgaySinh"));
                kh.setDiem(rs.getInt("Diem"));
                kh.setNgayTao(rs.getTimestamp("NgayTao"));
                kh.setGhiChu(rs.getString("GhiChu"));
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
        String query = "Select count(ID_KH) from KhachHang where TenKH like N'%" + keyWord + "%' or SoDT like N'%" + keyWord + "%' or MaKH like N'%"+keyWord+"%'";
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
        query = "Select * from KhachHang where TenKH like N'%" + keyWord + "%' or SoDT like N'%" + keyWord + "%' or MaKH like N'%"+keyWord+"%'";
        rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            for (int i = 0; rs.next(); i++) {
                DTOKhachHang kh = new DTOKhachHang();
                kh.setID_KH(rs.getInt("ID_KH"));
                kh.setMaKH(rs.getString("MaKH"));
                kh.setTenKH(rs.getString("TenKH"));
                kh.setMaLoaiKH(rs.getInt("MaLoaiKH"));
                kh.setGioiTinhNam(rs.getBoolean("GioiTinh"));
                kh.setSoDT(rs.getString("SoDT"));
                kh.setEmail(rs.getString("Email"));
                kh.setDiaChi(rs.getString("DiaChi"));
                kh.setNgaySinh(rs.getTimestamp("NgaySinh"));
                kh.setDiem(rs.getInt("Diem"));
                kh.setNgayTao(rs.getTimestamp("NgayTao"));
                kh.setGhiChu(rs.getString("GhiChu"));
                arrKhachHang[i] = kh;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        return arrKhachHang;
    }
    
    public static int layIDKHQuaMaKH(String maKH) {
        String query = "Select ID_KH from KhachHang where MaKH = '"+maKH+"'";
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
    
    public static DTOKhachHang layKHVuaThem(){
        String query = "Select top 1 ID_KH, MaKH, TenKH, KhachHang.MaLoaiKH, GioiTinh, SoDT, Email, DiaChi, NgaySinh, Diem, NgayTao, GhiChu from KhachHang order by ID_KH desc";
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            if (rs.next()) {
                DTOKhachHang kh = new DTOKhachHang();
                kh.setID_KH(rs.getInt("ID_KH"));
                kh.setMaKH(rs.getString("MaKH"));
                kh.setTenKH(rs.getString("TenKH"));
                kh.setMaLoaiKH(rs.getInt("MaLoaiKH"));
                kh.setGioiTinhNam(rs.getBoolean("GioiTinh"));
                kh.setSoDT(rs.getString("SoDT"));
                kh.setEmail(rs.getString("Email"));
                kh.setDiaChi(rs.getString("DiaChi"));
                kh.setNgaySinh(rs.getTimestamp("NgaySinh"));
                kh.setDiem(rs.getInt("Diem"));
                kh.setNgayTao(rs.getTimestamp("NgayTao"));
                kh.setGhiChu(rs.getString("GhiChu"));
                return kh;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);;
        }
        return null;
    }
}
