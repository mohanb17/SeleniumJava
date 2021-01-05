package com.amdocs.spring.test;

public interface Rbi //Interface have abstract methods without implementation 
{

	public void CashDeposit(); //abstract methods without any implementation
	public void CashWidrawal();

	public static void main(String[] args) 
	{
	//Rbi i = new Rbi();	//cannot instantiate the type Rbi
		
	Rbi i = new Axis(); //polymorphism
	i.CashDeposit();
	i.CashWidrawal();
	}
}

