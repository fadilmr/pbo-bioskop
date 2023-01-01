/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinemasmas;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Fadil
 */
public class Admin extends User{

    public Admin(String username, String Password, String role) {
        super(username, Password, role);
    }

    
    public void addUser(String name, String username, String pass, String role) {
        PreparedStatement ps;
        String query = "INSERT INTO `user`(`Name`, `Username`, `Role`, `Password`) VALUES (?, ?, ?, ?)";
        
        if (name.equals("") || username.equals("") || pass.equals("")) {
            System.out.println("inputan harus diisi");
        } else {
            try {
                ps = Config.getConnection().prepareStatement(query);
                ps.setString(1, name);
                ps.setString(2, username);
                ps.setString(3, role);
                ps.setString(4, pass);
                if (ps.executeUpdate() > 0) {
                    System.out.println("New User Added");
                }
                ps.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public void seeTransactionsHistory() {
        
    }

    @Override
    public void Login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void addMovie(String title, int duration) {
        new Movie(title, duration);
    }
    
    public void deleteMovie(String id) {
        
    }
    
    public static void main(String[] args) {
        Admin min = new Admin("test", "test", "Admin");
        min.addMovie("Chainsawman", 3);
    }
}