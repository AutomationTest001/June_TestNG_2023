package com.itview.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SoftAssertTest {

	WebDriver w;
	
	SoftAssert sft;

	@BeforeTest
	public void preCondition() {

		w = new ChromeDriver();
	}

	@Test(priority = 0, description = "Test Case to verify Admin login functionality", groups = "LoginModule")
	public void adminLogin() throws Exception {
		
		sft=new SoftAssert();

		w.get("http://testfire.net/login.jsp");
		
		
		String loginPageTitle=w.getTitle(); // return current page title
		String loginPageURL=w.getCurrentUrl();// return current page URL		
		String loginPageLabel=w.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/h1")).getText();
		
		sft.assertEquals(loginPageTitle, "Altoro Mutual");
		sft.assertEquals(loginPageURL, "http://testfire.net/login.jsp");		
		sft.assertTrue(loginPageLabel.contains("Login"),"Login Page Label is different from expected");
		
		
		w.findElement(By.id("uid")).sendKeys("admin");
		w.findElement(By.name("passw")).sendKeys("admin");
		Thread.sleep(1000);
		w.findElement(By.xpath("//*[@id='login']/table/tbody/tr[3]/td[2]/input")).click();

		sft.assertAll();
	}

	@Test(priority = 1, description = "Test Case to verify Admin Logout functionality", groups = "LoginModule",dependsOnMethods = "adminLogin" )
	public void adminLogout() throws Exception {
		
		sft=new SoftAssert();

		Thread.sleep(1000);
		
		String homePageTitle=w.getTitle();
		String homePageLabel=w.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/div/h1")).getText();
		
		sft.assertEquals(homePageTitle, "Altoro Mutual");
		sft.assertTrue(homePageLabel.contains("Admin"),"Home page label is different");
		
		w.findElement(By.linkText("Sign Off")).click();
		sft.assertAll();
	}

	@AfterTest
	public void postCondition() {

		w.close();
	}

}
