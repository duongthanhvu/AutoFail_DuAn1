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
public class DTOLoaiSanPham implements DTO{
    int maLoaiSP;
    String tenLoai;
    String moTa;

    public DTOLoaiSanPham() {
    }

    public DTOLoaiSanPham(int maLoaiSP, String tenLoai, String moTa) {
        this.maLoaiSP = maLoaiSP;
        this.tenLoai = tenLoai;
        this.moTa = moTa;
    }

    public DTOLoaiSanPham(String tenLoai, String moTa) {
        this.tenLoai = tenLoai;
        this.moTa = moTa;
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

    @Override
    public int getKey() {
        return maLoaiSP;
    }

    @Override
    public String getText() {
        return tenLoai;
    }
    
    
}
