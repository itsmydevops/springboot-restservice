package com.devops.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.devops.springboot.model.Employee;

@Service
public class EmployeeService {

	private List<Employee> empList = new ArrayList<>(Arrays.asList(
			new Employee(111111, "Srini", "Arizona"),
			new Employee(222222, "Siridevi", "Vinjamur"), 
			new Employee(333333, "Chandu", "kadapa")));

	public List<Employee> getAllEmployees() {
		return empList;

	}

	public Employee getEmployee(int id) {
		Employee e = null;
		for (int i = 0; i < empList.size(); i++) {
			e = empList.get(i);
			if (e.getEmployee_id() == id) {
				return e;
			}
		}
		return null;
	}

	public void addEmployee(Employee employee) {
		empList.add(employee);
	}

	public void updateEmployee(int id, Employee employee) {
		for (int i = 0; i < empList.size(); i++) {
			Employee e = empList.get(i);
			if (e.getEmployee_id() == id) {
				empList.set(i, employee);
				return;
			}
		}
	}

	public void deleteEmployee(int id) {
		for (int i = 0; i < empList.size(); i++) {
			Employee e = empList.get(i);
			if (e.getEmployee_id() == id) {
				empList.remove(e);
				return;
			}
		}
	}
}
