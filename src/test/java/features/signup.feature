Feature: Signup

  Background:
    Given i am at TalentTEK Homepage

  @signup @smoke
  Scenario:Create a brand new user
    And i click on "Create new account" button from signup page
    And i enter unique email address during signup

  @signup @smoke
  Scenario Outline:Create a brand new user
    And i click on "Create new account" button from signup page
    And i enter unique First Name "<firstName>" during signup
    And i enter unique Last Name "<lastName>" during signup
    Examples:
    |firstName|lastName|
    |razib    |ahmed   |
    |sakib    |khan    |
    |puja     |chery   |
    |sarkar   |vai     |



