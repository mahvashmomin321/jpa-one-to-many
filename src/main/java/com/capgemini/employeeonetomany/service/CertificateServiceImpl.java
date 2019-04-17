package com.capgemini.employeeonetomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.employeeonetomany.dao.EmployeeDao;
import com.capgemini.employeeonetomany.entities.Employee;


@Service
public class CertificateServiceImpl implements CertificateService{

	@Autowired
	 EmployeeDao dao;

	@Override
	public Employee addNew(Employee employee) {
		 dao.save(employee);
		return employee;
	}

	@Override
	public Employee findEmployeeById(int id) {
		Employee employee=dao.findById(id).get();
		return employee;
	}



}
