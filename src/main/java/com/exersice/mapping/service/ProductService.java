package com.exersice.mapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.exersice.mapping.model.Product;
import com.exersice.mapping.repository.ProductRepository;

@Service
public class ProductService {
@Autowired
private ProductRepository productrepository;
public Page<Product> getProductsByField(String field, int pageNo, int pageSize) {
	Sort sort = Sort.by(field);
    Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
    return productrepository.findAll(pageable);
}
}
