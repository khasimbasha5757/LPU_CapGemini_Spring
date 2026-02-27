package com.capgemini.Assigment3_26Feb2026ProductCategory.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Assigment3_26Feb2026ProductCategory.dto.Category;

public interface CategoryJpaRepository extends JpaRepository<Category, Integer>{
	
}