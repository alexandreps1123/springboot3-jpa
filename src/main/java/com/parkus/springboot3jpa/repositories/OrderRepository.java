package com.parkus.springboot3jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parkus.springboot3jpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
