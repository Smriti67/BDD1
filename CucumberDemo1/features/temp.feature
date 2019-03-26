Feature: Change PinNumber feature for users.This feature is essential because 
it will allow users to change their pinNumber for their atm.

Scenario: when a user forgets his pin or misplace his atm, he can use this
feature to change his pinNumber.

Given User is using the banking app

When User use the change pinNumber feature 

Then User get to access his atm using the changed pinNumber

