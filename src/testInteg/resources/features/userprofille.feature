#Feature: user profile
#  Background: Setup user profile Data
#    Given Following user profile exist in the system
#      |name|lastname|phno|emailid|userid
#      |test|user|1235477667|test.user@gmail.com|test1234
#      |test12|user12|2345667789|test12@gmail.com|test1212
#      Scenario: successfully create profile when user enter name, last name,
#         valid ph no, valid email id ,valid user id
#       Given User enter name test and last name user
#    And valid ph no 1235477667
#    And valid email id test.user@gmail.com
#    And valid user id test1234
#    When when the user profile API is called
#        Then user can see profile created successfully
#  Scenario: unsuccessfully profile when user enter name, last name,
#  valid ph no, invalid email id ,valid user id
#    Given user enter name test and  last name user
#    And valid ph no 1235477667
#    And invalid email id test.user
#    And valid user id test1234
#    When when the user profile API is called
#    Then user will see enter a valid email id
#  Scenario: unsuccessfully create profile when user enter name, lastname,
#  invalid ph no, valid email id ,valid user id
#    Given user enter name test, lastname user
#    And invalid ph no 1235477
#    And valid email id test.user@gmail.com
#    And valid user id test1234
#    When when the user profile API is called
#    Then user will see enter a valid ph no
#  Scenario: unsuccessfully create profile when user enter name, lastname,
#  valid ph no, valid email id ,invalid user id
#    Given user enter name test, lastname user
#    And invalid ph no 1235477
#    And valid email id test.user@gmail.com
#    And valid user id som12
#    When when the user profile API is called
#    Then user will see enter a different user id, this user id already been created