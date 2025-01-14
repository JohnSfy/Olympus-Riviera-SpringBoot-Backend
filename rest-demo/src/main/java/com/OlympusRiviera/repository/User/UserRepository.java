package com.OlympusRiviera.repository.User;

import com.OlympusRiviera.model.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByGoogleId(String googleId);

}
