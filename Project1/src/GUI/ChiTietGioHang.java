/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author vudt9
 */
public class ChiTietGioHang extends javax.swing.JPanel {

    private int maSP;
    private int giaSP;

    /**
     * Creates new form ChiTietGioHang
     */
    public ChiTietGioHang() {
        initComponents();
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public ChiTietGioHang(int maSP) {
        initComponents();
        this.maSP = maSP;
        doDuLieuLenPanel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_TenSP = new javax.swing.JLabel();
        lbl_ChietKhau = new javax.swing.JLabel();
        lbl_ThanhTien = new javax.swing.JLabel();
        btn_xoa = new javax.swing.JButton();
        spn_SoLuong = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(234, 234, 234)));

        lbl_TenSP.setText("Tên sản phẩm");
        lbl_TenSP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(234, 234, 234)));

        lbl_ChietKhau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ChietKhau.setText("Chiết khấu");
        lbl_ChietKhau.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(234, 234, 234)));

        lbl_ThanhTien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ThanhTien.setText("0");
        lbl_ThanhTien.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(234, 234, 234)));

        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Cancel_24px_1.png"))); // NOI18N
        btn_xoa.setContentAreaFilled(false);
        btn_xoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_xoaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_xoaMouseExited(evt);
            }
        });
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        spn_SoLuong.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spn_SoLuong.setBorder(null);
        spn_SoLuong.setOpaque(false);
        JFormattedTextField txt = ((JSpinner.NumberEditor) spn_SoLuong.getEditor()).getTextField();
        ((NumberFormatter) txt.getFormatter()).setAllowsInvalid(false);
        spn_SoLuong.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spn_SoLuongStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lbl_TenSP, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(spn_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl_ChietKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl_ThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_xoa)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                .addComponent(lbl_TenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(spn_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbl_ChietKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbl_ThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_xoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_xoaMouseEntered
        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Cancel_24px_2.png")));
    }//GEN-LAST:event_btn_xoaMouseEntered

    private void btn_xoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_xoaMouseExited
        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Cancel_24px_1.png")));
    }//GEN-LAST:event_btn_xoaMouseExited

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        this.setVisible(false);
        this.getParent().remove(this);
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void spn_SoLuongStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spn_SoLuongStateChanged
        int soLuong = (Integer)spn_SoLuong.getValue();
        int thanhTien = soLuong * giaSP;
        lbl_ThanhTien.setText(String.valueOf(thanhTien));
        ((Pnl_TaoHoaDon)(this.getParent().getParent().getParent().getParent().getParent())).updateTongGia();
    }//GEN-LAST:event_spn_SoLuongStateChanged

    private void doDuLieuLenPanel() {
        DTO.DTOSanPham sp = DAL.DALSanPham.layDuLieu(maSP);
        lbl_TenSP.setText(sp.getTenSP());
        lbl_ChietKhau.setText("waiting");
        lbl_ThanhTien.setText(String.valueOf(sp.getGiaBanLe()));
        giaSP = sp.getGiaBanLe();
    }
    
    public void tangSoLuong(int amount) {
        int soLuong = (Integer)spn_SoLuong.getValue() + amount;
        spn_SoLuong.setValue(soLuong);
        int thanhTien = soLuong * giaSP;
        lbl_ThanhTien.setText(String.valueOf(thanhTien));
    }
    
    public int getThanhTien() {
        return Integer.parseInt(lbl_ThanhTien.getText());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel lbl_ChietKhau;
    private javax.swing.JLabel lbl_TenSP;
    private javax.swing.JLabel lbl_ThanhTien;
    private javax.swing.JSpinner spn_SoLuong;
    // End of variables declaration//GEN-END:variables
}