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

    public Screening(Movie movie, String screenTime, int price, Seat[] seat) {
        this.movie = movie;
        this.screenTime = screenTime;
        this.price = price;
        for (Seat seat1 : seat) {
            seatAvailabilites.put(seat1, true);
        }
    }
    
    public void changeSeat(int i) {
        // ganti availability seat
    }

    public Movie getMovie() {
        return movie;
    }

    public int getPrice() {
        return price;
    }

    public HashMap<Seat, Boolean> getSeatAvailabilites() {
        return seatAvailabilites;
    }
    
    
}
