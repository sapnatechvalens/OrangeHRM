package com.orange.hrm.copy1.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public static WebDriver driver;
	public static Properties prop;
	public void propertyFile() throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\POM\\Orange_HRM_Copy\\src\\main\\java\\com\\orange\\hrm\\copy\\configpackages\\config.properties");
	    prop = new Properties();
	    prop.load(file);
	}
	
	public void openBrowser() {
		driver = new ChromeDriver();
	    driver.get(prop.getProperty("url"));
     driver.manage().window().maximize();
     Duration timeout = Duration.ofSeconds(15);
     driver.manage().timeouts().pageLoadTimeout(timeout);
}
}
