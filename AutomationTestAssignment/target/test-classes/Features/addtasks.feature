# Prasan Shetty
# 23/08/2022
# Gherkin Style Testing
Feature: Ability of user to add tasks

  @AddTasks
  Scenario: Adding one todo task
    Given I am on To Do MVC page
    When I add one Task
    Then My todo list should contain one task
    And remaining item count should show number of active tasks in the list
    And I can select all tasks and mark as completed

  #@AddMultipleTasks
  #Scenario: Adding multiple todo tasks
    #Given I am on To Do MVC page
    #When I add multiple Task
      #| Task1 |
      #| Task2 |
      #| Task3 |
    #Then My todo list should contain one task
    #And remaining item count should show number of active tasks in the list
    #And I can select all tasks and mark as completed
#
  #@NavigatetoActiveFilterAndAddTasks
  #Scenario: Navigation to Active Filters and add task
    #Given I am on All Filters of To Do MVC page
    #When I navigate to Active Filter
    #And I add a new task
    #Then I am able to see all the active tasks in the list
    #And I am able to add new tasks
#
  #@NavigatetoCompletedFilterAndAddTasks
  #Scenario: Navigation to Completed Filters and add task
    #Given I am on All Filters of To Do MVC page
    #When I navigate to Completed Filter
    #And I add a new task
    #Then I am able to see all the completed tasks in the list
    #And I am able to add new tasks
