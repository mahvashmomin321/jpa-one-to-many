package com.capgemini.employeeonetomany.service;

import com.capgemini.employeeonetomany.entities.Employee;

public interface CertificateService {

	public Employee addNew(Employee employee);
	public Employee findEmployeeById(int id);
}
