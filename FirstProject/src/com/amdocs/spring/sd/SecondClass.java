package com.amdocs.spring.sd;

public class SecondClass //Class name
{
	public int a , b , c;    //properties
	
	public void Add() 		//Method
	{
		a=10;
		b=20;
		c=a+b;
		System.out.println("Sum of a and b is:"+c);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Maths Class");
		SecondClass obj= new SecondClass();
		obj.Add();
	}
}
