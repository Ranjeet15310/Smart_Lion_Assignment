Feature: Sign In flow

  Scenario: Sign In with valid credential
    Given User Launch browser
    And opens URL "https://magento.softwaretestingboard.com/"
    And User navigate to Home Page
    And click on Sign In link
    Then Sign In page is opened 
    When The user enters Email as "rk1134351511e@gmail.com" and password as "Ranjeet@123"
    And Click on the sign In button
    Then The user should be successfully Sign In

  Scenario: Sign In with invalid email and valid password
    Given User Launch browser
    And opens URL "https://magento.softwaretestingboard.com/"
    And User navigate to Home Page
    And click on Sign In link
    Then Sign In page is opened 
    When The user enters Email as "invalidEmail@gmail.com" and password as "Ranjeet@123"
    And Click on the sign In button
    Then The user is getting Error message.

  Scenario: Sign In with valid email and invalid password
    Given User Launch browser
    And opens URL "https://magento.softwaretestingboard.com/"
    And User navigate to Home Page
    And click on Sign In link
    Then Sign In page is opened 
    When The user enters Email as "rk1134351511e@gmail.com" and password as "wrerj"
    And Click on the sign In button
    Then The user is getting Error message.
        
 Scenario: Sign In with invalid email and invalid password
    Given User Launch browser
    And opens URL "https://magento.softwaretestingboard.com/"
    And User navigate to Home Page
    And click on Sign In link
    Then Sign In page is opened 
    When The user enters Email as "invalidEmail@gmail.com" and password as "InvalidPassword"
    And Click on the sign In button
    Then The user is getting Error message.
    
 Scenario: Sign In with valid email and blank password
    Given User Launch browser
    And opens URL "https://magento.softwaretestingboard.com/"
    And User navigate to Home Page
    And click on Sign In link
    Then Sign In page is opened 
    When The user enters Email as "rk1134351511e@gmail.com" and password as ""
    And Click on the sign In button
    Then The user is getting Error message.
    
  Scenario: Sign In with blank email and blank password
    Given User Launch browser
    And opens URL "https://magento.softwaretestingboard.com/"
    And User navigate to Home Page
    And click on Sign In link
    Then Sign In page is opened 
    When The user enters Email as "" and password as ""
    And Click on the sign In button
    Then The user is getting Error message.  
    
    