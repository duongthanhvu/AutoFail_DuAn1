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
public class InvoiceDetail {

    private String sanPham;
    private Integer donGia;
    private Integer soLuong;
    private Integer soTien;

    public InvoiceDetail(String sanPham, Integer donGia, Integer soLuong, Integer soTien) {
        this.sanPham = sanPham;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.soTien = soTien;
    }

    
    public String getSanPham() {
        return sanPham;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public Integer getDonGia() {
        return donGia;
    }

    public void setDonGia(Integer donGia) {
        this.donGia = donGia;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Integer getSoTien() {
        return soTien;
    }

    public void setSoTien(Integer soTien) {
        this.soTien = soTien;
    }
}
