package com.padamBooking.PadamBooking.service;

import com.padamBooking.PadamBooking.model.Movie;
import com.padamBooking.PadamBooking.repository.MovieRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> createMovie(Iterable<Movie> movie){
        return movieRepository.saveAll(movie);
    }

    public Movie upadateMovie(Movie movie){
       return movieRepository.save(movie);

    }

    public Movie getMovieById(int movieId){
       return movieRepository.findById(movieId).get();
    }

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public void deleteMovie(int movieId){
        movieRepository.deleteById(movieId);
    }
}
