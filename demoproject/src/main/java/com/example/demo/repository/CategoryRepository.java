package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.*;

public interface CategoryRepository extends CrudRepository<Category, Integer>{

	public Iterable<Category> deleteByName(String name);
	public Category findByName(String name);

}
