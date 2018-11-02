package appModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOutPage {
	
	public static WebElement getLogOutIcon(WebDriver driver) {
		WebElement logOutIcon = driver.findElement(By.xpath("//i[@class='v-icon material-icons material-icons']"));
		return logOutIcon;
	}

	public static WebElement getLogOutButton(WebDriver driver) {
		WebElement logOutButton = driver.findElement(By.xpath("//div[@class='v-btn__content'][contains(text(),'Logout')]"));
		return logOutButton;
	}

	public static WebElement getLogOut(WebDriver driver) {
		WebElement logOutButton = driver.findElement(By.xpath("//div[contains(text(),'Yes')]"));
		return logOutButton;
	}

	public static void setLogOutIcon(WebDriver driver) {
		getLogOutIcon(driver).click();
	}

	public static void setLogOutButton(WebDriver driver) {
		getLogOutButton(driver).click();
	}

	public static void setLogOut(WebDriver driver) {
		getLogOut(driver).click();
	}
}


