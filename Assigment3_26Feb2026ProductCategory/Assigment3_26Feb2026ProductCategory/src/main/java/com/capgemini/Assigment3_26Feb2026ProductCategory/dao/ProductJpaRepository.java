package com.capgemini.Assigment3_26Feb2026ProductCategory.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Assigment3_26Feb2026ProductCategory.dto.Product;

public interface ProductJpaRepository extends JpaRepository<Product, Integer>{
	List<Product> findByProductName(String productName);
	List<Product> findByCategory_CategoryId(int categoryId);
}