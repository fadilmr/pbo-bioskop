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
        DashboardAdmin lg = new DashboardAdmin();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
    }
}