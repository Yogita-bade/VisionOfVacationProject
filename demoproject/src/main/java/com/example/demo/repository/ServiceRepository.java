package com.example.demo.repository;

//import com.app.service.*;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.*;

public interface ServiceRepository extends CrudRepository<ServiceProvider, Integer> {
	public Iterable<ServiceProvider> deleteByName(String name);
	public ServiceProvider findByName(String name);
}
