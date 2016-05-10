package com.rcb.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor
{
	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable
	{
		System.out.println("before method execution");
		arg0.proceed();
		System.out.println("after method execution");
		return null;
	}
}
