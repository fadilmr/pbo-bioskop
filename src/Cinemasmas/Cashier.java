/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinemasmas;

import java.sql.Statement;

/**
 *
 * @author Fadil
 */
public class Cashier extends User{

    public Cashier(String username, String Password, String role) {
        super(username, Password, role);
    }
    
    public void addTransaction(String id, String currentSeatAvailable, String movie, String theater, int price) {
        Statement st;

        String query = "INSERT INTO `transaction`(`Movie`, `Theater`, `Price`) VALUES ('" + movie + "','" + theater + "','" + price + "')";
        try {
            st = Config.getConnection().createStatement();
            st.execute(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
