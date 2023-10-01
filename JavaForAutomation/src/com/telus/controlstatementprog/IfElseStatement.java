package com.telus.controlstatementprog;

public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if else if ladder 

		int marks=93;


		if(marks>=80  && marks<=100)
		{

			System.out.println("Student Grade is O");
		}

		else if(marks>=75  && marks<=79)
		{

			System.out.println("Student Grade is A");
		}

		else if(marks>=70  && marks<=74)
		{

			System.out.println("Student Grade is B");
		}

		else if(marks>=60  && marks<=69)
		{

			System.out.println("Student Grade is C");
		}


		else if(marks>=50  && marks<=59)
		{

			System.out.println("Student Grade is D");
		}


		else if(marks>=45  && marks<=49)
		{

			System.out.println("Student Grade is E");
		}

		else if(marks>=40  && marks<=44)
		{

			System.out.println("Student Grade is P");
		}


		else if(marks>=0  && marks<=39)
		{

			System.out.println("Student Grade is Fail");
		}


		else
		{
			System.out.println("Invalid data");
		}




		System.out.println("==============================================");	

		
		//  Print no from 10 to 1 in descending order using for Loop

		System.out.println("No from 10 to 1 in descending order");

		for(int number=10;number>0;number--)
		{
			System.out.println(number);
		}





	}

}
