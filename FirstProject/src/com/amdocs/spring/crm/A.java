package com.amdocs.spring.crm;

import java.sql.Date;

public abstract class A {
	
	public transient int a=100;
	
	static // static block
	{
		System.out.println("This is First Line of OutPut | First Static Block");
	}
	
	static // static block
	{
		Date dt= new Date(0);
		System.out.println(dt);
	}
	
	{
		System.out.println("This is instance block will be executed whenever object is created");
	}

	public void m1() 
	{
		System.out.println("This is first instance method" + a );
	}
	
	public void m2() 
	{
		int b=20,c;
		c=a+b;
		System.out.println("Second instance method m2 | The sum is " + c);
	}
	
	public abstract void m5();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a=new A();
	    //a.m1();
	    
	    //A b =new A();
	    //b.m2();
	}

}
