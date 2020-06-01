package com.amdocs.spring.sd;

public class SecondClass {
	
	int a = 10, b =20, c;
	
	public void Multiply() 
	{
		c=a*b;
		System.out.println("Multiplication : "+c);
		
	}
	
	
	public static void main(String args[]) 
	{
		SecondClass i = new SecondClass();
		i.Multiply();
	}
	

}
