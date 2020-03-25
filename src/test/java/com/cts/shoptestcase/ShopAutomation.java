package com.cts.shoptestcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;



public class ShopAutomation {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://practice.automationtesting.in/shop/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.name("username")).sendKeys("harshithabethina@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Harshitha@0222");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Shop")).click();
        driver.findElement(By.linkText("HTML")).click();
		WebElement sorting = driver.findElement(By.name("orderby"));
		Select sortByOrder = new Select(sorting);
		sortByOrder.selectByVisibleText("Sort by price: high to low");
		
		driver.findElement(By.xpath("//a[@data-product_id='181']")).click();
		
		 driver.findElement(By.linkText("JavaScript")).click();
		 WebElement sorting1= driver.findElement(By.name("orderby"));
		Select sortByOrder1 = new Select(sorting1);
		sortByOrder1.selectByVisibleText("Sort by popularity");
		driver.findElement(By.xpath("//a[@data-product_id='165']")).click();
      
	
	
	}
}

