package com.itview.webobject;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Code_For_MouseHandle_7 {

	WebDriver w;

	@BeforeTest
	public void beforeTest() {

			 
		   w=new ChromeDriver();
		w.manage().window().maximize();	
	}

	@Test
	public void Code_For_MouseHandle_Test() throws Exception {
		
		Actions a=new Actions(w);
		
		
		  w.get("https://www.flipkart.com/");
		  
		  Thread.sleep(6000);
		 
		 WebElement ElectronicsLink=w.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[2]/div/div/span/span[1]"));
		
		a.moveToElement(ElectronicsLink).build().perform();
		
	//	a.doubleClick(ElectronicsLink).build().perform();
		
		 Thread.sleep(3000);
		 
		 w.findElement(By.linkText("Electronics GST Store")).click();
		
		String pageLabel=w.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/h1")).getText();
		
		 Thread.sleep(3000);
		
		System.out.println(pageLabel);
		
		WebElement pageLabelObject=w.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/h1"));
		
		a.moveToElement(pageLabelObject).contextClick().build().perform();
		

		
		
        
     
		
		w.get("http://crossbrowsertesting.github.io/drag-and-drop.html");
		
		Thread.sleep(2000);
		
		WebElement draggable=w.findElement(By.id("draggable"));
		WebElement droppable=w.findElement(By.id("droppable"));

		Actions drag_drop=new Actions(w);
		drag_drop.dragAndDrop(draggable, droppable).build().perform();
		
	}

	@AfterTest
	public void afterTest() {
	}
}
