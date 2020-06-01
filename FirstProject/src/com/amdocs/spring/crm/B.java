package com.amdocs.spring.crm;

public class B extends A {
	
	
	
	public void m2()
	{
		a=200;
		System.out.println("This is overridden method m2" + a );
	}
	
	public static void main(String[] args) {
	 B b = new B();
	 //b.m1();
	 b.m2();
   
	}

}
