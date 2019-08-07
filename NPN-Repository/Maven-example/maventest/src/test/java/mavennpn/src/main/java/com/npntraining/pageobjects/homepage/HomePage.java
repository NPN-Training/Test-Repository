package com.npntraining.pageobjects.homepage;

import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String fetchTitle()
	{
		String s=driver.getTitle();
		return s;
	}
	
}
