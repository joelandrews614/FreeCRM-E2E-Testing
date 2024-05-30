Feature: Dashboard Functionality

  Background: 
    Given user is in the home page
    When user clicks on login button
    Then user can see the login page
    Given user sees the email and passwork textboxes
    And user enters email in the email textbox
    And user enters password in the password textbox
    When user clicks on the login button
    Then user is able to login

  Scenario: User is able to see the Username in the Top
  	Given user full name should be displayed
  	
  Scenario: User is able to see the navigating Icons in the left side
  	# Once you implemented the visibility functions then add validations after clicking those icons
  	Given user is able to see home icon
  	And user is able to see calender icon
  	And user is able to see contacts icon
  	And user is able to see companies icon
  	And user is able to see deals icon
  	And user is able to see tasks icon
  	And user is able to see cases icon
  	And user is able to see calls icon
  	And user is able to see documents icon
  	And user is able to see email icon
  	And user is able to see campaigns icon
  	And user is able to see forms icon
  	And user is able to see reports icon