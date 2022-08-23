#Feature: Ability of user to delete tasks
#
  #@DeleteTasksfromAllFilters
  #Scenario: Able to Delete todo tasks from All Filters
    #Given I am on All Filters of To Do MVC page
    #When I Delete one of the tasks
    #Then Task is deleted
    #And remaining item count should show number of active tasks in the list
#
  #@DeleteTasksfromActiveFilters
  #Scenario: Able to Delete todo tasks from Active Filters
    #Given I am on Active Filters of To Do MVC page
    #When I Delete one of the tasks
    #Then Task is deleted
    #And remaining item count should show number of active tasks in the list
#
  #@DeleteTasksfromCompletedFilters
  #Scenario: Able to Delete todo tasks from Completed Filters
    #Given I am on Completed Filters of To Do MVC page
    #When I Delete one of the tasks
    #Then Task is deleted
    #And remaining item count should show number of active tasks in the list
#
  #@ClearCompletedToDoTasks
  #Scenario: Able to clear completed todo tasks in the task list
    #Given I am on All Filters of To Do MVC page
    #And there is atleast one completed task
    #When I click on clear completed button
    #Then All the completed tasks are cleared
    #And remaining item count should show number of active tasks in the list
    #And There should be no tasks under completed filter
