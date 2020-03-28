package com.cts.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MyAccount {
	private By clickOnmyAccountLoc= By.linkText("My Account");
	private By searchLoc=By.id("s");
	private By displayTextLoc=By.xpath("//p[text()='Sorry, nothing found.']");
	
	private WebDriver driver;

public MyAccount(WebDriver driver)
{
	this.driver=driver;
}

	public void MyAccount()
	{
	driver.findElement(clickOnmyAccountLoc).click();
	}
	
	public void search(String name)
	{
		
		driver.findElement(searchLoc).sendKeys(name);
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(searchLoc)).sendKeys(Keys.ENTER).build().perform();
		}
	public String displaytext() {
		String displayData=driver.findElement(displayTextLoc).getText();
		return displayData;
		
	}
	
	
	}



