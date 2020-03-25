package com.cts.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class LaunchWebDriver {
	 public WebDriver driver;
	 @BeforeMethod
	 @Parameters
	 public void enterbrowser(@Optional("ch") String browserName)
	 {
	 System.out.println(browserName);

	 if(browserName.equalsIgnoreCase("ff"))
	 {
	 System.setProperty("webdriver.firefox.driver", "geckodriver.exe");
	 driver=new FirefoxDriver();
	 }
	 else if(browserName.equalsIgnoreCase("ie"))
	 {
	 System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
	 driver=new InternetExplorerDriver();
	 }
	 else
	 {
	 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	 driver.get("http://practice.automationtesting.in");
	 }

	 }
//	 @AfterMethod
//	 public void close()
//	 {
//	 driver.quit();
//	 }

	 }



