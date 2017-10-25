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
public class ThongBao {
    String noiDungThongBao;
    int loaiThongBao;
    public static final int LOI = 0;
    public static final int THANH_CONG = 1;

    public ThongBao(String noiDungThongBao, int loaiThongBao) {
        this.noiDungThongBao = noiDungThongBao;
        this.loaiThongBao = loaiThongBao;
    }

    public String getNoiDungThongBao() {
        return noiDungThongBao;
    }

    public void setNoiDungThongBao(String noiDungThongBao) {
        this.noiDungThongBao = noiDungThongBao;
    }

    public int getLoaiThongBao() {
        return loaiThongBao;
    }

    public void setMaThongBao(int loaiThongBao) {
        this.loaiThongBao = loaiThongBao;
    }
    
    
}
