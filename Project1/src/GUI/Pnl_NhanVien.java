/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author vudt9
 */
public class Pnl_NhanVien extends javax.swing.JPanel {

    /**
     * Creates new form Pnl_NhanVien
     */
    public Pnl_NhanVien() {
        initComponents();
        doDuLieuLenTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchBar = new javax.swing.JPanel();
        txt_QueryInput = new javax.swing.JTextField();
        btn_Search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_NhanVien = new javax.swing.JTable();
        btn_TimKH = new javax.swing.JButton();
        btn_SuaKH = new javax.swing.JButton();
        btn_ThemKH = new javax.swing.JButton();
        btn_ThemKH1 = new javax.swing.JButton();

        SearchBar.setBackground(new java.awt.Color(255, 255, 255));
        SearchBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_QueryInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_QueryInput.setToolTipText("");
        txt_QueryInput.setBorder(null);
        txt_QueryInput.setSelectionColor(new java.awt.Color(72, 169, 153));
        GhostText queryInput = new GhostText(txt_QueryInput, "Tìm kiếm");

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
                .addComponent(txt_QueryInput, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(btn_Search))
        );
        SearchBarLayout.setVerticalGroup(
            SearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchBarLayout.createSequentialGroup()
                .addGroup(SearchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_Search, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_QueryInput, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tbl_NhanVien.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        tbl_NhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Danh sách nhân viên"
            }
        ));
        tbl_NhanVien.setColumnSelectionAllowed(true);
        tbl_NhanVien.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_NhanVien.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbl_NhanVien.setRowHeight(224);
        tbl_NhanVien.setSelectionBackground(new java.awt.Color(72, 169, 153));
        tbl_NhanVien.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_NhanVien.setShowHorizontalLines(false);
        tbl_NhanVien.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tbl_NhanVien);
        tbl_NhanVien.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tbl_NhanVien.getColumnModel().getColumnCount() > 0) {
            tbl_NhanVien.getColumnModel().getColumn(0).setCellRenderer(new NhanVienRenderer());
        }

        btn_TimKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Synchronize_24px.png"))); // NOI18N
        btn_TimKH.setContentAreaFilled(false);
        btn_TimKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_TimKHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_TimKHMouseExited(evt);
            }
        });

        btn_SuaKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_List_24px.png"))); // NOI18N
        btn_SuaKH.setContentAreaFilled(false);
        btn_SuaKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SuaKHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_SuaKHMouseExited(evt);
            }
        });

        btn_ThemKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Add_User_Male_24px.png"))); // NOI18N
        btn_ThemKH.setContentAreaFilled(false);
        btn_ThemKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ThemKHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ThemKHMouseExited(evt);
            }
        });

        btn_ThemKH1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Icons/icons8_Edit_24px.png"))); // NOI18N
        btn_ThemKH1.setContentAreaFilled(false);
        btn_ThemKH1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ThemKH1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ThemKH1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                        .addComponent(btn_ThemKH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_ThemKH1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_TimKH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_SuaKH)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_TimKH)
                        .addComponent(btn_ThemKH)
                        .addComponent(btn_SuaKH)
                        .addComponent(btn_ThemKH1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
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
    
    private void doDuLieuLenTable() {
        DTO.DTONhanVien[] arrNV = DAL.DALNhanVien.layDuLieu();
        DefaultTableModel model = (DefaultTableModel)tbl_NhanVien.getModel();
        model.setRowCount(0);
        for(int i = 0; i < arrNV.length; i++){
            Object[] obj = new Object[1];
            obj[0] = arrNV[i];
            model.addRow(obj);
        }
    }
    private void btn_SearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchMouseEntered
        diChuotVaoNutSearch(true);
    }//GEN-LAST:event_btn_SearchMouseEntered

    private void btn_SearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SearchMouseExited
        diChuotVaoNutSearch(false);
    }//GEN-LAST:event_btn_SearchMouseExited

    private void btn_TimKHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_TimKHMouseEntered
        btn_TimKH.setIcon(new ImageIcon(getClass().getResource("/GUI/Icons/icons8_Search_24px_3.png")));
    }//GEN-LAST:event_btn_TimKHMouseEntered

    private void btn_TimKHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_TimKHMouseExited
        btn_TimKH.setIcon(new ImageIcon(getClass().getResource("/GUI/Icons/icons8_Search_24px_4.png")));
    }//GEN-LAST:event_btn_TimKHMouseExited

    private void btn_SuaKHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SuaKHMouseEntered
        btn_SuaKH.setIcon(new ImageIcon(getClass().getResource("/GUI/Icons/icons8_Edit_24px_1.png")));
    }//GEN-LAST:event_btn_SuaKHMouseEntered

    private void btn_SuaKHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SuaKHMouseExited
        btn_SuaKH.setIcon(new ImageIcon(getClass().getResource("/GUI/Icons/icons8_Edit_24px.png")));
    }//GEN-LAST:event_btn_SuaKHMouseExited

    private void btn_ThemKHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThemKHMouseEntered
        btn_ThemKH.setIcon(new ImageIcon(getClass().getResource("/GUI/Icons/icons8_Add_User_Male_24px_2.png")));
    }//GEN-LAST:event_btn_ThemKHMouseEntered

    private void btn_ThemKHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThemKHMouseExited
        btn_ThemKH.setIcon(new ImageIcon(getClass().getResource("/GUI/Icons/icons8_Add_User_Male_24px.png")));
    }//GEN-LAST:event_btn_ThemKHMouseExited

    private void btn_ThemKH1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThemKH1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ThemKH1MouseEntered

    private void btn_ThemKH1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThemKH1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ThemKH1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SearchBar;
    private javax.swing.JButton btn_Search;
    private javax.swing.JButton btn_SuaKH;
    private javax.swing.JButton btn_ThemKH;
    private javax.swing.JButton btn_ThemKH1;
    private javax.swing.JButton btn_TimKH;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_NhanVien;
    private javax.swing.JTextField txt_QueryInput;
    // End of variables declaration//GEN-END:variables
}
