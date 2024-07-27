package com.padamBooking.PadamBooking.repository;

import com.padamBooking.PadamBooking.model.Screen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ScreenRepository extends JpaRepository<Screen,Integer> {
}
