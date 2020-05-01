Feature: Pages Features

Background:
   	Given User is logged on wordpress page at Page module

  Scenario: Page Preview
  	When User clicks on Add New button
    And  User completes the content
    Then User can look a preview of the page by clicking Preview button
    
  Scenario: Publish Page
  	When User clicks on draft page
    Then User can publish the page by clicking Publish button
    
Scenario: Quick Edit Page
    When User clicks on Quick Edit on a listed page
    Then User can edit some fields of the page
    And User can save the page changes by clicking Update button
    
  Scenario: Edit Page
    When User clicks on Edit on a listed page
    Then User can edit the content of the page
    And User can publish the page changes by clicking Publish button
 
    
    

