/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinemasmas;

import java.util.HashMap;

/**
 *
 * @author Fadil
 */
public class Screening {
    private int screenId;
    private Movie movie;
    private String screenTime;
    private HashMap<Seat, Boolean> seatAvailabilites = new HashMap<>();
    private int price;

    public Screening(Movie movie, String screenTime, int screenId, Seat[] seat) {
        this.movie = movie;
        this.screenTime = screenTime;
        this.screenId = screenId;
    }
    
    public void changeSeat(int i) {
        
    }
    
    public int getTheaterNum() {
        return 0;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getPrice() {
        return price;
    }
    
    public void displayAvailable(){
        
    }
    
    
}
