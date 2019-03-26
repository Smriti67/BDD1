Feature: valid username and password credentials required for login.
Scenario: User requires valid username and password to login into the github account
Given User is logging into github account
When User enters the valid credentials
Then User has access to the account