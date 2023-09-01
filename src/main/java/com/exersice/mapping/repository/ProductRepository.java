package com.exersice.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exersice.mapping.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
