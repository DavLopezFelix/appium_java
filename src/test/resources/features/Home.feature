Feature: Home
  @Smoke
  Scenario: Initial message
    Given The WebdriverIO is open
    Then I should see "Demo app for the appium-boilerplate"
