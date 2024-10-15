package com.example.springbootswagger.repository;

import com.example.springbootswagger.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
