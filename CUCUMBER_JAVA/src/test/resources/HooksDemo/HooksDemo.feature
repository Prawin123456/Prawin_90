Feature:check login functionality

  @smoke
  Scenario: 
    Given user is on login page
    When user Enter valid username and password
    And clicks on login button
    Then user is navigated to the homepage

    
     Scenario: 
    Given user is on login page
    When user Enter valid username and password
    And clicks on login button
    Then user is navigated to the homepage