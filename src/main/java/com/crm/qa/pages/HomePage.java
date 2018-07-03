package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
 @FindBy(xpath="//td[contains(text( ),'User: Zahid  khan')]")
 WebElement usernameLabel;
 
 @FindBy (xpath="//a[text()='Contacts']")
 WebElement contacts;
 
 @FindBy (xpath="//a[text()='Deals']")
 WebElement deals;
 
 @FindBy(xpath="//a[text()='Companies']")
 WebElement companies;
 
 @FindBy(xpath="//a[text()='Tasks']")
 WebElement tasks;
 
 public ContactsPage gotTOcontacts(){
	return new ContactsPage();
	 
 }
 public DealsPage goTOdeals(){
	 return new DealsPage();
 }
 public String validateUser(){
	 return usernameLabel.getText();

	 
 }
 
}
