package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.*;

public interface ServiceRegistrationRepository extends CrudRepository<ServiceRegistration, Integer>{
	public Iterable<ServiceRegistration> deleteByName(String name);
	public ServiceRegistration findByName(String name);
}
