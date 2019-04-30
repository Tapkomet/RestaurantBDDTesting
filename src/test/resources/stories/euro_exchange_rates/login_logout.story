Narrative:
In order to access the site I need to be able to log in and log out

Scenario: Gain access to inappropriate content
Given I want to gain access to site without logging in
When I click the Admin View button
Then I should see the Login page
And I should see the fields

Scenario:  Log in and log out
Given I want to log out
When I click the Login button
And I input Login info
And I click the Logout button
Then I should see the start page