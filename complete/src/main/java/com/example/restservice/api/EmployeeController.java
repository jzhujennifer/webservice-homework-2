package com.example.restservice.api;
import java.util.List;
import com.example.restservice.model.Employee;

import com.example.restservice.service.EmployeeService;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeController {
	EmployeeService employeeService = new EmployeeService();

	@GetMapping("/employee")
	public List<Employee>getAllEmployee(){
		return employeeService.getAllEmployees();
	}
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id){
		return employeeService.getById(id);
	}
	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee employee){
		employeeService.addEmployee(employee);
		return employee;
	}

}
