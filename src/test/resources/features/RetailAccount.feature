Feature: Retail Application Account Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'moh.sana@tekschool.us' and password 'Moh@sana1'
    And User click on login button
    And User should be logged in into Account

  #passed
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'SanaTransformers' and Phone '1072028977'
    And User click on Update button
    Then User profile information should be updated

  #passed
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill new Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1122998877665542 | Sana       |              09 |           2028 |          111 |
    And User click on Add your card button
    Then payment message displayed 'Payment Method added successfully'

  #passed
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1122998877665552 | Sananew    |              09 |           2028 |          111 |
    And user click on Update Your Card button
    Then update message should be displayed 'Payment Method updated Successfully'

  #passed
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

	#passed
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city     | state | zipCode |
      | United States | SanaSana |  3123455567 | 12 main ST    |  22 | Sterling | VA    |   20110 |
    And User click Add Your Address button
    Then address message should be displayed 'Address Added Successfully'

  #passed
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
