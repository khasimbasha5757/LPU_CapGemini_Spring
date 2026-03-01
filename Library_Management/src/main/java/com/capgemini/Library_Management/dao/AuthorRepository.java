package com.capgemini.Library_Management.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Library_Management.entity.Author;


public interface AuthorRepository extends JpaRepository<Author, Long> {
	
}