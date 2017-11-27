/*
 * Copyright (C) 2017 vudt9
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package DAL;

import DTO.ThongBao;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author vudtpk0074
 */
public class DALPhieuNhap {

    public static ThongBao taoPhieuNhapTransaction(int maNCC, int maNV, DTO.DTOSanPhamNhap[] dsSanPham, int tongTien) {
        try {
            Conn.connection.setAutoCommit(false);
            String query = "Insert into PhieuNhap values(" + maNV + "," + maNCC + ", "+tongTien+", Getdate())";
            Conn.connection.ExcuteNonQuery(query);
            //Add chi tiết phiếu nhập
            query = "select top 1 MaPhieuNhap from PhieuNhap order by MaPhieuNhap desc";
            ResultSet rs = Conn.connection.ExcuteQuerySelect(query);
            int maPNVuaTao = -1;
            if (rs.next()) {
                maPNVuaTao = rs.getInt(1);
            }
            for (int i = 0; i < dsSanPham.length; i++) {
                int maSP = dsSanPham[i].getMaSP();
                int soLuong = dsSanPham[i].getSoLuong();
                int giaNhap = dsSanPham[i].getGiaNhap();
                query = "Insert into ChiTietPhieuNhap Values("+maPNVuaTao+"," + maSP + "," + giaNhap + "," + soLuong + ")";
                Conn.connection.ExcuteNonQuery(query);
                //Điều chỉnh giá sp theo giá nhập
                query = "Update SanPham set GiaBanLe = "+giaNhap+" where MaSP = "+maSP;
                Conn.connection.ExcuteNonQuery(query);
            }
            Conn.connection.commit();
            return new ThongBao("Tạo phiếu nhập thành công", ThongBao.THANH_CONG);
        } catch (SQLException ex) {
            Conn.connection.rollback();
            return new ThongBao("Lỗi tạo phiếu nhập", ThongBao.LOI);
        }
    }
}
