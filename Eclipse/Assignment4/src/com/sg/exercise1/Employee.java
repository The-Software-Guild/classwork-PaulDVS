package com.sg.exercise1;

public class Employee {
	private String employeeName;
	private int employeeAge;
	
	public Employee(String employeeName, int employeeAge) {
		super();
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	
	public void checkName(String inputName) throws NonUniqueName {
		if(this.employeeName.equals(inputName)) {
			throw new NonUniqueName(inputName + " is already an employee");
		}
	}
}
