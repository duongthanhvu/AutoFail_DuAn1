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
    int maSP;
    String tenSP;
    int maLoaiSP;
    String tenLoai;
    int soLuong;
    int giaBanLe;
    String barcode;
    boolean available;

    public DTOSanPham() {
    }

    public DTOSanPham(int maSP, String tenSP, int maLoaiSP, int giaBanLe, String barcode, boolean available) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.maLoaiSP = maLoaiSP;
        this.giaBanLe = giaBanLe;
        this.barcode = barcode;
        this.available = available;
    }

    public DTOSanPham(String tenSP, int maLoaiSP, int giaBanLe, String barcode, boolean available) {
        this.tenSP = tenSP;
        this.maLoaiSP = maLoaiSP;
        this.giaBanLe = giaBanLe;
        this.barcode = barcode;
        this.available = available;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGiaBanLe() {
        return giaBanLe;
    }

    public void setGiaBanLe(int giaBanLe) {
        this.giaBanLe = giaBanLe;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    public Object[] getAll(){
        Object[] item = new Object[8];
        item[0] = getMaSP();
        item[1] = getTenSP();
        item[2] = getMaLoaiSP();
        item[3] = getTenLoai();
        item[4] = getSoLuong();
        item[5] = getGiaBanLe();
        item[6] = getBarcode();
        item[7] = isAvailable();
        return item;
    }
}
