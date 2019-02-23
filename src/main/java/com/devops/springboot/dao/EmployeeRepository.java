package com.devops.springboot.dao;

import org.springframework.data.repository.CrudRepository;
import com.devops.springboot.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}