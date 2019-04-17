package com.capgemini.employeeonetomany.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.employeeonetomany.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
