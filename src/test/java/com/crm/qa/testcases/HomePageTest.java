package com.crm.qa.testcases;

//author name is Zahid

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	HomePage homepage;
	LoginPage login;
	public HomePageTest() {
		super();
	}
	@BeforeMethod
	public void setup(){
		initialization();
		login=PageFactory.initElements(driver, LoginPage.class);
		login.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	@Test
	public void testing(){
		System.out.println("123456789");
	}
	@AfterMethod
	public void breakdown(){
		driver.quit();
		
	}
	

	
}
