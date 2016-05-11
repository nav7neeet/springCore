package com.rcb.aop;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionAdvice implements ThrowsAdvice
{
	public void afterThrowing(IllegalArgumentException ex)
	{
		System.out.println("after throwing exception");
	}
}
