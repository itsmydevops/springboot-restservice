package com.devops.springboot.controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.devops.springboot.model.Employee;
import com.devops.springboot.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value="/employees")
	public List<Employee> getAllEmployees() {

		return employeeService.getAllEmployees();
	}

	@GetMapping(value="/employees/{id}")
	public Employee getEmployee(@PathVariable int id) {

		return employeeService.getEmployee(id);
	}

	@PostMapping(value = "/employees")
	public void addEmployee(@RequestBody Employee employee) {

		employeeService.addEmployee(employee);
	}

	@PutMapping(value = "/employees/{id}")
	public void updateEmployee(@RequestBody Employee employee, @PathVariable int id) {

		employeeService.updateEmployee(id, employee);
	}

	@DeleteMapping(value = "/employees/{id}")
	public void deleteEmployee(@PathVariable int id) {

		employeeService.deleteEmployee(id);
	}
}
