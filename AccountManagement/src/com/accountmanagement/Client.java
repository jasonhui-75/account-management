package com.accountmanagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args)
	{
		ApplicationContext ac = new ClassPathXmlApplicationContext("banking-beans.xml");
		System.out.println("//==========\tCreating c1 with Setter Injection");
		Customer c1 = ac.getBean("c1", Customer.class);
		System.out.println(c1);
		
		System.out.println("//==========\tCreating c2 with Constructor Injection");
		Customer c2 = ac.getBean("c2", Customer.class);
		System.out.println(c2);
		
		System.out.println("//==========\tCreating c3 with Constructor Injection");
		Customer c3 = ac.getBean("c3", Customer.class);
		System.out.println(c3);
		
		System.out.println("//==========\tCreating c4 with Constructor Injection");
		Customer c4 = ac.getBean("c4", Customer.class);
		System.out.println(c4);
		
		System.out.println("//==========\tCreating c4 with Constructor Injection");
		Account a1 = ac.getBean("a1", Account.class);
		System.out.println(a1);

		System.out.println("//==========\tLogging AOP");
		a1.deposit(100);
		
	}
}
