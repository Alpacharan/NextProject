Feature:Add Item In Trolley
  As a end user
  I want to add item in trolley
  So that i can buy my particular search product

  Scenario: Add product to trolley
    Given I am on homepage
    When I hover on "Home & Furniture"
    And I hover on subcategory "Kitchen & Dining"
    And I select "Dining Room Furniture"
    And I click on "Hudson Small Sideboard"
    And I click on add to bag
    And I click on shopping bag
    And I hover on shopping bag and click on "VIEW/EDIT BAG"
    Then I should see respective product add in my cart with correct name
    And I should see respective product add in my cart with correct product code

  @Regression
  Scenario Outline: Add product to trolley
    Given I am on homepage
    When I hover on "<Department>"
    And I hover on subcategory "<SubCategory>"
    And I select "<ProductCategory>"
    And I click on "<Product>"
    And I click on add to bag
    And I click on shopping bag
    And I hover on shopping bag and click on "<Option>"
    Then I should see respective product add in my cart with correct name
    And I should see respective product add in my cart with correct product code
    Examples:
      | Department       | SubCategory      | ProductCategory       | Product                     | Option        |
      | Home & Furniture | Kitchen & Dining | Dining Room Furniture | Hudson Dark Small Sideboard | VIEW/EDIT BAG |
      | Home & Furniture | Kitchen & Dining | Dining Room Furniture | Hudson Dark Ladder Shelf    | VIEW/EDIT BAG |


