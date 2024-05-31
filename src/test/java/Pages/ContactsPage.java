package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactsPage {

	private WebDriver driver;
	
	public ContactsPage(WebDriver driver) {
		this.driver = driver;
	}

	private By createNewContactLink = By.xpath("//a[@href='/contacts/new']");
	private By createNewContactTag = By.xpath("//span[@class='selectable ']");
	private By firstNameInput = By.xpath("//input[@name='first_name']");
	private By lastNameInput = By.xpath("//input[@name='last_name']");
	private By saveBtn = By.xpath("//button[@class='ui linkedin button']");
	private By deleteBtn = By.xpath("//button[@class='ui button icon']");
	private By confirmationDeleteBtn = By.xpath("//button[@class='ui red button']");
	
	
	public void clickCreateNewContactLink() {
		WebElement ele = driver.findElement(createNewContactLink);
		ele.click();
	}

	public String getContactPageURL() {
		return driver.getCurrentUrl();
	}
	
	public String getCreateNewContactTag() {
		WebElement ele = driver.findElement(createNewContactTag);
		return ele.getText();
	}

	public void enterFirstName(String fname) {
		WebElement ele = driver.findElement(firstNameInput);
		ele.sendKeys(fname);
	}
	
	public void enterLastName(String lname) {
		WebElement ele = driver.findElement(lastNameInput);
		ele.sendKeys(lname);
	}
	
	public void clickSaveBtn() {
		WebElement ele = driver.findElement(saveBtn);
		ele.click();
	}

	public String getFullName(String string, String string2) {
		
		By fullName = By.linkText(string + " " + string2);
		WebElement ele = driver.findElement(fullName);
		
		return ele.getText();
		
	}
	
	public void clickDeleteBtn() {
		WebElement ele = driver.findElement(deleteBtn);
		ele.click();
	}
	
	public void clickConfirmationDeleteBtn() {
		WebElement ele = driver.findElement(confirmationDeleteBtn);
		ele.click();
	}
}
