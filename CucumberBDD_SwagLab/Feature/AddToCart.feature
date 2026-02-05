Feature: Login

  Scenario: Adding product to cart
    When User open Edge browser
    And User opens url 
    And User enter username and password and login
    And Click Cart button
    And Go to the cart link
    Then Add To cart page is displayed