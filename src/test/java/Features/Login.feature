Feature: Login Functionality of Free CRM

	Background:
		Given user is in the home page
		When user clicks on login button
		Then user can see the login page

  Scenario: Opening Up and Validating the Login Page
    Then user can see the login page

  Scenario: Entering Correct Credentials and Logging in
    Given user sees the email and passwork textboxes
    And user enters email in the email textbox
    And user enters password in the password textbox
    When user clicks on the login button
    Then user is able to login

  Scenario Outline: Entering Incorrect Credentials and Logging in
    Given user enters "<username>" and "<password>"
    When user clicks on the login button
    Then user should see incorrect email error

    Examples: 
      | username          | password |
      | test01            | test01   |
      | test01gmail.com   | test01   |
      | bogus23@gmail.com | bogus23  |
