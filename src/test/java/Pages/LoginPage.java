package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	private By loginBtnLocator = By.xpath("//div[@class='ui fluid large blue submit button']");
	private By emailLocator = By.xpath("//input[@name='email']");
	private By pwdLocator = By.xpath("//input[@name='password']");
	private By somethingWentWrongErrorLocator = By.xpath("//div[@class='header']");
	private By invlaidLoginErrorLocator = By.xpath("//div//p");
	
	public void clickLoginBtn() {
		WebElement loginBtnElement = driver.findElement(loginBtnLocator);
		loginBtnElement.click();
	}
	
	public String getLoginBtnText() {
		WebElement loginBtnElement = driver.findElement(loginBtnLocator);
		return loginBtnElement.getText();
	}
	
	public boolean isEmailFieldExists() {
		WebElement emailElement = driver.findElement(emailLocator);
		return emailElement.isDisplayed();
	}
	
	public boolean isPwdFieldExists() {
		WebElement pwdElement = driver.findElement(pwdLocator);
		return pwdElement.isDisplayed();
	}
	
	public void enterEmail(String email) {
		WebElement emailElement = driver.findElement(emailLocator);
		emailElement.sendKeys(email);
	}
	
	public void enterPassword(String pwd) {
		WebElement pwdElement = driver.findElement(pwdLocator);
		pwdElement.sendKeys(pwd);
	}
	
	public String getSomethingWentWrongText() {
		WebElement somethingWentWrongElement = driver.findElement(somethingWentWrongErrorLocator);
		return somethingWentWrongElement.getText();
	}
	
	public String getInvalidLoginErrorText() {
		WebElement invalidLoginErrorElement = driver.findElement(invlaidLoginErrorLocator);
		return invalidLoginErrorElement.getText();
	}
}
