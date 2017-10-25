/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author vudtpk0074
 */
public class XuLyCbb {
    public static void capNhatCbb(JComboBox cbb, DTO.DTO[] arrItem){
        DefaultComboBoxModel cbbModel = new DefaultComboBoxModel();
        cbb.setModel(cbbModel);
        for(int i = 0; i < arrItem.length; i++){
            CustomObjectItem cbbItem = new CustomObjectItem(arrItem[i].getText(), arrItem[i].getKey());
            cbbModel.addElement(cbbItem);
        }
    }
    
    public static void setItemDcChon(JComboBox cbb, String ten){
        for(int i = 0; i < cbb.getItemCount(); i++){
            Object objItem = cbb.getItemAt(i);
            CustomObjectItem customCbbItem = (CustomObjectItem)objItem;
            if(customCbbItem.Text.equals(ten)){
                cbb.setSelectedIndex(i);
            }
        }
    }
    
    public static int layMaCuaItemDcChon(JComboBox cbb){
        CustomObjectItem itemDcChon = (CustomObjectItem)cbb.getSelectedItem();
        return itemDcChon.layMa();
    }
    
    public static void themItem(JComboBox cbb, int viTriThem, String Item){
        CustomObjectItem cbbItem = new CustomObjectItem(Item, 0);
        DefaultComboBoxModel cbbModel = (DefaultComboBoxModel)cbb.getModel();
        cbbModel.insertElementAt(cbbItem, viTriThem);
    }
}
