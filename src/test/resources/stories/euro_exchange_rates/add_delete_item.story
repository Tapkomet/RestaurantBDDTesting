Narrative:
In order to change the menu I need to add and delete items

Scenario: Add, then delete item
Given I want to add and delete items
When I click the Login button
And I input Login info
And I click the Item List button
And I input item info
Then I should see the Item added
And I should be able to delete it
And I should no longer see it