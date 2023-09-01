package com.exersice.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exersice.mapping.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
