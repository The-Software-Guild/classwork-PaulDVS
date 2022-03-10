package com.sg.exercise2.bankimpl;

import com.sg.exercise2.bank.DebitInterest;
import com.sg.exercise2.bank.LoanAcc;

public class HousingLoanAcc implements LoanAcc, DebitInterest {


	@Override
	public void createAcc() {
		System.out.println(ACCOUNTTYPE4 + " account Created");

	}

	@Override
	public void calcInt() {
		System.out.println("Interest Calculated at rate of " + HOUSINGLOANINTEREST + "%");

	}

	@Override
	public void deductMonthlyInt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deductHalfYrlyInt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deductAnnualInt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void repayPrincipal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payInterest() {
		// TODO Auto-generated method stub

	}

	@Override
	public void payPartialPrincipal() {
		// TODO Auto-generated method stub

	}

	

}
