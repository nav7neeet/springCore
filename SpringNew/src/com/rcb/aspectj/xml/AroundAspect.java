package com.rcb.aspectj.xml;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAspect
{
	public Object around()
	{
		System.out.println("before method execution");
		System.out.println("after method execution");
		return null;
	}
}
