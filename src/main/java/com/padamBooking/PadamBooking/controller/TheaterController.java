package com.padamBooking.PadamBooking.controller;

import com.padamBooking.PadamBooking.model.Theater;
import com.padamBooking.PadamBooking.service.TheaterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/theater")
public class TheaterController {
    TheaterService theaterService;

    public TheaterController(TheaterService theaterService) {
        this.theaterService = theaterService;
    }

    @GetMapping("/getTheaterById")
    public Theater getTheaterById(@RequestParam(name = "theaterId", required = true) int theaterId) {
        return theaterService.getTheaterById(theaterId);
    }

    @GetMapping("/getAll")
    public List<Theater> getAllTheater() {
        return theaterService.getAllTheater();
    }

    @PostMapping
    public List<Theater> createTheater(@RequestBody List<Theater> theater) {
        return theaterService.createTheatre(theater);
    }

    @PutMapping
    public List<Theater> updateTheater(@RequestBody List<Theater> theater) {
        return theaterService.updateTheater(theater);
    }

    @DeleteMapping("/deleteTheaterById")
    public String deleteTheater(@RequestParam(name = "theaterId", required = true) Theater theater) {
        theaterService.deleteTheater(theater);
        return "success";
    }
}
