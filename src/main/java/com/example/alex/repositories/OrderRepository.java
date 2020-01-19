package com.example.alex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.alex.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
