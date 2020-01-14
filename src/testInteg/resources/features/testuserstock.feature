#Feature: user stock Action
#  Background: Setup User stock Data
#    Given Following user stock exist in the system
#      |userId|stockId|
#      |test123|APPL|
#      |test123|COST|
#      |test3|WALM|
#    Scenario: user can see the current stock price when enter a valid user id and stock id
#      Given user enter user id test123 and stock id APPL
#      When whene the user stock API is called
#      Then user can see the current value of the stock
#  Scenario: user can not see the stock price when enter a valid user id and invalid stock id
#    Given user enter user id test123 and stock id AAPL
#    When whene the user stock API is called
#    Then user can not see the current value of the stock
#  Scenario: user can not see the current stock price when enter a invalid user id and stock id
#    Given user enter user id abcd and stock id APPL
#    When whene the user stock API is called
#    Then user can not see the current value od the stock
