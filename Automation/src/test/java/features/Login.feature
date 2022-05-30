Feature: Application Login

Scenario: Home Page default login
Given User is on NetBanking landing page
When User login into application with "jin" and password "12345"
Then Home page is populated
And Cards are displayed as "true"

Scenario: Home Page default login
Given User is on NetBanking landing page
When User login into application with "john" and password "54321"
Then Home page is populated
And Cards are displayed as "true"
