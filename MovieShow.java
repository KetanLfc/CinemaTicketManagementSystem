/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssignmentOOSD1;

/**
 *
 * @author Admin
 */
public class MovieShow {
    
    private String movieTitle;
    private String datePlaying;
    private String timePlaying;

    public MovieShow(String movieTitle, String datePlaying, String timePlaying) {
        this.movieTitle = movieTitle;
        this.datePlaying = datePlaying;
        this.timePlaying = timePlaying;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getDatePlaying() {
        return datePlaying;
    }

    public String getTimePlaying() {
        return timePlaying;
    }
    
}
