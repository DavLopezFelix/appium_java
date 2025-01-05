Feature: Forms

  @Sanity
  Scenario Outline: Input field
    Given The Forms screen is open
    When I input "<text>"
    Then I should see "<text>" in expected field
    Examples:
      | text |
      | Hola!! |
      | Que hace? |

  @Sanity
  Scenario: Switch
    Given The Forms screen is open
    Then I should see "Click to turn the switch ON" in expected switch field
    When I click the switch
    Then I should see "Click to turn the switch OFF" in expected switch field
    When I click the switch
    Then I should see "Click to turn the switch ON" in expected switch field

  @Sanity
  Scenario Outline: Dropdown
    Given The Forms screen is open
    When I select the dropdown option "<option>"
    Then The selected dropdown option should be "<option>"

    Examples:
      | option |
      | webdriver.io is awesome |
      | This app is awesome |
    
  @Only
  Scenario: Buttons
    Given The Forms screen is open
    When I click the button
    Then I should see a popup
    And I should see "This button is active" on the popup
    When I click the OK option
    Then I should not see the popup