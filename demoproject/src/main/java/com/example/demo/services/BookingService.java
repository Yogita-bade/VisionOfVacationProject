package com.example.demo.services;

import com.example.demo.model.*;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import com.app.dao.CategoryDaoIF;

//import com.app.pojos.Customer;
import com.example.demo.repository.*;

@Service
@Transactional
public class BookingService {
	
	@Autowired
	private CategoryRepository repo;
	//private CategoryDaoIF catdao;
	
//private CustomerRepository repo;
	
	public BookingService() {
	}
	
	public BookingService(CategoryRepository repo) {
	
	super();
	this.repo = repo;
}
	public void saveMyUser(Category category)
	{
		repo.save(category);
	}
	public Iterable<Category> showAllUser()
	{
		return repo.findAll();
	}

public Iterable<Category> deleteCategoryByName(String name)
{
	repo.deleteByName(name);
	return repo.findAll();
}
public Category findByCategoryName(String name)
{
	return repo.findByName(name);
}
}

	
	/*@Override
	public Category saveCatgory(Category c) {
		if (catdao.saveCatgory(c) != null) {
			return c;
		}
		return null;
	}

	@Override
	@Transactional(readOnly=true)
	public Category getCategoryById(int id) {
		Category c = null;
		c = catdao.getCategoryById(id);
		if (c != null) {
			return c;
		}
		return null;
	}

	@Override
	@Transactional(readOnly=true)
	public List<Category> getCategories() {
		List<Category> list = null;
		list = catdao.getCategories();
		if (list != null) {
			return list;
		}
		return null;
	}
	
	@Override
	public Category deleteCategory(int id) {
		return catdao.deleteCategory(id);
	}
	@Override
	public Category updateCategory(Category c) {
		return catdao.updateCategory(c);
	}
}*/
