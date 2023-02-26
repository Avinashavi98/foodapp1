package com.food.foodSpringApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.foodSpringApplication.dto.item;

public interface item_repo extends JpaRepository<item, Integer>{

}
