package com.padamBooking.PadamBooking.service;

import com.padamBooking.PadamBooking.model.Movie;
import com.padamBooking.PadamBooking.model.Theater;
import com.padamBooking.PadamBooking.repository.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TheaterService {
    private final TheaterRepository theaterRepository;

    @Autowired
    public TheaterService(TheaterRepository theaterRepository) {
        this.theaterRepository = theaterRepository;
    }

    public List<Theater> createTheaters(Iterable<Theater> theaters) {
        return theaterRepository.saveAll(theaters);
    }

    public Theater updateTheater(Theater theater) {
        return theaterRepository.save(theater);
    }

    public Theater getTheaterById(int theaterId) {
        return theaterRepository.findById(theaterId)
                .orElseThrow(() -> new NoSuchElementException("Theater not found with id " + theaterId));
    }

    public List<Theater> findTheatersByMovieId(Integer movieId) {
        return theaterRepository.findTheatersByMovieId(movieId);
    }

    public List<Theater> getAllTheaters() {
        return theaterRepository.findAll();
    }

    public void deleteTheaterById(int theaterId) {
        theaterRepository.deleteById(theaterId);
    }

    public List<Theater> findTheatreDetailsByMovieId(Integer movieId) {
        return theaterRepository.findTheatreDetailsByMovieId(movieId);
    }
}