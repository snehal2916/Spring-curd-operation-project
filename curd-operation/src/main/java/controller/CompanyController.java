package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Company;

@RestController

public class CompanyController {
	@Autowired  
	CompanyDetails companyservice;  
	@GetMapping("/company")  
	
	private List<Company> getAllCompany()   
	{  
	return companyservice.getAllCompany();  
	}  
	@GetMapping("/company/{name}")  
	private Company getCompany(@PathVariable("name") String name)   
	{  
	return companyservice.getname(name);  
	}  
	
	@DeleteMapping("/company/{name}")  
	private void deleteCompany(@PathVariable("name")String name )   
	{  
		companyservice.delete(name);  
	}  
	
	@PostMapping("/company")  
	private int saveCompany(@RequestBody Company name)   
	{  
		companyservice.saveOrUpdate(name);  
	return companyservice.getName();  
	}  
	@PutMapping("/company")  
	private Company update(@RequestBody Company name)   
	{  
		companyservice.saveOrUpdate(name);  
	return name;  
	}  
	}  


