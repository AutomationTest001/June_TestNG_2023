package com.itview.testcases.selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCase {

	public static void main(String[] args)  throws Exception {

	//	 interfaceName instance=new implementationClassName();
		
		//WebDriverManager.chromedriver().setup();
		
		WebDriver w=new ChromeDriver(); // Means Open blank browser -> Chrome
		
		//Step 1 : Open application with url
		
		w.get("http://altoromutual.com:8080/login.jsp");
		
		//Step 2 : Enter username
		
		w.findElement(By.id("uid")).sendKeys("admin");
		
		//Step 3 : Enter Password
		
		w.findElement(By.name("passw")).sendKeys("admin");
		
		Thread.sleep(3000); // pause for 3000 millisec = 3 sec
		

		//Step 4: Click login
		
		w.findElement(By.xpath("//*[@id='login']/table/tbody/tr[3]/td[2]/input")).click();
	
		
		Thread.sleep(3000);
		
		//Step 5: Click Logout
		
		w.findElement(By.linkText("Sign Off")).click();
		
		//Step 6 : Close 
		
		w.close();
		
		System.out.println("Admin Login Successfully....");

	
	}

}
