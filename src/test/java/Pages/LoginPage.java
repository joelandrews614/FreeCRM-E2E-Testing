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
	
	
}
