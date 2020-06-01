package com.amdocs.spring.sd;

public class FirstClass {
	int a =20 , b=10 , c;
	
	public void add()
	{
		c=a+b;
		System.out.println("Additon " + c);
	}
	
	public void substact()
	{
		c=a-b;
		System.out.println("Substraction " + c);
	}
	public static void main(String[] args) 
	{
		FirstClass i = new FirstClass();
		i.add();
		i.substact();

	}

}
