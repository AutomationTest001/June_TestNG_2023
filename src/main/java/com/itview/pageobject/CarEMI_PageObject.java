package com.itview.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarEMI_PageObject extends TestBase{

	// WebElement LoanAmount1=w.findElement(By.id("carhome_loan"));

	@FindBy(id = "carhome_loan")
	public WebElement loanAmount;

	@FindBy(id = "loan_period")
	public WebElement loanPeriod;

	@FindBy(css = "select.custselect")
	public WebElement emi_Starts_from;

	@FindBy(id = "interest_rate")
	public WebElement interestRate;

	@FindBy(id = "upfront_charges")
	public WebElement upfront_charges;

	@FindBy(xpath = "/html/body/div[13]/section[1]/div/div/div[1]/div[1]/div/div[2]/div/div[5]/a[1]")
	public WebElement submitBtn;

	@FindBy(id = "total_payment")
	public WebElement total_Payment;
	
	@FindBy(id="wzrk-cancel")
	public WebElement cancelBtn;
	
	public void exportPageObject() {
		
		PageFactory.initElements(w, this);
		
	}
	
	

}
