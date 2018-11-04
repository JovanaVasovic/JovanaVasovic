package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientsPage {
	
	private static WebElement element = null;
	
	public static WebElement getClients(WebDriver driver) {
		 element = driver.findElement(By.xpath("//a[@id='nav-bar-clients']//div[@class='v-btn__content']"));
		 return element;
	}
	
	public static WebElement getAddNewClient(WebDriver driver) {
		 element = driver.findElement(By.xpath("//a[@class='primary mt-5 mr-5 v-btn v-btn--flat v-btn--router v-btn--small']//div[@class='v-btn__content']"));
		 return element;
	}
	
	public static WebElement getClientName(WebDriver driver) {
        	WebDriverWait wait = new WebDriverWait(driver, 5);
        	element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-label=\"Client Name\"]")));
        	return element;
    }
	
	public static void addClientName(WebDriver driver, String ClientName) {
		getClientName(driver).sendKeys(ClientName);
	 }	
	
	public static WebElement getContactName(WebDriver driver) {
		 element = driver.findElement(By.xpath("//form[@class='ma-2 pa-3 text-xs-center']//div[1]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		 return element;
	}
	
	public static void addContactName(WebDriver driver, String ContactName) {
		getContactName(driver).sendKeys(ContactName);
	}
	
	public static WebElement getEmail(WebDriver driver) {
		 element = driver.findElement(By.xpath("//div[@class='flex xs6 mr-2']//input[@type='text']"));
		 return element;
	}
	
	public static void addEmail(WebDriver driver, String Email) {
		getEmail(driver).sendKeys(Email);
	}
	
	public static WebElement getRegistryNumber(WebDriver driver) {
		 element = driver.findElement(By.xpath("//form[@class='ma-2 pa-3 text-xs-center']//div[2]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		 return element;
	}
	
	public static void addRegistryNumber(WebDriver driver, String RegistryNumber) {
		getRegistryNumber(driver).sendKeys(RegistryNumber);
	}
	
	public static WebElement getCountries(WebDriver driver) {
		 element = driver.findElement(By.xpath("//div[@class='v-select__slot']//input[@type='text']"));
		 return element;
	}
	
	public static void addCountries(WebDriver driver, String CountryName) throws InterruptedException {   
		Actions builder = new Actions(driver);
		Actions country = builder
		.moveToElement(getCountries(driver))
		.click()
		.sendKeys(CountryName);
		country.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
		country.perform();
		}
	
	public static WebElement getCity(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement City = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[6]/main/div/div/div[2]/div[2]/div/div[1]/div/form/div[3]/div[2]/div/div[2]/div[1]/div/input")));
		return City;
	}
	
	public static void addCity(WebDriver driver, String City) {
		getCity(driver).sendKeys(City);
	}
	
	public static WebElement getStreet(WebDriver driver) {
		 element = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/div[@class='container']/div[@class='mt-1 white v-card']/div[@class='v-card__actions']/div[@class='layout column']/div[@class='layout']/div[@class='flex secondary xs12']/form[@class='ma-2 pa-3 text-xs-center']/div[@class='layout']/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		 return element;
	}
	
	public static void addStreet(WebDriver driver, String Street) {
		getStreet(driver).sendKeys(Street);
	}
	
	public static WebElement getZip(WebDriver driver) {
		 element = driver.findElement(By.xpath("//div[@class='layout']//div[@class='layout']//div[4]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		 return element;
	}
	
	public static void addZip(WebDriver driver, String Zip) {
		getZip(driver).sendKeys(Zip);
	}
	
	/*public static WebElement getDateAdded(WebDriver driver) {
		 element = driver.findElement(By.xpath("//div[@class='flex xs3']//div[@class='v-dialog__container']//input[@type='text']"));
		 return element;
	}
	
	public static void addDateAdded(WebDriver driver, String DateAdded) {
		getDateAdded(driver).sendKeys(DateAdded);
	}*/
	
	public static WebElement getCode(WebDriver driver) {
		 element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[6]/main/div/div/div[2]/div[2]/div/div[1]/div/form/div[4]/div[2]/div/div[2]/div[1]/div/input"));
		 return element;
	}
	
	public static void addCode(WebDriver driver, String Code) {
		getCode(driver).sendKeys(Code);
	}
	
	/*public static WebElement getAgreementDate(WebDriver driver) {
		 element = driver.findElement(By.xpath("//div[@class='flex xs3 ml-3']//input[@type='text']"));
		 return element;
	}
	
	public static void addAgreementDate(WebDriver driver, String AgreementDate) {
		getAgreementDate(driver).sendKeys(AgreementDate);
	}*/
	
	public static WebElement getStatus(WebDriver driver) {
	     	element = driver.findElement(By.xpath("//label[contains(text(),'Status: Active')]"));
	     	return element;
	}

	public static WebElement getStatusLabel(WebDriver driver) {
	     	element = driver.findElement(By.xpath("//label[contains(text(),'Status: Active')]"));
	     	return element;
	}

	public static void addStatus(WebDriver driver, String status) throws InterruptedException {
	     	String currentStatus = getStatus(driver).getText();
	     	String cs = currentStatus.split(":")[1].trim();
	     	if(!status.equals(cs)) {
	       		getStatus(driver).click();
	     	}
	}
	
	public static WebElement getSave(WebDriver driver) {
		 element = driver.findElement(By.xpath("//div[contains(text(),'Save')]"));
		 return element;
	}


	}
	

