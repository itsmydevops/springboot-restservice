package com.devops.springboot.model;

public class Employee {

	private int employee_id;
	private String employee_name;
	private String employee_city;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, String eaddress) {
		super();
		this.employee_id = eid;
		this.employee_name = ename;
		this.employee_city = eaddress;
	}
	
	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmployee_city() {
		return employee_city;
	}

	public void setEmployee_city(String employee_city) {
		this.employee_city = employee_city;
	}


	
}
