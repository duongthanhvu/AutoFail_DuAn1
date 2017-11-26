/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author vudtpk0074
 */
public class InvoiceInfo {

    private String tenKH;
    private String tenNV;
    private String ngayTao;
    private Integer tongTien;

    public InvoiceInfo(String tenKH, String tenNV, String ngayTao, Integer tongTien) {
        this.tenKH = tenKH;
        this.tenNV = tenNV;
        this.ngayTao = ngayTao;
        this.tongTien = tongTien;
    }
    
    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Integer getTongTien() {
        return tongTien;
    }

    public void setTongTien(Integer tongTien) {
        this.tongTien = tongTien;
    }
}
