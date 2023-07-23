package com.itview.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	
	WebDriver w;
	
  @Test(priority = 0, description = "Verify Google page on chrome browser")
  public void chromeTest() throws Exception {
	  
	  w=new ChromeDriver();
	  w.get("https://www.google.com/");
	  Thread.sleep(2000);
	  w.close();
  }
  
  @Test(priority = 1, description = "Verify Google page on firefox browser")
  public void firefoxTest() throws Exception {
	  
	  w=new  FirefoxDriver();
	  w.get("https://www.google.com/");
	  Thread.sleep(2000);
	  w.close();
  }
  
  
  @Test(priority = 2, description = "Verify Google page on edge browser")
  public void edgeTest() throws Exception {
	  w=new  EdgeDriver();
	  w.get("https://www.google.com/");
	  Thread.sleep(2000);
	  w.close();
  }
  
  
  
}
