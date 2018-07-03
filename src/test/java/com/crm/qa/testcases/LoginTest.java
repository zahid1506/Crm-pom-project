package com.crm.qa.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;

	
	public LoginTest() {
		super();
	}
	@BeforeMethod
	public void setup(){
		initialization();
		loginpage=PageFactory.initElements(driver, LoginPage.class);
	}
	@Test(priority=2)
	public void loginPageTitleTest(){
		String title =loginpage.validateLoginTitle();
		Assert.assertEquals(title, "Free CRM software in the cloud powers sales and customer service");
	}
@Test(priority=1)
public void loginPageLogoTest(){
	loginpage.ValidateLogo();
}
	@Test(priority=3)
	public void LoginAppTest(){
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void breakdown(){
		
	}
}
