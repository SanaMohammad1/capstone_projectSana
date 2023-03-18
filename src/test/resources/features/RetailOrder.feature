Feature: Retail Order Page

  #@cancelOrder
  #passed
  Scenario: Verify User can cancel the order
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'moh.sana@tekschool.us' and password 'Moh@sana1'
    And User click on login button
    And User should be logged in into Account
    And User click on Orders section
    And User click on first order in list
    And User click on Cancel The Order button
    And User select the cancelation Reason 'Bought wrong item'
    And User click on Cancel Order button
    Then a cancelation message should be displayed 'Your Order Has Been Cancelled'

  #passed return
  Scenario: Verify User can Return the order
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'moh.sana@tekschool.us' and password 'Moh@sana1'
    And User click on login button
    And User should be logged in into Account
    And User click on Orders section
    And User click on first order in list
    And User click on Return Items button
    And User select the Return Reason 'Item damaged'
    And User select the drop off service 'FedEx'
    And User click on Return Order button
    Then a return message should be displayed 'Return was successfull'

  #review passed
  Scenario: Verify User can write a review on order placed
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'moh.sana@tekschool.us' and password 'Moh@sana1'
    And User click on login button
    And User should be logged in into Account
    And User click on Orders section
    And User click on first order in list
    And User click on Review button
    And User write Review headline  'Qaulity' and ' Sana reviewed this item'
    And User click Add your Review button
    Then a review message should be displayed 'Your review was added successfully'

  #passed
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'moh.sana@tekschool.us' and password 'Moh@sana1'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Electronics'
    And User search for an apex item 'Apex Legends '
    And User click on apex result
    And User click on Apex Legend item
    And User select quantity '5'
    And User click add to Cart button
    Then the cart icon quantity should change to '5'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    And a message should be displayed 'Order Placed, Thanks'

  #passed
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'moh.sana@tekschool.us' and password 'Moh@sana1'
    And User click on login button
    And User should be logged in into Account
    And User change category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on kasa result
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address form with below information
      | country | fullName | phoneNumber | streetAddress | apt | city     | state | zipCode |
      | Taiwan  | SanaSana |  2313455567 | 345dssff      |  12 | Sterling | Yilan |   22001 |
    And User click Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 3322114455667788 | SanaSana   |              09 |           2028 |          112 |
    And User click on Add your card button
    And User click on Place Your Order
    Then a message should be displayed ‘Order Placed, Thanks’



