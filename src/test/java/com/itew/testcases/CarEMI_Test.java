package com.itew.testcases;

import org.testng.annotations.Test;

import com.itview.pageobject.CarEMI_PageObject;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class CarEMI_Test {
	
	CarEMI_PageObject car=new CarEMI_PageObject();
  
  @BeforeTest
  public void preCondition() throws Exception {
	  
	 String testBrowser=car.readDataFromConfigFile("browser");
	 car.openBrowser(testBrowser);
	 
	 car.exportPageObject();
      
  }
  
  @Test(priority = 0, description = "Verify car loan emi for 4 lakh")
  public void carEMI_Test1() throws Exception {
	  
	  String baseURL=car.readDataFromConfigFile("baseURL");
	  
	  car.openApplicationUrl(baseURL+"emi-calculator.html");
	  
	  car.handleRandomObject(car.cancelBtn);
	  
	  car.waitForSecond(3);
	  
	  car.scrollPageUp();
	  
	  car.handleInputEvent(car.loanAmount, "400000");
	  
	  car.handleInputEvent(car.loanPeriod, "3");
	  
	  car.handleDropDown(car.emi_Starts_from, "From next month after disbursement");
  
      car.handleInputEvent(car.interestRate, "10");
  
      car.handleInputEvent(car.upfront_charges, "2000");
      
      car.handleClickEvent(car.submitBtn);
      
      car.waitForSecond(3);
      
      String PaymentAmt=car.total_Payment.getText();
      
      System.out.println("Total Payement : "+PaymentAmt);
      
      car.waitForSecond(3);
  
  }

  @AfterTest
  public void postCondition() {
	  
	  car.closeBrowser();
  }

}
