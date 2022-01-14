package com.accountmanagement;

import java.time.LocalDate;

import org.springframework.context.annotation.Scope;

//@Scope("singleton")
public class FixedDeposit {
	private int acctNo;
	private double amount;
	private String maturityDate;
	
	public FixedDeposit(int acctNo, double amount, String maturityDate) {
		super();
		this.acctNo = acctNo;
		this.amount = amount;
		this.maturityDate = maturityDate;
	}
	
	public int getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}

	@Override
	public String toString() {
		return "FixedDeposit [acctNo=" + acctNo + ", amount=" + amount + ", maturityDate=" + maturityDate + "]";
	} 
	
}
