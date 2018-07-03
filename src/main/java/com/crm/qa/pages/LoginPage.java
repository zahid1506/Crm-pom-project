package com.crm.qa.pages;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	JavascriptExecutor js;
	
	@FindBy(name="username")
	 WebElement username;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(xpath="//input[@name='username']/../div/input")
	WebElement Loginbutton;
	
	@FindBy(xpath="//button[text()='Sign Up']")
	 WebElement SignUpButton;
	
	@FindBy(xpath="//a[@class='navbar-brand']/img")
	  WebElement Logo;
	
	
	public String validateLoginTitle(){
		return driver.getTitle();
		
		}
	public boolean ValidateLogo(){
		return Logo.isDisplayed();
	}
	public HomePage login(String un,String pwd){
		username.sendKeys(un);
		Password.sendKeys(pwd);
		js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Loginbutton);
		//SignUpButton.click();
		return new HomePage();
		
	}

}
