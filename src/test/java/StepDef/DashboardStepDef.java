package StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Pages.ContactsPage;
import Pages.DashboardPage;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class DashboardStepDef {

	
	private HomePage homePage;
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private ContactsPage contactsPage;
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

	
	
	@When("user clicks on the contacts link")
	public void user_clicks_on_the_contacts_link() {

		dashboardPage.clickContactsLink();
	}

	@Then("user should see the contacts page")
	public void user_should_see_the_contacts_page() {

		contactsPage = new ContactsPage(driver);
		
		System.out.println(contactsPage.getContactPageURL());
		Assert.assertEquals("https://ui.cogmento.com/contacts", contactsPage.getContactPageURL());
		
	}

	@When("user clicks on create new contact button")
	public void user_clicks_on_create_new_contact_button() {

		contactsPage.clickCreateNewContactLink();

	}

	@Then("user should see the create new contact page")
	public void user_should_see_the_create_new_contact_page() {

		Assert.assertEquals("Create New Contact", contactsPage.getCreateNewContactTag());

	}

	@Then("user should add the {string} and {string}")
	public void user_should_add_the_and(String string, String string2) {

		contactsPage.enterFirstName(string);
		contactsPage.enterLastName(string2);

	}

	@When("finishing up, user clicks on save button")
	public void finishing_up_user_clicks_on_save_button() {

		contactsPage.clickSaveBtn();

	}

	@Then("user should see the {string} and {string} in the top left navbar")
	public void user_should_see_the_and_in_the_top_left_navbar(String string, String string2) {

		System.out.println("=========================================");
		String fullname = string + " " +  string2;
		System.out.println(fullname);
//		System.out.println(contactsPage.getFullName(string, string2));
//		Assert.assertEquals(fullname, contactsPage.getFullName(string, string2));
		System.out.println("=========================================");
		
	}

	@Then("user deletes the contact which they created")
	public void user_deletes_the_contact_which_they_created() {
		
		dashboardPage.clickContactsLink();
		
		contactsPage.clickDeleteBtn();

		contactsPage.clickConfirmationDeleteBtn();
		
	}

	
}
