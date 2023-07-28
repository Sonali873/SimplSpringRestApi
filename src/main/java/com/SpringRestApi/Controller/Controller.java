package com.SpringRestApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRestApi.entity.Employee;
import com.SpringRestApi.service.EmployeeService;




@RestController
public class Controller {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome Everyone in Spring REST:::";
	}
	
	@GetMapping("/sayWelcome/{name}")
	public String sayWelcome(@PathVariable String name)
	{
		return "Welcome Everyone in Spring REST:::"+name;
	}
	
	@GetMapping("/getEmployees")
	public List<Employee> getEmployees()
	{
		return employeeService.getEmps();
	}
	
	@GetMapping("/getEmployeeByid/{empId}")
	public Employee getEmployeeById(@PathVariable int empId)
	{
		return employeeService.getEmpById(empId);
	}
	
	@PostMapping("/addEmployee")
	public List<Employee> addEmployee(@RequestBody Employee emmployee)
	{
		return employeeService.addEmployee(emmployee);
	}
	
	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/deleteEmployee/{empId}")
	public List<Employee> deleteEmployee(@PathVariable int empId)
	{
		return employeeService.deleteEmployee(empId);
	}
}
