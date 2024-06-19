package com.padamBooking.PadamBooking.service;

import com.padamBooking.PadamBooking.model.Theater;
import com.padamBooking.PadamBooking.repository.TheaterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheaterService {
    TheaterRepository theaterRepository;

    public TheaterService(TheaterRepository theaterRepository) {
        this.theaterRepository = theaterRepository;
    }

    public List<Theater> createTheatre(List<Theater> theater){
        return theaterRepository.saveAll(theater);
    }

    public List<Theater> updateTheater(Iterable<Theater> theater){
        return theaterRepository.saveAll(theater);
    }

    public Theater getTheaterById(int theaterId){
        return theaterRepository.findById(theaterId).get();
    }

    public List<Theater> getAllTheater(){
        return theaterRepository.findAll();
    }

    public void deleteTheater(Theater theater){
        theaterRepository.delete(theater);
    }
}
