package com.capgemini.Library_Management.service;


import java.util.List;
import java.util.Set;

import com.capgemini.Library_Management.entity.Book;

public interface BookService {

    Book addBook(java.awt.print.Book book, Long categoryId, Long branchId, Set<Long> authorIds);

    Book getBookById(Long bookId);

    List<Book> getAllBooks();

    Book updateBook(Long bookId, Book updatedDetails);

    void deleteOrDisableBook(Long bookId);

	Book addBook(Book book, Long categoryId, Long branchId, Set<Long> authorIds);
}