/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DTO;

/**
 *
 * @author vudtpk0074
 */
public class DTOChiTietHoaDon {
    int maCTHD;
    int idSanPham;
    String tenSP;
    int soLuongMua;
    String donViTinh;
    int giaBan;
    int maHD;
    int tongTien;
    String ghiChu;

    public DTOChiTietHoaDon() {
    }

    public DTOChiTietHoaDon(int maCTHD, int idSanPham, String tenSP, int soLuongMua, String donViTinh, int giaBan, int maHD, int tongTien, String ghiChu) {
        this.maCTHD = maCTHD;
        this.idSanPham = idSanPham;
        this.tenSP = tenSP;
        this.soLuongMua = soLuongMua;
        this.donViTinh = donViTinh;
        this.giaBan = giaBan;
        this.maHD = maHD;
        this.tongTien = tongTien;
        this.ghiChu = ghiChu;
    }

    public DTOChiTietHoaDon(int idSanPham, int soLuongMua, int maHD, int tongTien, String ghiChu) {
        this.idSanPham = idSanPham;
        this.soLuongMua = soLuongMua;
        this.maHD = maHD;
        this.tongTien = tongTien;
        this.ghiChu = ghiChu;
    }

    public int getMaCTHD() {
        return maCTHD;
    }

    public void setMaCTHD(int maCTHD) {
        this.maCTHD = maCTHD;
    }

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuongMua() {
        return soLuongMua;
    }

    public void setSoLuongMua(int soLuongMua) {
        this.soLuongMua = soLuongMua;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    
}
