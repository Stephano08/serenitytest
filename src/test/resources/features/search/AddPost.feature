
Feature: Posts features

Background:
   	Given User is logged on wordpress page at Post module

  Scenario: Post Preview
  	When User clicks on Add New
    And  User completes the fields
    Then User can look a preview of the Post by clicking Preview button
    
  Scenario: Publish Post
  	When User clicks on draft post
    Then User can publish the Post by clicking Publish button
    
Scenario: Quick Edit Post
    And User clicks on Quick Edit on a listed post
    Then User can edit some fields of the post
    And User can save the post changes by clicking Update button
    
  Scenario: Edit Post
    When User clicks on Edit on a listed post
    Then User can edit the content of the post
    And User can publish the post changes by clicking Publish button
    
    
    
    