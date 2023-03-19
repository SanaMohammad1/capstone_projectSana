Feature: change password

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'test.retail@tekschool.us' and password 'Test@123'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  Scenario: Verify User can Update password
    And User enter below information
      | previousPassword | newPassword  | confirmPassword |
      | Retail@123       | Retail@12345 | Retail@12345    |
    And User click on Change Password button
    Then a message should be displayed 'Password Updated Successfully'