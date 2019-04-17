package com.capgemini.employeeonetomany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.employeeonetomany.entities.Certificate;
import com.capgemini.employeeonetomany.entities.Employee;
import com.capgemini.employeeonetomany.service.CertificateService;

@RestController
public class EmployeeController {

	@Autowired
	CertificateService service;
	
	@RequestMapping("/add")
	public Employee addEmployee() {
		Set<Certificate> certificates= new HashSet<Certificate>();
		certificates.add(new Certificate(1, "abc"));
		certificates.add(new Certificate(2, "cde"));
		
	
		return service.addNew(new Employee(101, "mahi",certificates));
		
		
		
	}
	
	@RequestMapping("/findEmployee")
	public Employee findEmployee() {
		Employee employee= service.findEmployeeById(101);
		
		return employee;
		
	}
	
}
