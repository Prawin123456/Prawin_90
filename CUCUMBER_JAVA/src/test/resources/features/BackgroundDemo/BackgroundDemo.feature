Feature: check home page functionality

Scenario: check logout link
Given user is logged in
When user click on welcome link
Then logout link is displyed

Scenario: verify quick launch toolbar is present
Given user is logged in
When user click on dashboard link
Then quick launch toolbar is displayed
