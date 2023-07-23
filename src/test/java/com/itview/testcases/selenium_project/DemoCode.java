package com.itview.testcases.selenium_project;

interface Student {

	public void show();

}

class Code implements Student {

	public void show() {

		System.out.println("Code Completed");
	}

}

public class DemoCode {

	public static void main(String[] args) {

		Student s=new Code();
		s.show();

	}

}
