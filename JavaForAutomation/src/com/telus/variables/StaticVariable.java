package com.telus.variables;



/*
 * 1. Declaration : Inside the class and outside the method
 * 2. Single copy will be created at the class level.
 * 3. It will be declared using static keyword
 * 4. It is also called as Class Level Variables
 * 5. If the value is not declared for int - default value = 0
 * 6. If the value is not declared for String - default value = Null
 * 7. No need to create the object instance
 */


public class StaticVariable {


	// Employee Details - Instance Variables 
	String empNameOne = "Pallav";
	int empIDOne = 544567;
	float empSalaryOne = (float) 30000000.50;
	int empMobileNumOne ;
	String empAddressOne; 

	String empNameTwo= "Kumar";
	int empIDTwo = 233124;
	float empSalaryTwo = (float) 50000000.75;

	// Static Variable
	static String companyName = "Telus";
	static int companyRegNum= 1223232;

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// Creating the  object of a Class
		// ClassName objectName = new ClassName();
		InstanceVariable empOne = new InstanceVariable();
		System.out.println("Employee Name is "+ empOne.empNameOne);
		System.out.println("Employee ID is "+ empOne.empIDOne);
		System.out.println("Employee Salary is "+ empOne.empSalaryOne);
		System.out.println("Employee Mobile Number is "+ empOne.empMobileNumOne);
		System.out.println("Employee Address is "+ empOne.empAddressOne);	

		System.out.println("==========================================");

		// Calling the static variable

		System.out.println("The Company name is :"+ companyName);
		System.out.println("The Company ID is  :"+ companyRegNum);



	}

}
