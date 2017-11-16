/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.FlowLayout;
import javax.swing.JPanel;

/**
 *
 * @author vudt9
 */
public class Pnl_KhachHang extends javax.swing.JPanel {

    /**
     * Creates new form Pnl_KhachHang
     */
    public Pnl_KhachHang() {
        initComponents();
        int[] mangID = new int[2];
        mangID[0] = 1;
        mangID[1] = 2;
        capNhatDanhSachKH(mangID);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        lbl_Ten = new javax.swing.JLabel();
        lbl_SoDienThoai = new javax.swing.JLabel();
        lbl_Diem = new javax.swing.JLabel();
        lbl_NgayTao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnl_bg = new javax.swing.JPanel();
        btn_ThemKH = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Danh sách khách hàng");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Member", "Silver", "Gold" }));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_Ten.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lbl_Ten.setText("Tên khách hàng");
        lbl_Ten.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(243, 243, 243)));

        lbl_SoDienThoai.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lbl_SoDienThoai.setText("Số điện thoại");
        lbl_SoDienThoai.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(243, 243, 243)));

        lbl_Diem.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lbl_Diem.setText("Điểm");
        lbl_Diem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(243, 243, 243)));

        lbl_NgayTao.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        lbl_NgayTao.setText("Ngày tạo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Ten, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Diem, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_NgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbl_Diem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Ten, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_NgayTao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(null);

        pnl_bg.setLayout(new javax.swing.BoxLayout(pnl_bg, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(pnl_bg);

        btn_ThemKH.setBackground(new java.awt.Color(0, 76, 64));
        btn_ThemKH.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_ThemKH.setForeground(new java.awt.Color(255, 255, 255));
        btn_ThemKH.setText("Thêm khách hàng");
        btn_ThemKH.setContentAreaFilled(false);
        btn_ThemKH.setOpaque(true);
        btn_ThemKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemKHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btn_ThemKH)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ThemKH))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ThemKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemKHActionPerformed
        dlg_ThemKhachHang themKH_dlg = new dlg_ThemKhachHang(null, true);
        themKH_dlg.setLocationRelativeTo(this);
        themKH_dlg.setVisible(true);
    }//GEN-LAST:event_btn_ThemKHActionPerformed

    private void capNhatDanhSachKH(int[] id_KH) {
        for (int i = 0; i < id_KH.length; i++) {
            pnl_bg.setVisible(false);
            JPanel card = new KhachHang_ChiTiet(id_KH[i]);
            pnl_bg.add(card);
            pnl_bg.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ThemKH;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Diem;
    private javax.swing.JLabel lbl_NgayTao;
    private javax.swing.JLabel lbl_SoDienThoai;
    private javax.swing.JLabel lbl_Ten;
    private javax.swing.JPanel pnl_bg;
    // End of variables declaration//GEN-END:variables
}