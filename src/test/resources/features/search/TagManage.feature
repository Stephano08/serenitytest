
Feature: Tag Management feature

Background:
    Given User is logged on wordpress page at Tag Module

	Scenario: Add Tag
    When User completes the new Tag fields
    Then User can add the tag by clicking Add New Tag
    
  Scenario: Quick Edit Tag
    When User clicks on Quick Edit on a listed tag
    Then User can edit some fields of the tag
    And User can save the changes by clicking Update Tag button  

  Scenario: Edit Tag
    When User clicks on Edit on a listed tag
    Then User can edit the content of the tag
    And User can save the tag changes by clicking Update button