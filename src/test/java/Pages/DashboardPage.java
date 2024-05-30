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

	public String getUsername() {
		WebElement usernameElement = driver.findElement(usernameLocator);
		return usernameElement.getText();
	}
}
