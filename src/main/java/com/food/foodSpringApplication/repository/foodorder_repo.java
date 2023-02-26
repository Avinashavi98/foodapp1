package com.food.foodSpringApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.foodSpringApplication.dto.foodorder;

public interface foodorder_repo extends JpaRepository<foodorder, Integer> {

}
