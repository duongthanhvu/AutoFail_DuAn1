/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author vudt9
 */
public class Frm_Main extends javax.swing.JFrame {
    
    private JPanel pnl_TrangChu;
    private JPanel pnl_TaoHoaDon;
    private JPanel pnl_SanPham;
    private JPanel pnl_KhachHang;
    private JPanel pnl_NhapKho;
    private JPanel pnl_KhuyenMai;
    private JPanel pnl_BaoCao;
    private JPanel pnl_NhanVien;
    private static int cardNo = 1;
    /**
     * Creates new form FrmMain
     */
    public Frm_Main() {
        //Khởi tạo các panel tại đây
        pnl_TrangChu = new Pnl_TrangChu();
        pnl_TaoHoaDon = new Pnl_TaoHoaDon();
        pnl_SanPham = new Pnl_SanPham();
        pnl_KhachHang = new Pnl_KhachHang();
        pnl_NhanVien = new Pnl_NhanVien();
        pnl_NhapKho = new Pnl_TaoPhieuNhap();
        pnl_KhuyenMai = new Pnl_KhuyenMai();
        pnl_BaoCao = new Pnl_BaoCao();
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

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        pnl_bg = new javax.swing.JPanel();
        pnlMain = new javax.swing.JPanel();
        sidepanel = new javax.swing.JPanel();
        tab_TrangChu = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tab_TaoHoaDon = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tab_SanPham = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tab_KhachHang = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tab_NhapKho = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tab_KhuyenMai = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tab_BaoCao = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tab_NhanVien = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jDialog1.setTitle("Cài đặt");
        jDialog1.setMinimumSize(new java.awt.Dimension(400, 300));
        jDialog1.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        jDialog1.setResizable(false);
        jDialog1.setLocationRelativeTo(null);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jDialog2.setTitle("Giới thiệu");
        jDialog2.setMinimumSize(new java.awt.Dimension(400, 300));
        jDialog2.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        jDialog2.setLocationRelativeTo(null);

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setLayout(new java.awt.CardLayout());

        pnlMain.add(pnl_TrangChu, "card0");
        pnlMain.add(pnl_TaoHoaDon, "card1");
        pnlMain.add(pnl_SanPham, "card2");
        pnlMain.add(pnl_KhachHang, "card3");
        pnlMain.add(pnl_NhapKho, "card4");
        pnlMain.add(pnl_KhuyenMai, "card5");
        pnlMain.add(pnl_BaoCao, "card6");
        pnlMain.add(pnl_NhanVien, "card7");

        sidepanel.setBackground(new java.awt.Color(0, 76, 64));

        tab_TrangChu.setBackground(new java.awt.Color(0, 76, 64));
        tab_TrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tab_TrangChuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tab_TrangChuMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tab_TrangChuMousePressed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Home_15px.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Trang chủ");

        javax.swing.GroupLayout tab_TrangChuLayout = new javax.swing.GroupLayout(tab_TrangChu);
        tab_TrangChu.setLayout(tab_TrangChuLayout);
        tab_TrangChuLayout.setHorizontalGroup(
            tab_TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_TrangChuLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel16)
                .addGap(32, 32, 32)
                .addComponent(jLabel17)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        tab_TrangChuLayout.setVerticalGroup(
            tab_TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_TrangChuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_TrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab_TaoHoaDon.setBackground(new java.awt.Color(0, 76, 64));
        tab_TaoHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tab_TaoHoaDonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tab_TaoHoaDonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tab_TaoHoaDonMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Bill_15px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tạo hóa đơn");

        javax.swing.GroupLayout tab_TaoHoaDonLayout = new javax.swing.GroupLayout(tab_TaoHoaDon);
        tab_TaoHoaDon.setLayout(tab_TaoHoaDonLayout);
        tab_TaoHoaDonLayout.setHorizontalGroup(
            tab_TaoHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_TaoHoaDonLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        tab_TaoHoaDonLayout.setVerticalGroup(
            tab_TaoHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_TaoHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_TaoHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab_SanPham.setBackground(new java.awt.Color(0, 76, 64));
        tab_SanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tab_SanPhamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tab_SanPhamMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tab_SanPhamMousePressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Product_15px_1.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sản phẩm");

        javax.swing.GroupLayout tab_SanPhamLayout = new javax.swing.GroupLayout(tab_SanPham);
        tab_SanPham.setLayout(tab_SanPhamLayout);
        tab_SanPhamLayout.setHorizontalGroup(
            tab_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_SanPhamLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addGap(0, 95, Short.MAX_VALUE))
        );
        tab_SanPhamLayout.setVerticalGroup(
            tab_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_SanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab_KhachHang.setBackground(new java.awt.Color(0, 76, 64));
        tab_KhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tab_KhachHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tab_KhachHangMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tab_KhachHangMousePressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Customer_15px.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Khách hàng");

        javax.swing.GroupLayout tab_KhachHangLayout = new javax.swing.GroupLayout(tab_KhachHang);
        tab_KhachHang.setLayout(tab_KhachHangLayout);
        tab_KhachHangLayout.setHorizontalGroup(
            tab_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_KhachHangLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        tab_KhachHangLayout.setVerticalGroup(
            tab_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_KhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab_NhapKho.setBackground(new java.awt.Color(0, 76, 64));
        tab_NhapKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tab_NhapKhoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tab_NhapKhoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tab_NhapKhoMousePressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Truck_15px.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nhập kho");

        javax.swing.GroupLayout tab_NhapKhoLayout = new javax.swing.GroupLayout(tab_NhapKho);
        tab_NhapKho.setLayout(tab_NhapKhoLayout);
        tab_NhapKhoLayout.setHorizontalGroup(
            tab_NhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_NhapKhoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addGap(32, 32, 32)
                .addComponent(jLabel8)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        tab_NhapKhoLayout.setVerticalGroup(
            tab_NhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_NhapKhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_NhapKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab_KhuyenMai.setBackground(new java.awt.Color(0, 76, 64));
        tab_KhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MaiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tab_KhuyenMaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tab_KhuyenMaiMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tab_KhuyenMaiMousePressed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Gift_15px.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Khuyến mãi");

        javax.swing.GroupLayout tab_KhuyenMaiLayout = new javax.swing.GroupLayout(tab_KhuyenMai);
        tab_KhuyenMai.setLayout(tab_KhuyenMaiLayout);
        tab_KhuyenMaiLayout.setHorizontalGroup(
            tab_KhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_KhuyenMaiLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addGap(32, 32, 32)
                .addComponent(jLabel10)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        tab_KhuyenMaiLayout.setVerticalGroup(
            tab_KhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_KhuyenMaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_KhuyenMaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab_BaoCao.setBackground(new java.awt.Color(0, 76, 64));
        tab_BaoCao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tab_BaoCaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tab_BaoCaoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tab_BaoCaoMousePressed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Increase_15px.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Báo cáo");

        javax.swing.GroupLayout tab_BaoCaoLayout = new javax.swing.GroupLayout(tab_BaoCao);
        tab_BaoCao.setLayout(tab_BaoCaoLayout);
        tab_BaoCaoLayout.setHorizontalGroup(
            tab_BaoCaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_BaoCaoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel11)
                .addGap(32, 32, 32)
                .addComponent(jLabel12)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        tab_BaoCaoLayout.setVerticalGroup(
            tab_BaoCaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_BaoCaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_BaoCaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab_NhanVien.setBackground(new java.awt.Color(0, 76, 64));
        tab_NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tab_NhanVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tab_NhanVienMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tab_NhanVienMousePressed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Name_Tag_15px.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nhân viên");

        javax.swing.GroupLayout tab_NhanVienLayout = new javax.swing.GroupLayout(tab_NhanVien);
        tab_NhanVien.setLayout(tab_NhanVienLayout);
        tab_NhanVienLayout.setHorizontalGroup(
            tab_NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_NhanVienLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel13)
                .addGap(32, 32, 32)
                .addComponent(jLabel14)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        tab_NhanVienLayout.setVerticalGroup(
            tab_NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_NhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab_NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel15.setBackground(new java.awt.Color(0, 76, 64));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Exit_24px.png"))); // NOI18N
        jLabel15.setToolTipText("Đăng xuất");
        jLabel15.setOpaque(true);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel15MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });

        javax.swing.GroupLayout sidepanelLayout = new javax.swing.GroupLayout(sidepanel);
        sidepanel.setLayout(sidepanelLayout);
        sidepanelLayout.setHorizontalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tab_TaoHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab_NhapKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab_KhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab_BaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tab_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidepanelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tab_TrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidepanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tab_BaoCao, tab_KhachHang, tab_KhuyenMai, tab_NhanVien, tab_NhapKho, tab_SanPham, tab_TaoHoaDon});

        sidepanelLayout.setVerticalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(tab_TrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tab_TaoHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tab_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tab_KhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tab_NhapKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tab_KhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tab_BaoCao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tab_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        sidepanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tab_BaoCao, tab_KhachHang, tab_KhuyenMai, tab_NhanVien, tab_NhapKho, tab_SanPham, tab_TaoHoaDon});

        javax.swing.GroupLayout pnl_bgLayout = new javax.swing.GroupLayout(pnl_bg);
        pnl_bg.setLayout(pnl_bgLayout);
        pnl_bgLayout.setHorizontalGroup(
            pnl_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_bgLayout.createSequentialGroup()
                .addComponent(sidepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        pnl_bgLayout.setVerticalGroup(
            pnl_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tab_TaoHoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_TaoHoaDonMouseEntered
        tab_TaoHoaDon.setBackground(new java.awt.Color(0, 121, 107));
    }//GEN-LAST:event_tab_TaoHoaDonMouseEntered

    private void tab_TaoHoaDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_TaoHoaDonMouseExited
        tab_TaoHoaDon.setBackground(new java.awt.Color(0, 76, 64));
    }//GEN-LAST:event_tab_TaoHoaDonMouseExited

    private void tab_SanPhamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_SanPhamMouseEntered
        tab_SanPham.setBackground(new java.awt.Color(0, 121, 107));
    }//GEN-LAST:event_tab_SanPhamMouseEntered

    private void tab_KhachHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_KhachHangMouseEntered
        tab_KhachHang.setBackground(new java.awt.Color(0, 121, 107));
    }//GEN-LAST:event_tab_KhachHangMouseEntered

    private void tab_NhapKhoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_NhapKhoMouseEntered
        tab_NhapKho.setBackground(new java.awt.Color(0, 121, 107));
    }//GEN-LAST:event_tab_NhapKhoMouseEntered

    private void tab_KhuyenMaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_KhuyenMaiMouseEntered
        tab_KhuyenMai.setBackground(new java.awt.Color(0, 121, 107));
    }//GEN-LAST:event_tab_KhuyenMaiMouseEntered

    private void tab_BaoCaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_BaoCaoMouseEntered
        tab_BaoCao.setBackground(new java.awt.Color(0, 121, 107));
    }//GEN-LAST:event_tab_BaoCaoMouseEntered

    private void tab_NhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_NhanVienMouseEntered
        tab_NhanVien.setBackground(new java.awt.Color(0, 121, 107));
    }//GEN-LAST:event_tab_NhanVienMouseEntered

    private void tab_SanPhamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_SanPhamMouseExited
        tab_SanPham.setBackground(new java.awt.Color(0, 76, 64));
    }//GEN-LAST:event_tab_SanPhamMouseExited

    private void tab_KhachHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_KhachHangMouseExited
        tab_KhachHang.setBackground(new java.awt.Color(0, 76, 64));
    }//GEN-LAST:event_tab_KhachHangMouseExited

    private void tab_NhapKhoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_NhapKhoMouseExited
        tab_NhapKho.setBackground(new java.awt.Color(0, 76, 64));
    }//GEN-LAST:event_tab_NhapKhoMouseExited

    private void tab_KhuyenMaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_KhuyenMaiMouseExited
        tab_KhuyenMai.setBackground(new java.awt.Color(0, 76, 64));
    }//GEN-LAST:event_tab_KhuyenMaiMouseExited

    private void tab_BaoCaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_BaoCaoMouseExited
        tab_BaoCao.setBackground(new java.awt.Color(0, 76, 64));
    }//GEN-LAST:event_tab_BaoCaoMouseExited

    private void tab_NhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_NhanVienMouseExited
        tab_NhanVien.setBackground(new java.awt.Color(0, 76, 64));
    }//GEN-LAST:event_tab_NhanVienMouseExited

    private void MaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaiMouseClicked
        
    }//GEN-LAST:event_MaiMouseClicked

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        jLabel15.setBackground(new java.awt.Color(0, 121, 107));
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        jLabel15.setBackground(new java.awt.Color(0, 76, 64));
    }//GEN-LAST:event_jLabel15MouseExited

    private void tab_TrangChuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_TrangChuMouseEntered
        tab_TrangChu.setBackground(new java.awt.Color(0, 121, 107));
    }//GEN-LAST:event_tab_TrangChuMouseEntered

    private void tab_TrangChuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_TrangChuMouseExited
        tab_TrangChu.setBackground(new java.awt.Color(0, 76, 64));
    }//GEN-LAST:event_tab_TrangChuMouseExited

    private void tab_TrangChuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_TrangChuMousePressed
        thayDoiPanel("card0", tab_TrangChu);
    }//GEN-LAST:event_tab_TrangChuMousePressed

    private void tab_TaoHoaDonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_TaoHoaDonMousePressed
        thayDoiPanel("card1", tab_TaoHoaDon);
    }//GEN-LAST:event_tab_TaoHoaDonMousePressed

    private void tab_SanPhamMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_SanPhamMousePressed
        thayDoiPanel("card2", tab_SanPham);
    }//GEN-LAST:event_tab_SanPhamMousePressed

    private void tab_KhachHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_KhachHangMousePressed
        thayDoiPanel("card3", tab_KhachHang);
    }//GEN-LAST:event_tab_KhachHangMousePressed

    private void tab_NhapKhoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_NhapKhoMousePressed
        thayDoiPanel("card4", tab_NhapKho);
    }//GEN-LAST:event_tab_NhapKhoMousePressed

    private void tab_KhuyenMaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_KhuyenMaiMousePressed
        thayDoiPanel("card5", tab_KhuyenMai);
    }//GEN-LAST:event_tab_KhuyenMaiMousePressed

    private void tab_BaoCaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_BaoCaoMousePressed
        thayDoiPanel("card6", tab_BaoCao);
    }//GEN-LAST:event_tab_BaoCaoMousePressed

    private void tab_NhanVienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab_NhanVienMousePressed
        thayDoiPanel("card7", tab_NhanVien);
    }//GEN-LAST:event_tab_NhanVienMousePressed

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        Frm_Login login = new Frm_Login();
        login.setVisible(true);
        login.doiThe();
        this.setVisible(false);
    }//GEN-LAST:event_jLabel15MousePressed
    
    private void thayDoiPanel(String tenCard, JPanel tab) {
        CardLayout cl = (CardLayout) (pnlMain.getLayout());
        cl.show(pnlMain, tenCard);
        tab_TrangChu.setBorder(null);
        tab_TaoHoaDon.setBorder(null);
        tab_SanPham.setBorder(null);
        tab_KhachHang.setBorder(null);
        tab_KhuyenMai.setBorder(null);
        tab_NhanVien.setBorder(null);
        tab_NhapKho.setBorder(null);
        tab_BaoCao.setBorder(null);
        tab.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new java.awt.Color(255, 255, 255)));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String tenUser) {
        /* Set System look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            // Set System L&F
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Frm_Main frm = new Frm_Main();
                frm.setTitle("Phần mềm quản lý bán hàng v1.0 - Nhân viên hiện tại: " + tenUser);
                frm.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnl_bg;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JPanel tab_BaoCao;
    private javax.swing.JPanel tab_KhachHang;
    private javax.swing.JPanel tab_KhuyenMai;
    private javax.swing.JPanel tab_NhanVien;
    private javax.swing.JPanel tab_NhapKho;
    private javax.swing.JPanel tab_SanPham;
    private javax.swing.JPanel tab_TaoHoaDon;
    private javax.swing.JPanel tab_TrangChu;
    // End of variables declaration//GEN-END:variables
}
