package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOutPage {
	
	public static WebElement getLogOutIcon(WebDriver driver) {
		element = driver.findElement(By.xpath("//i[@class='v-icon material-icons material-icons']"));
		return element;
	}

	public static void setLogOutIcon(WebDriver driver) {
		getLogOutIcon(driver).click();
	}

	public static WebElement getLogOutButton(WebDriver driver) {
		element= driver.findElement(By.xpath("//div[@class='v-btn__content'][contains(text(),'Logout')]"));
		return element;
	}

	public static void setLogOutButton(WebDriver driver) {
		getLogOutButton(driver).click();
	}

	public static WebElement getLogOut(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Yes')]"));
		return element;
	}

	public static void setLogOut(WebDriver driver) {
		getLogOut(driver).click();
	}
}


