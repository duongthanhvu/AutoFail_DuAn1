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
public class DTOKhachHang {

    int ID_KH;
    String maKH;
    String tenKH;
    int maLoaiKH;
    String tenLoai;
    boolean gioiTinhNam;
    String soDT;
    String email;
    String diaChi;
    java.util.Date ngaySinh;
    int diem;
    java.util.Date ngayTao;
    String ghiChu;

    public DTOKhachHang() {
    }

    public DTOKhachHang(String maKH, String tenKH, int maLoaiKH, boolean gioiTinhNam, String soDT, String email, String diaChi, Date ngaySinh, int diem, Date ngayTao, String ghiChu) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.maLoaiKH = maLoaiKH;
        this.gioiTinhNam = gioiTinhNam;
        this.soDT = soDT;
        this.email = email;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.diem = diem;
        this.ngayTao = ngayTao;
        this.ghiChu = ghiChu;
    }

    public DTOKhachHang(int ID_KH, String maKH, String tenKH, int maLoaiKH, boolean gioiTinhNam, String soDT, String email, String diaChi, Date ngaySinh, int diem, Date ngayTao, String ghiChu) {
        this.ID_KH = ID_KH;
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.maLoaiKH = maLoaiKH;
        this.gioiTinhNam = gioiTinhNam;
        this.soDT = soDT;
        this.email = email;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.diem = diem;
        this.ngayTao = ngayTao;
        this.ghiChu = ghiChu;
    }

    public DTOKhachHang(String maKH, String tenKH, String maLoaiKH, String gioiTinh, String soDT, String email, String diaChi, Date ngaySinh, String diem, Date ngayTao, String ghiChu) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        if (maLoaiKH.equals("Member")) {
            this.maLoaiKH = 1;
        } else if (maLoaiKH.equals("Silver")) {
            this.maLoaiKH = 2;
        } else {
            this.maLoaiKH = 3;
        }
        this.gioiTinhNam = gioiTinh.equals("Nam");
        this.soDT = soDT;
        this.email = email;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.diem = Integer.parseInt(diem);
        this.ngayTao = ngayTao;
        this.ghiChu = ghiChu;
    }

    public int getID_KH() {
        return ID_KH;
    }

    public void setID_KH(int ID_KH) {
        this.ID_KH = ID_KH;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public int getMaLoaiKH() {
        return maLoaiKH;
    }

    public void setMaLoaiKH(int maLoaiKH) {
        this.maLoaiKH = maLoaiKH;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public boolean isGioiTinhNam() {
        return gioiTinhNam;
    }

    public String getGioiTinh() {
        if (gioiTinhNam) {
            return "Nam";
        } else {
            return "Nữ";
        }
    }
    
    public int getGioiTinh_int() {
        int myInt = (isGioiTinhNam()) ? 1 : 0;
        return myInt;
    }

    public void setGioiTinhNam(boolean gioiTinhNam) {
        this.gioiTinhNam = gioiTinhNam;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public String getNgaySinh_DMY() {
        if (ngaySinh == null) {
            return "";
        } else {
            String sNgaySinh = ConvertDateFormat.chuyenNgay(ngaySinh);
            return sNgaySinh;
        }
    }

    public String getNgaySinh_forSQL() {
        if (ngaySinh == null) {
            return "NULL";
        } else {
            String sNgaySinh = ConvertDateFormat.chuyenNgayYMD(ngaySinh);
            return sNgaySinh;
        }
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getDiem() {
        return diem;
    }

    public String getDiem_String() {
        String sDiem = String.valueOf(diem);
        return sDiem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public String getNgayTao_String() {
        String sNgayTao = ConvertDateFormat.chuyenNgay(ngayTao);
        return sNgayTao;
    }

    public String getGioTao() {
        String sNgayTao = ConvertDateFormat.chuyenGio(ngayTao);
        return sNgayTao;
    }

    public String getNgayTao_forSQL() {
        String sNgayTao = ConvertDateFormat.chuyenNgayVaGio(ngayTao);
        return sNgayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

}
