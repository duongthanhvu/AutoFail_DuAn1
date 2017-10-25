/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.ThongBao;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author vudtpk0074
 */
public class XuLyThongBao {

    public static void hienThiThongBao(ThongBao thongBao) {
        String tieuDe = "";
        if (thongBao.getLoaiThongBao() == ThongBao.LOI) {
            tieuDe = "Lỗi";
        } else if (thongBao.getLoaiThongBao() == ThongBao.THANH_CONG) {
            tieuDe = "Thành công";
        }
        JOptionPane.showMessageDialog(new JFrame(),
                thongBao.getNoiDungThongBao(),
                tieuDe,
                thongBao.getLoaiThongBao());
    }
}
