package com.padamBooking.PadamBooking.service;

import com.padamBooking.PadamBooking.model.Movie;
import com.padamBooking.PadamBooking.repository.MovieRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> createMovies(Iterable<Movie> movies) {
        return movieRepository.saveAll(movies);
    }

    public Movie updateMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie getMovieById(int movieId) {
        return movieRepository.findById(movieId)
                .orElseThrow(() -> new NoSuchElementException("Movie not found with id " + movieId));
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public void deleteMovieById(int movieId) {
        movieRepository.deleteById(movieId);
    }
}