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
public class Movie {
    private String title;
    private int duration;

    public Movie(String title, int duration) {
        PreparedStatement ps;
        String query = "INSERT INTO `movie`(`Title`, `Duration`) VALUES (?,?)";
        if (title.equals("")) {
            JOptionPane.showMessageDialog(null, "Empty Input");
        } else {
            try {
                ps = Config.getConnection().prepareStatement(query);
                ps.setString(1, title);
                ps.setInt(2, duration);
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "New Movie Added");
                } else {
                    JOptionPane.showMessageDialog(null, "Error");
                }
                ps.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    
    
}
