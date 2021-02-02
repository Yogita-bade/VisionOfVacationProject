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


import com.example.demo.model.*;



@RestController
@RequestMapping("/subcategory")
@CrossOrigin
public class SubCategoryController {

	@Autowired
	//private SubCategoryServiceIF subcatservice;
	private SubCategoryService service;
	public SubCategoryController() {
	}
	@PostMapping("/save")
	@Transactional
	public String registeruser(@RequestBody SubCategory subcategory)
	{
		service.saveMyUser(subcategory);
		return "Hello your login successfully";
	}
	@GetMapping("/all-subcategory")
	public Iterable<SubCategory> showAllUsers()
	{
		return service.showAllUser();
	}

	@GetMapping("/delete/{name}")
	@Transactional
	public Iterable<SubCategory> deleteCategory(@PathVariable String name){
		return service.deleteCategoryByName(name);
	}
	@GetMapping("/search/{name}")
	public SubCategory searchCategory(@PathVariable String name)
	{
		return service.findByCategoryName(name);
	}

	
}
/*	@GetMapping("/list/{id}")
	public ResponseEntity<?> getSubCategoriesByCategoryId(@PathVariable int id) {
		try {
			 List<SubCategory> subcats = subcatservice.getSubCategoriesByCategoryId(id);
			return new ResponseEntity<List<SubCategory>>(subcats, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Something went wrong....", HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> saveSubCategory(@RequestBody SubCategory sub) {
		try {
			if(subcatservice.saveSubCatgory(sub) != null) {
				return new ResponseEntity<SubCategory>(sub,HttpStatus.OK);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<String>("SubCategory cann't be saved",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@PutMapping(value = "/update")
	public ResponseEntity<?> updateSubCategory(@RequestBody SubCategory sub) {
		try {
			if (subcatservice.updateSubCategory(sub) != null) {
				return new ResponseEntity<SubCategory>(sub, HttpStatus.OK);
			}
		} catch (Exception e) {
			return new ResponseEntity<String>("Internal Server Error ", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>("Unable to save SubCategory ", HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@GetMapping("/get/{id}")
	public ResponseEntity<?> getSubCategory(@PathVariable int id){
		try {
			SubCategory sub =  subcatservice.getSubCategory(id);
			if(sub != null) {
				return new ResponseEntity<SubCategory>(sub,HttpStatus.OK);
			}
			else {
				return new ResponseEntity<String>("sub is null",HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			return new ResponseEntity<String>("Unable to get SubCategory",HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping(value="/delete/{id}")
	public int deleteSubCategory(@PathVariable int id) {
		try {
			subcatservice.deleteSubCategory(id);
			return id;
		} catch (Exception e) {
			return 0;
		}
	}
}
*/