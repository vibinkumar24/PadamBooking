package com.padamBooking.PadamBooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;



@RestController
@SpringBootApplication
public class PadamBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadamBookingApplication.class, args);
		System.out.println();
	}

}
