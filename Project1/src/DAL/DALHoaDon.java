/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTOHoaDon;
import DTO.ThongBao;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author vudtpk0074
 */
public class DALHoaDon {

    public static int them(DTOHoaDon item) {
        String query = "Insert into HoaDon Values(" + item.getMaNV() + "," + item.getMaKH() + ",GETDATE()," + item.getTongTien() + ",N'" + item.getGhiChu() + "')";
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static int xoa(int maHD) {
        String query = "Delete from HoaDon where MaHD = " + maHD;
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static int sua(int maHD, DTOHoaDon newItem) {
        String query = "Update HoaDon set MaNV = " + newItem.getMaNV() + ", MaKH = " + newItem.getMaKH() + ", NgayTao = '" + newItem.getNgayTao() + "', TongTien = " + newItem.getTongTien() + ", GhiChu = N'" + newItem.getGhiChu() + "' where MaHD = " + maHD;
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static DTOHoaDon layDuLieu(int maHD){
        String query = "Select maHD, HoaDon.maNV, tenNV, HoaDon.maKH, TenKH, NgayTao, TongTien, HoaDon.GhiChu from HoaDon join NhanVien on HoaDon.MaNV = NhanVien.MaNV join KhachHang on HoaDon.MaKH = KhachHang.MaKH where MaHD = " + maHD;
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            if (rs.next()) {
                DTOHoaDon hd = new DTOHoaDon();
                hd.setMaHD(rs.getInt(1));
                hd.setMaNV(rs.getInt(2));
                hd.setTenNV(rs.getString(3));
                hd.setMaKH(rs.getInt(4));
                hd.setTenKH(rs.getString(5));
                hd.setNgayTao(rs.getString(6));
                hd.setTongTien(rs.getInt(7));
                hd.setGhiChu(rs.getString(8));
                return hd;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        return null;
    }

    public static DTOHoaDon[] layDuLieu() {
        String query = "Select count(MaHD) from HoaDon";
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        int soLuong = 0;
        try {
            if (rs.next()) {
                soLuong = rs.getInt(1);
            } else {
                soLuong = 0;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        DTOHoaDon[] arrHoaDon = new DTOHoaDon[soLuong];
        query = "Select maHD, HoaDon.maNV, tenNV, HoaDon.maKH, TenKH, NgayTao, TongTien, HoaDon.GhiChu from HoaDon join NhanVien on HoaDon.MaNV = NhanVien.MaNV join KhachHang on HoaDon.MaKH = KhachHang.MaKH";
        rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            for (int i = 0; rs.next(); i++) {
                DTOHoaDon hd = new DTOHoaDon();
                hd.setMaHD(rs.getInt(1));
                hd.setMaNV(rs.getInt(2));
                hd.setTenNV(rs.getString(3));
                hd.setMaKH(rs.getInt(4));
                hd.setTenKH(rs.getString(5));
                hd.setNgayTao(rs.getString(6));
                hd.setTongTien(rs.getInt(7));
                hd.setGhiChu(rs.getString(8));
                arrHoaDon[i] = hd;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        return arrHoaDon;
    }

    public static ThongBao taoHoaDonTransaction(int maKH, int maNV, String ngayTao, String ghiChu, int[][] dsSanPham, int thanhTien) {
        try {
            Conn.connection.setAutoCommit(false);
            String query = "set dateformat dmy insert into HoaDon values(" + maNV + "," + maKH + ",'" + ngayTao + "',0,'" + ghiChu + "')";
            Conn.connection.ExcuteNonQuery(query);
            query = "select top 1 MaHD from HoaDon order by MaHD desc";
            ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
            int maHDVuaTao = -1;
            if (rs.next()) {
                maHDVuaTao = rs.getInt(1);
            }
            for (int i = 0; i < dsSanPham.length; i++) {
                int idSanPham = dsSanPham[i][0];
                int soLuong = dsSanPham[i][1];
                query = "select GiaBan from SanPham where IDSanPham = " + idSanPham;
                rs = Conn.connection.ExcuteQuerySelect(query);
                int giaBan = -1;
                if (rs.next()) {
                    giaBan = rs.getInt(1);
                }
                int tongTien = giaBan * soLuong;
                query = "Insert into ChiTietHoaDon Values(" + idSanPham + "," + soLuong + "," + giaBan + "," + maHDVuaTao + "," + tongTien + ",null)";
                Conn.connection.ExcuteNonQuery(query);
            }
//            query = "Select GiaBan from ChiTietHoaDon where MaHD = "+maHDVuaTao;
//            rs = Conn.connection.ExcuteQuerySelect(query);
//            int tongTien = 0;
//            while(rs.next()){
//                tongTien = tongTien + rs.getInt(1);
//            }
            query = "Update HoaDon set TongTien = "+thanhTien+" where MaHD = "+maHDVuaTao;
            Conn.connection.ExcuteNonQuery(query);
            Conn.connection.commit();
            return new ThongBao("Tạo hóa đơn thành công", ThongBao.THANH_CONG);
        } catch (SQLException ex) {
            Conn.connection.rollback();
            return new ThongBao("Lỗi tạo hóa đơn", ThongBao.LOI);
        }
    }
}