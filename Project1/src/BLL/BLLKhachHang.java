/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DALKhachHang;
import DTO.DTOKhachHang;
import DTO.ThongBao;

/**
 *
 * @author vudtpk0074
 */
public class BLLKhachHang {

    public static ThongBao them(DTOKhachHang kh) {
        if (kh.getTenKH().trim().length() < 1 || kh.getTenKH().trim().length() > 30) {
            return new ThongBao("Độ dài tên không hợp lệ.", ThongBao.LOI);
        } else if (kh.getGhiChu().trim().length() > 50) {
            return new ThongBao("Độ dài mô tả quá lớn", ThongBao.LOI);
        } else if (CheckValue.isCorrectPhoneNumber(kh.getSoDT()) == false) {
            return new ThongBao("Số điện thoại không hợp lệ", ThongBao.LOI);
        } else {
            int kq = DALKhachHang.them(kh);
            if (kq < 0) {
                return new ThongBao("Lỗi thêm dữ liệu", ThongBao.LOI);
            } else if (kq == 0) {
                return new ThongBao("Thêm dữ liệu thất bại", ThongBao.LOI);
            } else {
                return new ThongBao("Thêm dữ liệu thành công", ThongBao.THANH_CONG);
            }
        }
    }

    public static ThongBao sua(int maKhachHang, DTOKhachHang kh) {
        if (kh.getTenKH().trim().length() < 1 || kh.getTenKH().trim().length() > 30) {
            return new ThongBao("Độ dài tên không hợp lệ.", ThongBao.LOI);
        } else if (kh.getGhiChu().trim().length() > 50) {
            return new ThongBao("Độ dài mô tả quá lớn", ThongBao.LOI);
        } else if (CheckValue.isCorrectPhoneNumber(kh.getSoDT()) == false) {
            return new ThongBao("Số điện thoại không hợp lệ", ThongBao.LOI);
        } else {
            int kq = DALKhachHang.sua(maKhachHang, kh);
            if (kq < 0) {
                return new ThongBao("Lỗi sửa dữ liệu", ThongBao.LOI);
            } else if (kq == 0) {
                return new ThongBao("Sửa dữ liệu thất bại", ThongBao.LOI);
            } else {
                return new ThongBao("Sửa dữ liệu thành công", ThongBao.THANH_CONG);
            }
        }
    }

    public static ThongBao xoa(int[] arrMaKH) {
        int daXoa = 0;
        for (int i = 0; i < arrMaKH.length; i++) {
            int kq = DALKhachHang.xoa(arrMaKH[i]);
            if (kq < 0) {
                return new ThongBao("Lỗi xóa dữ liệu", ThongBao.LOI);
            } else if (kq == 0) {
                return new ThongBao("Xóa dữ liệu thất bại", ThongBao.LOI);
            } else {
                daXoa++;
            }
        }
        if (daXoa > 0) {
            return new ThongBao("Đã xóa thành công " + daXoa + " dòng!", ThongBao.THANH_CONG);
        } else {
            return new ThongBao("Chưa có dòng nào bị xóa!", ThongBao.LOI);
        }
    }
}
