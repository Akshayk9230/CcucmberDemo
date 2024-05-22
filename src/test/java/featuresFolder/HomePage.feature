#Author: akshay00923@gmail.com

Feature: Home Page Feature
Background:
          Given I am on the HomePage after login

  Scenario: Verify all the Home Page buttons are visible
    Then Check the buttons <values> are present
    
    Examples:
    |values|
    |Home|
    |Orders|
    |Cart|
