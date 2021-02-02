package com.example.demo.services;




import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Login;
import com.example.demo.repository.LoginRepository;


@Service
@Transactional
public class LoginService {
	
	private final LoginRepository userRepository;
	
	public LoginService(LoginRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	public void saveMyUser(Login login ) {
		userRepository.save(login);
	}
	
	public Iterable<Login> showAllUsers(){
		return userRepository.findAll();
	}
	
	public Iterable<Login> deleteUserByUsername(String username) {
		userRepository.deleteByUsername(username);
		return userRepository.findAll();
	}
	
	public Optional<Login> editUser(int id) {
		return userRepository.findById(id);
	}
	
	public Login findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
	
	}

	