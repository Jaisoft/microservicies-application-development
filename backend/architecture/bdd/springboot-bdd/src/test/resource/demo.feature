

Feature: ToDo functionality

  Scenario Outline: As a user I want create a new ToDo

    Given I can creat a new ToDo

    And I sending ToDo to be create with ToDo with text Todo Sex and with completed False

    Then I should be able to see my newly created ToDo

    Examples:
      | text     | completed |
      | Todo sex | false     |



