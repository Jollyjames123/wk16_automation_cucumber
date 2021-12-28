Feature: Selecting a submenu from the main menu

  @Sanity @Regression
  Scenario: User should be able to view Summer Dresses option from the navigation menu
    Given User selects "Women" tab from the top menu
    When Selects "Summer Dresses" from the sub menu
    Then verifies the "SUMMER DRESSES " page verification text
