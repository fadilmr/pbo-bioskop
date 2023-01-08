/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinemasmas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

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
    
    public static void changeSeat(int id, String currentSeatAvailable) {
        String query = "UPDATE screening SET SeatAvailability='"+currentSeatAvailable+"' where Screening_ID='"+id+"'";
        Config.Manipulate(query);
    }

    public Movie getMovie() {
        return movie;
    }

    public int getPrice() {
        return price;
    }

    public static String getSeatAvailabilites(int id) {
        HashMap<Integer, Boolean> seatAvailabilities = new HashMap<>();
        
        PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT SeatAvailability FROM `screening` WHERE Screening_ID='" + id + "'";
        String seatBin = "";
        try {
            ps = Config.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            rs.next();
            seatBin = rs.getString("SeatAvailability");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return seatBin;
    }
}
