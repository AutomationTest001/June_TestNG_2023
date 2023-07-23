package com.itview.testcases.selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginMRS_XPATH {

	public static void main(String[] args) throws Exception {

   
		WebDriver w=new ChromeDriver();
		
		w.get("https://demo.openmrs.org/openmrs/login.htm");
				
		w.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin");
		
		w.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin123");
		
		w.findElement(By.xpath("//li[@value='6']")).click();
		
		w.findElement(By.xpath("//input[@type='submit']")).click();
		
		w.findElement(By.linkText("Logout")).click();
		
		w.close();
		
		System.out.println("Login Successfully.");

	}

}
