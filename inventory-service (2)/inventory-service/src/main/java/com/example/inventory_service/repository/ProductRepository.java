package com.example.inventory_service.repository;

import com.example.inventory_service.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}