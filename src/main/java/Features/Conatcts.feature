Feature: Free CRM Create Contacts
  Scenario Outline: Free CRM Create new Contact Scenario
    Given user is already on the login page
    When Title off login page is Free CRM
    Then User enters "<Username>" and "<Password>"
    Then User clicks on the login button
    Then USer lands on homepage of Free CRM
    Then User moves to contact page
    Then User enters "<FirstName>" and "<LastName>" and "<Position>"
    Then Close the browser
    Examples:
      |Username  | Password|FirstName|LastName|Position
      |Pradiksh99@gmail.com | Pradiksh@99|Pradiksh|Soman|Manager
#      |Test                 |            Tom|Tom  |Hanks|Assistant Manager
#      |naveenk              |test@123       |Naveen|Kumar|Engineer

#Feature: Free CRM Login feature
#  Scenario: Free CRM Login test Scenario
#    Given user is already on the login page
#    When Title off login page is Free CRM
#    Then User enters Username  and Password
#    Then User clicks on the login button
#    Then USer lands on homepage of Free CRM
