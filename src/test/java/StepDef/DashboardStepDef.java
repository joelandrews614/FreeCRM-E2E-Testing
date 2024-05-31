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

	@Given("user is able to see home link")
	public void user_is_able_to_see_home_link() {
		
		Assert.assertEquals(true, dashboardPage.isHomeLinkExists());
			
	}

	@Given("user is able to see calender link")
	public void user_is_able_to_see_calender_link() {

		Assert.assertEquals(true, dashboardPage.isCalenderLinkExists());

	}

	@Given("user is able to see contacts link")
	public void user_is_able_to_see_contacts_link() {

		Assert.assertEquals(true, dashboardPage.isContactsLinkExists());
	}

	@Given("user is able to see companies link")
	public void user_is_able_to_see_companies_link() {

		Assert.assertEquals(true, dashboardPage.isCompaniesLinkExists());
	}

	@Given("user is able to see deals link")
	public void user_is_able_to_see_deals_link() {

		Assert.assertEquals(true, dashboardPage.isDealsLinkExists());
	}

	@Given("user is able to see tasks link")
	public void user_is_able_to_see_tasks_link() {

		Assert.assertEquals(true, dashboardPage.isTasksLinkExists());
	}

	@Given("user is able to see cases link")
	public void user_is_able_to_see_cases_link() {

		Assert.assertEquals(true, dashboardPage.isCasesLinkExists());
	}

	@Given("user is able to see calls link")
	public void user_is_able_to_see_calls_link() {

		Assert.assertEquals(true, dashboardPage.isCallsLinkExists());
	}

	@Given("user is able to see documents link")
	public void user_is_able_to_see_documents_link() {

		Assert.assertEquals(true, dashboardPage.isDocumentLinkExists());
	}

	@Given("user is able to see email link")
	public void user_is_able_to_see_email_link() {

		Assert.assertEquals(true, dashboardPage.isEmailLinkExists());
	}

	@Given("user is able to see campaigns link")
	public void user_is_able_to_see_campaigns_link() {

		Assert.assertEquals(true, dashboardPage.isCampaignsLinkExists());
	}

	@Given("user is able to see forms link")
	public void user_is_able_to_see_forms_link() {

		Assert.assertEquals(true, dashboardPage.isFormsLinkExists());
	}

	@Given("user is able to see reports link")
	public void user_is_able_to_see_reports_link() {

		Assert.assertEquals(true, dashboardPage.isReportsLinkExists());
	}

}
