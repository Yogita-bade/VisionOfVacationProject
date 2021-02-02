package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="provider")
public class ServiceProvider {
	private Integer pid;
	private String name,email,password;
	private String phoneno;
	private String status;
	
	public ServiceProvider() {
		super();
	}

	public ServiceProvider(Integer pid, String name, String email, String password, String phoneno, String status) {
		super();
		this.pid = pid;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phoneno = phoneno;
		this.status = status;
	}

	public ServiceProvider(String name, String email, String password, String phoneno, String status) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.phoneno = phoneno;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

	/*@OneToMany(targetEntity=ServiceRegistration.class,cascade=CascadeType.ALL,
			mappedBy="sprovider")
	public ArrayList<ServiceRegistration> getServices() {
		return services;
	}

	public void setServices(ArrayList<ServiceRegistration> services) {
		this.services = services;
	}
	//Convenience method to persist services
	public void addServices(ServiceRegistration service) {
		services.add(service);
		service.setSprovider(this);
	}*/
}
