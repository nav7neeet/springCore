package com.rcb.acc;

public class HelloImpl implements Hello
{

	public HelloImpl(int i, String s)
	{
		System.out.println("test const inj "+i+s);
	}

	@Override
	public void fun(String s)
	{
		System.out.println("springing back to life -"+s);
	}
}
