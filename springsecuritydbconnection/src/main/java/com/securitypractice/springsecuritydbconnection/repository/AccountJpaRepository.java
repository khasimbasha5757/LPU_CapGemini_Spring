package com.securitypractice.springsecuritydbconnection.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.securitypractice.springsecuritydbconnection.entity.Account;

public interface AccountJpaRepository extends JpaRepository<Account, Long>{
	public Optional<Account> findByUsername(String name);
	public boolean existsByUsername(String name);
	
	public boolean existsByEmail(String email);
}