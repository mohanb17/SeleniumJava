package com.amdocs.spring.test;

public class Axis implements Rbi { //Overriding

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Axis i = new Axis(); //creating obj refererne i, new is allocating memory,Axis()Constructor
	i.CashDeposit();
	i.CashWidrawal();
	}

	@Override
	public void CashDeposit() {
	int Dep;
	System.out.println("Deposit to Axis bank");
	Dep=10000;
	System.out.println("Deposited Amount:- "+Dep);

	}

	@Override
	public void CashWidrawal() {
	System.out.println("Withdrawal from Axix bank");	
	int Wit;
	Wit=1000;
	System.out.println("Withdrawal Amount:- "+Wit);	
	}

}
