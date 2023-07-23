package com.itview.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

@Listeners(com.itview.testng.TestNGListener.class)

public class HositalMRS_Login {
  
	WebDriver w;

	@BeforeTest
	public void preCondition() {

		w = new ChromeDriver();
	}
  
  @Test
  public void loginTestMRS() {
	  
	  w.get("https://demo.openmrs.org/openmrs/login.htm");
		
		w.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin");
		
		w.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin123");
		
		w.findElement(By.xpath("//li[@value='6']")).click();
		
		w.findElement(By.xpath("//input[@type='submit']")).click();
		
		w.findElement(By.linkText("Logout")).click();
  }

  @AfterTest
	public void postCondition() {
		
		//w.quit();
	}
}
