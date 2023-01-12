package com.parkus.springboot3jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parkus.springboot3jpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
