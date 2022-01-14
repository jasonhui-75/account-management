package com.accountmanagement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("a3")
public class Account {
	//@Value(value = "9000")
	private int acctNo;
	//@Value(value = "51")
	private double balance;
	
	public Account() {
		super();
	}

	public Account(int acctNo, double balance) {
		super();
		this.acctNo = acctNo;
		this.balance = balance;
	}
	
	public int getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(int acctNo) {
		System.out.println("Setting acctNo");
		this.acctNo = acctNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		System.out.println("Setting balance");
		this.balance = balance;
	}
	public void deposit(double amount)
	{
		
	}
	public void withdraw(double amount)
	{
		
	}
	@Override
	public String toString() {
		return "Account [acctNo=" + acctNo + ", balance=" + balance + "]";
	}
}
