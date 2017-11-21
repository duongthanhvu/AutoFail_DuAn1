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
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author vudtpk0074
 */
public class GetImageHelper {

    public ImageIcon getImgSP(int ma, int width, int height) {
        ImageIcon imgIcon;
        try {
            InputStream f = new FileInputStream("./img_sp/" + ma + ".png");
            Image img = ImageIO.read(f).getScaledInstance(width, height, Image.SCALE_SMOOTH);
            imgIcon = new ImageIcon(img);
        } catch (FileNotFoundException ex) {
            imgIcon = new ImageIcon(getClass().getResource("/GUI/Icons/blank.png"));
        } catch (IOException ex) {
            imgIcon = new ImageIcon(getClass().getResource("/GUI/Icons/blank.png"));
        }
        return imgIcon;
    }

    public ImageIcon getImgNV(int ma, int width, int height) {
        ImageIcon imgIcon;
        try {
            InputStream f = new FileInputStream("./img_nv/" + ma + ".png");
            Image img = ImageIO.read(f).getScaledInstance(width, height, Image.SCALE_SMOOTH);
            imgIcon = new ImageIcon(img);
        } catch (FileNotFoundException ex) {
            imgIcon = new ImageIcon(getClass().getResource("/GUI/Icons/blank.png"));
        } catch (IOException ex) {
            imgIcon = new ImageIcon(getClass().getResource("/GUI/Icons/blank.png"));
        }
        return imgIcon;
    }
    
}
