Feature: Login
  @Sanity
  Scenario: Sign up
    Given The Login screen is open
    When I click on Sign up tab
    And I input email "test@h.com"
    And I input password "12345678"
    And I confirm password "12345678"
    And I click sign up button
    Then I should see popup "You successfully signed up!"
  @Sanity
  Scenario: Log in
    Given The Login screen is open
    When I input email "test@h.com"
    And I input password "12345678"
    And I click log in button
    Then I should see popup "You are logged in"