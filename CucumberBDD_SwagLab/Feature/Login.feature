Feature: Login

  Scenario: Successful login with valid credentials
    Given User launched Edge browser
    When User opens url "https://www.saucedemo.com/"
    And User enter username as "standard_user" and password as "secret_sauce"
    And Click login
    Then Page title should be "Swag Labs"
