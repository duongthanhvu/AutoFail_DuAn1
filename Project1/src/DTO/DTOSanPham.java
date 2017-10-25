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
public class DTOSanPham {
    int iDSanPham;
    String maSP;
    String tenSP;
    int soLuong;
    String donViTinh;
    int giaNhap;
    int giaBan;
    int maLoaiSP;
    String tenLoai;
    String moTa;

    public DTOSanPham() {
    }

    public DTOSanPham(int iDSanPham, String maSP, String tenSP, int soLuong, String donViTinh, int giaNhap, int giaBan, int maLoaiSP, String tenLoai, String moTa) {
        this.iDSanPham = iDSanPham;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donViTinh = donViTinh;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.maLoaiSP = maLoaiSP;
        this.tenLoai = tenLoai;
        this.moTa = moTa;
    }

    public DTOSanPham(String maSP, String tenSP, int soLuong, String donViTinh, int giaNhap, int giaBan, int maLoaiSP, String tenLoai, String moTa) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donViTinh = donViTinh;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.maLoaiSP = maLoaiSP;
        this.tenLoai = tenLoai;
        this.moTa = moTa;
    }

    public DTOSanPham(String maSP, String tenSP, int soLuong, String donViTinh, int giaNhap, int giaBan, int maLoaiSP, String moTa) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donViTinh = donViTinh;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.maLoaiSP = maLoaiSP;
        this.moTa = moTa;
    }

    public int getiDSanPham() {
        return iDSanPham;
    }

    public void setiDSanPham(int iDSanPham) {
        this.iDSanPham = iDSanPham;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public int getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getMaLoaiSP() {
        return maLoaiSP;
    }

    public void setMaLoaiSP(int maLoaiSP) {
        this.maLoaiSP = maLoaiSP;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
    public Object[] getAll(){
        Object[] item = new Object[10];
        item[0] = getiDSanPham();
        item[1] = getMaSP();
        item[2] = getTenSP();
        item[3] = getSoLuong();
        item[4] = getDonViTinh();
        item[5] = getGiaNhap();
        item[6] = getGiaBan();
        item[7] = getMaLoaiSP();
        item[8] = getTenLoai();
        item[9] = getMoTa();
        return item;
    }
}
