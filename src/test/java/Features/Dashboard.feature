Feature: Dashboard Functionality

  #Scenario: User is able to see the Username in the Top
    #Given user full name should be displayed
#
  #Scenario: User is able to see the navigating links in the left side
    #Given user is able to see home link
    #And user is able to see calender link
    #And user is able to see contacts link
    #And user is able to see companies link
    #And user is able to see deals link
    #And user is able to see tasks link
    #And user is able to see cases link
    #And user is able to see calls link
    #And user is able to see documents link
    #And user is able to see email link
    #And user is able to see campaigns link
    #And user is able to see forms link
    #And user is able to see reports link

  Scenario Outline: User is able to create a Contact
    Given user is able to see contacts link
    When user clicks on the contacts link
    Then user should see the contacts page
    When user clicks on create new contact button
    Then user should see the create new contact page
    And user should add the "<firstname>" and "<lastname>"
    When finishing up, user clicks on save button
    Then user should see the "<firstname>" and "<lastname>" in the top left navbar
    And user clicks on the contacts link
    Then user deletes the contact which they created

    Examples: 
      | firstname | lastname |
      | Test01    | Test01   |
