package com.sg.foundations.WorkerPay;

public class DailyWorker extends Worker {
	
	public DailyWorker(String workerName, int salaryRate) {
		super(workerName, salaryRate);
	}

	public int pay(int hours) {
		int pay = this.salaryRate * (hours/8)*8;
		
		return pay;
	}
}
