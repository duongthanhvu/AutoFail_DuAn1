/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DTO.ThongBao;
import GUI.XuLyThongBao;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author vudtpk0074
 */
public class CheckValue {

    public static boolean isNotBlank(String value) {
        if (value.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isCorrectPhoneNumber(String phoneNumber) {
        Pattern p = Pattern.compile("^\\d{9,11}$");
        Matcher m = p.matcher(phoneNumber);
        if (!m.find()) {
            XuLyThongBao.hienThiThongBao(new ThongBao("Số điện thoại này không hợp lệ", 0));
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean isValidNumber(String number){
        try{
            Integer.parseInt(number);
        }catch(NumberFormatException ex){
            return false;
        }
        return true;
    }
}
