package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By loginBtnLocator = By.xpath("//a[@href='https://ui.freecrm.com']");
	
	public void clickLoginBtn() {
		WebElement loginBtnElement = driver.findElement(loginBtnLocator);
		loginBtnElement.click();
	}
	
}
