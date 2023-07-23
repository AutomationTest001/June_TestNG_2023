package com.itview.testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class TestNGListener  implements ITestListener{
	
	public void onTestStart(ITestResult result) {  
	// TODO Auto-generated method stub  
	}  
	  
	public void onTestSuccess(ITestResult result) {  
	
	System.out.println("Success of test cases and its details are : "+result.getName());  

	Reporter.log("Passed",true);
	
	}  
	  
	public void onTestFailure(ITestResult result) {  
 
	System.out.println("Failure of test cases and its details are : "+result.getName());  
	}  
	  
	public void onTestSkipped(ITestResult result) {  
	
	System.out.println("Skip of test cases and its details are : "+result.getName());  
	}  
	  
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  
	
	System.out.println("Failure of test cases and its details are : "+result.getName());  
	}  
	  
	public void onStart(ITestContext context) {  
	
	}  
	  
	public void onFinish(ITestContext context) {  
	// TODO Auto-generated method stub  
	}  
	
}
