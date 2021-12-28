Feature: Changing price range

  @Sanity @Regression
  Scenario: User should be able to update the price range for the filter options
    When User selects "Women" tab from the top menu
    And Selects "Summer Dresses" from the sub menu
    And verifies the "SUMMER DRESSES " page verification text
    Then moves the slider to change the price range