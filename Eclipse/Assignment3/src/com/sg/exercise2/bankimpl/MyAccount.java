package com.sg.exercise2.bankimpl;

public class MyAccount {
	public static void main(String[] args) {
		SavingsAcc mySavings = new SavingsAcc();
		FDAcc myDeposit = new FDAcc();
		PersonalLoanAcc myPersonalLoan = new PersonalLoanAcc();
		HousingLoanAcc myHouseLoan = new HousingLoanAcc();
		
		
		mySavings.createAcc();
		myDeposit.createAcc();
		myPersonalLoan.createAcc();
		myHouseLoan.createAcc();
	}
}
