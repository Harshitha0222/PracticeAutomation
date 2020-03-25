package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterAccount {
	private By enterUsenameLoc = By.id("reg_email");
	private By enterPasswordLoc = By.id("reg_password");
	private By clickonRegisterLoc = By.xpath("//input[@name='register']");
	private By enteremailLoc = By.id("username");
	private By enterPassowrdLoc = By.id("password");
	private By clickonLoginLoc = By.xpath("//input[@name='login']");
	
	
	public WebDriver driver;

	public RegisterAccount(WebDriver driver)
	{
		this.driver=driver;
	}


	public void enterUsername(WebDriver driver, String username)
	{
	driver.findElement(enterUsenameLoc).sendKeys(username);
	}
	public  void enterPassword(WebDriver driver, String password)
	{
	driver.findElement(enterPasswordLoc).sendKeys(password);
	}

	public  void clickOnRegister(WebDriver driver)
	{
	driver.findElement(clickonRegisterLoc).click();
	}
	public  void enterEmail(WebDriver driver, String emailname)
	{
	driver.findElement(enteremailLoc).sendKeys(emailname);
	}
	public   void enterLoginPassword(WebDriver driver, String loginpassword)
	{
	driver.findElement(enterPassowrdLoc).sendKeys(loginpassword);
	}
	public  void clickOnLogin(WebDriver driver)
	{
	driver.findElement(clickonLoginLoc).click();
	}

	}


