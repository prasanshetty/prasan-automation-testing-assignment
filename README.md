# prasan-automation-testing-assignment
Automation Testing Using Selenium WebDriver , Cucumber framework and Gherkin Style

# Pre-requisites
Java 8 (jdk 1.8), Any Editor (or Eclipse IDE), Maven, Cucumber Plugin, 
# Please follow below steps to run the tests
1. Pull the source code in your local repository
2. Replace the chromedriver.exe file in <localrepository>\AutomationTestAssignment\src\test\resources\Drivers as per the version of chrome browser. ChromeDriver 104.0.5112.79 is currently in this directory. If you are using Chrome version 104, then no need to replace or do any changes.
3. Open any IDE (example: Eclipse IDE Version: 2022-06 (4.24.0))
4. Import the project and install the cucumber eclipse plugin from help>eclipse marketplace>search for cucumber exclipse plugin and install and restart your eclipse
5. Run the TestRunner.java from <local repository>\AutomationTestAssignment\src\test\java\Steps as Junit Tests (right click on file> Run As >JUnit Tests)
6.  We can run feature file from <local repository>\AutomationTestAssignment\src\test\resources\Features as Cucumber Feature (right click on file>Run as>Cucumber feature)

# Scenarios Covered
Have used Cucumber Framwework with Selenium Webdriver to add the features for "to do mvc web page".
AddTask, Edit Tasks and Delete Tasks, however only one scenario under AddTask was automated due to some time and minor technical contraints.
* Feature Files are under src/test/resources Feature folder
* Step Definations are under src/test/java Steps folder
* Locators are under src/test/java pages folder
