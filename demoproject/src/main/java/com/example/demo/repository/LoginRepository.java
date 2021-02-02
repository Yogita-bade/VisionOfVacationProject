package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.*;
public interface LoginRepository extends CrudRepository<Login, Integer>{
	
	public Iterable<Login> deleteByUsername(String username);
	public Login findByUsername(String username);

	public Login findByUsernameAndPassword(String username, String password);



}
