package com.padamBooking.PadamBooking.repository;

import com.padamBooking.PadamBooking.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
}
