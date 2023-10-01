package com.telus.variables;



/*
 * 1. Declaration : Inside the class and outside the method
 * 2. Values of the variables changes from object to object
 * 3. It is also called as Object Level Variables
 * 4. For every object separate copy of instance variable is created
 * 5. If the value is not declared for int - default value = 0
 * 6. If the value is not declared for String - default value = Null
 */

public class InstanceVariable {


	// Employee Details - (Instance Variables)
	String empNameOne = "Pallav";
	int empIDOne = 345677;
	float empSalaryOne = (float) 5000000.50;
	int empMobileNumOne ;
	String empAddressOne; 

	String empNameTwo= "Vinoth";
	int empIDTwo = 233124;
	float empSalaryTwo = (float) 4000000.75;

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// Creating the object of class Instancevariable
		// ClassName objectName = new ClassName();
		InstanceVariable empOne = new InstanceVariable();
		System.out.println("Employee Name is "+ empOne.empNameOne);
		System.out.println("Employee ID is "+ empOne.empIDOne);
		System.out.println("Employee Salary is "+ empOne.empSalaryOne);
		System.out.println("Employee Mobile Number is "+ empOne.empMobileNumOne);
		System.out.println("Employee Address is "+ empOne.empAddressOne);	


		System.out.println("=============================================");	

		InstanceVariable empTwo = new InstanceVariable();
		System.out.println("Employee Name is "+ empTwo.empNameTwo);
		System.out.println("Employee ID is "+ empTwo.empIDTwo);
		System.out.println("Employee Salary is "+ empTwo.empSalaryTwo);





	}

}
