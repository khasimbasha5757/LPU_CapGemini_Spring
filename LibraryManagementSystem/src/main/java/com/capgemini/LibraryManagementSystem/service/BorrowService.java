package com.capgemini.LibraryManagementSystem.service;


import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import com.capgemini.LibraryManagementSystem.entity.Book;
import com.capgemini.LibraryManagementSystem.entity.BorrowRecord;
import com.capgemini.LibraryManagementSystem.repository.BookRepository;
import com.capgemini.LibraryManagementSystem.repository.BorrowRecordRepository;
import com.capgemini.LibraryManagementSystem.repository.UserRepository;

@Service
public class BorrowService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BorrowRecordRepository borrowRepository;

    public BorrowRecord borrowBook(Long userId, Long bookId) {

        User user = userRepository.findById(userId).orElseThrow();
        Book book = bookRepository.findById(bookId).orElseThrow();

        if (!book.isAvailable()) {
            throw new RuntimeException("Book not available");
        }

        BorrowRecord record = new BorrowRecord();
        record.setUser(user);  
        record.setBook(book);
        record.setBorrowDate(LocalDate.now());
        record.setReturned(false);

        book.setAvailable(false);
        bookRepository.save(book);

        return borrowRepository.save(record);
    }
}