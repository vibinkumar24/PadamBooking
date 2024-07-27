package com.padamBooking.PadamBooking.controller;

import com.padamBooking.PadamBooking.model.Admin;
import com.padamBooking.PadamBooking.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> loginRequest) {
        String username = loginRequest.get("username");
        String password = loginRequest.get("password");

        Admin admin = adminService.findByUsername(username);
        Map<String, String> response = new HashMap<>();
        if (admin != null && admin.getPassword().equals(password)) {
            response.put("message", "Login successful");
        } else {
            response.put("message", "Invalid username or password");
        }
        return response;
    }
}
