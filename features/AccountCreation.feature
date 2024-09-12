Feature: Account Creation

@sanity
  Scenario: Account Created with Valid Details
    Given User Launch browser
    And opens URL "https://magento.softwaretestingboard.com/"
    When User navigate to Home Page
    And click on Account Creation link
    And User enters FirstName as "Ranjeet" Last Name as "Kumar" Email id as "AmitKumar123@gmail.com" Password as "Ranjeet@123" and Confirm Password as "Ranjeet@123"  
    And Click on Create Account button
    Then User navigates to MyAccount Page
    
 @sanity   
    Scenario: Account Created with existing email id
    Given User Launch browser
    And opens URL "https://magento.softwaretestingboard.com/"
    When User navigate to Home Page
    And click on Account Creation link
    And User enters FirstName as "Ranjeet" Last Name as "Kum" Email id as "rk11511@gmail.com" Password as "Ranjeet@123" and Confirm Password as "Ranjeet@123"  
    And Click on Create Account button
    Then Error message is showing already created with the same email