package com.telus.inheritence;

public class SavingAccount extends Account {


	public void display()
	{
		System.out.println("Account summary is displayed");
		System.out.println("Saving account class is executed");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create an object of SavingAccount class

		SavingAccount obj=new SavingAccount();
		obj.withdrawl();
		obj.deposit();
		obj.display();



	}

}
