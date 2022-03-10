package com.sg.exercise2.bankimpl;

import com.sg.exercise2.bank.DebitInterest;
import com.sg.exercise2.bank.LoanAcc;

public class PersonalLoanAcc implements LoanAcc, DebitInterest {


	@Override
	public void createAcc() {
		System.out.println(ACCOUNTTYPE3 + " account Created");

	}

	@Override
	public void calcInt() {
		System.out.println("Interest Calculated at rate of " + PERSONALOANINTEREST + "%");

	}

	@Override
	public void deductMonthlyInt() {
		System.out.println("Monthly interest deducted");

	}

	@Override
	public void deductHalfYrlyInt() {
		System.out.println("Half-yearly interest deducted");

	}

	@Override
	public void deductAnnualInt() {
		System.out.println("Annual interest deducted");

	}

	@Override
	public void repayPrincipal() {
		System.out.println("Principal has been repaid");
		
	}

	@Override
	public void payInterest() {
		System.out.println("Interest has been paid");

	}

	@Override
	public void payPartialPrincipal() {
		System.out.println("Principal has been partialy repaid");

	}

}
