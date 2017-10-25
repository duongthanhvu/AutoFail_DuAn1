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
public class DTOKhachHang {
    int maKH;
    String tenKH;
    int gioiTinh;
    String soDT;
    String ngaySinh;
    String diaChi;
    String ghiChu;

    public DTOKhachHang(int maKH, String tenKH, int gioiTinh, String soDT, String ngaySinh, String diaChi, String ghiChu) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.soDT = soDT;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.ghiChu = ghiChu;
    }

    public DTOKhachHang() {
    }

    public DTOKhachHang(String tenKH, int gioiTinh, String soDT, String ngaySinh, String diaChi, String ghiChu) {
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.soDT = soDT;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.ghiChu = ghiChu;
    }
    

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
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

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    
}
