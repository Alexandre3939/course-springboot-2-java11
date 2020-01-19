package com.example.alex.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.alex.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
