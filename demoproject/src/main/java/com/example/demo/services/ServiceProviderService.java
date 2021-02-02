package com.example.demo.services;
import com.example.demo.model.*;
//import com.app.pojos.*;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import com.app.dao.ServiceProviderDaoIF;

import com.example.demo.repository.*;
@Service
@Transactional
public class ServiceProviderService{

	@Autowired
	//private ServiceProviderDaoIF sdao;
	private ServiceRepository repo;
	
	public ServiceProviderService() {
	}
	
	public ServiceProviderService(ServiceRepository repo) {
	
	super();
	this.repo = repo;
}
	public void saveMyUser(ServiceProvider serviceprovider)
	{
		repo.save(serviceprovider);
	}
	public Iterable<ServiceProvider> showAllUser()
	{
		return repo.findAll();
	}

public Iterable<ServiceProvider> deleteServiceProviderByName(String name)
{
	repo.deleteByName(name);
	return repo.findAll();
}
public ServiceProvider findByName(String name)
{
	return repo.findByName(name);
}

}
	/*@Override
	public ServiceProvider saveServiceProvider(ServiceProvider sp) {
		if (sdao.saveServiceProvider(sp) != null) {
			return sp;
		}
		return null;
	}

	@Override
	public ServiceProvider getServiceProviderById(int id) {
		ServiceProvider sp = null;
		sp = sdao.getServiceProviderById(id);
		if (sp != null) {
			return sp;
		}
		return null;
	}
	@Override
	public ServiceProvider updateServiceProvider(int id, String name, String phoneNo) {
		ServiceProvider sp=null;
		sp=sdao.updateServiceProvider(id, name, phoneNo);
		if(sp!=null){
		return sp;
		}
		return null;
	}

	@Override
	public String deleteServiceProvider(int id) {
		ServiceProvider sp=null;
		sp=sdao.deleteServiceProvider(id);
		return "Deleted Service provider with details:"+sp;
		
	}
	
	@Override
	public ServiceProvider validateServiceProvider(ServiceProvider sp) {		
		return sdao.validateServiceProvider(sp);
	}
	
	@Override
	public List<ServiceProvider> getProviders() {
		return sdao.getProviders();
	}
}*/
