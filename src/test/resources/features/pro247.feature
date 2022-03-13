Feature: Contacts

  Background: Navigate the website
    Given User navigates the webpage

  @wip
  Scenario: Removing shortcuts
    Given User clicks on the star
    And User writes the name of the shortcut
    And User clicks on the name of the shortcut
    And User verifies shortcut removed
  @wip
  Scenario: Adding shortcuts
    Given User clicks on the star
    And User writes the name of the shortcut for add
    And User clicks on the name of the shortcut for add
    And User verifies shortcut added

  @wip
  Scenario: Adding new contact
    Given User clicks on Add new button
    And User fills the blank with given datas
    Then User clicks Add button

  @wip
  Scenario: Searching contact
    Given User writes the name in search box
    And User sees the contact at the top

  @wip
  Scenario: Editting the contact information
    Given User hover over the contact which is required to be editted
    And User clicks the edit button
    When User changes the datas
    And User clicks edit button

  @wip
  Scenario: Deleting the contact information
    Given User writes the name in search box
    Given User hover over the contact which is required to be editted
    And User clicks the delete button
    And User clicks confirm button
    Given User writes the name in search box
    And User verifies that added contact deleted


  @wip
  Scenario: Switching the language
    Given User clicks on the language tab En
    And User clicks on Tr
