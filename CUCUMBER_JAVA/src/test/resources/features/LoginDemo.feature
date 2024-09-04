Feature: Test login functionality

Scenario Outline: Check login is successful
Given Browser is open
And user is on  login page
When user enter <Email> and <password>
And user clicks on login
Then user is navigated to homepage

Examples:
|Email   |password|
|raju@123   |123     |
|raam@456    |pqr     |

