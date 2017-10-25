/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 * 
 * @author vudtpk0074
 */
//Object dùng để lưu cặp thông tin mã - text, phục vụ cho việc add và lấy dữ liệu
//từ Combobox và Jtable
public class CustomObjectItem {

    public String Text;
    public int Value;

    public CustomObjectItem() {
    }

    public CustomObjectItem(String text, int value) {
        Text = text;
        Value = value;
    }

    @Override
    public String toString() {
        return Text;
    }
    
    public int layMa() {
        return Value;
    }
}
