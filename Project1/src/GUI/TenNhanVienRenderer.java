/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author vudtpk00714
 */
public class TenNhanVienRenderer extends JLabel implements TableCellRenderer {

    public TenNhanVienRenderer() {
        setOpaque(true); //MUST do this for background to show up.
    }

    public Component getTableCellRendererComponent(
            JTable table, Object item,
            boolean isSelected, boolean hasFocus,
            int row, int column) {
        
        //CustomObjectItem newItem = (CustomObjectItem) item;
        this.setIcon(new ImageIcon(getClass().getResource("/GUI/NhanVien_Pictures/nv1.png")));
        this.setText("dfsdfasfsafsaf");
        if (isSelected) {
            this.setBackground(table.getSelectionBackground());
        } else {
            this.setBackground(table.getBackground());
        }
        setToolTipText("Nhan vien abcxyz");
        return this;
    }
}
