/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import javax.swing.JMenuItem;

/**
 *
 * @author vudtpk0074
 */
public class CustomMenuItem extends JMenuItem{
    private int ma;

    CustomMenuItem(int ma, String text) {
        super(text);
        this.ma = ma;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }
}
