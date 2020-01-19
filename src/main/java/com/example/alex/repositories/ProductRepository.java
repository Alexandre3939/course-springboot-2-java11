package com.example.alex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.alex.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
