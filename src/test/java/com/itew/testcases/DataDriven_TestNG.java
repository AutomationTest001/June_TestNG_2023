package com.itew.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DataDriven_TestNG {

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { 
			new Object[] { "4", "4", "+" ,"8" },			
			new Object[] { "10", "8" ,"-", "2"},
			new Object[] { "2", "2" ,"*", "4"},
		
		
		};
	}

	WebDriver w;

	@BeforeTest
	public void beforeTest() {

		w = new FirefoxDriver();
		w.get("https://juliemr.github.io/protractor-demo/");

	}

	@Test(dataProvider = "dp")
	public void calculatorTest(String firstnumber, String secondnumber,String operator, String outputValue) throws Exception {

		Thread.sleep(2000);
		w.findElement(By.xpath("/html/body/div/div/form/input[1]")).clear();
		w.findElement(By.xpath("/html/body/div/div/form/input[1]")).sendKeys(firstnumber);

		WebElement operator_dropdown = w.findElement(By.xpath("/html/body/div/div/form/select"));
		Select sc = new Select(operator_dropdown);
		sc.selectByVisibleText(operator);

		w.findElement(By.xpath("/html/body/div/div/form/input[2]")).clear();
		w.findElement(By.xpath("/html/body/div/div/form/input[2]")).sendKeys(secondnumber);
		Thread.sleep(2000);
		w.findElement(By.id("gobutton")).click();
		Thread.sleep(2000);		
		String output=w.findElement(By.xpath("/html/body/div/div/form/h2")).getText();
		Assert.assertEquals(outputValue, output);
	}

	@AfterTest
	public void afterTest() {
		
		//w.close();
	}

}
