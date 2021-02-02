package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Login;
import com.example.demo.services.LoginService;

import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

import javax.transaction.Transactional;


@RestController
@RequestMapping("/login")
@CrossOrigin
public class LoginController {

	
	@Autowired
	private LoginService service;
	
	@PostMapping("/save-user")
	@Transactional
	public String registeruser(@RequestBody Login admin)
	{
		service.saveMyUser(admin);
		return "Hello " +admin.getUsername()+" your login successfully";
	}
	
	@GetMapping("/all-users")
	public Iterable<Login> showAllUsers()
	{
		return service.showAllUsers();
	}

}
