package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

	private WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By usernameLocator = By.xpath("//span[@class='user-display']");

	private By homeLinkLocator = By.xpath("//a[@href='/home']");
	
	private By calenderLinkLocator = By.xpath("//a[@href='/calendar']");
	
	private By contactsLinkLocator = By.xpath("//a[@href='/contacts']");
	
	private By companiesLinkLocator = By.xpath("//a[@href='/companies']");
	
	private By dealsLinkLocator = By.xpath("//a[@href='/deals']");
	
	private By tasksLinkLocator = By.xpath("//a[@href='/tasks']");
	
	private By casesLinkLocator = By.xpath("//a[@href='/cases']");
	
	private By callsLinkLocator = By.xpath("//a[@href='/calls']");
	
	private By documentsLinkLocator = By.xpath("//a[@href='/documents']");
	
	private By emailLinkLocator = By.xpath("//a[@href='/email']");
	
	private By campaignsLinkLocator = By.xpath("//a[@href='/campaigns']");
	
	private By formsLinkLocator = By.xpath("//a[@href='/forms']");
	
	private By reportsLinkLocator = By.xpath("//a[@href='/reports']");
	
	public String getUsername() {
		WebElement usernameElement = driver.findElement(usernameLocator);
		return usernameElement.getText();
	}
	
	public boolean isHomeLinkExists() {
		WebElement homeLinkElement = driver.findElement(homeLinkLocator);
		return homeLinkElement.isDisplayed();
	}
	
	public boolean isCalenderLinkExists() {
		WebElement calenderLinkElement = driver.findElement(calenderLinkLocator);
		return calenderLinkElement.isDisplayed();
	}
	
	public boolean isContactsLinkExists() {
		WebElement contactsLinkElement = driver.findElement(contactsLinkLocator);
		return contactsLinkElement.isDisplayed();
	}
	
	public boolean isCompaniesLinkExists() {
		WebElement companiesLinkElement = driver.findElement(companiesLinkLocator);
		return companiesLinkElement.isDisplayed();
	}
	
	public boolean isDealsLinkExists() {
		WebElement dealsLinkElement = driver.findElement(dealsLinkLocator);
		return dealsLinkElement.isDisplayed();
	}
	
	public boolean isTasksLinkExists() {
		WebElement tasksLinkElement = driver.findElement(tasksLinkLocator);
		return tasksLinkElement.isDisplayed();
	}
	
	public boolean isCasesLinkExists() {
		WebElement casesLinkElement = driver.findElement(casesLinkLocator);
		return casesLinkElement.isDisplayed();
	}
	
	public boolean isCallsLinkExists() {
		WebElement callsLinkElement = driver.findElement(callsLinkLocator);
		return callsLinkElement.isDisplayed();
	}
	
	public boolean isDocumentLinkExists() {
		WebElement documentLinkElement = driver.findElement(documentsLinkLocator);
		return documentLinkElement.isDisplayed();
	}
	
	public boolean isEmailLinkExists() {
		WebElement emailLinkElement = driver.findElement(emailLinkLocator);
		return emailLinkElement.isDisplayed();
	}
	
	public boolean isCampaignsLinkExists() {
		WebElement campaignsLinkElement = driver.findElement(campaignsLinkLocator);
		return campaignsLinkElement.isDisplayed();
	}
	
	public boolean isFormsLinkExists() {
		WebElement formsLinkElement = driver.findElement(formsLinkLocator);
		return formsLinkElement.isDisplayed();
	}
	
	public boolean isReportsLinkExists() {
		WebElement reportsLinkElement = driver.findElement(reportsLinkLocator);
		return reportsLinkElement.isDisplayed();
	}
	
}
