
Feature: Category Managemente Feature

Background:
    Given User is logged on wordpress page at Category Module

	Scenario: Add Category
    When User completes the new Category fields
    Then User can add the category by clicking Add New Category
    
  Scenario: Quick Edit Category
    When User clicks on Quick Edit on a listed category
    Then User can edit some fields of the category
    And User can save the changes by clicking Update Category button  

  Scenario: Edit Category
    When User clicks on Edit on a listed category
    Then User can edit the content of the category
    And User can save the category changes by clicking Update button