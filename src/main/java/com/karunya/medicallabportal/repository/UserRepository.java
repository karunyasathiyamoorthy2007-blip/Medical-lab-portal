package com.karunya.medicallabportal.repository;
import com.karunya.medicallabportal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}


