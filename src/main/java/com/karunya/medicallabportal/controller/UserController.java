package com.karunya.medicallabportal.controller;

import com.karunya.medicallabportal.model.User;
import com.karunya.medicallabportal.dto.UserResponse;
import jakarta.validation.Valid;
import com.karunya.medicallabportal.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    public UserController(UserService userService,
                          PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/signup")
    public UserResponse signup(@Valid @RequestBody User user) {
        User savedUser = userService.registerUser(user);
        return new UserResponse(
            savedUser.getId(),
            savedUser.getName(),
            savedUser.getEmail(),
            savedUser.getRole()
        );
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        return userService.getUserByEmail(user.getEmail())
                .filter(u -> passwordEncoder.matches(
                        user.getPassword(),
                        u.getPassword()
                ))
                .map(u -> "Login successful! Role: " + u.getRole())
                .orElse("Invalid email or password!");
    }
    
    
}