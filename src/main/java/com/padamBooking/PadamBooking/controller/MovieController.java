package com.padamBooking.PadamBooking.controller;


import com.padamBooking.PadamBooking.model.Movie;
import com.padamBooking.PadamBooking.service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movie")
@CrossOrigin(origins = "http://localhost:3000")
public class MovieController {
    MovieService movieService;

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
    public List<Movie> createMovie(@RequestBody List<Movie> movie){
        return movieService.createMovie(movie);
    }

    @PutMapping
    public Movie updateMovie(@RequestBody Movie movie){
        return movieService.upadateMovie(movie);
    }

    @DeleteMapping("deleteMovieById")
    public String deleteMovie(@RequestParam(name="movieId",required = true) int movieId){
        movieService.deleteMovie(movieId);
        return "success";
    }
}
