package com.npntraining.pageobjects.loginpage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.npntraining.pageobjects.utility.ORPropertyReader;

public class LoginPage {
	
	private WebDriver driver;
	private WebElement usertxt;
	private WebElement passwordtxt;
	private WebElement clickbtn;
	

	public LoginPage (WebDriver driver) throws IOException
	{
		
	this.usertxt=driver.findElement(By.id(ORPropertyReader.ORPropReader("usertext")));
	this.passwordtxt=driver.findElement(By.id(ORPropertyReader.ORPropReader("passwordtext")));
	this.clickbtn=driver.findElement(By.id(ORPropertyReader.ORPropReader("clickbttn")));

		
	}
	
	public void ClickSubmit(String userid,String Password)
	{
		this.usertxt.sendKeys(userid);
		this.passwordtxt.sendKeys(Password);
		this.clickbtn.click();
	}
	
}
		
		


