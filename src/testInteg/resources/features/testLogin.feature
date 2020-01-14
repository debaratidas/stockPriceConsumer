Feature: Login Action
  Background: Setup Login Data
    Given Following user exist in the system
    |userId|password|
    |som1|som123|
    |test2|test1245|
    |test3|test345|

  Scenario: Successful Login when user and password match
    Given user enter login id som1 and password som123
    When when the login api is called
    Then It should return true
  Scenario:unsuccessful login when user exist but password does not match
    Given user enter login id test2 and password test1223
    When when the login api is called
    Then It should return false

  Scenario: unsuccessful login when user does not exist but password is there
    Given user enter login id test123 and password test345
    When  when the login api is called
    Then  It should return false

  Scenario:unsuccessful login when user and password both does not exist
    Given user enter login id test4 and password test456
    When when the login api is called
    Then It should return false




