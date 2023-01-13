package com.parkus.springboot3jpa.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.parkus.springboot3jpa.entities.Order;
import com.parkus.springboot3jpa.entities.User;
import com.parkus.springboot3jpa.repositories.OrderRepository;
import com.parkus.springboot3jpa.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Breu", "maria@email.com", "99999999", "12345");
        User u2 = new User(null, "Joaquin Leu", "joaquin@email.com", "977777777", "12345");

        Order o1 = new Order(null, Instant.parse("2023-01-12T12:00:00Z"), u1);
        Order o2 = new Order(null, Instant.parse("2022-11-12T12:00:00Z"), u2);
        Order o3 = new Order(null, Instant.parse("2019-08-19T12:00:00Z"), u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
        
    }

}