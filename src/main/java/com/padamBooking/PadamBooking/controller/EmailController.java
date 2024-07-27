//package com.padamBooking.PadamBooking.controller;
//
//import com.padamBooking.PadamBooking.service.EmailService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:3000")
//public class EmailController {
//
//    @Autowired
//    private EmailService emailService;
//
//    @PostMapping("/send-email")
//    public void sendEmail(@RequestBody EmailRequest emailRequest) {
//        String to = emailRequest.getEmail();
//        String subject = "Your Movie Ticket";
//        String text = String.format("Movie: %s\nTheater: %s\nLocation: %s\nScreen: %s\nSeats: %s\nShow Time: %s\nTotal Price: ₹%.2f",
//                emailRequest.getTicketDetails().getMovieName(),
//                emailRequest.getTicketDetails().getTheaterName(),
//                emailRequest.getTicketDetails().getLocation(),
//                emailRequest.getTicketDetails().getScreenName(),
//                emailRequest.getTicketDetails().getSelectedSeats(),
//                emailRequest.getTicketDetails().getStartTime(),
//                emailRequest.getTicketDetails().getTotalPrice());
//        emailService.sendEmail(to, subject, text);
//    }
//}
//
//class EmailRequest {
//    private String email;
//    private TicketDetails ticketDetails;
//
//    // Getters and setters
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public TicketDetails getTicketDetails() {
//        return ticketDetails;
//    }
//
//    public void setTicketDetails(TicketDetails ticketDetails) {
//        this.ticketDetails = ticketDetails;
//    }
//}
//
//class TicketDetails {
//    private String movieName;
//    private String theaterName;
//    private String location;
//    private String screenName;
//    private String selectedSeats;
//    private String startTime;
//    private double totalPrice;
//
//    // Getters and setters
//    public String getMovieName() {
//        return movieName;
//    }
//
//    public void setMovieName(String movieName) {
//        this.movieName = movieName;
//    }
//
//    public String getTheaterName() {
//        return theaterName;
//    }
//
//    public void setTheaterName(String theaterName) {
//        this.theaterName = theaterName;
//    }
//
//    public String getLocation() {
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }
//
//    public String getScreenName() {
//        return screenName;
//    }
//
//    public void setScreenName(String screenName) {
//        this.screenName = screenName;
//    }
//
//    public String getSelectedSeats() {
//        return selectedSeats;
//    }
//
//    public void setSelectedSeats(String selectedSeats) {
//        this.selectedSeats = selectedSeats;
//    }
//
//    public String getStartTime() {
//        return startTime;
//    }
//
//    public void setStartTime(String startTime) {
//        this.startTime = startTime;
//    }
//
//    public double getTotalPrice() {
//        return totalPrice;
//    }
//
//    public void setTotalPrice(double totalPrice) {
//        this.totalPrice = totalPrice;
//    }
//}