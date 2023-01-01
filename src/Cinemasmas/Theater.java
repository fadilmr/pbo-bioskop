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
public class Theater {
    private int TheaterNum;
    private Screening[] screenings;
    private Seat[] seats;

    public Theater(int TheaterNum) {
        this.TheaterNum = TheaterNum;
    }
    
    public void addScreening(Movie movie, String screenTime, int price){
        
    }

    public Screening[] getScreenings() {
        return screenings;
    } 
}
