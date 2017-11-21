/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;

/**
 *
 * @author vudtpk0074
 */
public class CustomMenuItem extends JMenuItem {

    private int ma;

    CustomMenuItem(int ma, String text, boolean hienIcon) {
        this.setText(text);
        if (hienIcon) {
            this.setIcon(new GetImageHelper().getImgSP(ma, 45, 70));
        }
        this.setFont(new java.awt.Font("Segoe UI", 0, 14));
        this.ma = ma;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }
}
