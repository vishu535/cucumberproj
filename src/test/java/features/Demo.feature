Feature: This is ecomm app test 

@ignore
Scenario: Register a user
Given open faballey application
When click signup and enter new user details 
Then it should prompt for otp
@ignore
Scenario: try to enter cart without login
Given open faballey application
When click cart icon
Then it should prompt to loginto account