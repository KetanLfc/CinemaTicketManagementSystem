/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssignmentOOSD1;

/**
 *
 * @author Admin
 */
public class TheaterHall {
    
    private String theaterName;
    private String hallNumber;

    public TheaterHall(String theaterName, String hallNumber) {
        this.theaterName = theaterName;
        this.hallNumber = hallNumber;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public String getHallNumber() {
        return hallNumber;
    }

    public void setHallNumber(String hallNumber) {
        this.hallNumber = hallNumber;
    }
}
