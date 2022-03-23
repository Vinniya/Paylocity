Feature: Login To Paylocity

Background: Check login Successful

Given user is on login page
When user enters username and password
And click on login button
Then user is navigated to the paylocity benefits dashboard page

Senario Outline: Verify employee is added

Given add employee <firstname>, <lastname> and <dependents>
Then verify the added employee is shown in the employees table
And verify employee firstname can be edited
Then verify employee can be deleted

Examples:
|firstname||lastname||dependents|
|John||Martin||2|
|scott|Bancroft||






#Scenario Outline: Check login is successful
#
#Given user is on login page
#When user enters  <username> and <password>
#And click on login button
#Then user is navigated to the paylocity benefits dashboard page
#When User enters invalid <username> and <password>
#And click on login button
#Then system throws an error message
#
#Examples:
#|username|password|
#|TestUser180|ZLb0#;3pJ#vh|
#|Test345|Test123|
#|TestUser180||
#||ZLb0#;3pJ#vh|
#|||
 

