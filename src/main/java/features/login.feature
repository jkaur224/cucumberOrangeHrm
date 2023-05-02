Feature: logging in OrangeHRM

@SmokeTest
Scenario: With correct credentials

Given user is on website
When title of page is 
Then user input username and password
Then user click on login
Then user logged in
Then user log out

@RegressionTest
Scenario Outline: With incorrect username

Given user is on website
When title of page is 
Then user input "<username>" and "<password>"
Then user click on login
Then user get error
Then user not able to login

Examples:
 	|username|password|
 	|admin	 |admin13|