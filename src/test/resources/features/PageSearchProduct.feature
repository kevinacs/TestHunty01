@AddToCarPage
Feature: Test page search and add item to car functionality

  @AddCart
  Scenario Outline: As a customer when i search for mac i want to see if the system allows me to add two different products to the cart.
    Given The user navigates to http://opencart.abstracta.us/
    And searches for <Product>
    When selects the third item
    Then the user is able to add it to the cart

    Examples:
      |Product     |
      |Mac         |