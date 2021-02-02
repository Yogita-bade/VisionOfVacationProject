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
//import com.app.repository.*;
import com.example.demo.model.*;
//import com.app.service.ServiceProviderServiceIF;
import com.example.demo.services.*;;
@RestController
@RequestMapping("/serviceprovider")
@CrossOrigin
public class ServiceProviderController {
	@Autowired
	private ServiceProviderService service;

	public ServiceProviderController() {
	}
	@PostMapping("/save")
	@Transactional
	public String registeruser(@RequestBody ServiceProvider serviceprovider)
	{
		service.saveMyUser(serviceprovider);
		return "Save successfully";
	}
	@GetMapping("/all-serviceprovider")
	public Iterable<ServiceProvider> showAllUsers()
	{
		return service.showAllUser();
	}

	@GetMapping("/delete/{name}")
	@Transactional
	public Iterable<ServiceProvider> deleteServiceProvider(@PathVariable String name){
		return service.deleteServiceProviderByName(name);
	}
	
	@GetMapping("/search/{name}")
	public ServiceProvider searchServiceProvider(@PathVariable String name)
	{
		return service.findByName(name);
	}
}
	
	/*@PostMapping("/save")
	public ResponseEntity<?> saveProvider(@RequestBody ServiceProvider provider) {
		try {

			service.saveServiceProvider(provider);
			return new ResponseEntity<ServiceProvider>(provider, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Incorrect data", HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<?> getProviderByID(@PathVariable int id) {
		try {
			ServiceProvider sp = service.getServiceProviderById(id);
			return new ResponseEntity<ServiceProvider>(sp, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Invalid Provider ID", HttpStatus.NOT_FOUND);
		}

	}

	@PutMapping("/update/{id}/{name}/{phoneNo}")
	public ResponseEntity<?> updateProvider(@RequestBody ServiceProvider provider, @PathVariable int id,
			@PathVariable String name, @PathVariable String phoneNo) {
		try {
			ServiceProvider sp = service.updateServiceProvider(id, name, phoneNo);
			return new ResponseEntity<ServiceProvider>(sp, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Invalid Provider ID", HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("delete/{id}")
	public ResponseEntity<?> deleteProvider(@PathVariable int id) {
		try {
			String s = service.deleteServiceProvider(id);
			return new ResponseEntity<String>(s, HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Invalid Provider ID", HttpStatus.NOT_FOUND);

		}

	}
	@PostMapping("/validate")
	public ResponseEntity<?> validateProvider(@RequestBody ServiceProvider provider) {
		try {
			ServiceProvider sp = service.validateServiceProvider(provider);
			return new ResponseEntity<ServiceProvider>(sp, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Invalid Provider ID", HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/list")
	public ResponseEntity<?> getProviders() {
		try {
			List<ServiceProvider> providers = service.getProviders(); 
			return new ResponseEntity<List<ServiceProvider>>(providers, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Unable to get all providers", HttpStatus.NOT_FOUND);
		}

	}

}*/