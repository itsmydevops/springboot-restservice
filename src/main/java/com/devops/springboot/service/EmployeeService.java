package com.devops.springboot.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devops.springboot.dao.EmployeeRepository;
import com.devops.springboot.model.Employee;

@Service
@Transactional
public class EmployeeService {

	private final Logger logger = LoggerFactory.getLogger(EmployeeService.class);
	
    @Autowired
    EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees() {
		logger.info("employeeRepository : " + employeeRepository);
		
		List<Employee> list = (List<Employee>)employeeRepository.findAll();
		logger.info("Employee List : " + list);
		
		return list;
	}

	public Employee getEmployee(long id) {
		return employeeRepository.findById(id).get();
	}

	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	public void updateEmployee(int id, Employee employee) {
		employeeRepository.save(employee);
	}

	public void deleteEmployee(long id) {
		employeeRepository.delete(getEmployee(id));
	}
}
