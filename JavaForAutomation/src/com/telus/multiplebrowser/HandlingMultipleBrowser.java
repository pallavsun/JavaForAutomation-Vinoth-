package com.telus.multiplebrowser;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;



/*=============================================================================
| Author :  Pallav Kumar
| Project:  Handling Multiple Browser
| Purpose:  How to handle more than one browser window
| Date   :  04/11/2022
 *===========================================================================*/



public class HandlingMultipleBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Set the system property for the chrome driver
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");


		//Creating instance of Chrome driver
		WebDriver driver=new ChromeDriver();


		//Maximize  the browser 
		driver.manage().window().maximize();

		//launch the URL
		String url="https://nxtgenaiacademy.com/multiplewindows";
		driver.get(url);
		System.out.println("parent browser is opened");

		//Click on button
		driver.findElement(By.name("newbrowserwindow123")).click();
		System.out.println("Child browser is opened");


		// Get the window id
		Set<String> windowId=driver.getWindowHandles();
		Iterator<String> iterator=windowId.iterator();


		//Storing the windowId
		String parentWindow=iterator.next();
		String childWindow=iterator.next();


		System.out.println("parent id : "+parentWindow);
		System.out.println("Child id : "+childWindow);


		// Switch the control from the parent window to the child window
		driver.switchTo().window(childWindow);
		System.out.println("Child browser is activated");

		// Maximize the child window
		driver.manage().window().maximize(); 


		//Click on Data Science Link
		driver.findElement(By.partialLinkText("DATA SCIENCE")).click();


		//close the child browser
		driver.close();

		// switch the control from child to parent 
		driver.switchTo().window(parentWindow);

		//Click on home link
		driver.findElement(By.linkText("HOME")).click();

		//close the parent browser
		driver.close();










	}

}
