/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinemasmas;

/**
 *
 * @author Fadil
 */
public class User {
    private String name;
    private String username;
    private String Password;
    private String role;

    public User() {
        Login();
    }
    

    public User(String username, String Password, String role) {
        this.username = username;
        this.Password = Password;
        this.role = role;
    }    
    
    public void Login() {
        Login lg = new Login();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
    }
    
}
