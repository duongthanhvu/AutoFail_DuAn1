/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vudtpk00714
 */
public class Conn {

    public static DAL.DBConnection connection;

    public static String serverUrl;
    public static String database;
    public static String user;
    public static String password;
    
    public static void ketNoiCSDL(){
        FileInputStream input = null;
        try {
            Properties thongTinCSDL = new Properties();
            input = new FileInputStream(new File("./data/db.properties"));
            thongTinCSDL.load(input);
            serverUrl = thongTinCSDL.getProperty("serverUrl");
            database = thongTinCSDL.getProperty("database");
            user = thongTinCSDL.getProperty("user");
            password = thongTinCSDL.getProperty("password");
            connection = new DBConnection();
        } catch (FileNotFoundException ex) {
            System.out.println("Không tìm thấy file");
        } catch (IOException ex) {
            System.out.println("Lỗi đọc file");
        } finally {
            try {
                input.close();
            } catch (IOException ex) {
                System.out.println("cant close");
            }
        }
    }
}
