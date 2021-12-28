Feature: Test for deleting item from basket

  @Regression
  Scenario: User should be able to delete an item from the basket and see basket is empty
    Given User selects "Women" tab from the top menu
    And Selects "Summer Dresses" from the sub menu
    And Adds item to cart
    And closes shopping cart window
    And verifies shopping cart has delete icon
    And removes item from cart
    Then verifies the displayed message "Your shopping cart is empty."