package com.karunya.medicallabportal.controller;
import com.karunya.medicallabportal.model.LabBooking;
import com.karunya.medicallabportal.repository.LabBookingRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/bookings")
public class LabBookingController {

    private final LabBookingRepository bookingRepository;

    public LabBookingController(LabBookingRepository bookingRepository) {
        this.bookingRepository=bookingRepository;
    }

    @PostMapping
    public LabBooking createBooking(@RequestBody LabBooking booking) {
        return bookingRepository.save(booking);
    }
    @GetMapping
    public List<LabBooking> getAllBookings() {
        return bookingRepository.findAll();
    }
}

