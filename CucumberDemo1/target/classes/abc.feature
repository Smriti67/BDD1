
@abc
Feature: Logging in with valid credentials only
  I want to use this template for my feature file

  @tag1
  Scenario: Invalid Username
    Given User is on the GitHub login Page
    
    When user tries to login with invalid username
  
    Then login access is denied
    

  @tag2
  Scenario Outline: Invalid password
    Given User is on the GitHub login Page
    When  user tries to login with invalid password
    Then login access is denied
    
  @tag3
   Scenario Outline: valid credentials
    Given User is on the GitHub login page
    When  user tries to login with valid credentials
    Then login access is allowed
  

   
