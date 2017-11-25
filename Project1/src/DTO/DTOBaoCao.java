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
public class DTOBaoCao {
    int maSP;
    String tenSP;
    int soLuongBan;
    int donGiaBan;
    int tienBan;
    int tienKM;
    int doanhThu;

    public DTOBaoCao() {
    }

    public DTOBaoCao(int maSP, String tenSP, int soLuongBan, int donGiaBan, int tienBan, int tienKM, int doanhThu) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuongBan = soLuongBan;
        this.donGiaBan = donGiaBan;
        this.tienBan = tienBan;
        this.tienKM = tienKM;
        this.doanhThu = doanhThu;
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

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public int getDonGiaBan() {
        return donGiaBan;
    }

    public void setDonGiaBan(int donGiaBan) {
        this.donGiaBan = donGiaBan;
    }

    public int getTienBan() {
        return tienBan;
    }

    public void setTienBan(int tienBan) {
        this.tienBan = tienBan;
    }

    public int getTienKM() {
        return tienKM;
    }

    public void setTienKM(int tienKM) {
        this.tienKM = tienKM;
    }

    public int getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(int doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    
}
