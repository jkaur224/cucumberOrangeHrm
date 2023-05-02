Feature: add employee in PIM section

@SmokeTest
Scenario: add employee

Given user is on website
Then user click on PIM
And user click on Add Employee
Then user give details EmployeeFirstName,EmployeeMiddleName,EmployeeLastName,ID
|Jasmine||singh|09|
Then add picture of employee
