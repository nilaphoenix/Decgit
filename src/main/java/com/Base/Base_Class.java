package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
public static WebDriver driver;
//Launch Browser
	public  static WebDriver launchBrowser(String browsername)
	{
		if (browsername.equalsIgnoreCase("chrome")) 
		{
			
			WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			}
		driver.manage().window().maximize();
		return driver;
	}
//get
public static WebDriver LaunchUrl(String Url) {
	driver.get(Url);
	return driver;
}
//close
public static void closeBrowser() {
driver.close();
}
//click
	public void clickonelement (WebElement element) {
		element.click();
	}
}