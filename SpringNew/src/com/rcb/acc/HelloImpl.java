package com.rcb.acc;

public class HelloImpl implements Hello
{
	int a;
	String s;
	float f;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public float getF() {
		return f;
	}

	public void setF(float f) {
		this.f = f;
	}

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
