package org.nirai;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class Demo {
	static WebDriver driver;
	private DataTable customerDetails;
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\3\\eclipse-workspace\\Nirai\\MavenPro\\driv\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/telecom/addcustomer.php");
	}

	/*@When("I complete action")
	public void i_complete_action() {
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys("mukilan");
		driver.findElement(By.id("lname")).sendKeys("niraui");
        driver.findElement(By.name("addr")).sendKeys("tyheni");
       
		driver.findElement(By.id("telephoneno")).sendKeys("7667828643");
		driver.findElement(By.id("email")).sendKeys("nirai@gamil.com");
	}*/
	@When("A user customer details")
	public void a_user_customer_details(DataTable customerDetails) {
		List<String> DetailsList = customerDetails.asList(String.class);
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(DetailsList.get(0));
		driver.findElement(By.id("lname")).sendKeys(DetailsList.get(1));
        driver.findElement(By.name("addr")).sendKeys(DetailsList.get(2));
	driver.findElement(By.id("telephoneno")).sendKeys(DetailsList.get(3));
		driver.findElement(By.id("email")).sendKeys(DetailsList.get(4));
	}
	@When ("The user clicks submit buttons")
	public void The_user_clicks_submit_buttons() {
		 driver.findElement(By.name("submit")).click();

	}
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	Assert.assertTrue(driver.findElement(By.tagName("h3")).isDisplayed());
	}


}
