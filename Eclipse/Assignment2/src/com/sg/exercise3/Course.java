package com.sg.exercise3;

public class Course {
	private int courseID;
	private String name;
	private int fee;
	private String delivery;
	private String time;
	private Employee attendees[] = new Employee[12];
	private int attendance;
	
	
	public Course(int courseID, String name, int fee, String delivery, String time) {
		super();
		this.courseID = courseID;
		this.name = name;
		this.fee = fee;
		this.delivery = delivery;
		this.time = time;
	}
	
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getDelivery() {
		return delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Employee[] getAttendees() {
		return attendees;
	}
	public void setAttendees(Employee[] attendees) {
		this.attendees = attendees;
	}
	
	public boolean courseFull() {
		if(this.attendance == 12){
			return false;
		} else {
			return true;
		}
	}
	
	public void addAttendee(Employee newAttendee) {
		for(int i = 0; i < 12; i++) {
			if(this.attendees[i] == null) {
				this.attendees[i] = newAttendee;
				attendance++;
				i=99;
			}
		}
	}
	
	public String listAttendees() {
		String attendeeString = "Attendees: \n";
		
		for(int i = 0; i < 12; i++) {
			if(this.attendees[i] != null) {
				attendeeString += ("ID: " + this.attendees[i].getEmployeeID() + " Name:"+ this.attendees[i].getName() + "\n");
			}
		}
		
		return attendeeString;
	}
	
	public void removeAttendee(int employeeID) {
		for(int i = 0; i < 12; i++) {
			if(this.attendees[i].getEmployeeID() == employeeID) {
				this.attendees[i] = null;
				this.attendance--;
				i=99;
			}
		}
	}
	
}
