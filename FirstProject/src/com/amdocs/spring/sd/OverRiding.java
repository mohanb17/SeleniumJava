package com.amdocs.spring.sd;

public class OverRiding extends FirstClass
{
	final void m4() 
	{
		System.out.println("This is from m4 from child class");
	}
	
	public static void main (String args[]) 
	{
		System.out.println("This is main method from overriding class");
		
		OverRiding o = new OverRiding();
		o.add();
		o.substact();
		o.m4();
		
		
	}

}
