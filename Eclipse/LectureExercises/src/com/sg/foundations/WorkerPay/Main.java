package com.sg.foundations.WorkerPay;

public class Main {

	public static void main(String[] args) {


		Worker currentWorker;
		
		currentWorker = new DailyWorker("Alex", 12);
		System.out.println(currentWorker.pay(60));
		
		
		currentWorker = new SalariedWorker("John", 12);
		System.out.println(currentWorker.pay(60));
	}

}
