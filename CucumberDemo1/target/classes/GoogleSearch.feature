@execute
Feature: Google search feature
 Using this feature user can able to search very vital information
  Scenario: User wants to search Agile Methodology by entering valid set of words.
    Given User is on Google Search
  
    When User search for 'Agile Methodology'
    
    Then All links should display with 'Agile Methodology'
   

 

 