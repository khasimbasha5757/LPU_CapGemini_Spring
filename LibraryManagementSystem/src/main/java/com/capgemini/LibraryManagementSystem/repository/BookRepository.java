package com.capgemini.LibraryManagementSystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.LibraryManagementSystem.entity.Book;


public interface BookRepository extends JpaRepository<Book, Long> {

}