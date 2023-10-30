package com.orange.hrm.copy1.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.orange.hrm.copy1.base.base;
import com.orange.hrm.copy1.pages.loginPage;

public class test1 extends base{

	public static loginPage login;
	public test1() throws IOException {
		super();
		propertyFile();
	}
	
	@Test
	public void tc01() throws InterruptedException {
		openBrowser();
		login = new loginPage(driver);
		Thread.sleep(5000);
		login.usernamefield("Admin");
		login.passwordField("Sapna@123");
		login.loginBtn();
	}
	
}
