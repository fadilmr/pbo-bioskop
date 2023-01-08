/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinemasmas;

/**
 *
 * @author rafli
 */
public class Transactions {
    private int transactionId;
    private Screening screening;
    private int price;
    private Seat[] selectedSeats;

    public Transactions(Screening screening, Seat[] selectedSeats) {
        this.screening = screening;
        this.selectedSeats = selectedSeats;
    }

    public void setPrice(int price) {
        this.price = price * selectedSeats.length;
    }

    public int getPrice() {
        return price;
    }
    
}
