@wip
Feature: Login as different users
  Background: 
    Given Benutzer ist auf der Home Page
    
    Scenario: the user should be able to login with different credentials
    When the user logs in using "Erol1995" and "Erol1995!"
    Then the user should see the username "Erol1995" as the logged in user 
 
