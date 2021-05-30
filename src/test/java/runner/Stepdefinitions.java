package runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinitions {
	public WebDriver driver;
	@Given("open the browser and enter the url of te application")
	public void open_the_browser_and_enter_the_url_of_te_application() {
		WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://demo.actitime.com/login.do");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	@When("enter the valid username and valid passsword and click on login button")
	public void enter_the_valid_username_and_valid_passsword_and_click_on_login_button() {
	   driver.findElement(By.id("username")).sendKeys("admin");
	   driver.findElement(By.name("pwd")).sendKeys("manager");
	}

	@Then("user should be succesfully login into application")
	public void user_should_be_succesfully_login_into_application() {
	   System.out.println("success");
	}

}
