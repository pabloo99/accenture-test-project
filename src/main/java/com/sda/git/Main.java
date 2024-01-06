package com.sda.git;

public class Main {

    public static void main(String[] args) {
        MovieService movieService = new MovieService();

        movieService.getAllMovies()
                .forEach(movie -> System.out.println(movie.toString()));
    }
}
