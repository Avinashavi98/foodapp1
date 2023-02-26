package com.food.foodSpringApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.foodSpringApplication.dto.product;

public interface product_repo extends JpaRepository<product,Integer > {

}
