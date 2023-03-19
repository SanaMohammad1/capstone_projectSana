Feature: TEK Retail Application SignIn feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  Scenario: Verify user can sign in into Retail Application
    And User enter email 'test.retail@tekschool.us' and password 'Test@123'
    And User click on login button
    Then User should be logged in into Account

  Scenario Outline: Verify user can sign in into Retail Application
    And User enter email '<email>' and password '<password>'
    And User click on login button
    Then User should be logged in into Account

    Examples: 
      | email                  | password     |
      | moh.sana@tekschool.us  | Moh@sana1    |
      | sana.moh2002@gmail.com | Sana@123Sana |

  Scenario: Verify user can create an acount into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name | email                      | password     | confirmPassword |
      | sana | capstone.sana@tekschool.us | Capstone@123 | Capstone@123    |
    And User click on SignUp button
    Then User should be logged into account page