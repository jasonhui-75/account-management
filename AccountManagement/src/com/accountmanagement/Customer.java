package com.accountmanagement;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
	private String firstName;
	private String lastName;
	private Integer ssn;
	@Autowired
	//@Resource(name="a1")
	@Qualifier(value="a2")
	private Account account;
	
	private List<FixedDeposit> FixedDeposits;
	public Customer() {
		super();
	}
	
	public Customer(String firstName, String lastName) {
		super();
		System.out.println("constructor with 2 param");
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Customer(String firstName, String lastName, Integer ssn) {
		super();
		System.out.println("constructor with 3 param");
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		System.out.println("Setting firstName");
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		System.out.println("Setting lastName");
		this.lastName = lastName;
	}
	public Integer getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		System.out.println("Setting ssn");
		this.ssn = ssn;
	}
	
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		System.out.println("Setting account");
		this.account = account;
	}
	
	public List<FixedDeposit> getFixedDeposits() {
		return FixedDeposits;
	}

	public void setFixedDeposits(List<FixedDeposit> fixedDeposits) {
		FixedDeposits = fixedDeposits;
	}

	public void init()
	{
		System.out.println("Initializing");
		if(this.ssn == null )
		{
			System.out.println("ssn is initialized to default value 999999");
			this.ssn = 999999;
		}
		
	}
	public void destroy()
	{
		System.out.println("Destroying");
		this.account = null;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + ", account=" + account
				+ ",\n FixedDeposits=" + FixedDeposits + "]";
	}
	
	

	
	
}
