package com.rcb.aspectj.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeforeAspectTest
{
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("aspectj.xml");
		CustomerBo bo=(CustomerBo) context.getBean("customerBoImpl");
		
		/*bo.addCustomer();
		bo.addCustomerReturnValue();*/
		try 
		{
			bo.addCustomerThrowException();
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
	
		/*bo.addCustomerAround("reckon");*/
	}
}
