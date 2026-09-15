Feature: Deal Data Creation
     Scenario: Free CRM Create new Deal Scenario
    Given user is already on the login page
    When Title off login page is Free CRM
    Then User enters Username and Password
    | Username | Password|
      |Pradiksh99@gmail.com | Pradiksh@99|
    Then User clicks on the login button
    Then USer lands on homepage of Free CRM
    Then User moves to Deal Page
    Then User Enters Deal Details
    |Title  | Amount| Probablity | Comission|
| Test Deal | 1000 | 50 | 10|
    Then Close the browser
