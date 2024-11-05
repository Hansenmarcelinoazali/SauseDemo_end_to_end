@WEB
Feature: WebAutomation

  @TestFlow
  Scenario: Flow Automation Test
    Given user is on login page
    And user inserts valid username "standard_user"
    And user inserts valid password "secret_sauce"
    And user click login button
    And user click random item
    And user click cart
    And user click remove for one item
    And user click checkout button
    And user fill form "Hansen"
    And user fill lastname form "Marcelino"
    And user fill postalcode "1234"
    And user click continue
    And user click finish
    Then thank you page is appear