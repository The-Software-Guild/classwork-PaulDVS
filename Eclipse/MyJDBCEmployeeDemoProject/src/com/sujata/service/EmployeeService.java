package com.sujata.service;

import java.util.List;

import com.sujata.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployee();
	boolean saveEmployee(Employee employee);
	Employee getEmployeeById(int id);
	boolean deleteEmployee(int id);
	boolean updateEmployeeSalary(int id, int newSal);
	List<Employee> getDept(String Dept);
	
}
