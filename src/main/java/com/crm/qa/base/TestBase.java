package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase(){
		try
		{
			prop=new Properties();
		FileInputStream fis=new FileInputStream("E:/seleniumframework/crmForFree/src/main/java/com/crm/qa/config/config.properties");
		prop.load(fis);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
			
		}
		catch(IOException e){ 
			e.printStackTrace();
			
		}
	}
	public static void initialization(){
		
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","C:/Users/Aritra/Desktop/selenium essentials/browser driver/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox")){
			System.setProperty("webdriver.firefox.driver","C:/Users/zahid/Desktop/selenium essentials/browser driver/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	
		
	}
	
	}
	
	


