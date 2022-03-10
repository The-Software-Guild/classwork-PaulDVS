package com.sg.exercise2.bank;

public interface DebitInterest extends Interest {

	public void deductMonthlyInt();
	public void deductHalfYrlyInt();
	public void deductAnnualInt();
}
