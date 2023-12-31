package com.itview.testcases.selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginMRS_CSS {

	public static void main(String[] args) throws Exception {

   
		WebDriver w=new ChromeDriver();
		
		w.get("https://demo.openmrs.org/openmrs/login.htm");
		
		w.findElement(By.cssSelector("input#username")).sendKeys("Admin");
		
		w.findElement(By.cssSelector("input[name='password']")).sendKeys("Admin123");
		
		Thread.sleep(2000);
		
		w.findElement(By.cssSelector("li[value='6']")).click();
		
		w.findElement(By.cssSelector("input[type='submit']")).click();
		
		Thread.sleep(2000);
		
		w.findElement(By.linkText("Logout")).click();
		
		w.close();
		
		System.out.println("Login Successfully.");

	}

}
