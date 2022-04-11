@Smoke
Feature: As a user should be able to complete  the survey

  Background:
    Given I am on visit page
    When I click on 'Not got a code?' link
    And I am on location page and I click on 'Food And Drink Branch'
    And I click on yesterday tab
    And I select hour,minutes and am time slot
    Then I click on start button and start my survey


  Scenario:  As a user I should be able to give ratings about my recent visit
    And I click on good smiley for food
    And  I click on neutral smiley for drinks
    And I click on Next button after rate food and drinks
    And I click on slider Track
    And I drag the slider to change score
    And I click on Next button after Slider
    And I click on Dessert menu option
    And I click on Churros Good Smileys
    And I select I loved the Taste
    And I click on Done button
    And I click on save and Continue button
    And I click on Main Course menu option
    And I click on beefRanDang Good Smiley
    And I select It was a Good Price
    And I click on Done button
    And I click on save and Continue button
    And I click on Skip button after menu option
    And I click on Skip button after menu option
    And I click on Next Button After Menu options
    And I click on Skip button after menu option
    And I click on Skip button after menu option
    And I click on Skip button after menu option
    Then I can see "Thanks for your feedback" message
    And I click and scratch on Scratch card
    When I click on No Thanks Button
    Then I can see "Your feedback summary" Text is displayed
    And  I click on Upload Photo icon
    And I click on Upload Photo block





