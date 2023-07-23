package com.itview.testcases.selenium_project;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigFileData {

	public static void main(String[] args) throws Exception {

		FileInputStream fi = new FileInputStream(".\\TestConfig\\config.properties");

		Properties prop = new Properties();

		prop.load(fi);// properties file -> to open (load) -> at fi path

		String baseURL = prop.getProperty("domainURL");
		System.out.println(baseURL);

		String browser = prop.getProperty("browser");
		System.out.println(browser);
		
		fi.close();

	}

}
