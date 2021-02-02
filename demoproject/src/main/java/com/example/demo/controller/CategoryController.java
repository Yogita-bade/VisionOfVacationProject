package com.example.demo.controller;

import com.example.demo.services.*;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.*;;


@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoryController {
	
	@Autowired
	private CategoryService service;
	
	
	@PostMapping("/save")
	@Transactional
	public String registeruser(@RequestBody Category category)
	{
		service.saveMyUser(category);
		return " successfully";
	}
	@GetMapping("/all-category")
	public Iterable<Category> showAllUsers()
	{
		return service.showAllUser();
	}

	@GetMapping("/delete/{name}")
	@Transactional
	public Iterable<Category> deleteCategory(@PathVariable String name){
		return service.deleteCategoryByName(name);
	}
	@GetMapping("/search/{name}")
	public Category searchCategory(@PathVariable String name)
	{
		return service.findByCategoryName(name);
	}
	
	/*@GetMapping(value="/get/{id}")
	public Category getCategoryById(@PathVariable int id) {
		try {
			return catservice.getCategoryById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@PostMapping(value="/save")
	public ResponseEntity<?> saveCategory(@RequestBody Category c){
		try {
			return new ResponseEntity<Category>(catservice.saveCatgory(c),HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Unable to save Category",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(value="/list")
	public List<Category> getCategories() {
		try {
			return catservice.getCategories();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	@PutMapping(value="/update")
	public ResponseEntity<?> updateCategory(@RequestBody Category c){
		try {
			return new ResponseEntity<Category>(catservice.updateCategory(c),HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Unable to update Category",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping(value="/delete/{id}")
	public Category deleteCategory(@PathVariable int id) {
		try {
			return catservice.deleteCategory(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}*/
}
