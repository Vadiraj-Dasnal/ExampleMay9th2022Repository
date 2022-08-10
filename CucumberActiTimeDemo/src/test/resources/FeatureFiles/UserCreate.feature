#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: Create user

Feature: Create User functionalities
Description this feature validates create user functionalities

Scenario: Login with valid credentials
Given I launch the chrome browser
And I navigate the Application url
When I enter the username in username text field
And I enter the password in password text field
And I click on login button
Then I find the home page
And I click on minimize flyout window

Scenario: Create User functionality 
And I click on User
And I click on Add user
When I enter the firstName
And I enter the LastName
When I enter the Email
And I enter the Username
And I enter the password
And I enter the passwordcopy
And I click on create User 

Scenario: Logout functionality
Then I find the home page
When I click on logout link
Then I find the login page
And I close Application