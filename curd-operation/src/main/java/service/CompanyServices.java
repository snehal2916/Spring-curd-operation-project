package service;

import java.util.ArrayList;

import javax.management.loading.ClassLoaderRepository;

import org.hibernate.mapping.List;
import org.springframework.stereotype.Service;

import repository.CompanyRepository;

@Service

public class CompanyServices {
	@Autowired
	 CompanyRepository companyRepository ;
	
	public ArrayList<Company> getAllCompany()   
	{  
	ArrayList<Company> company = new ArrayList<Company>();  
	companyRepository.findAll();  
	return company;  
	}  
	public Company getCompanyByName(String name)   
	{  
	return companyRepository.findByName(name);
	}  
	public void saveOrUpdate(Company company)   
	{  
		companyRepository.save(company);  
	}  
	]public void delete(int id)   
	{  
		companyRepository.deletBy(id);  
	}  
	public void update(Company company, String name )   
	{  
		companyRepository.save(company);  
	}  
	}


