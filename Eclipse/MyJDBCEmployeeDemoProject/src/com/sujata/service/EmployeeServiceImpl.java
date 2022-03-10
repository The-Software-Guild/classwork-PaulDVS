package com.sujata.service;

import java.util.List;

import com.sujata.entity.Employee;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	
	@Override
	public List<Employee> getAllEmployee() {
		return employeeDao.getEmployeeList();
	}

	@Override
	public boolean saveEmployee(Employee employee) {
		int rows=employeeDao.insertRecord(employee);
		if(rows>0)
			return true;
		return false;
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		return employeeDao.getRecordById(id);
	}

	@Override
	public boolean deleteEmployee(int id) {
		int rows=employeeDao.deleteRecord(id);
		if(rows>0)
			return true;
		return false;
	}

	@Override
	public boolean updateEmployeeSalary(int id, int newSal) {
		int rows=employeeDao.updateSalary(id, newSal);
		if(rows>0)
			return true;
		return false;
	}

	@Override
	public List<Employee> getDept(String Dept) {
		return employeeDao.getDeptEmployeeList(Dept);
	}

}
