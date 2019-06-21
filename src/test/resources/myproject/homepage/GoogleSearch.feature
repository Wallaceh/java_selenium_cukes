@focus
Feature: Demo of Searching Keyword cheese farts in Google
As a site user
If I search for keyword
The page title should contains the keyword

Scenario:
  Given I visit Google.com
  When I search "cheese farts"
  Then The page title should contains "cheese farts"