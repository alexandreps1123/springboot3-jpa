package com.parkus.springboot3jpa.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.parkus.springboot3jpa.entities.User;
import com.parkus.springboot3jpa.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Breu", "maria@email.com", "99999999", "12345");
        User u2 = new User(null, "Joaquin Leu", "joaquin@email.com", "977777777", "12345");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }

}
