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
public class DTOHoaDon {
    int maHD;
    int maNV;
    String tenNV;
    int id_KH;
    String tenKH;
    Date ngayTao;
    int tongTien;

    public DTOHoaDon() {
    }

    public DTOHoaDon(int maHD, int maNV, String tenNV, int maKH, String tenKH, Date ngayTao, int tongTien) {
        this.maHD = maHD;
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.id_KH = maKH;
        this.tenKH = tenKH;
        this.ngayTao = ngayTao;
        this.tongTien = tongTien;

    }

    public DTOHoaDon(int maNV, int maKH, Date ngayTao, int tongTien) {
        this.maNV = maNV;
        this.id_KH = maKH;
        this.ngayTao = ngayTao;
        this.tongTien = tongTien;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
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

    public int getId_KH() {
        return id_KH;
    }

    public void setId_KH(int id_KH) {
        this.id_KH = id_KH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }
    
}
