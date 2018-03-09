package stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LogInPage;

public class LogIn {
	WebDriver driver;
	@Given("^new user to the AgileTraiblazers home page$")
	public void new_user_to_the_AgileTraiblazers_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://mock.agiletrailblazers.com/contact.html");
	  
	}
		

	@Given("^user wants to contact with AgileTraiblazers management$")
	public void user_wants_to_contact_with_AgileTraiblazers_management() throws Throwable {
	 
			  
	}

	@When("^enter \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void enter(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
		 LogInPage object1= new LogInPage(driver);
		  object1.name().sendKeys(arg1);
		  object1.email().sendKeys(arg2);
		  object1.mobile().sendKeys(arg3);
		  object1.office().sendKeys(arg4);
		  object1.subject().click();
		  object1.message().sendKeys(arg6);
		  
	}

	@Then("^user click submit$")
	public void user_click_submit() throws Throwable {
		 LogInPage object2= new LogInPage(driver);
		 object2.submit().click();
	  
	}

	@Then("^user get a message\"([^\"]*)\"$")
	public void user_get_a_message(String arg1) throws Throwable {
	  
	}



}
