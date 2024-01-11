package com.sda.git;

import java.util.ArrayList;
import java.util.List;

public class MovieService {

    public List<Movie> getAllMovies() {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Sami swoi", Genre.COMEDY, 1967));
        movies.add(new Movie("Star Wars V Empire Strikes Back", Genre.SCI_FI, 1980));
        movies.add(new Movie("Mr and Mrs Smith", Genre.ACTION, 1999));
        movies.add(new Movie("Lord of the rings", Genre.DRAMA, 2010));

        return movies;
    }
}
