package com.capgemini.Library_Management.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Library_Management.entity.Book;


public interface BookRepository extends JpaRepository<Book, Long> {}