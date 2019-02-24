package com.devops.springboot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.devops.springboot.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}