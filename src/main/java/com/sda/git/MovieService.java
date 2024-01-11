package com.sda.git;

import java.util.ArrayList;
import java.util.List;

public class MovieService {

    public List<Movie> getAllMovies() {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Sami swoi", Genre.COMEDY, 1967));
        movies.add(new Movie("Star Wars V Empire Strikes Back", Genre.SCI_FI, 1980));
        movies.add(new Movie("Matrix 2. Reloaded", Genre.ACTION, 2002));

        return movies;
    }
}
