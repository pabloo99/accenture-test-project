package com.sda.git;

public class Movie {

    private String title;
    private Genre genre;
    private int productionYear;

    public Movie(String title, Genre genre, int productionYear) {
        this.title = title;
        this.genre = genre;
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Movie title: " + title + ", genre: " + genre + ", production year: " + productionYear;
    }
}
