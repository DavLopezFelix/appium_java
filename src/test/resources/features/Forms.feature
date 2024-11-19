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



#  @Sanity
#  Scenario: Switch
#    Given The Forms screen is open
#    When I click on Sign up tab
#    And I check switch
#    Then I should see "Click to turn the switch ON"
#    When I check switch
#    Then I should see "Click to turn the switch OFF"