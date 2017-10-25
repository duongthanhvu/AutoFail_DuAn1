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
public class DTONhanVien implements DTO{
    int maNV;
    String tenNV;
    int gioiTinh;
    String soDT;
    String ngaySinh;
    String diaChi;
    String soCMND;
    String ghiChu;

    public DTONhanVien() {
    }

    public DTONhanVien(int maNV, String tenNV, int gioiTinh, String soDT, String ngaySinh, String diaChi, String soCMND, String ghiChu) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
        this.soDT = soDT;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.soCMND = soCMND;
        this.ghiChu = ghiChu;
    }

    public DTONhanVien(String tenNV, int gioiTinh, String soDT, String ngaySinh, String diaChi, String soCMND, String ghiChu) {
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
        this.soDT = soDT;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.soCMND = soCMND;
        this.ghiChu = ghiChu;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @Override
    public int getKey() {
        return maNV;
    }

    @Override
    public String getText() {
        return tenNV;
    }
    
}
