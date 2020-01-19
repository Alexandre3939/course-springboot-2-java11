package com.example.alex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.alex.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
