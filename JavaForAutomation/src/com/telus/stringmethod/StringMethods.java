package com.telus.stringmethod;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String firstName="  Pallav   ";
		String middleName="Kumar";
		String lastName="Maurya";
		String name="Pallav Kumar Maurya";
		
		
		// check the length of the string
		System.out.println("Lenght of string : "+name.length());
		
		System.out.println("------------------------------");
		
		// To convert the string  in to lowercase
		System.out.println("LowerCase: "+ name.toLowerCase());
		
		System.out.println("-------------------------------------");
		
		// To convert the string in to Uppercase
		System.out.println("UpperCase: "+ name.toUpperCase());
		
		System.out.println("-------------------------------------");
		
		//  To remove blank spaces at the starting and ending  position of the string
		System.out.println(firstName.trim());
		
		System.out.println("------------------------------------------");
		
		// To concatenate the strings
		System.out.println("Concat middle name and lastname: "+ middleName.concat(lastName));
		
		System.out.println("--------------------------------------------");
		
		//  To compare 2 strings
		System.out.println("Compare first name and last name: "+ firstName.equals(lastName));
		
		System.out.println("--------------------------------------------------");
		
		//  To compare 2 strings
		System.out.println(middleName.compareTo(lastName));
		
		System.out.println("----------------------------------------------------");
		
		//  To find the Character at index number
		System.out.println("character at index 3 position: "+ name.charAt(3));
		
		System.out.println("-----------------------------------------------------");
		
		//  To get the index of a character
		System.out.println("Index of 'a' is: "+name.indexOf('a'));
		System.out.println("Next index of 'a' after 12 is: "+ name.indexOf('a', 12)); // returns index of the character after the specified index
		
		System.out.println("--------------------------------------------------------");
		
		//  To check whether the specified  character is present or not
		System.out.println("Can name contains last name: "+ name.contains(lastName));
		
		System.out.println("-------------------------------------------------------------");
		
		// Returns substring of a string
		System.out.println(name.substring(7));
		
		System.out.println("---------------------------------------------------------------");
		
		//  replace
		System.out.println(name.replace("Pallav","Sunny"));
		System.out.println("-----------------------------------------------------------------");
		
		
		

		

	}

}
