package com.itview.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Altoromutual_Login {

	WebDriver w;

	@BeforeTest
	public void preCondition() {

		w = new ChromeDriver();
	}

	@Test(priority = 0,description = "Test Case to verify Admin login functionality",groups="LoginModule",invocationCount = 1)
	public void adminLogin()  throws Exception {

		w.get("http://altoromutual.com:8080/login.jsp");
		w.findElement(By.id("uid")).sendKeys("admin");
		w.findElement(By.name("passw")).sendKeys("admin");
		Thread.sleep(3000);
		w.findElement(By.xpath("//*[@id='login']/table/tbody/tr[3]/td[2]/input")).click();
		Thread.sleep(3000);
		w.findElement(By.linkText("Sign Off")).click();
		
		//Assert.fail();

	}
	
	@Test(priority = 1,description = "Test Case to verify JSmith login functionality",dependsOnMethods="adminLogin",groups="LoginModule",enabled = true)
	public void jSmithLogin()  throws Exception {

		w.get("http://altoromutual.com:8080/login.jsp");
		w.findElement(By.id("uid")).sendKeys("jsmith");
		w.findElement(By.name("passw")).sendKeys("Demo1234");
		Thread.sleep(3000);
		w.findElement(By.xpath("//*[@id='login']/table/tbody/tr[3]/td[2]/input")).click();
		Thread.sleep(3000);
		w.findElement(By.linkText("Sign Off")).click();

	}
	
	@Test(priority = 2,description = "Test Case to verify TestUser login functionality",dependsOnMethods="adminLogin",groups="LoginModule")
	public void testUserLogin()  throws Exception {

		w.get("http://altoromutual.com:8080/login.jsp");
		w.findElement(By.id("uid")).sendKeys("tuser");
		w.findElement(By.name("passw")).sendKeys("tuser");
		Thread.sleep(3000);
		w.findElement(By.xpath("//*[@id='login']/table/tbody/tr[3]/td[2]/input")).click();
		Thread.sleep(3000);
		w.findElement(By.linkText("Sign Off")).click();

	}

	@AfterTest
	public void postCondition() {
		
		w.close();
	}

}
