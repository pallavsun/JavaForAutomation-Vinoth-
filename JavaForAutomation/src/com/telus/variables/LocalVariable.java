package com.telus.variables;


/*
 * 1. It will be declared within the method
 * 2. It will be created while executing the block in which we declared it
 * 3. We cannot access the local variable outside the method
 */


public class LocalVariable {



	public void methodName() {
		
		int num = 10;          // Local Variable
		System.out.println(num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaring local variable inside main method
		int num2 = 100;
		System.out.println(num2);
		
		
		System.out.println("====================================");
		
      //  System.out.println(num); (We can not access the local variable outside the method)
		
		

		

	}

}
