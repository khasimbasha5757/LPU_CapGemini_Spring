package com.capgemini.springmvcboot;

public class UsersJpaRepository extends JpaRepository<Users,String>{
	public Users findByEmailAndPassword(String email,String password);
}
