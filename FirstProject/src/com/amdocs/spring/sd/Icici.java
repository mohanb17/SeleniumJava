package com.amdocs.spring.sd;

public class Icici implements Rbi
{

	@Override
	public void deposit() {
		System.out.println("This is deposit of ICICI");
	
		
	}

	@Override
	public void withdrawl() {
		System.out.println("This is withdrawl of ICICI");
		
	}

	@Override
	public void balanceCheck() {

		System.out.println("This is balanceCheck of ICICI");
	}

	public static void main(String args[]) 
	{
		Icici i = new Icici();
		i.deposit();
		i.withdrawl();
		i.balanceCheck();
	}
}
