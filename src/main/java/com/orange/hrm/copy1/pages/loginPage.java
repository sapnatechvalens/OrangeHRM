package com.orange.hrm.copy1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']") WebElement loginfield;
	@FindBy(xpath="//input[@name='password']") WebElement password;
	@FindBy(xpath="//button[text()=' Login ']") WebElement submitBtn;
	
	
	public void usernamefield(String username) throws InterruptedException {
		//Thread.sleep(3000);
		//loginfield.click();
		loginfield.sendKeys(username);
	}
	
	public void passwordField(String pass) {
		password.sendKeys(pass);
	}
	
	public void loginBtn() {
		submitBtn.click(); 
	}
}
