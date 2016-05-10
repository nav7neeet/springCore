package com.rcb.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Customer.xml");

		CustomerService cust = (CustomerService) appContext.getBean("beforeProxy");

		System.out.println("*************************");
		cust.printName();
		System.out.println("*************************");
		cust.printURL();
		System.out.println("*************************");
		
		try
		{
			cust.printThrowException();
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}

	}
}
