Feature: FB Sign Up Functionality

Background: Lanching Facebook WebPage
Given  Launch the Edge Browser with Url "https://www.facebook.com/"
And Click on Create New AccountButton

#Scenario: Filling the SignUp Details by one dim list
#When User Clicks on available tab and entering the data by One Dimensional List
#|firstname|lastname|email|passwd|27|Dec|1994|
#And Click on gender radio button and Take ScreenShot
#Then Click on sign up button and take ScreenShot

#Scenario: Filling the SignUp Details by one dim map
#When User Clicks on available tab and entering the data by One Dimensional Map
#|Firstname|OneDim|
#|Surname|Map|
#|email|pradeepbabu@gmail.com|
#|password|babu123|
#|date|20|
#|month|Jan|
#|year|2002|
#And Click on gender radio button and Take ScreenShot
#Then Click on sign up button and take ScreenShot

Scenario Outline: Filling the SignUp Details with multiple datas using example keyword
When User Clicks on available tab and entering the data by example Keyword "<Firstname>" "<lastname>" "<email>" "<reenter>" "<password>" "<date>" "<month>" "<year>"
And Click on sign up button and take ScreenShot in example keyword

Examples:
|Firstname|lastname|email                |reenter              |password   |date|month |year|
|mass     |babu    |pradeepbabu@gmail.com|pradeepbabu@gmail.com|babu123    |27  |Dec   |1994|
|asault   |babu    |abcdef@gmail.com     |abcdef@gmail.com     |b123456    |22  |Feb   |1999| 
|yes      |babu    |efggrd@gmail.com     |efggrd@gmail.com     |dcf1256    |10  |Aug   |1980| 