package com.exersice.mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exersice.mapping.model.Product;
import com.exersice.mapping.service.ProductService;

@RestController
public class ProductController {
@Autowired
private ProductService productservice;
@GetMapping
public ResponseEntity<Page<Product>> getProductsByField(
        @RequestParam String field,     // Field for sorting
        @RequestParam int pageNo,       // Page number (starting from 0)
        @RequestParam int pageSize) {   // Page size
    Page<Product> products = productservice.getProductsByField(field, pageNo, pageSize);
    return ResponseEntity.ok(products);
}
}
