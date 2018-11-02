package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class BussinesPage {
	
	private static WebElement element = null;

	 public static WebElement getBusiness(WebDriver driver) {
		 element = driver.findElement(By.xpath("//a[@id='nav-bar-business']//div[@class='v-btn__content']"));
		 return element;
	 }
	 
	 public static WebElement getAddNewBusiness(WebDriver driver) {
		 element = driver.findElement(By.xpath("//a[@id='add-new-business']//div[@class='v-btn__content']"));
		 return element;
	 }
	 
	 public static WebElement getBusinessName(WebDriver driver) {
		 element = driver.findElement(By.xpath("//input[@id='business-form-name']"));
		 return element;	 
	 }
	 
	 public static void addBusinessName(WebDriver driver, String BusinessName) {
			getBusinessName(driver).sendKeys(BusinessName);
		 }	
	 
	 public static WebElement getCountries(WebDriver driver) {
		 element = driver.findElement(By.xpath("//input[@id='business-form-country']"));
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
		 element = driver.findElement(By.xpath("//input[@id='business-form-city']"));
		 return element;
	 }
	 
	 public static void addCity(WebDriver driver, String City) {
			getCity(driver).sendKeys(City);
		}
	 
	 public static WebElement getStreet(WebDriver driver) {
		 element = driver.findElement(By.xpath("//input[@id='business-form-street']"));
		 return element;
	 }
	 
	 public static void addStreet(WebDriver driver, String Street) {
			getStreet(driver).sendKeys(Street);
		}
	 
	 public static WebElement getZip(WebDriver driver) {
		 element = driver.findElement(By.xpath("//input[@id='business-form-zip']"));
		 return element;
	 }
	 
	 public static void addZip(WebDriver driver, String Zip) {
			getZip(driver).sendKeys(Zip);
		}
	 
	 public static WebElement getRegistryNumber(WebDriver driver) {
		 element = driver.findElement(By.xpath("//input[@id='business-form-reg-num']"));
		 return element;
	 }
	 
	 public static void addRegistryNumber(WebDriver driver, String RegistryNumber) {
			getRegistryNumber(driver).sendKeys(RegistryNumber);
		}
	 
	 public static WebElement getAddBankAccount(WebDriver driver) {
		 element = driver.findElement(By.xpath("//button[@id='business-form-add-bank-btn']//div[@class='v-btn__content']"));
		 return element;
	 }
	 
	 public static WebElement getBankName(WebDriver driver) {
		 element = driver.findElement(By.xpath("//input[@id='bank-dialog-name']"));
		 return element;
	 }
	 
	 public static void addBankName(WebDriver driver, String BankName) {
			getBankName(driver).sendKeys(BankName);
		}
	 
	 public static WebElement getAccountNumber(WebDriver driver) {
		 element = driver.findElement(By.xpath("//input[@id='bank-dialog-num']"));
		 return element;
	 }
	 
	 public static void addAcountNumber(WebDriver driver, String AccountNumber) {
			getAccountNumber(driver).sendKeys(AccountNumber);
		}
	 
	 public static WebElement getSwiftNumber(WebDriver driver) {
		 element = driver.findElement(By.xpath("//input[@id='bank-dialog-swf-num']"));
		 return element;
	 }
	 
	 public static void addSwiftNumber(WebDriver driver, String SwiftNumber) {
			getSwiftNumber(driver).sendKeys(SwiftNumber);
		}
	 
	 public static WebElement getPaymentInstructions(WebDriver driver) {
		 element = driver.findElement(By.xpath("//textarea[@id='bank-dialog-pay-inst']"));
		 return element;
	 }
	 
	 public static void addPaymentInstructions(WebDriver driver, String PaymentInstructions) {
			getPaymentInstructions(driver).sendKeys(PaymentInstructions);
		}
	 
	 public static WebElement getCurrency(WebDriver driver) {
		 element = driver.findElement(By.xpath("//div[@class='v-select__selections']"));
		 return element;
	 }
	 
	 public static void addCurrency(WebDriver driver) throws InterruptedException {
		 getCurrency(driver).click();
	 }
	 
	 public static WebElement selectCurrency(WebDriver driver, String input) {
		 WebElement selectCurrency = driver.findElement(By.xpath("//div[contains(text(),'" + input + "')]"));
		 return selectCurrency;
	 }
	 
	 public static void currencyClick(WebDriver driver, String input) {
		 selectCurrency(driver, input).click();
	 }
	 
	 /*public static void addCurrency(WebDriver driver) throws InterruptedException {
			Actions builder = new Actions(driver);
	        Actions currency = builder
	        .moveToElement(getCurrency(driver))
	        .click()	        
	        .click();
	        //currency.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
	        currency.perform();        
	    }	*/
	 
	 public static WebElement getAddBankAccountSubmit(WebDriver driver) {
		 element = driver.findElement(By.xpath("//div[contains(text(),'Add bank account')]"));
		 return element;
	 }
	 
	 public static WebElement getSave(WebDriver driver) {
		 element = driver.findElement(By.xpath("//div[contains(text(),'Save')]"));
		 return element;
	 }
	
	
	}
	
	
	
 

	 
	 
	 
	 
	 
	 


