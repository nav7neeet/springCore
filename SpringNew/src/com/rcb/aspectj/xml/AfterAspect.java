package com.rcb.aspectj.xml;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAspect {

	public void after() 
	{
		System.out.println("after method call");
	}

}
