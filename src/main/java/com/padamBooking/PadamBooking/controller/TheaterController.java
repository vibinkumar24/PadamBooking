package com.padamBooking.PadamBooking.controller;

import com.padamBooking.PadamBooking.model.Theater;
import com.padamBooking.PadamBooking.service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/v1/theater")
@CrossOrigin(origins = "http://localhost:3000")
public class TheaterController {
    private final TheaterService theaterService;

    @Autowired
    public TheaterController(TheaterService theaterService) {
        this.theaterService = theaterService;
    }

    @GetMapping("/getTheaterById")
    public ResponseEntity<Theater> getTheaterById(@RequestParam(name = "theaterId", required = true) int theaterId) {
        try {
            Theater theater = theaterService.getTheaterById(theaterId);
            return new ResponseEntity<>(theater, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/getTheaterByMovieId")
    public ResponseEntity<List<Theater>> findTheatersByMovieId(@RequestParam(name = "movieId", required = true) Integer movieId) {
        try {
            List<Theater> theaters = theaterService.findTheatersByMovieId(movieId);
            return new ResponseEntity<>(theaters, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/findTheatreDetailsByMovieId")
    public ResponseEntity<List<Theater>> findTheatreDetailsByMovieId(@RequestParam(name = "movieId", required = true) Integer movieId) {
        try {
            List<Theater> theaters = theaterService.findTheatreDetailsByMovieId(movieId);
            return new ResponseEntity<>(theaters, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Theater>> getAllTheaters() {
        try {
            List<Theater> theaters = theaterService.getAllTheaters();
            return new ResponseEntity<>(theaters, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<List<Theater>> createTheaters(@RequestBody List<Theater> theaters) {
        try {
            List<Theater> createdTheaters = theaterService.createTheaters(theaters);
            return new ResponseEntity<>(createdTheaters, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping
    public ResponseEntity<Theater> updateTheater(@RequestBody Theater theater) {
        try {
            Theater updatedTheater = theaterService.updateTheater(theater);
            return new ResponseEntity<>(updatedTheater, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/deleteTheaterById/{id}")
    public ResponseEntity<String> deleteTheaterById(@PathVariable int id) {
        try {
            theaterService.deleteTheaterById(id);
            return new ResponseEntity<>("Theater deleted successfully", HttpStatus.OK);
        } catch (EmptyResultDataAccessException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}