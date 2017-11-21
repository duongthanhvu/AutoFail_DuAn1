/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.DTOSanPham;
import java.awt.CardLayout;

/**
 *
 * @author vudt9
 */
public class SanPham_ChiTiet extends javax.swing.JPanel {

    /**
     * Creates new form KhachHang_ChiTiet
     */
    public int maSP;

    public SanPham_ChiTiet() {
        initComponents();
        pnl_MoRong.setVisible(false);
    }

    public SanPham_ChiTiet(int maSP) {
        this.maSP = maSP;
        initComponents();
        pnl_MoRong.setVisible(false);
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

        pnl_MoRong = new javax.swing.JPanel();
        pnl_ChiTietKH = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_TenSP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_Barcode = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_GiaBanLe = new javax.swing.JTextField();
        cbb_TinhTrang = new javax.swing.JComboBox<>();
        cbb_LoaiSP = new javax.swing.JComboBox<>();
        btn_LuuThayDoi = new javax.swing.JButton();
        btn_CapNhat = new javax.swing.JButton();
        btn_XemKho = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        pnl_AnhSP = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btn_ChangePP = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lbl_AnhSP = new javax.swing.JLabel();
        pnl_ThongTinTT = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_LSMuaHang = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        pnl_Goc = new javax.swing.JPanel();
        lbl_Ten = new javax.swing.JLabel();
        lbl_Gia = new javax.swing.JLabel();
        lbl_SoLuong = new javax.swing.JLabel();
        lbl_TinhTrang = new javax.swing.JLabel();
        lbl_indicator = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        pnl_MoRong.setBackground(new java.awt.Color(239, 239, 239));
        pnl_MoRong.setLayout(new java.awt.CardLayout());

        jLabel5.setText("Tên SP");

        txt_TenSP.setText("Sữa bột ABCXYZ");

        jLabel6.setText("Barcode");

        txt_Barcode.setText("DW2D5");

        jLabel7.setText("Loại SP");

        jLabel8.setText("Tình trạng");

        jLabel9.setText("Giá bán lẻ");

        txt_GiaBanLe.setText("0985390133");

        cbb_TinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nữ", "Nam" }));

        cbb_LoaiSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Member", "Silver", "Gold" }));

        btn_LuuThayDoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Save_24px_1.png"))); // NOI18N
        btn_LuuThayDoi.setContentAreaFilled(false);
        btn_LuuThayDoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LuuThayDoiActionPerformed(evt);
            }
        });

        btn_CapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Synchronize_24px.png"))); // NOI18N
        btn_CapNhat.setContentAreaFilled(false);

        btn_XemKho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Procurement_24px.png"))); // NOI18N
        btn_XemKho.setContentAreaFilled(false);
        btn_XemKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XemKhoActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        pnl_AnhSP.setLayout(new javax.swing.OverlayLayout(pnl_AnhSP));

        jPanel5.setOpaque(false);
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });

        btn_ChangePP.setBackground(new java.awt.Color(0, 76, 64));
        btn_ChangePP.setForeground(new java.awt.Color(255, 255, 255));
        btn_ChangePP.setText("Thay đổi ảnh");
        btn_ChangePP.setContentAreaFilled(false);
        btn_ChangePP.setOpaque(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btn_ChangePP, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(51, Short.MAX_VALUE)
                    .addComponent(btn_ChangePP)
                    .addContainerGap(52, Short.MAX_VALUE)))
        );

        jPanel5.setVisible(false);

        pnl_AnhSP.add(jPanel5);

        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
        });

        lbl_AnhSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_AnhSP, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_AnhSP, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
        );

        pnl_AnhSP.add(jPanel4);

        javax.swing.GroupLayout pnl_ChiTietKHLayout = new javax.swing.GroupLayout(pnl_ChiTietKH);
        pnl_ChiTietKH.setLayout(pnl_ChiTietKHLayout);
        pnl_ChiTietKHLayout.setHorizontalGroup(
            pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ChiTietKHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(36, 36, 36)
                .addGroup(pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_GiaBanLe)
                    .addComponent(cbb_TinhTrang, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_TenSP, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(txt_Barcode)
                    .addComponent(cbb_LoaiSP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(pnl_AnhSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_LuuThayDoi)
                    .addComponent(btn_CapNhat)
                    .addComponent(btn_XemKho))
                .addContainerGap())
        );
        pnl_ChiTietKHLayout.setVerticalGroup(
            pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ChiTietKHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_ChiTietKHLayout.createSequentialGroup()
                        .addComponent(btn_LuuThayDoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_CapNhat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_XemKho))
                    .addGroup(pnl_ChiTietKHLayout.createSequentialGroup()
                        .addGroup(pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_TenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_Barcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbb_LoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbb_TinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_GiaBanLe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnl_AnhSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_MoRong.add(pnl_ChiTietKH, "card3");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Synchronize_24px.png"))); // NOI18N
        jButton6.setContentAreaFilled(false);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Edit_24px.png"))); // NOI18N
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jScrollPane3.setBorder(null);
        jScrollPane3.setOpaque(false);

        tbl_LSMuaHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tbl_LSMuaHang);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Lịch sử mua hàng");

        javax.swing.GroupLayout pnl_ThongTinTTLayout = new javax.swing.GroupLayout(pnl_ThongTinTT);
        pnl_ThongTinTT.setLayout(pnl_ThongTinTTLayout);
        pnl_ThongTinTTLayout.setHorizontalGroup(
            pnl_ThongTinTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ThongTinTTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ThongTinTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_ThongTinTTLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ThongTinTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap())
        );
        pnl_ThongTinTTLayout.setVerticalGroup(
            pnl_ThongTinTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ThongTinTTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ThongTinTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_ThongTinTTLayout.createSequentialGroup()
                        .addGroup(pnl_ThongTinTTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_ThongTinTTLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_ThongTinTTLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pnl_MoRong.add(pnl_ThongTinTT, "card2");

        pnl_Goc.setBackground(new java.awt.Color(255, 255, 255));
        pnl_Goc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_GocMousePressed(evt);
            }
        });

        lbl_Ten.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Ten.setText("Sữa bột ABCXYZ");
        lbl_Ten.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(243, 243, 243)));
        lbl_Ten.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lbl_Ten.setIconTextGap(5);

        lbl_Gia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Gia.setText("100 000 VND");
        lbl_Gia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(243, 243, 243)));

        lbl_SoLuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_SoLuong.setText("342");
        lbl_SoLuong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(243, 243, 243)));

        lbl_TinhTrang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_TinhTrang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_TinhTrang.setText("Ngừng kinh doanh");

        lbl_indicator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Expand_Arrow_24px.png"))); // NOI18N

        javax.swing.GroupLayout pnl_GocLayout = new javax.swing.GroupLayout(pnl_Goc);
        pnl_Goc.setLayout(pnl_GocLayout);
        pnl_GocLayout.setHorizontalGroup(
            pnl_GocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_GocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Ten, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Gia, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_TinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_indicator)
                .addContainerGap())
        );
        pnl_GocLayout.setVerticalGroup(
            pnl_GocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_GocLayout.createSequentialGroup()
                .addGroup(pnl_GocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbl_SoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Ten, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(lbl_Gia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_TinhTrang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnl_GocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_indicator)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Goc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_MoRong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_Goc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_MoRong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void doDuLieuLenPanel() {
        DTOSanPham sp = DAL.DALSanPham.layDuLieu(maSP);
        lbl_Ten.setText(sp.getTenSP());
        lbl_Gia.setText(sp.getGiaBanLe_Formatted());
        lbl_SoLuong.setText("");
        lbl_TinhTrang.setText(sp.getTinhTrang());
        //Set text cho phần chỉnh sửa thông tin (Done)
        txt_TenSP.setText(sp.getTenSP());
        txt_Barcode.setText(sp.getBarcode());
        cbb_LoaiSP.setSelectedItem(sp.getTenLoai());
        cbb_TinhTrang.setSelectedItem(sp.getTinhTrang());
        txt_GiaBanLe.setText(sp.getGiaBanLe_String());
        lbl_AnhSP.setIcon(new GetImageHelper().getImgSP(maSP, 80, 120));
    }

    private void pnl_GocMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_GocMousePressed
        if (pnl_MoRong.isVisible()) {
            pnl_MoRong.setVisible(false);
            lbl_indicator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Expand_Arrow_24px.png")));
        } else {
            pnl_MoRong.setVisible(true);
            lbl_indicator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Collapse_Arrow_24px_1.png")));
        }
    }//GEN-LAST:event_pnl_GocMousePressed

    private void btn_LuuThayDoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LuuThayDoiActionPerformed
        //Code kiểm tra tính hợp lệ của thông tin nhập vào

        this.setVisible(false);
        DTOSanPham sp = new DTOSanPham(txt_TenSP.getText(), 1, txt_GiaBanLe.getText(), txt_Barcode.getText(),cbb_TinhTrang.getSelectedItem().toString());
        XuLyThongBao.hienThiThongBao(BLL.BLLSanPham.sua(maSP, sp));
        doDuLieuLenPanel();
        this.setVisible(true);
    }//GEN-LAST:event_btn_LuuThayDoiActionPerformed

    private void btn_XemKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XemKhoActionPerformed
        CardLayout cl = (CardLayout) (pnl_MoRong.getLayout());
        cl.show(pnl_MoRong, "card2");
    }//GEN-LAST:event_btn_XemKhoActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        CardLayout cl = (CardLayout) (pnl_MoRong.getLayout());
        cl.show(pnl_MoRong, "card3");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        jPanel5.setVisible(true);
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        jPanel5.setVisible(false);
    }//GEN-LAST:event_jPanel5MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CapNhat;
    private javax.swing.JButton btn_ChangePP;
    private javax.swing.JButton btn_LuuThayDoi;
    private javax.swing.JButton btn_XemKho;
    private javax.swing.JComboBox<String> cbb_LoaiSP;
    private javax.swing.JComboBox<String> cbb_TinhTrang;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_AnhSP;
    private javax.swing.JLabel lbl_Gia;
    private javax.swing.JLabel lbl_SoLuong;
    private javax.swing.JLabel lbl_Ten;
    private javax.swing.JLabel lbl_TinhTrang;
    private javax.swing.JLabel lbl_indicator;
    private javax.swing.JPanel pnl_AnhSP;
    private javax.swing.JPanel pnl_ChiTietKH;
    private javax.swing.JPanel pnl_Goc;
    private javax.swing.JPanel pnl_MoRong;
    private javax.swing.JPanel pnl_ThongTinTT;
    private javax.swing.JTable tbl_LSMuaHang;
    private javax.swing.JTextField txt_Barcode;
    private javax.swing.JTextField txt_GiaBanLe;
    private javax.swing.JTextField txt_TenSP;
    // End of variables declaration//GEN-END:variables
}