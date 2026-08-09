package com.karunya.medicallabportal.controller;
import com.karunya.medicallabportal.model.User;
import com.karunya.medicallabportal.repository.UserRepository;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository=userRepository;
    }

    @PostMapping("/signup")
    public User signup(@RequestBody User user) {
        return userRepository.save(user);
    }
    @PostMapping("/login")
    public String login(@RequestBody User user) {

    return userRepository.findByEmail(user.getEmail())
            .filter(u -> u.getPassword().equals(user.getPassword()))
            .map(u -> "Login successful!")
            .orElse("Invalid email or password!");
    }
}


