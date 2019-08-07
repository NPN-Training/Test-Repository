package com.npntraining.pageobjects.loginpage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.npntraining.pageobjects.homepage.HomePage;
import com.npntraining.pageobjects.utility.ConfigTestReader;

public class LoginPageTest{

	public static WebDriver driver;
	HomePage home=null;
	
	@BeforeTest
	public void startup() throws IOException
	{
			System.setProperty((ConfigTestReader.configReader("driver.name")),ConfigTestReader.configReader("driver.location"));
			driver= new ChromeDriver();
		driver.get(ConfigTestReader.configReader("aut"));
	
		LoginPage login = new LoginPage(driver);
		login.ClickSubmit(ConfigTestReader.configReader("user.name"),(ConfigTestReader.configReader("password")));
	}
	@Test
	public void checkHome()
	{
		
		HomePage home=new HomePage(driver);
		home.fetchTitle();
		
	}
	@AfterTest
	public void tearDownClass()
	{
		driver.close();
	}
	
}


