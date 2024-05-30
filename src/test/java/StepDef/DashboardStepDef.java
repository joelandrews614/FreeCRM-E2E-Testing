package StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Pages.DashboardPage;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class DashboardStepDef {

	private DashboardPage dashboardPage;
	private HomePage homePage;
	private LoginPage loginPage;
	private WebDriver driver;

	@Before
	public void setUp() {

		System.setProperty("webdriver.edge.driver", "src/test/resources/WebDrivers/EdgeDriver.exe");

		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://freecrm.com/");

		homePage = new HomePage(driver);
		dashboardPage = new DashboardPage(driver);
		loginPage = new LoginPage(driver);

		homePage.clickLoginBtn();
		loginPage.enterEmail("joelandrews614@gmail.com");
		loginPage.enterPassword("Ss9fagU.gmY8TtJ");
		loginPage.clickLoginBtn();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Given("user full name should be displayed")
	public void user_full_name_should_be_displayed() {

		Assert.assertEquals("Joel Andrews Jeyakumar", dashboardPage.getUsername());

	}

	@Given("user is able to see home icon")
	public void user_is_able_to_see_home_icon() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("user is able to see calender icon")
	public void user_is_able_to_see_calender_icon() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("user is able to see contacts icon")
	public void user_is_able_to_see_contacts_icon() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("user is able to see companies icon")
	public void user_is_able_to_see_companies_icon() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("user is able to see deals icon")
	public void user_is_able_to_see_deals_icon() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("user is able to see tasks icon")
	public void user_is_able_to_see_tasks_icon() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("user is able to see cases icon")
	public void user_is_able_to_see_cases_icon() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("user is able to see calls icon")
	public void user_is_able_to_see_calls_icon() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("user is able to see documents icon")
	public void user_is_able_to_see_documents_icon() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("user is able to see email icon")
	public void user_is_able_to_see_email_icon() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("user is able to see campaigns icon")
	public void user_is_able_to_see_campaigns_icon() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("user is able to see forms icon")
	public void user_is_able_to_see_forms_icon() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("user is able to see reports icon")
	public void user_is_able_to_see_reports_icon() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
