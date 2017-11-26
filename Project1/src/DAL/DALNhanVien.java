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
        String query = "Insert into NhanVien Values(N'" + item.getTenNV() + "', '" + item.getSoDT() + "',"+item.getGioiTinh()+", '" + item.getNgaySinh_YMD() + "', '"+item.getCmnd()+"', N'" + item.getDiaChi() + "','" + item.getNgayTao_YMD() + "','" + item.getTenDangNhap() + "','"+item.getMatKhau()+"',"+item.getMaQuyen()+",'"+item.isAvailable()+"')";
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static int xoa(int maNV) {
        String query = "Delete from NhanVien where MaNV = " + maNV;
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static int sua(int maNV, DTONhanVien newItem) {
        String query = "Update NhanVien set TenNV = N'" + newItem.getTenNV() + "', SoDT = '"+newItem.getSoDT()+"', GioiTinh = " + newItem.getGioiTinh() + ", NgaySinh = '" + newItem.getNgaySinh_YMD() + "', CMND = '"+newItem.getCmnd()+"', DiaChi = '" + newItem.getDiaChi() + "', NgayTao = '"+newItem.getNgayTao_YMD()+"', TenDangNhap = '"+newItem.getTenDangNhap()+"', MatKhau = '"+newItem.getMatKhau()+"', MaQuyen = " + newItem.getMaQuyen() + ", TinhTrang = '"+newItem.isAvailable()+"' where MaNV = " + maNV;
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static DTONhanVien layDuLieu(int maNV) {
        String query = "Select * from NhanVien join Quyen on NhanVien.MaQuyen = Quyen.MaQuyen where MaNV = " + maNV;
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            if (rs.next()) {
                DTONhanVien nv = new DTONhanVien();
                nv.setMaNV(rs.getInt("MaNV"));
                nv.setTenNV(rs.getString("TenNV"));
                nv.setSoDT(rs.getString("SoDT"));
                nv.setGioiTinh(rs.getInt("GioiTinh"));
                nv.setNgaySinh(rs.getTimestamp("NgaySinh"));
                nv.setCmnd(rs.getString("CMND"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setNgayTao(rs.getTimestamp("NgayTao"));
                nv.setTenDangNhap(rs.getString("TenDangNhap"));
                nv.setMatKhau(rs.getString("MatKhau"));
                nv.setMaQuyen(rs.getInt("MaQuyen"));
                nv.setTenQuyen(rs.getString("TenQuyen"));
                nv.setAvailable(rs.getBoolean("TinhTrang"));
                return nv;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi DAL Nhân viên " + ex);
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
        query = "Select * from NhanVien join Quyen on NhanVien.MaQuyen = Quyen.MaQuyen";
        rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            for (int i = 0; rs.next(); i++) {
                DTONhanVien nv = new DTONhanVien();
                nv.setMaNV(rs.getInt("MaNV"));
                nv.setTenNV(rs.getString("TenNV"));
                nv.setSoDT(rs.getString("SoDT"));
                nv.setGioiTinh(rs.getInt("GioiTinh"));
                nv.setNgaySinh(rs.getTimestamp("NgaySinh"));
                nv.setCmnd(rs.getString("CMND"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setNgayTao(rs.getTimestamp("NgayTao"));
                nv.setTenDangNhap(rs.getString("TenDangNhap"));
                nv.setMatKhau(rs.getString("MatKhau"));
                nv.setMaQuyen(rs.getInt("MaQuyen"));
                nv.setTenQuyen(rs.getString("TenQuyen"));
                nv.setAvailable(rs.getBoolean("TinhTrang"));
                arrNhanVien[i] = nv;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi DALNhanVien " + ex);
        }
        return arrNhanVien;
    }
    
    public static boolean kiemTraUserName(String username){
        String query = "select * from NhanVien where TenDangNhap = '"+username+"'";
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            if(rs.next()){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public static boolean kiemTraPassword(String username, String password){
        String query = "select * from NhanVien where TenDangNhap = '"+username+"' and MatKhau = '"+password+"'";
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            if(rs.next()){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public static DTONhanVien layThongTinNVDaDN(String username, String password){
        String query = "select * from NhanVien where TenDangNhap = '"+username+"' and MatKhau = '"+password+"'";
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            if (rs.next()) {
                DTONhanVien nv = new DTONhanVien();
                nv.setMaNV(rs.getInt("MaNV"));
                nv.setTenNV(rs.getString("TenNV"));
                nv.setSoDT(rs.getString("SoDT"));
                nv.setGioiTinh(rs.getInt("GioiTinh"));
                nv.setNgaySinh(rs.getTimestamp("NgaySinh"));
                nv.setCmnd(rs.getString("CMND"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setNgayTao(rs.getTimestamp("NgayTao"));
                nv.setTenDangNhap(rs.getString("TenDangNhap"));
                nv.setMatKhau(rs.getString("MatKhau"));
                nv.setMaQuyen(rs.getInt("MaQuyen"));
                nv.setAvailable(rs.getBoolean("TinhTrang"));
                return nv;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi DAL Nhân viên " + ex);
        }
        return null;
    }
}
