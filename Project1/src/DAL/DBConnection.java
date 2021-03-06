/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.ThongBao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vudtpk00714
 */
public class DBConnection {
    String connectionString = Conn.serverUrl+";"
            + "databaseName="+Conn.database+"; user="+Conn.user+"; password="+Conn.password+";";
    Connection conn;
    
    public DBConnection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(connectionString);
            if(conn != null){
                System.out.println("Kết nối CSDL thành công");
            }
        } catch (ClassNotFoundException ex) {
            GUI.XuLyThongBao.hienThiThongBao(new ThongBao("Lỗi JDBC: " + ex.getMessage(), ThongBao.LOI));
            System.exit(0);
        } catch (SQLException ex) {
            GUI.XuLyThongBao.hienThiThongBao(new ThongBao("Lỗi kết nối CSDL: " + ex.getMessage(), ThongBao.LOI));
            System.exit(0);
        }                     
    }
    
    public ResultSet ExcuteQuerySelect(String query){
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            return rs;
        } catch (SQLException ex) {
            System.out.println("Lỗi câu truy vấn. " + ex.getMessage());
        }
        return null;
    }

    public int ExcuteNonQuery(String query){
        try {
            Statement stmt = conn.createStatement();
            int kq = stmt.executeUpdate(query);
            return kq; 
        } catch (SQLException ex) {
            System.out.println("Lỗi câu truy vấn: " + ex.getMessage());
        }
        return -1;
    }
    
    public void setAutoCommit(boolean isAuto) throws SQLException{
        conn.setAutoCommit(isAuto);
    }
    
    public void commit() throws SQLException{
        conn.commit();
    }
    
    public void rollback(){
        try {
            conn.rollback();
        } catch (SQLException ex) {
            System.out.println("Không thể rollback : " +ex);
        }
    }
}

