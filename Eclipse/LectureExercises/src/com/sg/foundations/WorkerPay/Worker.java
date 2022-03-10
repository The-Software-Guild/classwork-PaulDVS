package com.sg.foundations.WorkerPay;

public class Worker {
	String workerName;
	int salaryRate;
	
	public Worker(String workerName, int salaryRate) {
		super();
		this.workerName = workerName;
		this.salaryRate = salaryRate;
	}

	public int pay(int hours) {
		return 0;
	}

	public String getWorkerName() {
		return workerName;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public int getSalaryRate() {
		return salaryRate;
	}

	public void setSalaryRate(int salaryRate) {
		this.salaryRate = salaryRate;
	}
	
	
}
