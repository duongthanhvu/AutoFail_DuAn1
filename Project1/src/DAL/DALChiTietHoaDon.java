/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.ConvertDateFormat;
import DTO.DTOBaoCao;
import DTO.DTOChiTietHoaDon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
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
    
    public static DTO.DTOBaoCao[] layBaoCao(Date ngayBatDau, Date ngayKetThuc){
        String sNgayBatDau = ConvertDateFormat.chuyenNgayYMD(ngayBatDau);
        String sNgayKetThuc = ConvertDateFormat.chuyenNgayYMD(ngayKetThuc);
        String query = "Select Count(MaSP) from (select MaSP from HoaDon join ChiTietHoaDon on HoaDon.MaHD = ChiTietHoaDon.MaHD where NgayTao < '"+sNgayKetThuc+"' and NgayTao > '"+sNgayBatDau+"' Group by MaSP) as a";
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
        DTO.DTOBaoCao[] arrBaoCao = new DTO.DTOBaoCao[soLuong];
        query = "Select a.MaSP , sum(SoLuong) as SoLuong from (select NgayTao,MaCTHD,MaSP,GiaBanLe,SoLuong, GiaBanLe*SoLuong as thanhTien from HoaDon join ChiTietHoaDon on HoaDon.MaHD = ChiTietHoaDon.MaHD where NgayTao < '"+sNgayKetThuc+"' and NgayTao > '"+sNgayBatDau+"') as a group by MaSP";
        rs = Conn.connection.ExcuteQuerySelect(query);
        try {
            for (int i = 0; rs.next(); i++) {
                DTOBaoCao bc = new DTOBaoCao();
                bc.setMaSP(rs.getInt("MaSP"));
                bc.setSoLuongBan(rs.getInt("SoLuong"));
                arrBaoCao[i] = bc;
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi " + ex);
        }
        for(int i = 0; i < arrBaoCao.length; i++){
            DTO.DTOSanPham sp = DAL.DALSanPham.layDuLieu(arrBaoCao[i].getMaSP());
            arrBaoCao[i].setTenSP(sp.getTenSP());
            arrBaoCao[i].setDonGiaBan(sp.getGiaBanLe());
            arrBaoCao[i].setTienBan(arrBaoCao[i].getDonGiaBan()*arrBaoCao[i].getSoLuongBan());
            arrBaoCao[i].setTienKM(0);
            arrBaoCao[i].setDoanhThu(arrBaoCao[i].getTienBan()-arrBaoCao[i].getTienKM());
        }
        return arrBaoCao;
    }
}
