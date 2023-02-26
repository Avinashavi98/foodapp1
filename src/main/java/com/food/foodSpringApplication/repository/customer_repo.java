package com.food.foodSpringApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.foodSpringApplication.dto.customer;

public interface customer_repo extends JpaRepository<customer, Integer> {

}
