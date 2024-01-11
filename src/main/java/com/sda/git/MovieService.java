package com.sda.git;

import java.util.ArrayList;
import java.util.List;

public class MovieService {

    public List<Movie> getAllMovies() {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Sami swoi", Genre.COMEDY, 1967));
        movies.add(new Movie("Avengers", Genre.ACTION, 2012));
        movies.add(new Movie("Matrix", Genre.THRILLER, 2004));
        movies.add(new Movie("Pan Tadeusz", Genre.ACTION, 2001));
        movies.add(new Movie("Star Wars V Empire Strikes Back", Genre.SCI_FI, 1980));
        movies.add(new Movie("Love actually", Genre.COMEDY, 2002));
        movies.add(new Movie("Szklana pułapka", Genre.ACTION, 1999));
        movies.add(new Movie("Mr and Mrs Smith", Genre.ACTION, 1999));
        movies.add(new Movie("Lord of the rings", Genre.DRAMA, 2010));
        movies.add(new Movie("Titanic", Genre.ACTION, 1998));
        movies.add(new Movie("Teściowie", Genre.ACTION, 2021));
        movies.add(new Movie("Harry Potter and the philosopher's stone", Genre.ACTION, 2002));
        movies.add(new Movie("Akademia pana Kleksa", Genre.COMEDY, 2023));
        return movies;
    }
}
