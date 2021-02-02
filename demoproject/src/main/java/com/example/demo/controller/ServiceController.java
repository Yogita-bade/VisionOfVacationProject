package com.example.demo.controller;

//import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.app.pojos.Category;
import com.example.demo.services.*;
//import com.app.service.CategoryService;
import com.example.demo.model.*;;
//import com.app.service.ServiceRegistrationServiceIF;

@RestController
@RequestMapping("/service")
@CrossOrigin
public class ServiceController {

	@Autowired
	private ServiceRegistrationService service;
	//private ServiceRegistrationServiceIF sservice;
	
	public ServiceController() {
	}
	
	@PostMapping("/save")
	@Transactional
	public String registeruser(@RequestBody ServiceRegistration serviceregistration)
	{
		service.saveMyUser(serviceregistration);
		return "Hello your Booking done successfully";
	}
	@GetMapping("/all-serviceregistration")
	public Iterable<ServiceRegistration> showAllUsers()
	{
		return service.showAllUser();
	}

	@GetMapping("/delete/{name}")
	@Transactional
	public Iterable<ServiceRegistration> deleteServiceRegistration(@PathVariable String name){
		return service.deleteServiceRegistrationByName(name);
	}
	@GetMapping("/search/{name}")
	public ServiceRegistration searchServiceRegistration(@PathVariable String name)
	{
		return service.findByName(name);
	}

	
}
/*	@GetMapping(value="/get/{id}")
	public ServiceRegistration getService(@PathVariable int id) {
		try {
			return sservice.getService(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@PostMapping(value="/save")
	public ResponseEntity<?> saveService(@RequestBody ServiceRegistration sr) {
		try {
			return new ResponseEntity<ServiceRegistration>(sservice.saveService(sr),HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Unable to save Service",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping(value="/delete/{id}")
	public ServiceRegistration deleteService(@PathVariable int id) {
		try {
			return sservice.deleteService(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@PutMapping(value="/update")
	public ServiceRegistration updateService(@RequestBody ServiceRegistration sr) {
		return sservice.updateService(sr);
	}
	
	@GetMapping(value="/search/{searchString}")
	public List<ServiceRegistration> searchService(@PathVariable String searchString)
	{
		return sservice.searchService(searchString);
	}
	
	@GetMapping(value="/searchbyscid/{id}")
	public List<ServiceRegistration> getServiceBySubCategoryId(@PathVariable int id)
	{
		return sservice.getServiceBySubCategoryId(id);
	}
	
	
	
	@GetMapping(value="/getbypid/{id}")
	public List<ServiceRegistration> searchService(@PathVariable int id)
	{
		return sservice.getServiceByProviderID(id);
	}
}
*/