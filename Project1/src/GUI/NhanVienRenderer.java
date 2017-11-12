/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author vudt9
 */
public class NhanVienRenderer extends javax.swing.JPanel implements TableCellRenderer{

    /**
     * Creates new form NhanVienRenderer
     */
    public NhanVienRenderer() {
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

        lbl_Ten = new javax.swing.JLabel();
        lbl_GioiTinh = new javax.swing.JLabel();
        lbl_NgaySinh = new javax.swing.JLabel();
        lbl_CMND = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lbl_DiaChi = new javax.swing.JLabel();
        lbl_NgayTao = new javax.swing.JLabel();
        lbl_SoDienThoai = new javax.swing.JLabel();

        lbl_Ten.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Ten.setText("Nguyễn Văn Tuấn");

        lbl_GioiTinh.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lbl_GioiTinh.setText("Giới tính: Nam");

        lbl_NgaySinh.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lbl_NgaySinh.setText("Ngày sinh: 20/08/1993");

        lbl_CMND.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lbl_CMND.setText("CMND: 43234234");

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new javax.swing.OverlayLayout(jPanel1));

        jPanel3.setOpaque(false);

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nhân viên");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Đã nghỉ việc");
        jLabel2.setToolTipText("");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel3);

        jPanel2.setOpaque(false);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/NhanVien_Pictures/nv1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);

        lbl_DiaChi.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lbl_DiaChi.setText("Địa chỉ: 23/23 dfadfsd, tp BMT, Đăc Lăc");
        lbl_DiaChi.setToolTipText("");

        lbl_NgayTao.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lbl_NgayTao.setText("Ngày tạo: 20/08/1993");

        lbl_SoDienThoai.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        lbl_SoDienThoai.setText("SĐT: 098234234");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Ten, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_GioiTinh)
                    .addComponent(lbl_NgaySinh)
                    .addComponent(lbl_CMND)
                    .addComponent(lbl_DiaChi)
                    .addComponent(lbl_NgayTao)
                    .addComponent(lbl_SoDienThoai))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Ten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_GioiTinh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_NgaySinh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_CMND)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_DiaChi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_SoDienThoai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_NgayTao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (isSelected) {
            this.setBackground(table.getSelectionBackground());
            setTextColor(Color.WHITE);
        } else {
            this.setBackground(table.getBackground());
            setTextColor(Color.BLACK);
        }
        return this;
    }
    
    public void setTextColor(Color color){
        lbl_CMND.setForeground(color);
        lbl_DiaChi.setForeground(color);
        lbl_GioiTinh.setForeground(color);
        lbl_NgaySinh.setForeground(color);
        lbl_NgayTao.setForeground(color);
        lbl_Ten.setForeground(color);
        lbl_SoDienThoai.setForeground(color);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_CMND;
    private javax.swing.JLabel lbl_DiaChi;
    private javax.swing.JLabel lbl_GioiTinh;
    private javax.swing.JLabel lbl_NgaySinh;
    private javax.swing.JLabel lbl_NgayTao;
    private javax.swing.JLabel lbl_SoDienThoai;
    private javax.swing.JLabel lbl_Ten;
    // End of variables declaration//GEN-END:variables
}
