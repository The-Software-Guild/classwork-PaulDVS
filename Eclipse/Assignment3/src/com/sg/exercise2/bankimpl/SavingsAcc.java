package com.sg.exercise2.bankimpl;

import com.sg.exercise2.bank.CreditInterest;
import com.sg.exercise2.bank.DepositAcc;

public class SavingsAcc implements DepositAcc, CreditInterest {

	@Override
	public void createAcc() {
		System.out.println(ACCOUNTTYPE1 + " account Created");
	}

	@Override
	public void calcInt() {
		System.out.println("Interest Calculated at rate of " + SAVINGSACCOUNTINTEREST + "%");
	}

	@Override
	public void addMonthlyInt() {
		System.out.println("Monthly interest added");
	}

	@Override
	public void addHalfYrlyInt() {
		System.out.println("Half-yearly interest added");
	}

	@Override
	public void addAnnualInt() {
		System.out.println("Annual interest added");
	}

	@Override
	public void withdraw() {
		System.out.println("X-amount withdraw from balance");
	}
	
	@Override
	public void deposit() {
		System.out.println("X-amount deposited to balance");
	}

	@Override
	public void getBalance() {
		System.out.println("Balance is x");
	}

}
