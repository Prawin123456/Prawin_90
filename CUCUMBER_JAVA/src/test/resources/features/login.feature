#Author
#Date
#Description

@SmokeFeature
Feature: feature to test login page

@smoketest
Scenario: check login is successful with vallid credential

Given user is on login page
When user enter username and password
And click on login button
Then user is navigate to the homepage

