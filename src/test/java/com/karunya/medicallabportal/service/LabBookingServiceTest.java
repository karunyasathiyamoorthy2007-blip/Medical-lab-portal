package com.karunya.medicallabportal.service;

import com.karunya.medicallabportal.model.LabBooking;
import com.karunya.medicallabportal.repository.LabBookingRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class LabBookingServiceTest {

    @Mock
    LabBookingRepository bookingRepository;

    @InjectMocks
    LabBookingService bookingService;

    @Test
    void createBookingTest() {
        LabBooking booking = new LabBooking();

        when(bookingRepository.save(booking)).thenReturn(booking);

        LabBooking result = bookingService.createBooking(booking);

        assertNotNull(result);
        verify(bookingRepository).save(booking);
    }

    @Test
    void getAllBookingsTest() {
        when(bookingRepository.findAll())
                .thenReturn(List.of(new LabBooking(), new LabBooking()));

        List<LabBooking> result = bookingService.getAllBookings();

        assertEquals(2, result.size());
    }

    @Test
    void getBookingByIdTest() {
        LabBooking booking = new LabBooking();

        when(bookingRepository.findById(1L))
                .thenReturn(Optional.of(booking));

        Optional<LabBooking> result = bookingService.getBookingById(1L);

        assertTrue(result.isPresent());
    }

    @Test
    void deleteBookingTest() {
        bookingService.deleteBooking(1L);

        verify(bookingRepository).deleteById(1L);
    }
}
