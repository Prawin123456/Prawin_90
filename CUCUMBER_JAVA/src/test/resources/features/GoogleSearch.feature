Feature: feature to test google search functionality

Scenario: vallidate google search is working

Given browser is open
And user is on google search page
When user enters a text in search box
And hits enter
Then user navigate to search results
