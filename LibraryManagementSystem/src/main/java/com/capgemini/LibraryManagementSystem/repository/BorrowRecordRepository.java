package com.capgemini.LibraryManagementSystem.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.LibraryManagementSystem.entity.BorrowRecord;


public interface BorrowRecordRepository extends JpaRepository<BorrowRecord, Long> {

}