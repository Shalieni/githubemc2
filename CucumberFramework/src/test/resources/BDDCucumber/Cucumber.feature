Feature: Verifying Grocery Login Module

Scenario: Verifying Grocery Login with Valid credentials

Given User is on the Grocery Login Page
When User enters Username and Password
And User clicks login button
Then User should verify after login success message