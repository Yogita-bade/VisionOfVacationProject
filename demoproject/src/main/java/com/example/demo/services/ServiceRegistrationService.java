package com.example.demo.services;

import com.example.demo.repository.*;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import com.app.dao.ServiceRegistrationDaoIF;
//import com.app.pojos.ServiceProvider;
import com.example.demo.model.*;
//import com.app.repository.ServiceRepository;

@Service
@Transactional
public class ServiceRegistrationService {

	@Autowired
	private ServiceRegistrationRepository repo;

	//private ServiceRegistrationDaoIF srdao;
	
	public ServiceRegistrationService() {
	}
	
	public ServiceRegistrationService(ServiceRegistrationRepository repo) {
	
	super();
	this.repo = repo;
}
	public void saveMyUser(ServiceRegistration serviceregistration)
	{
		repo.save(serviceregistration);
	}
	public Iterable<ServiceRegistration> showAllUser()
	{
		return repo.findAll();
	}

public Iterable<ServiceRegistration> deleteServiceRegistrationByName(String name)
{
	repo.deleteByName(name);
	return repo.findAll();
}
public ServiceRegistration findByName(String name)
{
	return repo.findByName(name);
}

}

	/*@Override
	public ServiceRegistration saveService(ServiceRegistration sr) {
		if (srdao.saveService(sr)!= null) {
			return sr;
		}
		return null;
	}

	@Override
	@Transactional(readOnly=true)
	public ServiceRegistration getService(int id) {
		return srdao.getService(id);
	}

	@Override
	public ServiceRegistration deleteService(int id) {
		return srdao.deleteService(id);
	}
	
	@Override
	public ServiceRegistration updateService(ServiceRegistration sr) {
		return srdao.updateService(sr);
	}
	
	@Transactional(readOnly=true)
	@Override
	public List<ServiceRegistration> searchService(String st) {
		
		return srdao.searchService(st);
	}
	
	@Transactional(readOnly=true)
	@Override
	public List<ServiceRegistration> getServiceByProviderID(int id) {
		return srdao.getServiceByProviderID(id);
	}
	
	@Transactional(readOnly=true)
	@Override
	public List<ServiceRegistration> getServiceBySubCategoryId(int id) {
		return srdao.getServiceBySubCategoryId(id);
	}
}
*/