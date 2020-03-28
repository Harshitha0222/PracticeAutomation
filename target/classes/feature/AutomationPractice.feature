Feature: PracticeAutomation
In order to shop the Automation books
As a practice automation user
I want to connect with the practice automation application

Background: 
Given User launch the browser with practiceautomationtestingPage

@tc01
Scenario: click on shop 
When I click on login details from Excel 'src/test/resources/resource/automatonData.xlsx' with SheetName 'logInData'
And click on login button
And  click on shop 
Then I should get access to products page


Scenario: select a Book
When I click on login button and enter loginusername as 'pavanapriyanaka123@gmail.com' and I enter loginpassword as 'Ramadhiganesh12@park12K6'
And click on login button
And  click on shop 
And click on the Html book
Then I should select the book

Scenario: sortby
When I click on login button and enter loginusername as 'pavanapriyanaka123@gmail.com' and I enter loginpassword as 'Ramadhiganesh12@park12K6'
And click on login button
And  click on shop 
And click on the Html book
And  select the sorting using dropdown Box as 'Sort by price: high to low'
Then I should get the books in sorting order


Scenario: sortingby
When I click on login button and enter loginusername as 'pavanapriyanaka123@gmail.com' and I enter loginpassword as 'Ramadhiganesh12@park12K6'
And click on login button
And  click on shop 
And click on the javaScript book
And  select the dropdown Box as 'Sort by popularity'
Then I should get the books in sorting order

Scenario: search the books
When I click on login button and enter loginusername as 'pavanapriyanaka123@gmail.com' and I enter loginpassword as 'Ramadhiganesh12@park12K6'
And click on login button
And  click on shop 
And click on the javaScript book
And  select the dropdown Box as 'Sort by popularity'
And enter the data as 'python' in search box 
Then I should get the related search details





