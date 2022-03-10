package com.sujata.model.service;

import java.util.List;

import com.sujata.entity.Employee;
import com.sujata.entity.EmployeeList;

public interface EmployeeService {

	public Employee getEmployeeById(int id);
	public boolean saveEmployee(Employee employee);
	public EmployeeList getAllEmployees();
	public boolean deleteEmployeeById(int id);
	public boolean updateEmployeeSalById(int id, int newSal);
}
