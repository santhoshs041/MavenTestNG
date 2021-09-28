package com.santhosh.MavenTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG002 {

public WebDriver driver;
	
	@Test
	public void TS001() throws InterruptedException
	{
		System.out.println("Opening Browser");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\00002803\\eclipse\\edge_driver\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.google.com/");
		String vTitle=driver.getTitle();
		System.out.println("The Title is "+vTitle);
		Thread.sleep(5000);
		driver.close();
	}
	
	@BeforeTest
	public void openBrowser()
	{
	System.out.println("Before Test");
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		System.out.println("After Test");	
	}

}
