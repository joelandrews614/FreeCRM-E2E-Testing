package StepDef;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class loginStepDef {

	private WebDriver driver;
	private HomePage homePage;
	private LoginPage loginPage;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.edge.driver", "src/test/resources/WebDrivers/EdgeDriver.exe");

		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@After
	public void tearDown() {
			driver.quit();
	}
	
//	Scenario: Opening Up and Validating the Login Page - START

	@Given("user is in the home page")
	public void user_is_in_the_home_page() {

		driver.get("https://freecrm.com/");
		

		// Validation of Page Title:
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "#1 Free CRM Power Up your Entire Business Free Forever");

	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		
		homePage = new HomePage(driver);
		
		homePage.clickLoginBtn();
	}

	@Then("user can see the login page")
	public void user_can_see_the_login_page() {

		loginPage = new LoginPage(driver);
		
		String actualTitle = driver.getTitle();
		Assert.assertEquals("Cogmento CRM", actualTitle);

		String loginButtonText = loginPage.getLoginBtnText();
		Assert.assertEquals("Login", loginButtonText);

	}

//	Scenario: Opening Up and Validating the Login Page - END

//	Scenario: Entering Credentials and Logging in - START
	@Given("user sees the email and passwork textboxes")
	public void user_sees_the_email_and_passwork_textboxes() {

		Assert.assertEquals(true, loginPage.isEmailFieldExists());
		Assert.assertEquals(true, loginPage.isPwdFieldExists());

	}

	@Given("user enters email in the email textbox")
	public void user_enters_email_in_the_email_textbox() throws InterruptedException {

		loginPage.enterEmail("joelandrews614@gmail.com");

	}

	@Given("user enters password in the password textbox")
	public void user_enters_password_in_the_password_textbox() throws InterruptedException {

		loginPage.enterPassword("Ss9fagU.gmY8TtJ");

	}

	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() throws InterruptedException {

		loginPage.clickLoginBtn();

	}

	@Then("user is able to login")
	public void user_is_able_to_login() throws InterruptedException {

		String actualTitle = driver.getTitle();
		Assert.assertEquals("Cogmento CRM", actualTitle);

	}


	@Then("user should see incorrect email error")
	public void user_should_see_incorrect_email_error() throws InterruptedException {

		Assert.assertEquals("Something went wrong...", loginPage.getSomethingWentWrongText());

		Assert.assertEquals("Invalid login", loginPage.getInvalidLoginErrorText());

	}

	@Then("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
	    
		loginPage.enterEmail(string);
		loginPage.enterPassword(string2);
		
	}

	
}
