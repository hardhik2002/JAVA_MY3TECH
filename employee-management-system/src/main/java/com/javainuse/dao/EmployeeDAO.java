package com.javainuse.dao;

import java.util.ArrayList;
import java.util.List;

import com.javainuse.domain.Department;
import com.javainuse.domain.Employee;

public class EmployeeDAO {
	private Department department=new Department("java");
	private List<Employee> testEmployees = new ArrayList<Employee>();

	public void addNewEmployee(Employee employee) {
		testEmployees.add(employee);
	}

	public List<Employee> getAllEmployees() {
		return new ArrayList<Employee>(testEmployees);
	}
	public Department getDepartment(){
		return department;
	}

}