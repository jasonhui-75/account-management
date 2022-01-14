package com.accountmanagement;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	/*
	@Before(value = "dummy()")
	public void logBefore(JoinPoint jp)
	{
		System.out.println("Before deposit");
	}
	@After(value = "dummy()")
	public void logAfter(JoinPoint jp)
	{

		System.out.println("After deposit");
	}
	@AfterThrowing(value = "dummy()")
	public void logAfterThrowing(JoinPoint jp)
	{

		System.out.println("Encountered Error while depositing");
	}
	 */
	
	@Around(value= "dummy()")
	public Object logAround(ProceedingJoinPoint jp)
	{
		Object returnValue = null;
		System.out.println("Around: Before deposit");
		try {
			returnValue = jp.proceed();//Invoking deposit
			System.out.println("Around: After deposit");
		}catch(Throwable e)
		{
			System.out.println("Around: Exception");
		}
		return returnValue;
	}
	@Pointcut(value = "execution (* *.deposit*(..))")
	public void dummy()
	{
	}
}

