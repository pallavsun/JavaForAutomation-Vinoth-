package com.telus.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*=============================================================================
| Author :  Pallav Kumar
| Project:  Register Demo Page
| Purpose:  Object Identification
| Date   :  16/10/2022
 *===========================================================================*/




public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// Set the system property for the chrome driver
				System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

				//Create  an instance of Chrome driver
				WebDriver driver = new ChromeDriver();
				
				//Store the Url in a variable
				String url = "https://nxtgenaiacademy.com/demo-site/";

				// Launch  the URL
				driver.get(url);

				// Maximize the Window
				driver.manage().window().maximize();

				// Identifying Weblement using Locators(id ,xpath css selector ,name ,linkText ,partialLinkText)
				
				// First Name  (By id)
				driver.findElement(By.id("vfb-5")).sendKeys("Pallav ");

				//Last Name
				driver.findElement(By.id("vfb-7")).sendKeys("Kumar");

				// Identifying Weblement (By name)
				//Street Address
				driver.findElement(By.name("vfb-13[address]")).sendKeys("New Avas Vikas");

				//   Apt suite Bldg
				driver.findElement(By.name("vfb-13[address-2]")).sendKeys("Near LIC");
				
				// Identifying Weblement (By cssSelector)
				// Enter the City Name
				driver.findElement(By.cssSelector("#vfb-13-city")).sendKeys("Rampur");
				
				// Enter the State
				driver.findElement(By.cssSelector("#vfb-13-state")).sendKeys("Uttar pradesh");	
				
				// Identifying Weblement (By Xpath)
				// Email ID
				driver.findElement(By.xpath("//*[@id='vfb-14']")).sendKeys("pallav18kumar@gmail.com");
				
				// Mobile Number
				driver.findElement(By.xpath("//*[@id='vfb-19']")).sendKeys("7906189818");

				// Identifying Weblement (By LinkText)
				//Click on HOME
				driver.findElement(By.linkText("HOME")).click();		
				
				// Identifying Weblement (By partialLinkText) 
				// Click on Registration Form  Link
				driver.findElement(By.partialLinkText("Registration Form")).click();
				
				// Close
				driver.close();

	}

}
