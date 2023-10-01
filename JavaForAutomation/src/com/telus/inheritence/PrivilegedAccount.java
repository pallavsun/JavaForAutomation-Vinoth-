package com.telus.inheritence;

public class PrivilegedAccount extends SavingAccount {


	public void card(int no)
	{
		System.out.println("Credit card number is "+no);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create an object of PrivilegedAccount class	

		PrivilegedAccount obj=new PrivilegedAccount();
		obj.withdrawl();
		obj.deposit();
		obj.display();
		obj.card(98765);


	}

}
