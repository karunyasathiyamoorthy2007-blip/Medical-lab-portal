package com.karunya.medicallabportal.service;

import com.karunya.medicallabportal.model.User;
import com.karunya.medicallabportal.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    UserRepository userRepository;

    @Mock
    PasswordEncoder passwordEncoder;

    @InjectMocks
    UserService userService;

    @Test
    void registerUserTest() {
        User user = new User();
        user.setName("Test User");
        user.setEmail("test@gmail.com");
        user.setPassword("1234");

        when(passwordEncoder.encode("1234")).thenReturn("encoded");

        userService.registerUser(user);

        assertEquals("USER", user.getRole());
        assertEquals("encoded", user.getPassword());
        verify(userRepository).save(user);
    }

    @Test
    void getUserByIdTest() {
        User user = new User();
        user.setId(1L);

        when(userRepository.findById(1L)).thenReturn(Optional.of(user));

        Optional<User> result = userService.getUserById(1L);

        assertTrue(result.isPresent());
        assertEquals(1L, result.get().getId());
    }

    @Test
    void getAllUsersTest() {
        when(userRepository.findAll()).thenReturn(List.of(new User(), new User()));

        List<User> result = userService.getAllUsers();

        assertEquals(2, result.size());
    }

    @Test
    void deleteUserTest() {
        userService.deleteUser(1L);

        verify(userRepository).deleteById(1L);
    }
}
