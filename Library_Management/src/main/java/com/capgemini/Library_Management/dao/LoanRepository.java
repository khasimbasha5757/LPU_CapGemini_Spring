package com.capgemini.Library_Management.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Library_Management.entity.Loan;


public interface LoanRepository extends JpaRepository<Loan, Long> {
    List<Loan> findByMemberMemberId(Long memberId);
}
