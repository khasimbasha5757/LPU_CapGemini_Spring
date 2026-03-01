package com.capgemini.Library_Management.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Library_Management.entity.LibraryBranch;


public interface LibraryBranchRepository extends JpaRepository<LibraryBranch, Long> {
	
}