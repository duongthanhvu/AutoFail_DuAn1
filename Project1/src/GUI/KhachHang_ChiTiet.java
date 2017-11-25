/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.DTOKhachHang;
import java.awt.CardLayout;

/**
 *
 * @author vudt9
 */
public class KhachHang_ChiTiet extends javax.swing.JPanel {

    /**
     * Creates new form KhachHang_ChiTiet
     */
    public int id_KH;

    public KhachHang_ChiTiet() {
        initComponents();
        jPanel2.setVisible(false);
    }

    public KhachHang_ChiTiet(int id_KH) {
        this.id_KH = id_KH;
        initComponents();
        jPanel2.setVisible(false);
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

        jPanel2 = new javax.swing.JPanel();
        pnl_ChiTietKH = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_TenKH = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_MaKH = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_SDT = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbb_GioiTinh = new javax.swing.JComboBox<>();
        cbb_LoaiKH = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_DiaChi = new javax.swing.JTextArea();
        txt_Diem = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_GhiChu = new javax.swing.JTextArea();
        btn_LuuThayDoi = new javax.swing.JButton();
        btn_CapNhat = new javax.swing.JButton();
        btn_XemLSMuaHang = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        date_NgaySinh = new com.toedter.calendar.JDateChooser();
        pnl_ThongTinTT = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_LSMuaHang = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_Ten = new javax.swing.JLabel();
        lbl_SoDienThoai = new javax.swing.JLabel();
        lbl_Diem = new javax.swing.JLabel();
        lbl_NgayTao = new javax.swing.JLabel();
        lbl_indicator = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        jPanel2.setBackground(new java.awt.Color(239, 239, 239));
        jPanel2.setLayout(new java.awt.CardLayout());

        jLabel5.setText("Tên KH");

        txt_TenKH.setText("Dương Thành Vũ");

        jLabel6.setText("Mã KH");

        txt_MaKH.setText("DW2D5");

        jLabel7.setText("Loại KH");

        jLabel8.setText("Giới tính");

        jLabel9.setText("Số ĐT");

        txt_SDT.setText("0985390133");

        jLabel10.setText("Email");

        txt_Email.setText("vudt.93@gmail.com");

        jLabel11.setText("Địa chỉ");

        jLabel12.setText("Ngày sinh");

        jLabel13.setText("Điểm");

        jLabel14.setText("Ghi chú");

        cbb_GioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nữ", "Nam" }));

        cbb_LoaiKH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Member", "Silver", "Gold" }));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt_DiaChi.setColumns(20);
        txt_DiaChi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_DiaChi.setLineWrap(true);
        txt_DiaChi.setRows(5);
        txt_DiaChi.setText("49/7 Y Ơn, p. Tân Thành, tp. BMT, Đăk Lăk");
        txt_DiaChi.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txt_DiaChi);

        txt_Diem.setEditable(false);
        txt_Diem.setText("100");

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt_GhiChu.setColumns(20);
        txt_GhiChu.setLineWrap(true);
        txt_GhiChu.setRows(5);
        txt_GhiChu.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txt_GhiChu);

        btn_LuuThayDoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Save_24px_1.png"))); // NOI18N
        btn_LuuThayDoi.setContentAreaFilled(false);
        btn_LuuThayDoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LuuThayDoiActionPerformed(evt);
            }
        });

        btn_CapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Synchronize_24px.png"))); // NOI18N
        btn_CapNhat.setContentAreaFilled(false);

        btn_XemLSMuaHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Procurement_24px.png"))); // NOI18N
        btn_XemLSMuaHang.setContentAreaFilled(false);
        btn_XemLSMuaHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XemLSMuaHangActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

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
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(36, 36, 36)
                .addGroup(pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_SDT)
                    .addComponent(cbb_GioiTinh, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(txt_TenKH, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(txt_MaKH)
                    .addComponent(cbb_LoaiKH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ChiTietKHLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(pnl_ChiTietKHLayout.createSequentialGroup()
                        .addGroup(pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11))
                        .addGap(34, 34, 34)
                        .addGroup(pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txt_Diem, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)))
                    .addGroup(pnl_ChiTietKHLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnl_ChiTietKHLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(date_NgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_LuuThayDoi)
                    .addComponent(btn_CapNhat)
                    .addComponent(btn_XemLSMuaHang))
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
                        .addComponent(btn_XemLSMuaHang))
                    .addGroup(pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnl_ChiTietKHLayout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_Diem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(9, 9, 9)
                            .addGroup(pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12)
                                .addComponent(date_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnl_ChiTietKHLayout.createSequentialGroup()
                            .addGroup(pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txt_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txt_MaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(cbb_LoaiKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(cbb_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(txt_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(8, 8, 8)
                            .addGroup(pnl_ChiTietKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(pnl_ChiTietKH, "card3");

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
                "Ngày mua", "Trị giá hóa đơn", "Điểm cộng", "Sản phẩm đã mua"
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
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE))
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

        jPanel2.add(pnl_ThongTinTT, "card2");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        lbl_Ten.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Ten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/member.png"))); // NOI18N
        lbl_Ten.setText("<html> <h4>Dương Thành Vũ</h4> <p>DW2FS</p> </html>");
        lbl_Ten.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_Ten.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(243, 243, 243)));
        lbl_Ten.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lbl_Ten.setIconTextGap(5);

        lbl_SoDienThoai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_SoDienThoai.setText("098 539 0133");
        lbl_SoDienThoai.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(243, 243, 243)));

        lbl_Diem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Diem.setText("342");
        lbl_Diem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(243, 243, 243)));

        lbl_NgayTao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_NgayTao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NgayTao.setText("<html>\n<p>20/05/2016</p>\n<p>13:45:45</p>\n</html>");
        lbl_NgayTao.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lbl_indicator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Expand_Arrow_24px.png"))); // NOI18N

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_indicator)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbl_Diem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Ten, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_NgayTao, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_indicator)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void doDuLieuLenPanel() {
        DTOKhachHang kh = DAL.DALKhachHang.layDuLieu(id_KH);
        lbl_Ten.setText("<html>\n"
                + "<h4>" + kh.getTenKH() + "</h4>\n"
                + "<p>" + kh.getMaKH() + "</p>\n"
                + "</html>");
        switch(kh.getTenLoai()){
            case "Member": 
                lbl_Ten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/member.png")));
                break;
            case "Silver":
                lbl_Ten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/silver.png")));
                break;
            case "Gold":
                lbl_Ten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/gold.png")));
                break;
        }
        lbl_SoDienThoai.setText(kh.getSoDT());
        lbl_Diem.setText(kh.getDiem_String());
        lbl_NgayTao.setText("<html>\n"
                + "<p></p>\n"
                + "<p>" + kh.getNgayTao_String() + "</p>\n"
                + "<p>" + kh.getGioTao() + "</p>\n"
                + "</html>");
        //Set text cho phần chỉnh sửa thông tin (Done)
        txt_TenKH.setText(kh.getTenKH());
        txt_MaKH.setText(kh.getMaKH());
        cbb_LoaiKH.setSelectedItem(kh.getTenLoai());
        cbb_GioiTinh.setSelectedItem(kh.getGioiTinh());
        txt_SDT.setText(kh.getSoDT());
        txt_Email.setText(kh.getEmail());
        txt_DiaChi.setText(kh.getDiaChi());
        txt_Diem.setText(kh.getDiem_String());
        txt_GhiChu.setText(kh.getGhiChu());
        date_NgaySinh.setDate(kh.getNgaySinh());
        txt_DiaChi.setCaretPosition(0);
    }

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        if (jPanel2.isVisible()) {
            jPanel2.setVisible(false);
            lbl_indicator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Expand_Arrow_24px.png")));
        } else {
            jPanel2.setVisible(true);
            lbl_indicator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Collapse_Arrow_24px_1.png")));
        }
    }//GEN-LAST:event_jPanel1MousePressed

    private void btn_LuuThayDoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LuuThayDoiActionPerformed
        //Code kiểm tra tính hợp lệ của thông tin nhập vào

        this.setVisible(false);
        DTOKhachHang kh = new DTOKhachHang(
                txt_MaKH.getText(),
                txt_TenKH.getText(),
                cbb_LoaiKH.getSelectedItem().toString(),
                cbb_GioiTinh.getSelectedItem().toString(),
                txt_SDT.getText(),
                txt_Email.getText(),
                txt_DiaChi.getText(),
                date_NgaySinh.getDate(),
                txt_Diem.getText(),
                new java.util.Date(),
                txt_GhiChu.getText());
        XuLyThongBao.hienThiThongBao(BLL.BLLKhachHang.sua(id_KH, kh));
        doDuLieuLenPanel();
        this.setVisible(true);
    }//GEN-LAST:event_btn_LuuThayDoiActionPerformed

    private void btn_XemLSMuaHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XemLSMuaHangActionPerformed
        CardLayout cl = (CardLayout) (jPanel2.getLayout());
        cl.show(jPanel2, "card2");
    }//GEN-LAST:event_btn_XemLSMuaHangActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        CardLayout cl = (CardLayout) (jPanel2.getLayout());
        cl.show(jPanel2, "card3");
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CapNhat;
    private javax.swing.JButton btn_LuuThayDoi;
    private javax.swing.JButton btn_XemLSMuaHang;
    private javax.swing.JComboBox<String> cbb_GioiTinh;
    private javax.swing.JComboBox<String> cbb_LoaiKH;
    private com.toedter.calendar.JDateChooser date_NgaySinh;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_Diem;
    private javax.swing.JLabel lbl_NgayTao;
    private javax.swing.JLabel lbl_SoDienThoai;
    private javax.swing.JLabel lbl_Ten;
    private javax.swing.JLabel lbl_indicator;
    private javax.swing.JPanel pnl_ChiTietKH;
    private javax.swing.JPanel pnl_ThongTinTT;
    private javax.swing.JTable tbl_LSMuaHang;
    private javax.swing.JTextArea txt_DiaChi;
    private javax.swing.JTextField txt_Diem;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextArea txt_GhiChu;
    private javax.swing.JTextField txt_MaKH;
    private javax.swing.JTextField txt_SDT;
    private javax.swing.JTextField txt_TenKH;
    // End of variables declaration//GEN-END:variables
}
