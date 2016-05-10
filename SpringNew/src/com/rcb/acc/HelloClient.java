package com.rcb.acc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloClient
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("hello.xml");
		Hello hello = (Hello) context.getBean("hello");
		hello.fun("dossier - collection of docs");
		
		HelloImpl impl = (HelloImpl) context.getBean("hello");
		
		System.out.println(impl.getA());
		System.out.println(impl.getF());
		System.out.println(impl.getS());
		System.out.println(impl.getClass());
	}
}
