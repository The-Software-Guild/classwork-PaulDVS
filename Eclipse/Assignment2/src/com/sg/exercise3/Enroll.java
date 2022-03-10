package com.sg.exercise3;

public class Enroll {
	Course courseList[] = new Course[12];
	Employee employeeList[] = new Employee[12];
	
	public Enroll() {
		super();
		
		courseList[0] = new Course(1, "Computing Science", 100, "Classroom", "Full");
		courseList[1] = new Course(2, "Computing Science", 50, "Classroom", "Part");
		courseList[2] = new Course(3, "Network Security", 120, "Online", "Full");
		courseList[3] = new Course(4, "Network Security", 60, "Online", "Part");
		courseList[4] = new Course(5, "Art", 700, "Classroom", "Full");
		
		employeeList[0] = new Employee(1, "Adam Smith");
		employeeList[1] = new Employee(2, "Jack Williams");
		employeeList[2] = new Employee(3, "Anna Black");
		employeeList[3] = new Employee(4, "John Metro");
		employeeList[4] = new Employee(5, "Zack White");
		
	}
	
	
	public Course[] getCourseList() {
		return courseList;
	}



	public void setCourseList(Course[] courseList) {
		this.courseList = courseList;
	}



	public Employee[] getEmployeeList() {
		return employeeList;
	}



	public void setEmployeeList(Employee[] employeeList) {
		this.employeeList = employeeList;
	}



	public void listCourses() {
		String courseString = "Courses: \n";
		
		for(int i = 0; i < 12; i++) {
			if(this.courseList[i] != null) {
				courseString += ("ID: " + this.courseList[i].getCourseID() + " Name:"+ this.courseList[i].getName() + " Time:"+ this.courseList[i].getTime() + " Delivery:"+ this.courseList[i].getDelivery() + "\n");
			}
		}
		
		System.out.println("");
		System.out.println(courseString);
	}
	
	public void listEmployees() {
		String employeeString = "Employees: \n";
		
		for(int i = 0; i < 12; i++) {
			if(this.courseList[i] != null) {
				employeeString += ("ID: " + this.employeeList[i].getEmployeeID() + " Name:"+ this.employeeList[i].getName() + "\n");
			}
		}
		
		System.out.println("");
		System.out.println(employeeString);
	}
	
	public void register(int courseID, int employeeID){
		Employee currentEmployee = null;
		
		for(int i = 0; i < 12; i++) {
			if(this.employeeList[i].getEmployeeID() == employeeID) {
				currentEmployee = employeeList[i];
				i=99;
			}
		}
		
		for(int i = 0; i < 12; i++) {
			if(this.courseList[i].getCourseID() == courseID) {
				this.courseList[i].addAttendee(currentEmployee);
				i=99;
			}
		}
	}
	
	public void viewCourseAttendees(int courseID) {
		System.out.println("");
		
		for(int i = 0; i < 12; i++) {
			if(this.courseList[i].getCourseID() == courseID) {
				System.out.println(this.courseList[i].listAttendees());
				i=99;
			}
		}
		
	}
	
	public void deRegister(int courseID, int employeeID) {
		for(int i = 0; i < 12; i++) {
			if(this.courseList[i].getCourseID() == courseID) {
				this.courseList[i].removeAttendee(employeeID);
				i=99;
			}
		}
	}
}
