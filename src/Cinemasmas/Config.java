 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinemasmas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Fadil
 */
public class Config {
    static Connection con = null;
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/cinemasmas";
            String user = "root";
            String pass = "";
            con = DriverManager.getConnection(url, user, pass);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return con;
    }
    
    public static ResultSet AccessDB(String query) {
        PreparedStatement ps;
        ResultSet rs;
        rs = null;
        try {
            ps = Config.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
        public static void Manipulate(String query) {
        PreparedStatement ps;
        ResultSet rs;
        rs = null;
        try {
            ps = Config.getConnection().prepareStatement(query);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    public static void disconnect(){
        try {
            con.close();
        } catch (Exception e) {
        }
    }
    
}
