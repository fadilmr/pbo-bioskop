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
public class Cinemasmas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Register register = new Register();
        register.setVisible(true);
        register.pack();
        register.setLocationRelativeTo(null);
        register.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
    }
}