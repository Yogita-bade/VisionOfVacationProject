package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;


import com.example.demo.model.*;

public interface SubCategoryRepository extends CrudRepository<SubCategory, Integer>{

	public Iterable<SubCategory> deleteByName(String name);
	public SubCategory findByName(String name);


}
