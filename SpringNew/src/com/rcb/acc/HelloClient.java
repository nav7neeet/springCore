package com.rcb.acc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloClient
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("hello.xml");
		Hello hello = (Hello) context.getBean("hello");
		hello.fun();
	}
}
