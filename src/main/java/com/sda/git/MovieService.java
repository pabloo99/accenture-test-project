package com.sda.git;

import java.util.ArrayList;
import java.util.List;

public class MovieService {

    public List<Movie> getAllMovies() {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Sami swoi", Genre.COMEDY, 1967));
        movies.add(new Movie("Szklana pułapka", Genre.ACTION, 1999));

        return movies;
    }
}
