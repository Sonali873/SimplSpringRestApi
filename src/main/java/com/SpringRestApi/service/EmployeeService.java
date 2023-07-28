package com.SpringRestApi.service;

import java.util.List;

import com.SpringRestApi.entity.Employee;



public interface EmployeeService {
	 List<Employee> getEmps() ;
	 
	 Employee getEmpById(int id);

	 List<Employee> addEmployee(Employee employee);

	Employee updateEmployee(Employee employee);
	
	List<Employee> deleteEmployee(int id);
}
