package com.telus.programmingfundamentals;

public class Operators {

	public static void main(String[] args) {
	
		
		// 1. Arithmetic Operator
				byte num1=3; 
				byte num2=4;	
				byte num3=5;
				byte num4=3;
				
				//Addition of two numbers
				byte addition=(byte) (num1+num2);
				System.out.println("Addition of 2 no  is: "+addition);
				
				//Subtraction of two numbers
				byte subtract=(byte) (num3-num1);
				System.out.println("Subtraction of 2 no is: "+subtract);
				
				//Multiplication of two numbers
				byte multiply=(byte) (num3*num1);
				System.out.println("Multiplication of 2 no is: "+multiply);
				
				//Division of two numbers
				byte division=(byte) (num3/num1);
				System.out.println("Division of 2 no is: "+division);
				
				//Remainder of two numbers
				byte remainder=(byte) (num3%num1);
				System.out.println("Remainder is: "+remainder);
				
				System.out.println("-----------------");
				
				// 2. Equality and relation operators
				//Equal to 
				System.out.println(num1==num4);
				
				//Greater than
				System.out.println(num2>num1);
				
				//Less than
				System.out.println(num1<num3);
				
				//Less than equal to
				System.out.println(num1<=num4);
				
				//Greater than equal to
				System.out.println(num2>=num4);
				
				System.out.println("====================");
				
				// 3. Conditional Operator
				//And - if both the condition is true - denoted by '&&'
				System.out.println(num1<num3 && num1<=num4);
				System.out.println(num1<num3 && num1>=num2);
				
				// OR - if any one condition is true - denoted by '||'
				System.out.println(num1<num3 || num1<=num4);
				System.out.println(num1<num3 || num1>=num2);
				
				System.out.println("-----------------");
				
				// 4. Unary Operator
				// Pre-increment
				int num5=++num1; //num1 =4 after increment num1 = 5
				System.out.println("Value of num5 is:"+num5);
				System.out.println("Value of num1 is:"+num1);
				
				// Post- increment
				int num6=num4++; //num4 =4 after increment num4 = 5
				System.out.println("Value of num6 is:"+num6);
				System.out.println("Value of num4 is:"+num4);
		
		
		

	}

}
