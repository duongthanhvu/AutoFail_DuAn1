/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.BLLKhachHang;
import BLL.BLLNhanVien;
import BLL.BLLSanPham;
import DAL.DALNhanVien;
import DTO.ConvertDateFormat;
import DTO.*;
import java.util.Date;

/**
 *
 * @author vudt9
 */
public class dlg_SuaNhanVien extends javax.swing.JDialog {

    private boolean success;
    private DTONhanVien nvCanSua;
    /**
     * Creates new form dlg_ThemKhachHang
     */
    public dlg_SuaNhanVien(java.awt.Frame parent, boolean modal, DTONhanVien nvCanSua) {
        super(parent, modal);
        initComponents();
        this.nvCanSua = nvCanSua;
        doDuLieuLenForm();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbb_GioiTinh = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_TenNV = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_Huy = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        lbl_BaoLoi = new javax.swing.JLabel();
        txt_SoDienThoai = new javax.swing.JFormattedTextField();
        txt_DiaChi = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        dat_NgaySinh = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        txt_TenDangNhap = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_MatKhau = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_CMND = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        cbb_Availability = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);

        jLabel9.setText("Địa chỉ");

        jLabel7.setText("Giới tính");

        cbb_GioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nữ", "Nam" }));

        jLabel6.setText("Số ĐT");

        jLabel5.setText("Tên NV");

        btn_Huy.setText("Hủy");
        btn_Huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HuyActionPerformed(evt);
            }
        });

        btn_Sua.setText("Sửa");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        lbl_BaoLoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_BaoLoi.setForeground(new java.awt.Color(255, 51, 51));
        lbl_BaoLoi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_BaoLoi.setText("Lỗi!");
        lbl_BaoLoi.setVisible(false);

        jLabel1.setText("Ngày sinh");

        jLabel2.setText("Tên đăng nhập");

        jLabel3.setText("Mật khẩu");

        txt_MatKhau.setText("12345678");

        jLabel4.setText("CMND");

        jLabel8.setText("Tình trạng");

        cbb_Availability.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đã nghỉ việc", "Đang làm" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_BaoLoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Sua)
                        .addGap(80, 80, 80)
                        .addComponent(btn_Huy)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_TenNV, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                            .addComponent(cbb_GioiTinh, 0, 298, Short.MAX_VALUE)
                            .addComponent(txt_SoDienThoai)
                            .addComponent(txt_DiaChi)
                            .addComponent(txt_TenDangNhap)
                            .addComponent(txt_MatKhau)
                            .addComponent(dat_NgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_CMND)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbb_Availability, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_BaoLoi, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbb_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(dat_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_CMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_TenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbb_Availability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Huy)
                    .addComponent(btn_Sua))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_HuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HuyActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_HuyActionPerformed

    private void doDuLieuLenForm() {
        txt_TenNV.setText(nvCanSua.getTenNV());
        txt_SoDienThoai.setText(nvCanSua.getSoDT());
        cbb_GioiTinh.setSelectedIndex(nvCanSua.getGioiTinh());
        dat_NgaySinh.setDate(nvCanSua.getNgaySinh());
        txt_DiaChi.setText(nvCanSua.getDiaChi());
        txt_CMND.setText(nvCanSua.getCmnd());
        txt_TenDangNhap.setText(nvCanSua.getTenDangNhap());
        txt_MatKhau.setText(nvCanSua.getMatKhau());
        if(nvCanSua.isAvailable()){
            cbb_Availability.setSelectedItem("Đang làm");
        }else{
            cbb_Availability.setSelectedItem("Đã nghỉ việc");
        }
    }
    
    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        boolean avlb;
        if(cbb_Availability.getSelectedIndex() == 1){
            avlb = true;
        }else{
            avlb = false;
        }
        DTONhanVien nv = new DTONhanVien(txt_TenNV.getText(),
                txt_SoDienThoai.getText(),
                cbb_GioiTinh.getSelectedIndex(),
                dat_NgaySinh.getDate(),
                txt_CMND.getText(),
                txt_DiaChi.getText(),
                new Date(),
                txt_TenDangNhap.getText(),
                txt_MatKhau.getText(),
                2,
                avlb);
        ThongBao tb = BLLNhanVien.sua(nvCanSua.getMaNV(), nv);
        if(tb.getLoaiThongBao() == ThongBao.LOI){
            lbl_BaoLoi.setText("Lỗi! " + tb.getNoiDungThongBao());
            lbl_BaoLoi.setVisible(true);
            setSuccess(false);
        }else{
            this.dispose();
            setSuccess(true);
        }
    }//GEN-LAST:event_btn_SuaActionPerformed

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }



    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(dlg_SuaNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(dlg_SuaNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(dlg_SuaNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(dlg_SuaNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                dlg_SuaNhanVien dialog = new dlg_SuaNhanVien(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Huy;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JComboBox<String> cbb_Availability;
    private javax.swing.JComboBox<String> cbb_GioiTinh;
    private com.toedter.calendar.JDateChooser dat_NgaySinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_BaoLoi;
    private javax.swing.JFormattedTextField txt_CMND;
    private javax.swing.JFormattedTextField txt_DiaChi;
    private javax.swing.JFormattedTextField txt_MatKhau;
    private javax.swing.JFormattedTextField txt_SoDienThoai;
    private javax.swing.JFormattedTextField txt_TenDangNhap;
    private javax.swing.JTextField txt_TenNV;
    // End of variables declaration//GEN-END:variables
}