package com.karunya.medicallabportal.service;

import com.karunya.medicallabportal.model.LabBooking;
import com.karunya.medicallabportal.repository.LabBookingRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LabBookingService {

    private final LabBookingRepository labBookingRepository;

    public LabBookingService(LabBookingRepository labBookingRepository) {
        this.labBookingRepository = labBookingRepository;
    }

    public LabBooking createBooking(LabBooking booking) {
        return labBookingRepository.save(booking);
    }

    public List<LabBooking> getAllBookings() {
        return labBookingRepository.findAll();
    }

    public Optional<LabBooking> getBookingById(Long id) {
        return labBookingRepository.findById(id);
    }

    public LabBooking updateBooking(LabBooking booking) {
        return labBookingRepository.save(booking);
    }

    public void deleteBooking(Long id) {
        labBookingRepository.deleteById(id);
    }
}
