
Feature: Functionality of Login Module
 
  Scenario: Login with Positive Credentials
    Given Launch the browser
    Given Load the url
    Given Enter the Username as 'demoSalesManager'
    And Enter the Password as 'crmsfa'
    When Click on the Login button
    Then WelcomePage is displayed
    
    
   