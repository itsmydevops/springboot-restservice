package com.devops.springboot.controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.devops.springboot.model.Employee;
import com.devops.springboot.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value="/employees", method = RequestMethod.GET)
	public List<Employee> getAllEmployees() {

		return employeeService.getAllEmployees();
	}

	@RequestMapping(value="/employees/{id}", method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable int id) {

		return employeeService.getEmployee(id);
	}

	@RequestMapping(value = "/employees", method = RequestMethod.POST)
	public void addEmployee(@RequestBody Employee employee) {

		employeeService.addEmployee(employee);
	}

	@RequestMapping(value = "/employees/{id}", method = RequestMethod.PUT)
	public void updateEmployee(@RequestBody Employee employee, @PathVariable int id) {

		employeeService.updateEmployee(id, employee);
	}

	@RequestMapping(value = "/employees/{id}", method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable int id) {

		employeeService.deleteEmployee(id);
	}
}
