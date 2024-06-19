package com.padamBooking.PadamBooking;

import com.padamBooking.PadamBooking.model.Movie;
import com.padamBooking.PadamBooking.repository.MovieRepository;
import com.padamBooking.PadamBooking.service.MovieService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class PadamBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadamBookingApplication.class, args);

	}

}
