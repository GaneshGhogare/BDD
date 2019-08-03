Feature: Hotel Login feature

Scenario: Unsuccesful login with empty details
Given user is on Login Page
When username field is blank and user clicks on login button
Then display error message 'please enter username'

Scenario: Unsuccesful login with empty details
Given user is on Login Page
When password field is blank and user clicks on login button
Then display error message 'please enter password'

Scenario: Unsuccesful login with invalid details
Given user is on Login Page
When  invalid username and password is entered
Then display error message 'Invalid credentials'


Scenario Outline: Succesful login with details
Given user is on Login Page
When user enter <username> and <password>
Then display Hotel Booking Page
Examples:
|username |password|
|capgemini|capg1234|
