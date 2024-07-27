package com.padamBooking.PadamBooking.controller;


import com.padamBooking.PadamBooking.model.Movie;
import com.padamBooking.PadamBooking.service.MovieService;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movie")
@CrossOrigin(origins = "http://localhost:3000")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/getMovieById")
    public Movie getMovieById(@RequestParam(name="movieId",required = true) int movieId){
        return movieService.getMovieById(movieId);
    }

    @GetMapping("/getAll")
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }

    @PostMapping
    public List<Movie> createMovies(@RequestBody List<Movie> movies) {
        return movieService.createMovies(movies);
    }

    @PutMapping
    public Movie updateMovie(@RequestBody Movie movie) {
        return movieService.updateMovie(movie);
    }


    @DeleteMapping("/deleteMovieById")
    public ResponseEntity<String> deleteMovieById(@PathVariable int id) {
        try {
            movieService.deleteMovieById(id);
            return new ResponseEntity<>("Movie deleted successfully", HttpStatus.OK);
        } catch (EmptyResultDataAccessException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
