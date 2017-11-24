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
public class DTONhanVien implements DTO{
    int maNV;
    String tenNV;
    String soDT;
    int gioiTinh;
    Date ngaySinh;
    String cmnd;
    String diaChi;
    Date ngayTao;
    String tenDangNhap;
    String matKhau;
    int maQuyen;
    String tenQuyen;
    boolean available;

    public DTONhanVien() {
    }

    public DTONhanVien(int maNV, String tenNV, String soDT, int gioiTinh, Date ngaySinh, String cmnd, String diaChi, Date ngayTao, String tenDangNhap, String matKhau, int maQuyen, String tenQuyen, boolean available) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.soDT = soDT;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.cmnd = cmnd;
        this.diaChi = diaChi;
        this.ngayTao = ngayTao;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.maQuyen = maQuyen;
        this.tenQuyen = tenQuyen;
        this.available = available;
    }

    public DTONhanVien(String tenNV, String soDT, int gioiTinh, Date ngaySinh, String cmnd, String diaChi, Date ngayTao, String tenDangNhap, String matKhau, int maQuyen, String tenQuyen, boolean available) {
        this.tenNV = tenNV;
        this.soDT = soDT;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.cmnd = cmnd;
        this.diaChi = diaChi;
        this.ngayTao = ngayTao;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.maQuyen = maQuyen;
        this.tenQuyen = tenQuyen;
        this.available = available;
    }

    public DTONhanVien(String tenNV, String soDT, int gioiTinh, Date ngaySinh, String cmnd, String diaChi, Date ngayTao, String tenDangNhap, String matKhau, int maQuyen, boolean available) {
        this.tenNV = tenNV;
        this.soDT = soDT;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.cmnd = cmnd;
        this.diaChi = diaChi;
        this.ngayTao = ngayTao;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.maQuyen = maQuyen;
        this.available = available;
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

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public String getGioiTinh_String() {
        if(gioiTinh == 1){
            return "Nam";
        }else{
            return "Nữ";
        }
    }
    
    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }
    
    public String getNgaySinh_String() {
        String sNgaySinh = ConvertDateFormat.chuyenNgay(ngaySinh);
        return sNgaySinh;
    }

    public String getNgaySinh_YMD() {
        String sNgaySinh = ConvertDateFormat.chuyenNgayYMD(ngaySinh);
        return sNgaySinh;
    }
    
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Date getNgayTao() {
        return ngayTao;
    }
    
    public String getNgayTao_String() {
        String sNgayTao = ConvertDateFormat.chuyenNgayVaGio(ngayTao);
        return sNgayTao;
    }

    public String getNgayTao_YMD() {
       String sNgayTao = ConvertDateFormat.chuyenNgayVaGio(ngayTao);
       return sNgayTao;
    }
    
    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public int getMaQuyen() {
        return maQuyen;
    }

    public void setMaQuyen(int maQuyen) {
        this.maQuyen = maQuyen;
    }

    public String getTenQuyen() {
        return tenQuyen;
    }

    public void setTenQuyen(String tenQuyen) {
        this.tenQuyen = tenQuyen;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
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
