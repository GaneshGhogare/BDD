Feature: Hotel booking Feature
  I want to use this template for my feature file

 
  Scenario: Hotel Booking with valid details
    Given User is on hotel booking page
    When  enters all valid details
    Then display succes page
  

 Scenario: FirstName is blank
    Given User is on hotel booking page
    When firstname is blank and clicks on booking button
    Then display error message for firstname field
    
 Scenario: LastName is blank
    Given User is on hotel booking page
     When lastName is blank and clicks on booking button
    Then display error messages for lastName field
    
 Scenario: Email field is blank
    Given User is on hotel booking page
     When Email is blank and clicks on booking button
    Then display error messages for email field
    
 Scenario Outline: Invalid Email Id Entered
 Given User is on hotel booking page
 When user enter invalid <email> and clicks on booking button
 Then display error message 'please enter valid email'
 Examples:
   |email|
   |ajhjh.com|
    
 Scenario: Mobile field is blank
    Given User is on hotel booking page
    When Mobile is blank and clicks on booking button
    Then display error messages for mobile field
 



  Scenario Outline: Invalid Mobile No entered
    Given User is on hotel booking page
    When user enters <mobileno> and clicks on booking button
    Then Display Error message for mobile field

    Examples: 
      | mobileno  |
      | 911223 |   
      | 2132-23322| 
      |12345678999|
      |1311909456|
      |99-229-23430|
      
    #Scenario: No of people staying not selected
    #Given User is on hotel booking page
    #When no of people staying field is blank and clicks on booking button
    #Then display error messages for people staying field
    #
     #Scenario: Address not entered
    #Given User is on hotel booking page
    #When Address field is blank and clicks on booking button
    #Then display error messages for Address field
    
    Scenario: City not selected
    Given User is on hotel booking page
    When City is not selected and clicks on booking button
    Then display error messages for city field

      Scenario: State not selected
    Given User is on hotel booking page
    When State is not selected and clicks on booking button
    Then display error messages for state field
    
      Scenario: CardHolder Name field is blank
    Given User is on hotel booking page
    When user enters all previous details
    But cardholder name is blank and clicks on booking button
    Then display error messages for Cardholder field
    
      Scenario: Debitcard field is blank
    Given User is on hotel booking page
    When Debitcard field is blank and clicks on booking button
    Then display error messages for Debitcard field
    
    Scenario: Expiration month field is blank
    Given User is on hotel booking page
    When Expiration month field is blank and clicks on booking button
    Then display error messages for month field
    
    Scenario: Expiration year field is blank
    Given User is on hotel booking page
    When Expiration year field is blank and clicks on booking button
    Then display error messages for year field