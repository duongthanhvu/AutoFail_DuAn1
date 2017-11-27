/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAL.DALSanPham;
import DTO.DTOSanPham;
import DTO.ThongBao;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author vudt9
 */
public class Pnl_TaoPhieuNhap extends javax.swing.JPanel {

    private int maNCC = 1;

    /**
     * Creates new form CommonPanel
     */
    public Pnl_TaoPhieuNhap() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popMenuTimKiem = new javax.swing.JPopupMenu();
        jPanel2 = new javax.swing.JPanel();
        SearchBar = new javax.swing.JPanel();
        txtKhungTimKiem = new javax.swing.JTextField();
        btn_Search = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_TongTien = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pnl_bg = new javax.swing.JPanel();
        pnl_Header = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btn_ThanhToan = new javax.swing.JButton();
        btn_TaoMoi = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        SearchBar.setBackground(new java.awt.Color(255, 255, 255));
        SearchBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtKhungTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtKhungTimKiem.setToolTipText("");
        txtKhungTimKiem.setBorder(null);
        txtKhungTimKiem.setSelectionColor(new java.awt.Color(72, 169, 153));
        GhostText queryInput = new GhostText(txtKhungTimKiem, "Tìm kiếm");
        txtKhungTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKhungTimKiemKeyReleased(evt);
            }
        });

        btn_Search.setBackground(new java.awt.Color(255, 255, 255));
        btn_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Search_24px.png"))); // NOI18N
        btn_Search.setContentAreaFilled(false);
        btn_Search.setOpaque(true);
        btn_Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SearchMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SearchBarLayout = new javax.swing.GroupLayout(SearchBar);
        SearchBar.setLayout(SearchBarLayout);
        SearchBarLayout.setHorizontalGroup(
            SearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchBarLayout.createSequentialGroup()
                .addComponent(txtKhungTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(btn_Search))
        );
        SearchBarLayout.setVerticalGroup(
            SearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchBarLayout.createSequentialGroup()
                .addGroup(SearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_Search, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtKhungTimKiem, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lbl_TongTien.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_TongTien.setText("0");
        lbl_TongTien.setToolTipText("");
        lbl_TongTien.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lbl_TongTienPropertyChange(evt);
            }
        });

        jScrollPane2.setBorder(null);
        jScrollPane2.setOpaque(false);

        pnl_bg.setBackground(new java.awt.Color(255, 255, 255));
        pnl_bg.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                pnl_bgComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                pnl_bgComponentRemoved(evt);
            }
        });
        pnl_bg.setLayout(new javax.swing.BoxLayout(pnl_bg, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane2.setViewportView(pnl_bg);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Số lượng");
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(255, 255, 255)));

        jLabel14.setText("Tên sản phẩm");
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(255, 255, 255)));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Thành tiền");
        jLabel17.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(255, 255, 255)));

        jLabel18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout pnl_HeaderLayout = new javax.swing.GroupLayout(pnl_Header);
        pnl_Header.setLayout(pnl_HeaderLayout);
        pnl_HeaderLayout.setHorizontalGroup(
            pnl_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_HeaderLayout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_HeaderLayout.setVerticalGroup(
            pnl_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_HeaderLayout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btn_ThanhToan.setBackground(new java.awt.Color(0, 76, 64));
        btn_ThanhToan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_ThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        btn_ThanhToan.setText("Tạo phiếu nhập");
        btn_ThanhToan.setToolTipText("");
        btn_ThanhToan.setBorder(null);
        btn_ThanhToan.setContentAreaFilled(false);
        btn_ThanhToan.setOpaque(true);
        btn_ThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThanhToanActionPerformed(evt);
            }
        });

        btn_TaoMoi.setBackground(new java.awt.Color(0, 76, 64));
        btn_TaoMoi.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_TaoMoi.setForeground(new java.awt.Color(255, 255, 255));
        btn_TaoMoi.setText("Tạo mới");
        btn_TaoMoi.setBorder(null);
        btn_TaoMoi.setContentAreaFilled(false);
        btn_TaoMoi.setOpaque(true);
        btn_TaoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TaoMoiActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Nhập hàng");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(pnl_Header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(145, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 135, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_TongTien)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_TaoMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(btn_ThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SearchBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addGap(54, 54, 54)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_TongTien)
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_TaoMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void diChuotVaoNutSearch(boolean check) {
        if (check) {
            btn_Search.setBackground(new Color(0, 76, 64));
            btn_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Search_24px_1.png")));
        } else {
            btn_Search.setBackground(Color.WHITE);
            btn_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Search_24px.png")));
        }
    }

    private void btn_SearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchMouseEntered
        diChuotVaoNutSearch(true);
    }//GEN-LAST:event_btn_SearchMouseEntered

    private void btn_SearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchMouseExited
        diChuotVaoNutSearch(false);
    }//GEN-LAST:event_btn_SearchMouseExited

    private void btn_TaoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TaoMoiActionPerformed
        this.removeAll();
        initComponents();
//        loadThongTinKH(1);
    }//GEN-LAST:event_btn_TaoMoiActionPerformed

    private void txtKhungTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKhungTimKiemKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            popMenuTimKiem.requestFocus();
            return;
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int maSP = DAL.DALSanPham.layMaSPQuaBarcode(txtKhungTimKiem.getText());
            if(maSP != -1){
                txtKhungTimKiem.setText("");
                themSPVaoGioHang(maSP);
            }else{
                XuLyThongBao.hienThiThongBao(new ThongBao("Mã vạch không đúng", ThongBao.LOI));
                return;
            }
        }
        String keyWord = txtKhungTimKiem.getText();
        DTOSanPham arrItem[] = DALSanPham.searchBy(keyWord);
        popMenuTimKiem.removeAll();
        popMenuTimKiem.setVisible(false);
        for (DTOSanPham item : arrItem) {
            CustomMenuItem menuItem = new CustomMenuItem(item.getMaSP(), item.getTenSP(), true);
            //Thêm sự kiện cho menuItem: khi click vào item -> đổ thông tin sản phẩm tương ứng lên form
            menuItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtKhungTimKiem.setText("");
                    themSPVaoGioHang(item.getMaSP());
                }
            });
            popMenuTimKiem.add(menuItem);
        }
        popMenuTimKiem.show(txtKhungTimKiem, 0, txtKhungTimKiem.getHeight());
        txtKhungTimKiem.requestFocus();
    }//GEN-LAST:event_txtKhungTimKiemKeyReleased

    private void btn_ThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThanhToanActionPerformed
        int soLuongSP = pnl_bg.getComponentCount();
        if (soLuongSP == 0) {
            XuLyThongBao.hienThiThongBao(new ThongBao("Không có sản phẩm nào trong giỏ hàng!", ThongBao.LOI));
            return;
        }
        //Transaction tạo phiếu nhập
        int tongTien = Integer.parseInt(lbl_TongTien.getText());
        DTO.DTOSanPhamNhap[] dsSanPham = new DTO.DTOSanPhamNhap[pnl_bg.getComponentCount()];
        for (int i = 0; i < pnl_bg.getComponentCount(); i++) {
            dsSanPham[i].setMaSP(((ChiTietSPNhap) pnl_bg.getComponent(i)).getMaSP());
            dsSanPham[i].setSoLuong(((ChiTietSPNhap) pnl_bg.getComponent(i)).getSoLuongNhap());
            dsSanPham[i].setGiaNhap(((ChiTietSPNhap) pnl_bg.getComponent(i)).getDonGiaNhap());
        }
        ThongBao tb = DAL.DALPhieuNhap.taoPhieuNhapTransaction(maNCC, Frm_Login.maNVPhienHienTai, dsSanPham, tongTien);
        if (tb.getLoaiThongBao() == ThongBao.LOI) {
            XuLyThongBao.hienThiThongBao(tb);
        } else {
            this.removeAll();
            initComponents();
        }
    }//GEN-LAST:event_btn_ThanhToanActionPerformed

    private void pnl_bgComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_pnl_bgComponentAdded

    }//GEN-LAST:event_pnl_bgComponentAdded

    private void pnl_bgComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_pnl_bgComponentRemoved

    }//GEN-LAST:event_pnl_bgComponentRemoved

    private void lbl_TongTienPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lbl_TongTienPropertyChange
        int tongTien = Integer.parseInt(lbl_TongTien.getText());
        int thue = tongTien / 10;
        int tienChuaThue = tongTien - thue;
        //        lbl_TongChuaThue.setText(String.valueOf(tienChuaThue));
        //        lbl_Thue.setText(String.valueOf(thue));
    }//GEN-LAST:event_lbl_TongTienPropertyChange

    private void themSPVaoGioHang(int maSP) {
//        pnl_bg.setVisible(false);
        int slMatHang = pnl_bg.getComponentCount();
        for (int i = 0; i < slMatHang; i++) {
            ChiTietSPNhap ctsp = (ChiTietSPNhap) pnl_bg.getComponent(i);
            if (maSP == ctsp.getMaSP()) {
                ctsp.tangSoLuong(1);
                return;
            }
        }
        JPanel card = new ChiTietSPNhap(maSP);
        pnl_bg.add(card);
        pnl_bg.revalidate();
    }


    public JLabel getLblTongGia() {
        return lbl_TongTien;
    }

//    public void loadThongTinKH(int id_KH) {
//        DTO.DTOKhachHang kh = DAL.DALKhachHang.layDuLieu(id_KH);
//        this.id_KH = id_KH;
//        DTO.DTOChuongTrinhKM[] arrKM = DAL.DALChuongTrinhKM.layKMDuocApDung(kh.getMaLoaiKH());
//        arrMaKM = new int[arrKM.length];
//        for (int i = 0; i < arrMaKM.length; i++) {
//            arrMaKM[i] = arrKM[i].getMaKhuyenMai();
//        }
////        pnl_KhuyenMai.removeAll();
////        for (DTO.DTOChuongTrinhKM item : arrKM) {
////            JCheckBox chkKM = new JCheckBox(item.getTenKM());
////            chkKM.setSelected(true);
////            pnl_KhuyenMai.add(chkKM);
////        }
////        txt_TenKH.setText(kh.getTenKH());
////        txt_MaKH.setText(kh.getMaKH());
////        txt_DiaChi.setText(kh.getDiaChi());
////        txt_SoDT.setText(kh.getSoDT());
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SearchBar;
    private javax.swing.JButton btn_Search;
    private javax.swing.JButton btn_TaoMoi;
    private javax.swing.JButton btn_ThanhToan;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_TongTien;
    private javax.swing.JPanel pnl_Header;
    private javax.swing.JPanel pnl_bg;
    private javax.swing.JPopupMenu popMenuTimKiem;
    private javax.swing.JTextField txtKhungTimKiem;
    // End of variables declaration//GEN-END:variables
}
