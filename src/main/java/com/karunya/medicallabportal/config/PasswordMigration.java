package com.karunya.medicallabportal.config;

import com.karunya.medicallabportal.model.User;
import com.karunya.medicallabportal.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class PasswordMigration {

    @Bean
    CommandLineRunner migratePasswords(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder) {

        return args -> {

            for (User user : userRepository.findAll()) {

                String password = user.getPassword();

                if (password != null
                        && !password.startsWith("$2a$")
                        && !password.startsWith("$2b$")
                        && !password.startsWith("$2y$")) {

                    user.setPassword(passwordEncoder.encode(password));
                    userRepository.save(user);
                }
            }

            System.out.println("Password migration completed successfully!");
        };
    }
}
