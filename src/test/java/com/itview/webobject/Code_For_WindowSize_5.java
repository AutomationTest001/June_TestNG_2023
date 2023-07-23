package com.itview.webobject;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Code_For_WindowSize_5 {

	WebDriver w;

	@BeforeTest
	public void beforeTest() {

	 
		   w=new ChromeDriver();
		   
		
	}

	@Test
	public void Code_For_WindowSize() throws InterruptedException {
		
	
		w.get("https://www.google.co.in/");
		Thread.sleep(1000);
		
		w.manage().window().maximize();
		
		Thread.sleep(1000);
		
		//Set Window Size  (Parameter - > width , height)
		
		Dimension d=new Dimension(1600, 600);
		
		w.manage().window().setSize(d);
		
		
		
		
		
		//Dimension d=new Dimension(1600, 1200);
      //  w.manage().window().setSize(d);	
		
		
			
	}

	@AfterTest
	public void afterTest() {
	}

}
