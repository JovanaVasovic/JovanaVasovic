package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.BussinesPage;
import utility.Constant;
import utility.ExcelUtils;

public class BusinessPage_Action {
	
	public static void SetUpExcel() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet2");
	}
	
	public static void Execute(WebDriver driver) throws Exception {
		
		Thread.sleep(3000);
		BussinesPage.getBusiness(driver).click();
		Thread.sleep(3000);
		BussinesPage.getAddNewBusiness(driver).click();
		
		String BusinessName = ExcelUtils.getCellData(1, 1);
		String Countries = ExcelUtils.getCellData(1, 2);
		String City = ExcelUtils.getCellData(1, 3);
		String Street = ExcelUtils.getCellData(1, 4);
		String Zip = ExcelUtils.getCellData(1, 5);
		System.out.println(Zip);
		String RegistryNumber = ExcelUtils.getCellData(1, 6);
		System.out.println(RegistryNumber);
		
		Thread.sleep(3000);
		
		BussinesPage.addBusinessName(driver, BusinessName);
		BussinesPage.addCountries(driver, Countries);
		BussinesPage.addCity(driver, City);
		BussinesPage.addStreet(driver, Street);
		BussinesPage.addZip(driver, Zip);
		BussinesPage.addRegistryNumber(driver, RegistryNumber);
		
		BussinesPage.getAddBankAccount(driver).click();
		
		String BankName = ExcelUtils.getCellData(1, 7);
		String AccountNumber = ExcelUtils.getCellData(1, 8);
		String SwiftNumber = ExcelUtils.getCellData(1, 9);
		System.out.println("ovo je swift"+SwiftNumber);
		String PaymentInstructions = ExcelUtils.getCellData(1, 10);
		String currencyName = ExcelUtils.getCellData(1, 11);
		
		BussinesPage.addBankName(driver, BankName);
		BussinesPage.addAcountNumber(driver, AccountNumber);
		BussinesPage.addSwiftNumber(driver, SwiftNumber);
		BussinesPage.addPaymentInstructions(driver, PaymentInstructions);
		BussinesPage.addCurrency(driver);
		BussinesPage.currencyClick(driver, currencyName);
		
		Thread.sleep(3000);
		BussinesPage.getAddBankAccountSubmit(driver).click();
		BussinesPage.getSave(driver).click();
		
		

		
	}

}
