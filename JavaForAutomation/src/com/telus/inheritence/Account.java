package com.telus.inheritence;




/*=============================================================================
| Author :  Pallav Kumar
| Project:  Inheritence 
| Purpose:  Multilevel inheritence
| Date   :  03/11/2022
 *===========================================================================*/


public class Account {

	public void deposit()
	{
		System.out.println("Money is deposited in account");
		System.out.println("Account class is executed");


	}

	public void withdrawl()
	{
		System.out.println("Money is withdrawn from the account");
		System.out.println("Account class is executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create an object of Account class

		Account obj=new Account();
		obj.deposit();
		obj.withdrawl();



	}

}
