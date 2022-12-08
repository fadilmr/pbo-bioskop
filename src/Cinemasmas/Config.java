 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinemasmas;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Fadil
 */
public class Config {
    public static Connection getConnection(){
        Connection con = null;
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
}
