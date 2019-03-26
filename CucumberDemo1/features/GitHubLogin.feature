
Feature:GitHub Login functionality check 
 
  Scenario: User is trying to signin in GitHub using Invalid username and password
    Given User is on GitHub login page
   
    When User enter invalid username and password
   
    Then Access is denied
   

 
  Scenario Outline: User is trying to signin with valid username and password
    Given User is on GitHub login page
    
    When User enter valid username and password
    
    Then Access granted

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
