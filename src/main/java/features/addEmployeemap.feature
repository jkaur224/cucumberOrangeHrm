Feature: add employee in PIM section

Scenario: add employee

Given user is on website
When title of page is 
Then user input username and password
|Admin|admin123|
Then user click on login
Then user click on PIM
And user click on Add Employee
Then user give details EmployeeFirstName,EmployeeMiddleName,EmployeeLastName
|EmployeeFirstName|EmployeeMiddleName|EmployeeLastName|ID|
|kay|pal|singh|1111|
|man||singh|1112|
