/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssignmentOOSD1;

/**
 *
 * @author Admin
 */
public class Ticket {
    
    private String customerName;
    private String movieShowTitle;
    private String theaterName;
    private String hallNumber;
    private String seatNumber;
    private String ticketID;

    public Ticket(String customerName, String movieShowTitle, String theaterName, String hallNumber, String seatNumber, String ticketID) {
        this.customerName = customerName;
        this.movieShowTitle = movieShowTitle;
        this.theaterName = theaterName;
        this.hallNumber = hallNumber;
        this.seatNumber = seatNumber;
        this.ticketID = ticketID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getMovieShowTitle() {
        return movieShowTitle;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public String getHallNumber() {
        return hallNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getTicketID() {
        return ticketID;
    }
}
