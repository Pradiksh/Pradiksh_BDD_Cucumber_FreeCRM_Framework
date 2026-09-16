@FunctionalTest
Feature: Free CRM application testing

  @SmokeTest @RegressionTest
Scenario: Login with correct username and password
  Given This is a valid login test
  @RegressionTest
  Scenario: Login with incorrect username and password
    Given This is a invalid login test
  @SmokeTest
    Scenario: Create a contact
      Given This is a contact case
  @SmokeTest @End2End
  Scenario: Create a deal
    Given This is a deal case
  @SmokeTest @End2End
  Scenario: Create a task
    Given This is a task case
  @RegressionTest
  Scenario: Create a case
    Given This is a case test case
  @RegressionTest
  Scenario: Verify Panel links
    Given Clicking on panel links
  @SmokeTest
  Scenario: Search a deal
    Given This is a Search deal test case
  @SmokeTest @RegressionTest
  Scenario: Search a contact
    Given This is a contact test case
  @SmokeTest @RegressionTest
  Scenario: Search a case
    Given This is a Search case test case
  @SmokeTest @End2End
  Scenario: Search a task
    Given This is a Search task test case
  @RegressionTest @End2End
  Scenario: Search a call
    Given This is a Search call test case
  @RegressionTest
  Scenario: Search an email
    Given This is a Search email test case
   @End2End
  Scenario: Application logout
    Given This is a application logout test case