package com.genric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	private WebDriver driver;
   
    
	public void initilizeWebDriver () {
    	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/chromedriver.exe");
		
	  	driver = new ChromeDriver();
	  	this.setDriver(driver);
	    driver.get("http://demo.automationtesting.in/Register.html");
	 	driver.manage().window().maximize();
		
	}
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

  public void tearDown() {
	   	  driver.quit();
	     }
	}


