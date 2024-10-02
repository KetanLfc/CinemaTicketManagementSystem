/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AssignmentOOSD1;

/**
 *
 * @author Admin
 */
public class Movie {
    
        private String id;
        private String name;
        private String duration;
        private String language;
        private String genre;

        public Movie(String id, String name, String duration, String language, String genre) {
            this.id = id;
            this.name = name;
            this.duration = duration;
            this.language = language;
            this.genre = genre;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDuration() {
            return duration;
        }

        public String getLanguage() {
            return language;
        }

        public String getGenre() {
            return genre;
        }
    }

