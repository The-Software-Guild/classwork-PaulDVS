package com.sg.exercise2.bank;

public interface LoanAcc extends Account {

	public void repayPrincipal();
	public void payInterest();
	public void payPartialPrincipal();
}
