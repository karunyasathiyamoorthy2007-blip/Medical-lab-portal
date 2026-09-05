package com.karunya.medicallabportal.controller;

import com.karunya.medicallabportal.model.LabBooking;
import com.karunya.medicallabportal.service.LabBookingService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class LabBookingController {

    private final LabBookingService bookingService;

    public LabBookingController(LabBookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public LabBooking createBooking(@RequestBody LabBooking booking) {
        return bookingService.createBooking(booking);
    }

    @GetMapping
    public List<LabBooking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/{id}")
    public LabBooking getBookingById(@PathVariable Long id) {
        return bookingService.getBookingById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public LabBooking updateBooking(@PathVariable Long id,
                                    @RequestBody LabBooking booking) {
        booking.setId(id);
        return bookingService.updateBooking(booking);
    }

    @DeleteMapping("/{id}")
    public String deleteBooking(@PathVariable Long id) {
        bookingService.deleteBooking(id);
        return "Booking deleted successfully!";
    }
}