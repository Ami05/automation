Feature: Title of your feature
  I want to use this template for my feature file

	@SmokeTest
  Scenario: Title of your scenario
    Given I want to add 2 numbers
    When I add 10 and 15
    Then The sum would be 25

  @RegTest
  Scenario: Title of your scenario
    Given I want to add 2 numbers
    When I add 40 and 55
    Then The sum would be 105

	@SmokeTest
  Scenario Outline: Home Page default login
    Given User is on netbanking landing page
    When I enter Username as "<username>" and Password as "<password>"
    Then Home page is populated 
    And Home page can see the text "Welcome!!"
    
    Examples:
    |username|password|
    |user1	 |1234		|
    |user2	 |4321		|
    |user3	 |4312		|