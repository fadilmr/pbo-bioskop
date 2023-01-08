/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinemasmas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fadil
 */
public class Theater {
    private Screening[] screenings;
    DefaultTableModel model[] = new DefaultTableModel[3];
    ArrayList<Integer> ScreeningId[] = new ArrayList[3];

    public Theater() {
    }

    
    public DefaultTableModel[] getScreening(){
         for (int i = 1; i <= 3; i++) {
            model[i-1] = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    //all cells false
                    return false;
                }
            };
            model[i-1].addColumn("Title");
            model[i-1].addColumn("Jam");

            this.ScreeningId[i-1] = new ArrayList<>();
            
            ResultSet rs;

            String query = "SELECT * FROM `screening` WHERE TheaterNum='" + Integer.toString(i) + "'";
            try {
                rs = Config.AccessDB(query);
                while(rs.next()) {
                    model[i-1].addRow(new Object[]{rs.getString("MovieTitle"), rs.getString("JamTayang")});
                    this.ScreeningId[i-1].add(rs.getInt("Screening_ID"));
                }
                Config.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
         return model;
    }
    
    public void addScreening1(String title, String theater, String jam, String price) {
        String query = "INSERT INTO `screening`(`TheaterNum`, `MovieTitle`, `JamTayang`, `Price`, `SeatAvailability`) VALUES ('"+ theater +"','"+ title +"','"+ jam +"','"+ price +"','"+ "111111111111111111111111111111111111" +"')";
        try {
            Config.Manipulate(query);
            Config.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void EditScreening(String id, String title, String theater, String jam, String price) {
        String query = "UPDATE `screening` SET `TheaterNum`='"+ theater +"',`MovieTitle`='"+ title +"',`JamTayang`='"+ jam +"',`Price`='"+ price +"' WHERE `Screening_ID` = '" + id +"'";
        try {
            Config.Manipulate(query);
            Config.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DeleteScreening(String id) {
        String query = "DELETE FROM `screening` WHERE `Screening_Id` = '" + id +"'";
        try {
            Config.Manipulate(query);
            Config.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Integer>[] getScreeningId() {
        return ScreeningId;
    }
    
    
    public Screening[] getScreenings() {
        return screenings;
    } 
}
