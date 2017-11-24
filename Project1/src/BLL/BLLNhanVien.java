/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BLL;

import DAL.DALNhanVien;
import DTO.DTONhanVien;
import DTO.ThongBao;

/**
 *
 * @author vudtpk0074
 */
public class BLLNhanVien {
    public static ThongBao them(DTONhanVien sp) {
        if (sp.getTenNV().trim().length() < 1 || sp.getTenNV().trim().length() > 30) {
            return new ThongBao("Độ dài tên không hợp lệ.", ThongBao.LOI);
        } else {
            int kq = DALNhanVien.them(sp);
            if (kq < 0) {
                return new ThongBao("Lỗi thêm dữ liệu", ThongBao.LOI);
            } else if (kq == 0) {
                return new ThongBao("Thêm dữ liệu thất bại", ThongBao.LOI);
            } else {
                return new ThongBao("Thêm dữ liệu thành công", ThongBao.THANH_CONG);
            }
        }
    }

    public static ThongBao sua(int maSanPham, DTONhanVien sp) {
        if (sp.getTenNV().trim().length() < 1 || sp.getTenNV().trim().length() > 30) {
            return new ThongBao("Độ dài tên không hợp lệ.", ThongBao.LOI);
        } else {
            int kq = DALNhanVien.sua(maSanPham, sp);
            if (kq < 0) {
                return new ThongBao("Lỗi sửa dữ liệu", ThongBao.LOI);
            } else if (kq == 0) {
                return new ThongBao("Sửa dữ liệu thất bại", ThongBao.LOI);
            } else {
                return new ThongBao("Sửa dữ liệu thành công", ThongBao.THANH_CONG);
            }
        }
    }

    public static ThongBao xoa(int[] arrMaSanPham) {
        int daXoa = 0;
        for (int i = 0; i < arrMaSanPham.length; i++) {
            int kq = DALNhanVien.xoa(arrMaSanPham[i]);
            if (kq < 0) {
                return new ThongBao("Lỗi xóa dữ liệu", ThongBao.LOI);
            } else if (kq == 0) {
                return new ThongBao("Xóa dữ liệu thất bại", ThongBao.LOI);
            } else {
                daXoa++;
            }
        }
        if(daXoa > 0){
            return new ThongBao("Đã xóa thành công "+daXoa+" dòng!", ThongBao.THANH_CONG);
        }else{
            return new ThongBao("Chưa có dòng nào bị xóa!", ThongBao.LOI);
        }
    }
}
