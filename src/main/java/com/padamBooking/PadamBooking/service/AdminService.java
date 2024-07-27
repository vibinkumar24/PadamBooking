package com.padamBooking.PadamBooking.service;

import com.padamBooking.PadamBooking.model.Admin;
import com.padamBooking.PadamBooking.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admin findByUsername(String username) {
        return adminRepository.findByUsername(username);
    }

    public void saveAdmin(Admin admin) {
        adminRepository.save(admin);
    }
}
