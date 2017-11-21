/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DTO;

import java.util.Date;

/**
 *
 * @author vudtpk0074
 */
public class DTOChuongTrinhKM {

    private int maKhuyenMai;
    private String tenKM;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private String kieuKhuyenMai;
    private int doiTuongApDung;
    private String moTa;

    public DTOChuongTrinhKM() {
    }

    public DTOChuongTrinhKM(int maKhuyenMai, String tenKM, Date ngayBatDau, Date ngayKetThuc, String kieuKhuyenMai, int doiTuongApDung, String moTa) {
        this.maKhuyenMai = maKhuyenMai;
        this.tenKM = tenKM;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.kieuKhuyenMai = kieuKhuyenMai;
        this.doiTuongApDung = doiTuongApDung;
        this.moTa = moTa;
    }

    public DTOChuongTrinhKM(String tenKM, Date ngayBatDau, Date ngayKetThuc, String kieuKhuyenMai, int doiTuongApDung, String moTa) {
        this.tenKM = tenKM;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.kieuKhuyenMai = kieuKhuyenMai;
        this.doiTuongApDung = doiTuongApDung;
        this.moTa = moTa;
    }

    public int getMaKhuyenMai() {
        return maKhuyenMai;
    }

    public void setMaKhuyenMai(int maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    public String getTenKM() {
        return tenKM;
    }

    public void setTenKM(String tenKM) {
        this.tenKM = tenKM;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getKieuKhuyenMai() {
        return kieuKhuyenMai;
    }

    public void setKieuKhuyenMai(String kieuKhuyenMai) {
        this.kieuKhuyenMai = kieuKhuyenMai;
    }

    public int getDoiTuongApDung() {
        return doiTuongApDung;
    }

    public void setDoiTuongApDung(int doiTuongApDung) {
        this.doiTuongApDung = doiTuongApDung;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    
    
}