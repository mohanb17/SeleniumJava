package com.amdocs.spring.sd;

public class OverLoading 
{
	
	public void m1() 
	{
		System.out.println("This is method m1");
	}
	
	public void m2(int i, int j) 
	{
		int k;
		k=i+j;
		System.out.println("The sum is :- " +k);
	}
	
	public void m2(int i , float f)
	{
		float l;
		l=i+f;
		System.out.println("The sum is :- "+l);
		
	}
	
	public static void main(String args[]) 
	{
		System.out.println("This is example of Operator Overloading");
		OverLoading o = new OverLoading();
		o.m1();
	//	o.m2(10,20);
		o.m2(100, 10.2f);
	}
}
