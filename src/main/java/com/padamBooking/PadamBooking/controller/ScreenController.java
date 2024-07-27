package com.padamBooking.PadamBooking.controller;

import com.padamBooking.PadamBooking.model.Screen;
import com.padamBooking.PadamBooking.service.ScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/v1/screen")
@CrossOrigin(origins = "http://localhost:3000")
public class ScreenController {
    private final ScreenService screenService;

    public ScreenController(ScreenService screenService) {
        this.screenService = screenService;
    }

    @GetMapping("/getScreenById")
    public Screen getScreenById(@RequestParam(name = "ScreenId", required = true) int screenId) {
        return screenService.getScreenById(screenId);
    }

    @GetMapping("/getAll")
    public List<Screen> getAllScreens() {
        return screenService.getAllScreens();
    }


    @PostMapping
    public List<Screen> createScreens(@RequestBody List<Screen> screens) {
        return screenService.createScreens(screens);
    }

    @PutMapping
    public Screen updateScreen(@RequestBody Screen screen) {
        return screenService.updateScreen(screen);
    }

    @DeleteMapping("/deleteByScreenId")
    public ResponseEntity<String> deleteScreenById(@PathVariable int id) {
        try {
            screenService.deleteScreenById(id);
            return new ResponseEntity<>("Screen deleted successfully", HttpStatus.OK);
        } catch (EmptyResultDataAccessException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
