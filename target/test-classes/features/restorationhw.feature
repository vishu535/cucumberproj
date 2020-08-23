Feature: Restoration hardware USA

@rh
Scenario: login to application
Given open restoration hardware application
When click signin and enter user details 
Then homepage should be displayed
Then logout from the application
@rh
Scenario: Navigate to all menus
Given open restoration hardware application
When click signin and enter user details 
Then click all the submenu links



#Welcome@123