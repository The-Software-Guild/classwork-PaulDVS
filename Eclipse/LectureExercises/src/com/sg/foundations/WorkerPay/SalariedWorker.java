package com.sg.foundations.WorkerPay;

public class SalariedWorker extends Worker {
	
	public SalariedWorker(String workerName, int salaryRate) {
		super(workerName, salaryRate);
	}
	
	public int pay(int hours) {
		int pay = this.salaryRate * 40;
		
		return pay;
	}

}
