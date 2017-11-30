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
        String query = "Insert into HoaDon Values(" + item.getMaNV() + "," + item.getId_KH() +","+item.getTongTien()+",GETDATE())";
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }

    public static int xoa(int maHD) {
        String query = "Delete from HoaDon where MaHD = " + maHD;
        int result = Conn.connection.ExcuteNonQuery(query);
        return result;
    }


    public static DTOHoaDon layDuLieu(int maHD){
        String query = "Select maHD, HoaDon.maNV, tenNV, HoaDon.id_KH, TenKH, NgayTao, TongTien from HoaDon join NhanVien on HoaDon.MaNV = NhanVien.MaNV join KhachHang on HoaDon.id_KH = KhachHang.id_KH where MaHD = " + maHD;
        ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            if (rs.next()) {
                DTOHoaDon hd = new DTOHoaDon();
                hd.setMaHD(rs.getInt("MaHD"));
                hd.setMaNV(rs.getInt("MaNV"));
                hd.setTenNV(rs.getString("TenNV"));
                hd.setId_KH(rs.getInt("ID_KH"));
                hd.setTenKH(rs.getString("Ten_KH"));
                hd.setNgayTao(rs.getTimestamp("NgayTao"));
                hd.setTongTien(rs.getInt("TongTien"));
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
        query = "Select maHD, HoaDon.maNV, tenNV, HoaDon.ID_KH, TenKH, NgayTao, TongTien from HoaDon join NhanVien on HoaDon.MaNV = NhanVien.MaNV join KhachHang on HoaDon.id_KH = KhachHang.id_KH";
        rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            for (int i = 0; rs.next(); i++) {
                DTOHoaDon hd = new DTOHoaDon();
                hd.setMaHD(rs.getInt("MaHD"));
                hd.setMaNV(rs.getInt("MaNV"));
                hd.setTenNV(rs.getString("TenNV"));
                hd.setId_KH(rs.getInt("ID_KH"));
                hd.setTenKH(rs.getString("TenKH"));
                hd.setNgayTao(rs.getTimestamp("NgayTao"));
                hd.setTongTien(rs.getInt("TongTien"));
                arrHoaDon[i] = hd;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        return arrHoaDon;
    }

    public static ThongBao taoHoaDonTransaction(int id_KH, int maNV, int[][] dsSanPham, int tongTien, int chietKhau, int[] arrKM) {
        try {
            Conn.connection.setAutoCommit(false);
            String query = "Insert into HoaDon values(" + maNV + "," + id_KH + ", "+tongTien+", Getdate())";
            Conn.connection.ExcuteNonQuery(query);
            //Cộng điểm cho khách hàng, cộng thêm 1 điểm mỗi 10.000 giá trị hóa đơn
            query = "Select Diem from KhachHang where ID_KH = "+id_KH;
            ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
            int diem = -1;
            if (rs.next()) {
                    diem = rs.getInt(1);
                }
            diem = diem + (tongTien / 10000);
            query = "Update KhachHang set Diem = " + diem + " where ID_KH = "+id_KH;
            Conn.connection.ExcuteNonQuery(query);
            //Add chi tiết hóa đơn
            query = "select top 1 MaHD from HoaDon order by MaHD desc";
            rs = Conn.connection.ExcuteQuerySelect(query);
            int maHDVuaTao = -1;
            if (rs.next()) {
                maHDVuaTao = rs.getInt(1);
            }
            for (int i = 0; i < dsSanPham.length; i++) {
                int maSP = dsSanPham[i][0];
                int soLuong = dsSanPham[i][1];
                query = "select GiaBanLe from SanPham where MaSP = " + maSP;
                rs = Conn.connection.ExcuteQuerySelect(query);
                int giaBan = -1;
                if (rs.next()) {
                    giaBan = rs.getInt(1);
                }
                query = "Insert into ChiTietHoaDon Values("+maHDVuaTao+"," + maSP + "," + giaBan + "," + soLuong + ")";
                Conn.connection.ExcuteNonQuery(query);
            }
            if(chietKhau > 0 && chietKhau < 100){
                query = "Insert into ChiTietKhuyenMai Values("+maHDVuaTao+","+arrKM[0]+",NULL,NULL,"+chietKhau+")";
                Conn.connection.ExcuteNonQuery(query);
            }
            Conn.connection.commit();
            return new ThongBao("Tạo hóa đơn thành công", ThongBao.THANH_CONG);
        } catch (SQLException ex) {
            Conn.connection.rollback();
            return new ThongBao("Lỗi tạo hóa đơn", ThongBao.LOI);
        }
    }
}
