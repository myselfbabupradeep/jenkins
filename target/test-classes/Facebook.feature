Feature: Facebook Account Creation

Background: Lanch Facebook WebPage
Given  Launch Edge Browser with Url "https://www.facebook.com/"
And Click Create New AccountButton

@examplekey
Scenario Outline: Create new account
When Enter First Name "<Firstname>"
And Enter Surname "<lastname>"
And Enter the mail id "<email>"
And Reenter the mail id "<reenter>"
And Enter Password "<password>"
And Select Date of Birth "<date>"
And Select Month of Birth "<month>"
And Select Year of Birth "<year>"
And Select Male radio button
Then Click on Sign Up button
And TakeScreenshort "<Firstname>"
And Check The Broken Links In Page "https://www.facebook.com/"



Examples:
|Firstname|lastname|email                |reenter              |password   |date|month |year|
|pradeep  |babu    |pradeepbabu@gmail.com|pradeepbabu@gmail.com|babu123    |27  |Dec   |1994|
|abc      |def     |abcdef@gmail.com     |abcdef@gmail.com     |b123456    |22  |Feb   |1999| 
|efg      |frd     |efggrd@gmail.com     |efggrd@gmail.com     |dcf1256    |10  |Aug   |1980| 