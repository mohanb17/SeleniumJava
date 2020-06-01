package com.amdocs.spring.oms;
import com.amdocs.spring.crm.*;

public class C extends A
{
	{
		System.out.println("This is class C instance block");
	}
	
	static 
	{
		System.out.println("This is class C static block");
	}
	
	public void m3() 
	{
		a=300;
		System.out.println("This is m3 from class C" + a);
	}
	
	

	
	public static void main(String[] args) 
	{
		//C c = new C();
		//c.m3();
		//c.m1();
		//c.m2();
		//c.m5();
		A obj1 = new C();
		obj1.m1();
		obj1.m2();
	}




	@Override
	public void m5() {
		System.out.println("This is overridden abstract method from class C");
		
	}
}
