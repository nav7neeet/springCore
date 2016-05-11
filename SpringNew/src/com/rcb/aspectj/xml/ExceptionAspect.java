package com.rcb.aspectj.xml;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionAspect
{
	public void exception()
	{
		System.out.println("after throwing exception");
	}
}
