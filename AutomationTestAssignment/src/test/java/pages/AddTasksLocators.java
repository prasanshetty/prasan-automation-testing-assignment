package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddTasksLocators {

	WebDriver driver;
	By textArea = By.className("new-todo");
	By taskList = By.xpath("//label[(contains(text(), 'Task1'))]");
	By activeTaskCount = By.cssSelector("span[class='todo-count'] strong");
	By selectAllTasks = By.id("toggle-all");
	
	
	public void displayVerifyPlaceholder() {
		driver.findElement(textArea).isDisplayed();
		String placeholder_value = driver.findElement(textArea).getAttribute("placeholder");
		System.out.println("todolist home page is displayed and placeholder value is " + placeholder_value);
		Assert.assertEquals("What needs to be done?", placeholder_value); // Verifying placeholder value
	}
	
	public void addTasks(String tasks) {
		driver.findElement(textArea).sendKeys(tasks);
		driver.findElement(textArea).sendKeys(Keys.ENTER);
	}
	
	public void viewActiveTasks() {
		driver.findElement(activeTaskCount).isDisplayed();
	}
	
	public void containsTasks() {
		
		Boolean check = driver.findElement(taskList).isDisplayed();
		System.out.println("Does Todo List Contain Tasks: " + check.booleanValue());
	}
	

	
public void selectAllTasks() throws InterruptedException {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement selectalltasks = driver.findElement(selectAllTasks);
	js.executeScript("arguments[0].click();", selectalltasks);
}


	public AddTasksLocators(WebDriver driver) {
		this.driver = driver;
	}

}
