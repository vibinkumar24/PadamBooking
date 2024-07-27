package com.padamBooking.PadamBooking.service;

import com.padamBooking.PadamBooking.model.Movie;
import com.padamBooking.PadamBooking.model.Screen;
import com.padamBooking.PadamBooking.model.Theater;
import com.padamBooking.PadamBooking.repository.MovieRepository;
import com.padamBooking.PadamBooking.repository.ScreenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ScreenService {
    private final ScreenRepository screenRepository;

    public ScreenService(ScreenRepository screenRepository) {
        this.screenRepository = screenRepository;
    }

    public List<Screen> createScreens(Iterable<Screen> screens) {
        return screenRepository.saveAll(screens);
    }

    public Screen updateScreen(Screen screen) {
        return screenRepository.save(screen);
    }

    public Screen getScreenById(int screenId) {
        return screenRepository.findById(screenId)
                .orElseThrow(() -> new NoSuchElementException("Screen not found with id " + screenId));
    }

    public List<Screen> getAllScreens() {
        return screenRepository.findAll();
    }

    public void deleteScreenById(int screenId) {
        screenRepository.deleteById(screenId);
    }
}
