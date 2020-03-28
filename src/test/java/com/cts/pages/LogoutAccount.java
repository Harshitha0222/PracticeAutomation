package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LogoutAccount {
	private By clickOnShopLoc=By.linkText("Shop");
	private By ClickOnHtmlBookLoc=By.linkText("HTML");
	private By sortingLoc=By.name("orderby");
	private By selectBookLoc=By.xpath("//a[@data-product_id='181']");
	private By clickOnJavaLoc=By.linkText("JavaScript");
	private By sortingLoc1=By.name("orderby");
	private By selectBookLoc1=By.xpath("//a[@data-product_id='165']");
	public WebDriver driver;
	public LogoutAccount(WebDriver driver)
	{
		this.driver=driver;
	}
	 
	
	public void ClicokOnshop() 
	{
		driver.findElement(clickOnShopLoc).click();
		
		}
	
	public  String getCurrentTitle()
   {
	  String expectedTitle="Products-Automation Practice Site";
	   String actualTitle=driver.getTitle();
	   return actualTitle;
   }
    public  void clickOnHtmlBook()
    {
    	driver.findElement(ClickOnHtmlBookLoc).click();
    }
    public  String getPageTitle()
    {
 	  String expectedTitle="HTM-Automation Practice Site";
 	   String actualTitle=driver.getTitle();
 	   return actualTitle;
    }
    public  void sortBy(String sortBy ) //"Sort by price: high to low"
    {
    	WebElement sorting = driver.findElement(sortingLoc);
		Select sortByOrder = new Select(sorting);
		sortByOrder.selectByVisibleText(sortBy);

    }
    public  void selectBook(WebDriver driver)
    {
    	driver.findElement(selectBookLoc).click();
    }
    public  void clickOnJavaScript()
    {
    	 driver.findElement(clickOnJavaLoc).click();
    }
    public  void sorting(String sortingBy)
    {
    	WebElement sorting1 = driver.findElement(sortingLoc1);//Sort by popularity
    	Select sortByOrder = new Select(sorting1);
		sortByOrder.selectByVisibleText(sortingBy);
    }
	
	
	
	

	
    



	}


