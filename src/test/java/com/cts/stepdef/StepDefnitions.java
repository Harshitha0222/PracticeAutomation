package com.cts.stepdef;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.cts.pages.LogoutAccount;
import com.cts.pages.MyAccount;
import com.cts.pages.RegisterAccount;
import com.cts.utils.ExcelUtils;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
;

public class StepDefnitions {
	WebDriver driver;
	@After
	public void close()
	{
		driver.quit();
	}
	
	
//launch the browser
	@Given("User launch the browser with practiceautomationtestingPage")
	public void user_launch_the_browser_with_practiceautomationtestingPage() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
	    System.out.println("Given");

	    driver =new ChromeDriver();
	    driver.get("http://practice.automationtesting.in/");
	    driver.manage().window().maximize();
}

    //click on my account and enter details
	@When("I click on login details from Excel {string} with SheetName {string}")
	public void i_click_on_login_details_from_Excel_with_SheetName(String fileDetails, String SheetName) throws IOException {
		String data[][]=ExcelUtils.getsheetIntoStringArray("src/test/resources/resource/automatonData.xlsx", "logInData");
		
		MyAccount myaccount=new MyAccount(driver);
		myaccount.MyAccount();
		RegisterAccount register=new RegisterAccount(driver);
		register.enterEmail(data[0][0]);
		RegisterAccount password=new RegisterAccount(driver);
		password.enterLoginPassword(data[0][1]);
	}
	

    //click on login button
	@When("click on login button")
	public void click_on_login_button() 
	{
		RegisterAccount loginbutton=new RegisterAccount(driver);
		loginbutton.clickOnLogin();
		}
    //click on shop icons
	@When("click on shop")
	public void click_on_shop() {
		LogoutAccount logout=new LogoutAccount(driver);
		logout.ClicokOnshop();
	}
		
		
		
		@When("I click on login button and enter loginusername as {string} and I enter loginpassword as {string}")
		public void i_click_on_login_button_and_enter_loginusername_as_and_I_enter_loginpassword_as(String loginusername, String loginpassword) {
			MyAccount myaccount=new MyAccount(driver);
			myaccount.MyAccount();
			RegisterAccount register=new RegisterAccount(driver);
			register.enterEmail1(loginusername );
			RegisterAccount password=new RegisterAccount(driver);
			password.enterLoginPassword(loginpassword);
		}
		
	
    //next page appears 
	@Then("I should get access to products page")
	public void i_should_get_access_to_products_page() {
		LogoutAccount page=new LogoutAccount(driver);
		   String actualTitle=page.getCurrentTitle();
		   String expectedTitle=page.getCurrentTitle();
		    Assert.assertEquals(expectedTitle, actualTitle);
		   System.out.println(actualTitle);
	   	}

	//clickon html book
	@When("click on the Html book")
	public void click_on_the_Html_book() {
		LogoutAccount htmlBook=new LogoutAccount(driver);
		htmlBook.clickOnHtmlBook();
	}
    
	@Then("I should select the book")
	public void i_should_select_the_book() {
		
		LogoutAccount selectBook=new LogoutAccount(driver);
		String actualTitle=selectBook.getPageTitle();
		   String expectedTitle=selectBook.getPageTitle();
		   Assert.assertEquals(expectedTitle, actualTitle);
		   System.out.println(actualTitle);
	}

	// displays books based on sorting

	@When("select the sorting using dropdown Box as {string}")
	public void select_the_sorting_using_dropdown_Box_as(String sortBy) {
		LogoutAccount sort=new LogoutAccount(driver);
		sort.sortBy(sortBy);
	}
    //clickon java script book
	@When("click on the javaScript book")
	public void click_on_the_javaScript_book() {
		LogoutAccount javaBook=new LogoutAccount(driver);
	 javaBook.clickOnJavaScript();
}
	
    // books display in the sorting order
	@When("select the dropdown Box as {string}")
	public void select_the_dropdown_Box_as(String sortingBy) {
		
		LogoutAccount sortBy=new LogoutAccount(driver);
	    sortBy.sorting(sortingBy);
	}
	
	
	@Then("I should get the books in sorting order")
	public void i_should_get_the_books_in_sorting_order() {
	    System.out.println("Books display in sorting order");
	}
    // enter the required books in the search bar
	@When("enter the data as {string} in search box")
	public void enter_the_data_as_in_search_box(String data) {
		MyAccount enterText=new MyAccount(driver);
		enterText.search(data);
	   
	}
	    
	
   // get the search details
	@Then("I should get the related search details")
	public void i_should_get_the_related_search_details() {
		MyAccount string=new MyAccount(driver);
	String text = string.displaytext();
		System.out.println(text);

	}





}
