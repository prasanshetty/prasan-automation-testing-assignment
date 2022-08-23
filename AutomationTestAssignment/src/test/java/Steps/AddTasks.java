package Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddTasksLocators;

public class AddTasks {

	WebDriver driver = null;
	AddTasksLocators add;

	// Launching Chrome Browser and navigating to todomvc page
	@Before
	public void browserSetUp() {

		System.out.println("Open Browser");
		String path = System.getProperty("user.dir");
		System.out.println("path is" + path);
		System.setProperty("webdriver.chrome.driver", path + "\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://todomvc.com/examples/vue/");
	}

	// Close and Exit from browser
	@After
	public void exitBrowser() {

		driver.quit();
	}

	// Verifying if the placeholder value is correct
	@Given("I am on To Do MVC page")
	public void toDoMVCPage() {

		add = new AddTasksLocators(driver);
		add.displayVerifyPlaceholder(); // this method is defined in AddTaskLocators class
	}

	// Verifying if the user is able to add one task
	@When("I add one Task")
	public void addOneTask() {
		add = new AddTasksLocators(driver);
		System.out.println("adding tasks");
		add.addTasks("Task1"); // this method is defined in AddTaskLocators class
	}

	// Verifying if the to do list has tasks
	@Then("My todo list should contain one task")
	public void viewTasks() {
		add = new AddTasksLocators(driver);
		System.out.println("todolist contains tasks");
		add.containsTasks(); // this method is defined in AddTaskLocators class
	}

	// Verifying if the active task counts
	@And("remaining item count should show number of active tasks in the list")
	public void activeTaskCount() {
		// Write code here that turns the phrase above into concrete actions
		add = new AddTasksLocators(driver);
		add.viewActiveTasks();// this method is defined in AddTaskLocators class
	}
	
	@And("I can select all tasks and mark as completed")
	public void selectAllTaskToComplete() throws InterruptedException {
		add = new AddTasksLocators(driver);
		add.selectAllTasks();
	}

}
