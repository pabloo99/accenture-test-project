package com.sda.git;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    @Test
    void shouldCountAllMovies() {
        MovieService movieService = new MovieService();

        int allMoviesCount = movieService.getAllMovies().size();

        assertEquals(allMoviesCount, 8);
    }
}
