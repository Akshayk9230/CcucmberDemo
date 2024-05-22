#Author: akshay00923@gmail.com

Feature: 
  Login Feature
  Background:
      Given I am on login page of the of application

  Scenario: Login with valid credentials
  When I enter valid email "testuser123@example.com" and password "Password@123" and click on login button
  Then I should be able to view the home button in home page
  
  Scenario: Login using invalid credentials
  When I enter email "testuser123@example.com" and wrong password "random123" and click on login button 
  Then I should not be able to login and a error message should be displayed stating "Incorrect email or password."
  
  Scenario: Login using email with invalid format
  When I enter invalid email format "testuser.com" and a password "random123" and click on login button
  Then I should get a error message below the email input field stating "*Enter Valid Email"

