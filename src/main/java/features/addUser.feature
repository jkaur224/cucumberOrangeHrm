Feature: add a user in admin section

@RegressionTest
Scenario Outline: add user

Given user is on website
When user click on Admin
Then user click on Add
And user add details "<UserRole>","<Status>","<EmployeeName>","<UserName>","<Password>","<ConfirmPassword>"


Examples:
	|UserRole|Status |EmployeeName|UserName|Password  |ConfirmPassword|
	|ESS	 |Enabled|Jasmine singh|kaysingh69|kay@ESSuu7|kay@ESSuu7|
	

	

