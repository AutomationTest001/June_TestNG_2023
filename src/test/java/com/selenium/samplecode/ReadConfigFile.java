package com.selenium.samplecode;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigFile {
	
	public static void main(String args[])throws Exception {
		
		FileInputStream fi=new FileInputStream(".\\Config\\config.properties");
		
		 Properties prop=new Properties();
		 prop.load(fi);
		 
		 String user=prop.getProperty("username");
		 
		 System.out.println(user);
	}

}
